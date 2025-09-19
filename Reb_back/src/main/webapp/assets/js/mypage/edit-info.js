document.addEventListener("DOMContentLoaded", function() {
	const form = document.getElementById("formEdit");
	const base = (form && form.dataset.contextPath) ? form.dataset.contextPath : ""; // ★ 전역 없이 읽기
	const pwWarning = document.querySelector(".edit-info-pw-warning");

	const pwFirstWarning = document.querySelector("#edit-info-pw-first-warning");
	const pwReInputWarning = document.querySelector("#edit-info-pw-re-warning");

	const pwFirstInput = document.querySelector("#input-password-first");
	const pwReInput = document.querySelector("#input-password-re");

	const nicknameInput = document.querySelector("#input-edit-info-nickname");
	const nicknameAlert = document.querySelector("#possible-nickname-text");

	const nicknameInputOriginalColor = nicknameInput.style.color;
	const nicknameInputOriginalText = nicknameInput.placeholder;
	const buttonEditNickname = document.querySelector("#button-edit-info-nickname");

	const buttonUpdatePhoneNumber = document.querySelector("#button-update-phone-number");
	const inputEditInfoPhoneNumber = document.querySelector("#input-edit-info-phone-number");

	const buttonSendVerificationCode = document.querySelector("#button-send-verification-code");

	const buttonCheckVerificationCode = document.querySelector("#button-check-verification-code");

	const inputVerificationCode = document.querySelector("#input-verification-code");
	let verificatioCode = "123456";

	const buttonSearchAddress = document.querySelector("#button-search-address");
	const editInfoAddressText = document.querySelector("#edit-info-address-text");
	const buttonColor = "#f59d85";
	const buttonDisabledColor = "#797979ff";

	const inputEditInfoEmail = document.querySelector("#input-edit-info-email");

	let checkNickname = false;

	/*document.querySelector("#button-edit-user-complete").addEventListener(('click'), () => {
		
	});*/

	document.querySelector("#button-edit-user-cancel").addEventListener(('click'), () => {
		cacelEditUserInfo()
	});

	inputVerificationCode.addEventListener('focus',
		() => {
			inputVerificationCode.value = "";
			inputVerificationCode.style.color = "black";
		}
	);

	pwFirstInput.addEventListener('change',
		() => {
			checkPassword();
			compareEqualPassword();
		}
	);

	/*buttonSearchAddress.addEventListener('click', () => {
		editInfoAddressText.innerHTML = prompt("(API 대체 예정)주소 입력");
	});*/


	buttonSearchAddress.addEventListener('click', function() {
		new daum.Postcode({
			oncomplete: function(data) {
				// 우편번호
				document.querySelector("#edit-info-address-post").innerHTML = data.zonecode || "";
				document.querySelector("#input-edit-info-address-post").value = data.zonecode || "";

				// 메인 주소(도로명 또는 지번 한 칸만)
				var isRoad = data.userSelectedType === "R";
				var base = isRoad ? (data.roadAddress || "") : (data.jibunAddress || "");
				var extra = "";

				if (isRoad) {
					if (data.bname && /[동|로|가]$/.test(data.bname)) extra += data.bname;
					if (data.buildingName && data.apartment === "Y") {
						extra += (extra ? ", " : "") + data.buildingName;
					}
				}

				var main = base + (extra ? " (" + extra + ")" : "");
				document.querySelector("#edit-info-address-text").innerHTML = main;
				document.querySelector("#input-edit-info-address-text").value = main;

				// 상세주소 포커스
				document.querySelector("#address-re-input input").focus();
			}
		}).open({ popupTitle: "우편번호 검색" });
	});

	const pnRegex = /^0\d{2}-\d{4}-\d{4}$/;

	buttonSendVerificationCode.addEventListener('click', function() {
		const phoneNumberValue = inputEditInfoPhoneNumber.value.trim().replace(/[^0-9]/g, "");
		if (!phoneNumberValue) {
			alert("핸드폰 번호를 입력해주세요");
			return;
		}
		console.log(phoneNumberValue);

		if (!pnRegex.test(inputEditInfoPhoneNumber.value)) {
			alert("-를 입력해 형식을 지켜주세요.");
			return;
		}
		fetch("/member/joinSMS.me", {
			method: 'POST',
			headers: {
				"Content-Type": "application/json",
				"X-Requested-With": "XMLHttpRequest"
			},
			body: JSON.stringify({ phoneNumberValue: phoneNumberValue })
		})
			.then(response => {
				if (!response.ok) throw new Error(`오류 상태 코드 : ${response.status}`);
			})
			.then(() => {
				inputEditInfoPhoneNumber.setAttribute("disabled", true);
				inputVerificationCode.removeAttribute("disabled");

				buttonSendVerificationCode.setAttribute("disabled", true);
				buttonSendVerificationCode.style.backgroundColor = buttonDisabledColor;

				console.log("인증발송 성공");
				alert("인증 번호를 전송하였습니다.");
			})
			.catch(error => {
				console.error("sms 발송 오류 : ", error);
				alert("인증번호 발송 중 오류가 발생했습니다.");
			});
	});


	let checkPhoneNumber = false;

	buttonUpdatePhoneNumber.addEventListener('click', () => {
		checkPhoneNumber = false;
		inputEditInfoPhoneNumber.removeAttribute("disabled");

		buttonUpdatePhoneNumber.removeAttribute("disabled");
		buttonUpdatePhoneNumber.style.backgroundColor = buttonColor;

		inputVerificationCode.setAttribute("disabled", true);

		buttonSendVerificationCode.removeAttribute("disabled");
		buttonSendVerificationCode.style.backgroundColor = buttonColor;

		buttonCheckVerificationCode.removeAttribute("disabled");
		buttonCheckVerificationCode.style.backgroundColor = buttonColor;
	});

	/*buttonSendVerificationCode.addEventListener('click', () => {
		inputEditInfoPhoneNumber.setAttribute("disabled", true);
		inputVerificationCode.removeAttribute("disabled");

		buttonSendVerificationCode.setAttribute("disabled", true);
		buttonSendVerificationCode.style.backgroundColor = buttonDisabledColor;

		alert("인증 번호를 전송하였습니다.");
	});*/

	/*buttonCheckVerificationCode.addEventListener('click', () => {
		if (verificatioCode === inputVerificationCode.value) {
			buttonCheckVerificationCode.setAttribute("disabled", true);
			buttonCheckVerificationCode.style.backgroundColor = buttonDisabledColor;

			inputVerificationCode.setAttribute("disabled", true);
			buttonSendVerificationCode.setAttribute("disabled", true);
			buttonSendVerificationCode.style.backgroundColor = buttonDisabledColor;
			checkPhoneNumber = true;
			alert("전화번호 변경을 성공하였습니다.");
		} else {
			inputVerificationCode.value = "발송한 인증번호와 다른 입력";
			inputVerificationCode.style.color = "red";
		}
	});*/



	buttonCheckVerificationCode.addEventListener("click", function() {
		const code = inputVerificationCode.value.trim();

		if (code === "") {
			alert("인증번호를 입력해주세요.");
			return;
		}

		fetch("/member/verifyCode.me", {
			method: "POST",
			headers: { "Content-Type": "application/json" },
			body: JSON.stringify({ code: code })
		})
			.then(response => {
				if (!response.ok) throw new Error(`HTTP 오류!, 상태코드 : ${response.status}`);
				return response.json();
			})
			.then(data => {
				console.log(data);
				if (data.success) {
					buttonCheckVerificationCode.setAttribute("disabled", true);
					buttonCheckVerificationCode.style.backgroundColor = buttonDisabledColor;

					inputVerificationCode.setAttribute("disabled", true);
					buttonSendVerificationCode.setAttribute("disabled", true);
					buttonSendVerificationCode.style.backgroundColor = buttonDisabledColor;
					checkPhoneNumber = true;
					alert("전화번호 변경을 성공하였습니다.");
				} else {
					inputVerificationCode.value = "발송한 인증번호와 다른 입력";
					inputVerificationCode.style.color = "red";
				}
			})
			.catch(error => {
				console.error("인증 확인 오류:", error);
				alert("인증 처리중 오류가 발생했습니다.")
			})
	})



	pwReInput.addEventListener('change', compareEqualPassword);
	const pwRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$])[A-Za-z\d!@#$]{8,20}$/;

	function checkPassword() {
		if (!pwRegex.test(pwFirstInput.value)) {
			pwFirstWarning.style.display = "inline";
		} else {
			pwFirstWarning.style.display = "none";
		}
	}

	function compareEqualPassword() {
		if (pwFirstInput.value === pwReInput.value) {
			pwReInputWarning.style.display = "none";
		}
		else if (pwReInput.value != "") {
			pwReInputWarning.style.display = "inline";
		}
	}

	const nicknamelist = ['보라도리', '보라돌이', '보라'];
	const originalNickname = nicknameInput.value;

	buttonEditNickname.addEventListener('click', () => {
		const nickname = nicknameInput.value.trim();

		if (nickname === originalNickname) {
			nicknameAlert.innerHTML = "기존과 동일";
			nicknameAlert.style.display = "block";
			checkNickname = true;

			return;
		}

		/*if (nickname === originalNickname) {
			nicknameAlert.innerHTML = "기존과 동일";
			nicknameAlert.style.display = "block";
			checkNickname = true;
		}
		else if (nicknamelist.indexOf(nickname) === -1) {
			nicknameAlert.innerHTML = "사용 가능";
			nicknameAlert.style.display = "block";
			checkNickname = true;
		} else {
			nicknameAlert.style.display = "none";
			nicknameInput.value = "존재하는 닉네임입니다";
			nicknameInput.style.color = "red";
			checkNickname = false;
		}*/

		fetch(`${base}/mypage/checkNicknameOk.my?memberNickname=${encodeURIComponent(nickname)}`, {
			headers: { "Accept": "application/json" }
		})
			.then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
			.then(data => {
				console.log("data.available ", data.available);
				if (data.available) {
					nicknameAlert.innerHTML = "사용 가능";
					nicknameAlert.style.display = "block";
					nicknameAlert.style.color = "green";
				} else {
					nicknameAlert.innerHTML = "존재하는 닉네임";
					nicknameAlert.style.display = "block";
					nicknameAlert.style.color = "black";
				}

				checkNickname = data.available;
			})
			.catch(() => {
				nicknameAlert.innerHTML = "오류 발생";
				nicknameAlert.style.color = "red";
			});
	}
	);

	nicknameInput.addEventListener('focus', () => {
		if (nicknameInput.style.color === "red") {
			nicknameInput.value = "";
			nicknameInput.style.color = nicknameInputOriginalColor;
		}
	})

	nicknameInput.addEventListener('input', () => {
		nicknameAlert.style.display = "none";
	})


	//필수 입력 값 확인
	function checkAllInfo() {
		let checkMsg = ""
		//  비밀번호 두개 다맞게
		if (!pwRegex.test(pwFirstInput.value) || !(pwFirstInput.value === pwReInput.value)) {
			checkMsg += "비밀번호 입력 확인 필요\n";
		}

		//  이메일 입력
		if (inputEditInfoEmail.value === "") {
			checkMsg += "이메일 필수 입력 필요\n";
		}

		// 기존과 동일하거나 사용 가능 여부 판단 시 넘어가기 
		if (nicknameInput.value !== originalNickname) {
			if (!checkNickname) {
				checkMsg += "기존과 동일하거나 중복되지 않는 닉네임으로 확인 필요\n";
			}
		}

		return checkMsg;
	}

	function checkAdditinalInfo() {
		let checkMsg = "";


		// [전화번호는 동일하게 유지됩니다.] 
		// - 변경 버튼 클릭 후, 인증 확인이 안된 경우
		// - 변경 버튼을 누르지 않은 경우
		if (!checkPhoneNumber) {
			checkMsg += "전화번호는 동일하게 유지됩니다.\n";
		}

		return checkMsg;
	}

	function editCompleteUserInfo() {


		return checkMsg;
	}

	function moveToPersonalInfo() {
		location.href = "/myPage/myInfoOk.my";
	}

	function cacelEditUserInfo() {
		if (confirm("수정하신 내용이 사라집니다.\n정말 취소하시겠습니까?")) {
			moveToPersonalInfo();
		}
	}

	form.addEventListener("submit", function(e) {
		let checkMsg = checkAllInfo();
		if (checkMsg !== "") {
			e.preventDefault();
			alert(checkMsg);
			return;
		}

		checkMsg = checkAdditinalInfo();
		if (confirm(checkMsg + "개인정보를 수정하시겠습니까?")) {
			moveToPersonalInfo();
		}
		else {
			e.preventDefault();
		}
	});
});
