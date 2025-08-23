const createBtn = document.querySelector(".button-application");
const dropBtn = document.querySelector(".button-cancel");
const dropModal = document.querySelector("#modal-background");
const submitBtn = document.querySelector("#submit");
const closeModal = document.querySelector("#close-modal");
const returnMsg = document.querySelector("#return-message");
const updateBtn = document.querySelector("#div-admin-detail-button-update");
const deleteBtn = document.querySelector("#div-admin-detail-button-delete");
const chooseBtn = document.querySelector("#choose-create");
const viewBtn = document.querySelector("#view-button");

createBtn.addEventListener('click', () => {
  alert("개설을 승인하였습니다.");
  location.href = "./../../../app/admin/course/admin-course-detail.html";
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
  location.href = "./../../../app/admin/course/admin-course-request-list.html";
});

chooseBtn.addEventListener('click', () => {
  updateBtn.style.display = "none";
  deleteBtn.style.display = "none";
});

viewBtn.addEventListener('click', () => {
  updateBtn.style.display = "flex";
  deleteBtn.style.display = "flex";
});