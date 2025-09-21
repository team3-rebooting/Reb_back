document.addEventListener("DOMContentLoaded", function() {

	const findIdModal = document.querySelector(".p-findid");
	const closeFindIdModal = document.querySelector(".button-id-x");
	const idModal = document.querySelector(".modal-id-background");
	const idResultModal = document.querySelector(".modal-id-end-background");
	const inputModalNameId = document.querySelector(".input-modal-name-id");
	const inputModalPnId = document.querySelector(".input-modal-pn-id");
	const inputPhoneNumberId = document.querySelector("input[name='modalIdPhoneInjung']");
	const pnRegex = /^0\d{2}-\d{4}-\d{4}$/;

	findIdModal.addEventListener('click', () => {
		idModal.style.display = "flex";
	});

	closeFindIdModal.addEventListener('click', () => {
		idModal.style.display = "none";
		inputModalNameId.value = "";
		inputModalPnId.value = "";
		inputPhoneNumberId.value = "";
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

	const sendSMSBtn = document.querySelector(".button-injung-id");
	const veriId = document.querySelector(".button-injung-do-id");
	const reIdPn = document.querySelector(".button-retry-id");

	/*	let tempCode = "";   // 임시 발급 코드 저장할 변수
	
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
		*/

	sendSMSBtn.addEventListener("click", function() {
		const phoneNumber = inputModalPnId.value.trim().replace(/[^0-9]/g, "");
		if (!phoneNumber) {
			alert("핸드폰 번호를 입력해주세요");
			return;
		}
		console.log(phoneNumber);

		if (!pnRegex.test(inputModalPnId.value)) {
			alert("-를 입력해 형식을 지켜주세요.");
			return;
		}

		fetch("/member/joinSMS.me", {
			method: 'POST',
			headers: {
				"Content-Type": "application/json",
				"X-Requested-With": "XMLHttpRequest"
			},
			body: JSON.stringify({ phoneNumberValue: phoneNumber })
		})
			.then(response => {
				if (!response.ok) throw new Error(`오류 상태 코드 : ${response.status}`);
			})
			.then(() => {
				console.log("인증번호발송 성공");
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
	});


	let checkPhone = true;

	veriId.addEventListener("click", function() {
		const code = inputPhoneNumberId.value.trim();

		if (code === "") {
			alert("인증번호를 입력해주세요");
			return;
		}

		fetch("/member/verifyCode.me", {
			method: 'POST',
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
					inputPhoneNumberId.style.backgroundColor = "#d9d9d9";
					inputPhoneNumberId.readOnly = true;
					veriId.style.color = "black";
					veriId.style.backgroundColor = "#d9d9d9";
					veriId.disabled = true;
					checkPhone = false;
				} else {
					alert("인증번호가 맞지 않습니다.");
				}
			});
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

	const findIdBtn = document.querySelector(".button-modal-find-id");
	let resultId = document.querySelector("#aa");
	const findIdEndBtn = document.querySelector(".button-modal-find-end-id");

	findIdBtn.addEventListener("click", async () => {
		const name = inputModalNameId.value.trim();
		const phoneNumber = inputModalPnId.value.trim();
		console.log(name);
		console.log(phoneNumber);

		if (!name || !phoneNumber) {
			alert("이름과 전화번호를 입력해주세요.");
			return;
		}

		if (checkPhone) {
			alert("핸드폰 인증을 완료해주세요.");
			return;
		}

		try {
			const res = await fetch("/member/findIdOk.me", {
				method: 'POST',
				headers: {
					'Content-Type': "application/x-www-form-urlencoded"
				},
				body: new URLSearchParams({
					modalIdName: name,
					modalIdPhone: phoneNumber
				})
			});

			if (!res.ok) throw new Error("서버에 오류가 발생했습니다.");
			const data = await res.json();
			console.log(`memberDTO : `, data);
			/*console.log(`${data.memberId}`);
			console.log(`${data.memberSignupDate}`);
*/
			// 결과 모달에 값 추가
			const resultContainer = document.getElementById('resultId');
			const birthContainer = document.getElementById('resultIdBirth');
			resultContainer.innerHTML = "";
			birthContainer.innerHTML = "";

			if (data.length === 0) {
				resultContainer.textContent = "일치하는 아이디가 없습니다.";
			} else {
				data.forEach(item => {
					const div = document.createElement('div');
					// 한 줄에 ID와 가입일 함께 표시
					div.textContent = `ID: ${item.memberId}, 가입일: ${item.memberSignupDate}`;
					resultContainer.appendChild(div);
				});
			}

			idModal.style.display = "none";
			idResultModal.style.display = "flex";
		} catch (err) {
			console.error(err);
			alert("아이디를 찾을 수 없습니다.");
		}
	});

	findIdEndBtn.addEventListener("click", () => {
		idResultModal.style.display = "none";
		inputModalNameId.value = "";
		inputModalPnId.value = "";
		inputPhoneNumberId.value = "";
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
	/*--------------------------------------------------------------------*/


	/*--------------------------------------------------------------------*/

	const findPwModal = document.querySelector(".p-findpw");
	const pwModal = document.querySelector(".modal-pw-background");
	const closeFindPwModal = document.querySelector(".button-pw-x");
	const pwResultModal = document.querySelector(".modal-pw-end-background");
	const inputModalNamePw = document.querySelector(".input-modal-name-pw");
	const inputModalPnPw = document.querySelector(".input-modal-pn-pw");
	const inputPhoneNumberPw = document.querySelector("input[name='modalPwPhoneInjung']");
	const inputModalIdPw = document.querySelector(".input-modal-id-pw");

	findPwModal.addEventListener('click', () => {
		pwModal.style.display = "flex";
	});

	closeFindPwModal.addEventListener('click', () => {
		pwModal.style.display = "none";
		inputModalNamePw.value = "";
		inputModalPnPw.readOnly = false;
		inputModalPnPw.style.backgroundColor = "white";
		inputModalPnPw.value = "";
		sendSMSPwBtn.style.backgroundColor = "#F38A6E";
		sendSMSPwBtn.style.color = "white";
		sendSMSPwBtn.disabled = false;
		inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
		inputPhoneNumberPw.readOnly = true;
		inputPhoneNumberPw.value = "";
		veriPw.style.color = "black";
		veriPw.style.backgroundColor = "#d9d9d9";
		veriPw.disabled = true;
		rePwPn.disabled = true;
		inputModalIdPw.value = "";
	})

	const sendSMSPwBtn = document.querySelector(".button-injung-pw");
	const veriPw = document.querySelector(".button-injung-do-pw");
	const rePwPn = document.querySelector(".button-retry-pw");

	// let tempCode = "";   // 임시 발급 코드 저장할 변수

	/*sendSMSPwBtn.addEventListener("click", function() {
		const phoneNumber = inputModalPnPw.value.trim();
		if (!phoneNumber) {
			alert("핸드폰 번호를 입력해주세요.");
			return;
		}

		// 6자리 난수 생성
		tempCode = String(Math.floor(100000 + Math.random() * 900000));
		console.log("임시 인증번호:", tempCode); // 콘솔 확인용



		alert("임시 인증번호는 [" + tempCode + "] 입니다.");
		inputModalPnPw.readOnly = true;
		inputModalPnPw.style.backgroundColor = "#d9d9d9";
		sendSMSPwBtn.style.backgroundColor = "#d9d9d9";
		sendSMSPwBtn.style.color = "black";
		sendSMSPwBtn.disabled = true;
		inputPhoneNumberPw.style.backgroundColor = "white";
		inputPhoneNumberPw.readOnly = false;
		veriPw.style.color = "white";
		veriPw.style.backgroundColor = "#F38A6E";
		veriPw.disabled = false;
		rePwPn.disabled = false;
	});
*/

	sendSMSPwBtn.addEventListener("click", function() {
		const phoneNumber = inputModalPnPw.value.trim().replace(/[^0-9]/g, "");
		if (!phoneNumber) {
			alert("핸드폰 번호를 입력해주세요");
			return;
		}
		console.log(phoneNumber);

		if (!pnRegex.test(inputModalPnPw.value)) {
			alert("-를 입력해 형식을 지켜주세요.");
			return;
		}

		fetch("/member/joinSMS.me", {
			method: 'POST',
			headers: {
				"Content-Type": "application/json",
				"X-Requested-With": "XMLHttpRequest"
			},
			body: JSON.stringify({ phoneNumberValue: phoneNumber })
		})
			.then(response => {
				if (!response.ok) throw new Error(`오류 상태 코드 : ${response.status}`);
			})
			.then(() => {
				console.log("인증번호발송 성공");
				inputModalPnPw.readOnly = true;
				inputModalPnPw.style.backgroundColor = "#d9d9d9";
				sendSMSPwBtn.style.backgroundColor = "#d9d9d9";
				sendSMSPwBtn.style.color = "black";
				sendSMSPwBtn.disabled = true;
				inputPhoneNumberPw.style.backgroundColor = "white";
				inputPhoneNumberPw.readOnly = false;
				veriPw.style.color = "white";
				veriPw.style.backgroundColor = "#F38A6E";
				veriPw.disabled = false;
				rePwPn.disabled = false;
			});
	});

	let checkPhonePw = true;

	veriPw.addEventListener("click", function() {
		const code = inputPhoneNumberPw.value.trim();

		if (code === "") {
			alert("인증번호를 입력해주세요");
			return;
		}

		fetch("/member/verifyCode.me", {
			method: 'POST',
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
					inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
					inputPhoneNumberPw.readOnly = true;
					veriPw.style.color = "black";
					veriPw.style.backgroundColor = "#d9d9d9";
					veriPw.disabled = true;
					checkPhonePw = false;
				} else {
					alert("인증번호가 맞지 않습니다.");
				}
			});
	});

	// ===== 인증번호 확인 (서버 대신 로컬 비교) =====
	/*veriPw.addEventListener("click", function() {
		const code = inputPhoneNumberPw.value.trim();
		if (!code) {
			alert("인증번호를 입력해주세요.");
		}

		if (code === tempCode) {
			alert("인증에 성공하였습니다.");
			inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
			inputPhoneNumberPw.readOnly = true;
			veriPw.style.color = "black";
			veriPw.style.backgroundColor = "#d9d9d9";
			veriPw.disabled = true;
		} else {
			alert("인증에 실패하였습니다.");
		}
	});
*/

	rePwPn.addEventListener("click", function() {
		inputModalPnPw.readOnly = false;
		inputModalPnPw.style.backgroundColor = "white";
		inputModalPnPw.value = "";
		sendSMSPwBtn.style.backgroundColor = "#F38A6E";
		sendSMSPwBtn.style.color = "white";
		sendSMSPwBtn.disabled = false;
		inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
		inputPhoneNumberPw.readOnly = true;
		inputPhoneNumberPw.value = "";
		veriPw.style.color = "black";
		veriPw.style.backgroundColor = "#d9d9d9";
		veriPw.disabled = true;
		rePwPn.disabled = true;
	});


	const findPwBtn = document.querySelector(".button-modal-find-pw");
	// let resultId = document.querySelector("#aa");
	const findPwEndBtn = document.querySelector(".button-modal-find-end-pw");


	findPwBtn.addEventListener("click", async () => {
		const name = inputModalNamePw.value.trim();
		const phoneNumber = inputModalPnPw.value.trim();
		const id = inputModalIdPw.value.trim();
		console.log(name);
		console.log(phoneNumber);
		console.log(id);

		if (!name || !phoneNumber || !id) {
			alert("이름과 전화번호를 입력해주세요.");
			return;
		}

		if (checkPhonePw) {
			alert("핸드폰 인증을 완료해주세요.");
			return;
		}

		try {
			const res = await fetch("/member/findPwOk.me", {
				method: 'POST',
				headers: {
					'content-Type': "application/x-www-form-urlencoded"
				},
				body: new URLSearchParams({
					modalPwName: name,
					modalPwPhone: phoneNumber,
					modalPwId: id
				})
			});

			if (!res.ok) throw new Error("서버에 오류가 발생했습니다.");
			const data = await res.json();
			console.log(`${data.memberPw}`);

			// 결과 모달에 값 추가
			document.getElementById('resultPw').textContent = `[ ${data.memberPassword} ]`;
			document.getElementById('resultName').textContent = `${data.memberName}`;

			pwModal.style.display = "none";
			pwResultModal.style.display = "flex";
		} catch (err) {
			console.error(err);
			alert("비밀번호를 찾을 수 없습니다.");
		}
	});

	findPwEndBtn.addEventListener("click", () => {
		pwResultModal.style.display = "none";
		inputModalNamePw.value = "";
		inputModalPnPw.readOnly = false;
		inputModalPnPw.style.backgroundColor = "white";
		inputModalPnPw.value = "";
		sendSMSPwBtn.style.backgroundColor = "#F38A6E";
		sendSMSPwBtn.style.color = "white";
		sendSMSPwBtn.disabled = false;
		inputPhoneNumberPw.style.backgroundColor = "#d9d9d9";
		inputPhoneNumberPw.readOnly = true;
		inputPhoneNumberPw.value = "";
		veriPw.style.color = "black";
		veriPw.style.backgroundColor = "#d9d9d9";
		veriPw.disabled = true;
		rePwPn.disabled = true;
		inputModalIdPw.value = "";
	});


});