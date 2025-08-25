document.addEventListener("DOMContentLoaded", function() {
	const form = document.getElementById("joinForm") || document.querySelector("form");
	const base = (form && form.dataset.contextPath) ? form.dataset.contextPath : "";
	const codeInput = document.querySelector(".input-cert");

	const checkInput = false;

	const inputId = document.querySelector("input[name='memberId']");
	const idSame = document.querySelector(".p-nodupli-id");
	const idNotSame = document.querySelector(".p-dupli-id");
	const idRegex = /^[a-z0-9]{5,19}$/;

	inputId.addEventListener("blur", function() {
		const nearWarning = inputId.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		const memberId = inputId.value.trim();

		if (idRegex.test(memberId)) {
			warning.style.display = "none";
			checkInput = false;
		} else {
			warning.style.display = "block";
			checkInput = true;
		}
		fetch(`${base}/member/checkIdOk.me?memberId=${encodeURIComponent(memberId)}`, {
			headers: { "Accept": "application/json" }
		})
			.then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
			.then(data => {
				if (data.available) {
					idSame.style.display = "none";
					idNotSame.style.display = "block";
					checkInput = false;
				} else {
					idSame.style.display = "block";
					idNotSame.style.display = "none";
					checkInput = true;
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
			checkInput = false;
		} else {
			warning.style.display = "block";
			checkInput = true;
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
			checkInput = false;
		} else {
			same.style.display = "none";
			nosame.style.display = "block";
			checkInput = true;
		}
	});

	const birth = document.querySelector("input[name='memberBirthDate']");

	birth.addEventListener('blur', () => {
		const nearWarning = birth.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (!birth.value) {
			warning.style.display = "block";
			checkInput = true;
		} else {
			warning.style.display = "none";
			checkInput = false;
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

	const checkEmail = false;
	const emailRegex = /^[a-z0-9._%+\-]+@[a-z0-9.\-]+\.[a-z]{2,}$/;
	const email = document.querySelector("input[name='email']");

	email.addEventListener('blur', () => {
		const nearWarning = email.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (!emailRegex.test(email.value)) {
			warning.style.display = "block";
			const checkEmail = true;
		} else {
			warning.style.display = "none";
			const checkEmail = false;
		}
	});

	const name = document.querySelector("input[name='name']");
	name.addEventListener('blur', function() {
		inputName = name.value.trim();
		const nearWarning = name.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (inputName) {
			warning.style.display = "none";
			checkInput = false;
		} else {
			warning.style.display = "block";
			checkInput = true;
		}
	});

	const gender = document.querySelector("input[name='gender']");
	gender.addEventListener('blur', () => {
		const nearWarning = gender.closest(".div-signup");
		const warning = nearWarning.querySelector(".p-warning");
		if (!gender.value) {
			warning.style.display = "block";
			checkInput = true;
		} else {
			warning.style.display = "none";
			checkInput = false;
		}
	});

	const inputNickname = document.querySelector("input[name='memberNickname']");
	const nicknameRequired = document.querySelector(".nickname-required");
	const nicknameDupli = document.querySelector(".nickname-dupli");
	const nicknameNoDupli = document.querySelector(".nickname-nodupli");

	inputNickname.addEventListener('blur', function() {
		const memberNickname = inputNickname.value.trim();
		if (memberNickname) {
			nicknameRequired.style.display = "none";
			checkInput = false;
		} else {
			nicknameRequired.style.display = "block";
			checkInput = true;
		}
	});

	const nicknameBtn = document.querySelector(".button-no-duplication");

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
					checkInput = false;
				} else {
					nicknameNoDupli.style.display = "none";
					nicknameDupli.style.display = "block";
					checkInput = true;
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

	});

	injunging.addEventListener('blur', function() {
		const code = injungPhone.value.trim();

		if (code === tempCode) {
			alert("인증에 성공했습니다.");
			injungPhone.readOnly = true;
			injungPhone.style.backgroundColor = "#d9d9d9";
			injunging.disabled = true;
			injunging.style.color = "#d9d9d9";
			alert("인증 성공");
			checkInput = false;
		} else {
			alert("인증번호가 맞지 않습니다");
			checkInput = true;
		}
	});

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
		if (!agree.checked || !idRegex.test(memberId) || !data.available || !pwRegex.test(pw) || !(pw && pw === pwRe) || !birth.value || !emailRegex.test(email.value) || !inputName || !gender.value || !memberNickname || !data.available || !(code === tempCode)) {
			e.preventDefault();
			alert("약관에 동의해주세요.");
			return;
		}		
	});


});