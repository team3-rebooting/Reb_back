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

submitBtn.addEventListener("click", () => {
  if (returnMsg.value == "") {
    alert("사유를 입력해주세요.");
  } else {
    if (confirm("승인을 취소하시겠습니까?")) {
      alert("승인 취소되었습니다.");
      location.href = "./../../../app/admin/member/admin-expert-access-list.html";
      returnMsg.value = "";
    }
  }
});

closeModal.addEventListener(('click'), () => {
  dropModal.style.display = "none";
  returnMsg.value = "";
})