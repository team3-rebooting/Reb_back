document.addEventListener("DOMContentLoaded", function() {
	const form = document.getElementById("joinForm") || document.querySelector("form");
	const base = (form && form.dataset.contextPath) ? form.dataset.contextPath : "";

	let checkIdRegex = true;
	let checkAvailable = true;
	let checkpwRegex = true;
	let checkPwSame = false;

	const inputId = document.querySelector("input[name='memberId']");
	const idSame = document.querySelector(".p-nodupli-id");
	const idNotSame = document.querySelector(".p-dupli-id");
	const idRequired = document.querySelector(".p-id");
	const idRegex = /^[a-z0-9]{5,19}$/;
	const pnRegex = /^0\d{2}-\d{4}-\d{4}$/;

	inputId.addEventListener("blur", function() {
		const nearWarning = inputId.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		const memberId = inputId.value.trim();

		/*if (idRegex.test(memberId)) {
			warning.style.display = "none";
		} else {
			warning.style.display = "block";
			checkIdRegex = true;
		}*/
		fetch(`${base}/member/checkIdOk.me?memberId=${encodeURIComponent(memberId)}`, {
			headers: { "Content-type": "application/json" }
		})
			.then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
			.then(data => {
				if (memberId != "") {
					idRequired.style.display = "none";
					if (idRegex.test(memberId)) {
						checkIdRegex = false;
						warning.style.display = "none";
						if (data.available) {
							idSame.style.display = "none";
							idNotSame.style.display = "block";
							checkAvailable = false;
						} else {
							idSame.style.display = "block";
							idNotSame.style.display = "none";
							checkAvailable = true;
						}
					} else {
						warning.style.display = "block";
						idNotSame.style.display = "none";
						checkIdRegex = true;
					}
				} else {
					idRequired.style.display = "block";
					idSame.style.display = "none";
					idNotSame.style.display = "none";
				}
			})
			.catch(() => {
				console.log("예외 발생");
			});
	});

	const inputPw = document.querySelector(".input-password-first");
	const checkPw = document.querySelector(".input-password-second");
	const pwRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$])[A-Za-z\d!@#$]{8,20}$/;

	inputPw.addEventListener("blur", function() {
		console.log("pw 입력 진입 완료");
		const pw = inputPw.value.trim();
		const nearWarning = inputPw.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (pwRegex.test(pw)) {
			warning.style.display = "none";
			checkpwRegex = false;
		} else {
			warning.style.display = "block";
			checkpwRegex = true;
		}
	});

	checkPw.addEventListener("blur", function() {
		const pw = inputPw.value.trim();
		const pwRe = checkPw.value.trim();
		const nearWarning = inputPw.closest(".div-signup");
		const nosame = nearWarning.querySelector(".p-nosame");
		const same = nearWarning.querySelector(".p-same");

		if (pw && pw === pwRe) {
			same.style.display = "block";
			nosame.style.display = "none";
			checkPwSame = false;
		} else {
			same.style.display = "none";
			nosame.style.display = "block";
			checkPwSame = true;
		}
	});

	const birth = document.querySelector("input[name='memberBirthDate']");
	let checkBirth = true;

	birth.addEventListener('blur', () => {
		const nearWarning = birth.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (!birth.value) {
			warning.style.display = "block";
			checkBirth = true;
		} else {
			warning.style.display = "none";
			checkBirth = false;
		}
	});

	const searchBtn = document.querySelector(".button-find");
	if (searchBtn) {
		searchBtn.addEventListener("click", function() {
			new daum.Postcode({
				oncomplete: function(data) {
					// 우편번호
					document.querySelector(".input-zip-code").value = data.zonecode || "";

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
					document.querySelector(".input-address-basic").value = main;

					// 상세주소 포커스
					document.querySelector(".input-address-add").focus();
				}
			}).open({ popupTitle: "우편번호 검색" });
		});
	}

	let checkEmail = true;
	let checkInputEmail = true;
	const emailRegex = /^[a-z0-9._%+\-]+@[a-z0-9.\-]+\.[a-z]{2,}$/;
	const email = document.querySelector("input[name='email']");
	const emailRequired = document.querySelector(".p-email");

	email.addEventListener('blur', () => {
		const nearWarning = email.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (!email.value.trim()) {
			emailRequired.style.display = "block";
			checkInputEmail = true;
		} else {
			emailRequired.style.display = "none";
			checkInputEmail = false;
		}

		if (!emailRegex.test(email.value) && email.value != "") {
			warning.style.display = "block";
			checkEmail = true;
		} else {
			warning.style.display = "none";
			checkEmail = false;
		}
	});

	let checkName = true;
	const name = document.querySelector("input[name='name']");
	name.addEventListener('blur', function() {
		inputName = name.value.trim();
		const nearWarning = name.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (inputName) {
			warning.style.display = "none";
			checkName = false;
		} else {
			warning.style.display = "block";
			checkName = true;
		}
	});

	let checkGender = false;

	/*const gender = document.getElementsByName("gender");
	let checkedGender = document.querySelector("input[type='radio'][name='gender']:checked");*/

	function checkedGender() {
	    const radios = document.getElementsByName("gender");
	    let isChecked = false;

	    for (let radio of radios) {
	      if (radio.checked) {
	        isChecked = true;
	        break;
	      }
	    }
		
		const warning = document.querySelector(".p-warning-gender");

	    if (!isChecked) {
	      warning.style.display = "block"; // 경고 문구 보이기
	      return false; // 폼 제출 막기
	    } else {
	      warning.style.display = "none"; // 경고 문구 숨기기 (이미 선택한 경우)
	      return true; // 폼 제출 허용
	    }
	  }
	
	
	/*gender.addEventListener('blur', () => {
		const nearWarning = gender.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (!gender.value) {
			warning.style.display = "block";
			checkGender = true;
		} else {
			warning.style.display = "none";
			checkGender = false;
		}
	});*/

	const inputNickname = document.querySelector("input[name='memberNickname']");
	const nicknameRequired = document.querySelector(".nickname-required");
	const nicknameDupli = document.querySelector(".nickname-dupli");
	const nicknameNoDupli = document.querySelector(".nickname-nodupli");
	let checkNickname = true;

	inputNickname.addEventListener('blur', function() {
		const memberNickname = inputNickname.value.trim();
		if (memberNickname) {
			nicknameRequired.style.display = "none";
			checkNickname = false;
		} else {
			nicknameRequired.style.display = "block";
			checkNickname = true;
		}
	});

	const nicknameBtn = document.querySelector(".button-no-duplication");
	let checkNicknameSame = true;

	nicknameBtn.addEventListener("click", function() {
		const memberNickname = inputNickname.value.trim();
		fetch(`${base}/mypage/checkNicknameOk.my?memberNickname=${encodeURIComponent(memberNickname)}`, {
			headers: { "Accept": "application/json" }
		})
			.then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
			.then(data => {
				if (data.available) {
					nicknameNoDupli.style.display = "block";
					nicknameDupli.style.display = "none";
					checkNicknameSame = false;
				} else {
					nicknameNoDupli.style.display = "none";
					nicknameDupli.style.display = "block";
					checkNicknameSame = true;
				}
			});
	});


	let tempCode = "";
	const buttonInjung = document.querySelector(".button-injung");
	let phoneNumber = document.querySelector("input[name='phoneNumber']");
	let injungPhone = document.querySelector(".input-cert");
	let injunging = document.querySelector(".button-injunging");
	const retry = document.querySelector(".button-retry");

	buttonInjung.addEventListener('click', function() {
		const phoneNumberValue = phoneNumber.value.trim().replace(/[^0-9]/g, "");
		if (!phoneNumberValue) {
			alert("핸드폰 번호를 입력해주세요");
			return;
		}
		console.log(phoneNumberValue);

		if (!pnRegex.test(phoneNumber.value)) {
			alert("형식을 지켜주세요.");
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
				console.log("인증발송 성공");
				phoneNumber.readOnly = true;
				phoneNumber.style.backgroundColor = "#d9d9d9";
				buttonInjung.disabled = true;
				buttonInjung.style.color = "#d9d9d9";
				injungPhone.readOnly = false;
				injungPhone.style.backgroundColor = "white";
				injunging.disabled = false;
				injunging.style.color = "white";
				retry.disabled = false;
				retry.style.color = "white";
			})
			.catch(error => {
				console.error("sms 발송 오류 : ", error);
				alert("인증번호 발송 중 오류가 발생했습니다.");
			});
	});



	/*buttonInjung.addEventListener('click', function() {
		const phoneNumberValue = phoneNumber.value.trim();
		if (!phoneNumberValue) {
			alert("핸드폰 번호를 입력해주세요");
			return;
		}

		// 6자리 난수 생성
		tempCode = String(Math.floor(100000 + Math.random() * 900000));
		console.log("임시 인증번호 : " + tempCode);		// 콘솔 확인용

		alert("임시 인증번호는 [" + tempCode + "] 입니다.");
		phoneNumber.readOnly = true;
		phoneNumber.style.backgroundColor = "#d9d9d9";
		buttonInjung.disabled = true;
		buttonInjung.style.color = "#d9d9d9";
		injungPhone.readOnly = false;
		injungPhone.style.backgroundColor = "white";
		injunging.disabled = false;
		injunging.style.color = "white";
		retry.disabled = false;
		retry.style.color = "white";

	});*/

	let checkPhone = true;

	injunging.addEventListener("click", function() {
		const code = injungPhone.value.trim();

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
					alert("인증에 성공했습니다.");
					injungPhone.readOnly = true;
					injungPhone.style.backgroundColor = "#d9d9d9";
					injunging.disabled = true;
					injunging.style.color = "#d9d9d9";
					checkPhone = false;
				} else {
					alert("인증번호가 맞지 않습니다");
					checkPhone = true;
				}
			})
			.catch(error => {
				console.error("인증 확인 오류:", error);
				alert("인증 처리중 오류가 발생했습니다.")
			})
	})
	/*
	
		injunging.addEventListener('click', function() {
			const code = injungPhone.value.trim();
	
			if (code === tempCode) {
				alert("인증에 성공했습니다.");
				injungPhone.readOnly = true;
				injungPhone.style.backgroundColor = "#d9d9d9";
				injunging.disabled = true;
				injunging.style.color = "#d9d9d9";
				checkPhone = false;
			} else {
				alert("인증번호가 맞지 않습니다");
				checkPhone = true;
			}
		});
	
	*/
	retry.addEventListener('click', () => {
		phoneNumber.readOnly = false;
		phoneNumber.style.backgroundColor = "white";
		buttonInjung.disabled = false;
		buttonInjung.style.color = "white";
		injungPhone.readOnly = true;
		injungPhone.style.backgroundColor = "#d9d9d9";
		injungPhone.value = "";
		injunging.disabled = true;
		injunging.style.color = "#d9d9d9";
		retry.disabled = true;
		retry.style.color = "#d9d9d9";
		phoneNumber.value = "";
	});


	form.addEventListener("submit", function(e) {
		const agree = document.getElementById("id-terms");
		if (!agree.checked) {
			e.preventDefault();
			alert("약관에 동의해주세요.");
			return;
		} else if (checkIdRegex) {
			e.preventDefault();
			alert("아이디 형식을 지켜주세요.");
			reurn;
		} else if (checkAvailable) {
			e.preventDefault();
			alert("사용 불가능한 아이디입니다");
			return;
		} else if (checkpwRegex) {
			e.preventDefault();
			alert("비밀번호 형식을 지켜주세요.");
			return;
		} else if (checkPwSame) {
			e.preventDefault();
			alert("비밀번호가 동일하지 않습니다.");
			return;
		} else if (checkBirth) {
			e.preventDefault();
			alert("생년월일을 입력해주세요");
			return;
		} else if (checkInputEmail) {
			e.preventDefault();
			alert("이메일을 입력해수제요.")
		} else if (checkEmail) {
			e.preventDefault();
			alert("이메일 형식을 지켜주세요.");
			return;
		} else if (checkName) {
			e.preventDefault();
			alert("이름을 입력해주세요.");
			return;
		} else if (checkGender) {
			e.preventDefault();
			alert("성별을 선택해주세요.");
			return;
		} else if (checkNickname) {
			e.preventDefault();
			alert("닉네임을 입력해주세요.");
			return;
		} else if (checkNicknameSame) {
			e.preventDefault();
			alert("닉네임 중복을 확인해주세요.");
			return;
		} else if (checkPhone) {
			e.preventDefault();
			alert("전화번호 인증을 해주세요.");
			return;
		}
		checkedGender();
	});


});