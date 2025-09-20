const modalBackground = document.querySelector("#modal-background");
const acceptBtn = document.querySelectorAll(".accept");
const cancelBtn = document.querySelectorAll(".cancel");
const submitBtn = document.querySelector("#submit");
const closeModal = document.querySelector("#close-modal");
const returnMsg = document.querySelector("#return-message");


acceptBtn?.forEach(btn => {
	btn.addEventListener('click', function() {
		const memberNumber = btn.dataset.memberNumber;
		if (!memberNumber) return alert("memberNumber가 없습니다");
		window.location.href = `/admin/expertAcceptWrite.ad?memberNumber=${memberNumber}`;
	});
});


cancelBtn?.forEach(btn => {
	btn.addEventListener('click', function() {
		const memberNumber = btn.dataset.memberNumber;
		modalBackground.style.display = "flex";
		modalBackground.style.zIndex = 5;
		submitBtn.addEventListener('click', async () => {
			if (returnMsg.value == "") {
				alert("사유를 입력해주세요");
			} else {
				try {
					const response = await fetch("/admin/expertCompanionOk.ad", {
						method: "POST",
						headers: {
							"Content-Type": "application/json; charset=utf-8",
							"X-Requested-With": "XMLHttpRequest",
						},
						body: JSON.stringify({
							memberNumber: memberNumber, returnMsg: returnMsg.value,
							isExpert: false
						}),
					});
					const result = await safeJson(response);
					if (result?.status === "success") {
						alert("반려 완료");
						window.location.href = "/admin/expertApplicantListOk.ad";
					} else {
						alert("반려 실패");
					}
				} catch (error) {
					console.error("반려 실패:", error);
					alert("반려 중 오류가 발생했습니다.");
				} finally {
					returnMsg.value = "";
					modalBackground.style.display = "none";
				};
			}
		});
	});
});



closeModal.addEventListener(('click'), () => {
	modalBackground.style.display = "none";
});





// 성공 실패 확인
async function safeJson(res) {
	const text = await res.text();
	try { return text ? JSON.parse(text) : null; } catch { return null; }
}

