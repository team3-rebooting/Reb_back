const dropBtns = document.querySelectorAll(".button-cancel");
const dropModal = document.querySelector("#modal-background");
const submitBtns = document.querySelectorAll("#submit");
const closeModal = document.querySelector("#close-modal");
const returnMsgs = document.querySelectorAll("#return-message");
const updateBtn = document.querySelector("#div-admin-detail-button-update");
const deleteBtn = document.querySelector("#div-admin-detail-button-delete");
const chooseBtn = document.querySelector("#choose-create");
const viewBtn = document.querySelector("#view-button");
const approveButtons = document.querySelectorAll('.button-application');

approveButtons.forEach(button => {
	button.addEventListener('click', () => {
		if (confirm("정말 승인하시겠습니까?")) {
			const courseNumber = button.dataset.courseNumber;
			const state = button.dataset.courseRequestType;
			if (state === '1') {
				alert("승인되었습니다");
				window.location.href = `/admin/courseRequestApproveOk.ad?courseNumber=${courseNumber}`
			}
			/*if(state === '3'){
				window.location.href = `/admin/courseRequestDeleteOk.ad?courseNumber=${courseNumber}`
			}*/

		}
	});
});

dropBtns.forEach((dropBtn, index) => {
    dropBtn.addEventListener('click', () => {
        dropModal.style.display = "flex";
        dropModal.style.zIndex = 5;
        const submitBtn = submitBtns[index];
        const returnMsg = returnMsgs[index];

        submitBtn.onclick = async () => {
            if (returnMsg.value === "") {
                alert("사유를 입력해주세요.");
                return;
            }

            const courseNumber = dropBtn.dataset.courseNumber;
            const companionType = dropBtn.dataset.companionType;

            const bodyData = { courseNumber : courseNumber, returnMsg: returnMsg.value, companionType : companionType };

            try {
                const response = await fetch("/admin/courseRequestCompanionOk.ad", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json; charset=utf-8",
                        "X-Requested-With": "XMLHttpRequest",
                    },
                    body: JSON.stringify(bodyData),
                });
                const result = await safeJson(response);
                if (result?.status === "success") {
                    alert("반려 완료");
                    window.location.href = "/admin/courseRequestListOk.ad";
                } else {
                    alert("반려 실패");
                }
            } catch (error) {
                console.error("반려 실패:", error);
                alert("반려 중 오류가 발생했습니다.");
            }

            returnMsg.value = "";
            dropModal.style.display = "none";
        };
    });
});

closeModal.addEventListener(('click'), () => {
	dropModal.style.display = "none";
	returnMsgs.forEach(input => input.value = "");
})

const moveBtn = document.querySelector(".back-list");
moveBtn.addEventListener('click', () => {
	location.href = "/admin/courseRequestListOk.ad?page=1";
});



// 성공 실패 확인
async function safeJson(res) {
  const text = await res.text();
  try { return text ? JSON.parse(text) : null; } catch { return null; }
}

