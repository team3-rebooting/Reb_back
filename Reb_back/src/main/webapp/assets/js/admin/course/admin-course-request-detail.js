const dropBtn = document.querySelector(".button-cancel");
const dropModal = document.querySelector("#modal-background");
const submitBtn = document.querySelector("#submit");
const closeModal = document.querySelector("#close-modal");
const returnMsg = document.querySelector("#return-message");
const updateBtn = document.querySelector("#div-admin-detail-button-update");
const deleteBtn = document.querySelector("#div-admin-detail-button-delete");
const chooseBtn = document.querySelector("#choose-create");
const viewBtn = document.querySelector("#view-button");
const approveButtons = document.querySelectorAll('.button-application');

approveButtons.forEach(button => {
    button.addEventListener('click', () => {
		if(confirm("정말 승인하시겠습니까?")){	
        const courseNumber = button.dataset.courseNumber;
		const state = button.dataset.courseRequestType;
		if(state === '1'){
			alert("승인되었습니다");
			window.location.href = `/admin/courseRequestApproveOk.ad?courseNumber=${courseNumber}`								
		}
		/*if(state === '3'){
			window.location.href = `/admin/courseRequestDeleteOk.ad?courseNumber=${courseNumber}`
		}*/
		
		}
    });
});


dropBtn.addEventListener('click', () => {
  dropModal.style.display = "flex";
  dropModal.style.zIndex = 5;
});

submitBtn.addEventListener("click", () => {
  if (returnMsg.value == "") {
    alert("사유를 입력해주세요.");
  } else {
    alert("개설을 반려하였습니다.");
    location.href = "./../../../app/admin/course/admin-course-request-list.html";
    returnMsg.value = "";
  }
});

closeModal.addEventListener(('click'), () => {
  dropModal.style.display = "none";
  returnMsg.value = "";
})

const moveBtn = document.querySelector(".back-list");
moveBtn.addEventListener('click', () => {
  location.href = "/admin/courseRequestListOk.ad?page=1";
});

