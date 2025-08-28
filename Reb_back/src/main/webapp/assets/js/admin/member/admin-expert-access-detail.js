const moveBtn = document.querySelector(".back-list");
const deleteBtn = document.querySelector(".button-cancel");
const dropModal = document.querySelector("#modal-background");
const submitBtn = document.querySelector("#submit");
const closeModal = document.querySelector("#close-modal");
const returnMsg = document.querySelector("#return-message");


moveBtn.addEventListener('click', () => {
	location.href = "/admin/expertListOk.ad?page=1";
});

deleteBtn.addEventListener('click', () => {
	dropModal.style.display = "flex";
	dropModal.style.zIndex = 5;
});

submitBtn.addEventListener("click", async (e) => {
		const memberNumber = e.target.dataset.memberNumber;
	if (returnMsg.value == "") {
		alert("사유를 입력해주세요.");
	} else {
		try {
			const response = await fetch("/admin/expertCompanionOk.ad", {
				method: "POST",
				headers: {
					"Content-Type": "application/json; charset=utf-8",
					"X-Requested-With": "XMLHttpRequest",
				},
				body: JSON.stringify({ memberNumber: memberNumber, returnMsg: returnMsg.value,isExpert : true}),
			});
			const result = await safeJson(response);
			console.log(result);
			if (result?.status === "success") {
				alert("반려 완료");
				window.location.href = "/admin/expertListOk.ad";
			} else {
				alert("반려 실패");
			}
		}
		catch (error) {
			console.error("반려 실패:", error);
			alert("반려 중 오류가 발생했습니다.");
		}
		returnMsg.value = "";
		dropModal.style.display = "none";
	}
});

closeModal.addEventListener(('click'), () => {
	dropModal.style.display = "none";
	returnMsg.value = "";
});



// 성공 실패 확인
async function safeJson(res) {
  const text = await res.text();
  try { return text ? JSON.parse(text) : null; } catch { return null; }
}
