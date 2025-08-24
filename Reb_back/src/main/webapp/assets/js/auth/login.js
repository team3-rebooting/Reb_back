document.addEventListener("DOMContentLoaded", function() {

	const findIdModal = document.querySelector(".p-findid");
	const closeFindIdModal = document.querySelector(".button-id-x");
	const idModal = document.querySelector(".modal-id-background");
	const inputModalNameId = document.querySelector(".input-modal-name-id");
	const inputModalPnId = document.querySelector(".input-modal-pn-id");
	const inputPhoneNumberId = document.querySelector("input[name='modalIdPhoneInjung']");

	findIdModal.addEventListener('click', () => {
		idModal.style.display = "flex";
	});

	closeFindIdModal.addEventListener('click', () => {
		idModal.style.display = "none";
		inputModalNameId.value = "";
		inputModalPnId.value = "";
		inputPhoneNumberId.value = "";
	});

	const sendSMSBtn = document.querySelector(".button-injung-id");
	const veriId = document.querySelector(".button-injung-do-id");
	const reIdPn = document.querySelector(".button-retry-id");

	let tempCode = "";   // 임시 발급 코드 저장할 변수

	sendSMSBtn.addEventListener("click", function() {
		const phoneNumber = inputModalPnId.value.trim();
		if (!phoneNumber) {
			alert("핸드폰 번호를 입력해주세요.");
			return;
		}

		// 6자리 난수 생성
		tempCode = String(Math.floor(100000 + Math.random() * 900000));
		console.log("임시 인증번호:", tempCode); // 콘솔 확인용



		alert("임시 인증번호는 [" + tempCode + "] 입니다.");
		inputModalPnId.readOnly = true;
		inputModalPnId.style.backgroundColor = "#d9d9d9";
		sendSMSBtn.style.backgroundColor = "#d9d9d9";
		sendSMSBtn.style.color = "black";
		sendSMSBtn.disabled = true;
		inputPhoneNumberId.style.backgroundColor = "white";
		inputPhoneNumberId.readOnly = false;
		veriId.style.color = "white";
		veriId.style.backgroundColor = "#F38A6E";
		veriId.disabled = false;
		reIdPn.disabled = false;
	});

	// ===== 인증번호 확인 (서버 대신 로컬 비교) =====
	veriId.addEventListener("click", function() {
		const code = inputPhoneNumberId.value.trim();
		if (!code) {
			alert("인증번호를 입력해주세요.");
		}

		if (code === tempCode) {
			alert("인증에 성공하였습니다.");
			inputPhoneNumberId.style.backgroundColor = "#d9d9d9";
			inputPhoneNumberId.readOnly = true;
			veriId.style.color = "black";
			veriId.style.backgroundColor = "#d9d9d9";
			veriId.disabled = true;
		} else {
			alert("인증에 실패하였습니다.");
		}
	});


	reIdPn.addEventListener("click", function() {
		inputModalPnId.readOnly = false;
		inputModalPnId.style.backgroundColor = "white";
		inputModalPnId.value = "";
		sendSMSBtn.style.backgroundColor = "#F38A6E";
		sendSMSBtn.style.color = "white";
		sendSMSBtn.disabled = false;
		inputPhoneNumberId.style.backgroundColor = "#d9d9d9";
		inputPhoneNumberId.readOnly = true;
		inputPhoneNumberId.value = "";
		veriId.style.color = "black";
		veriId.style.backgroundColor = "#d9d9d9";
		veriId.disabled = true;
		reIdPn.disabled = true;
	});

	const findBtn = document.querySelector(".button-modal-find-id");
	const findIdOkModal = document.querySelector(".modal-id-end-background");

	findBtn.addEventListener("click", function() {
	fetch("/member/findIdOk.me", {
		headers: { "Accept": "application/json" }
	})
		.then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
		.then(data => {
				idModal.style.display = "none";
				inputModalNameId.value = "";
				inputModalPnId.readOnly = false;
				inputModalPnId.style.backgroundColor = "white";
				inputModalPnId.value = "";
				sendSMSBtn.style.backgroundColor = "#F38A6E";
				sendSMSBtn.style.color = "white";
				sendSMSBtn.disabled = false;
				inputPhoneNumberId.style.backgroundColor = "#d9d9d9";
				inputPhoneNumberId.readOnly = true;
				inputPhoneNumberId.value = "";
				veriId.style.color = "black";
				veriId.style.backgroundColor = "#d9d9d9";
				veriId.disabled = true;
				reIdPn.disabled = true;
				findIdOkModal.style.display = "block";
			});
		});

});