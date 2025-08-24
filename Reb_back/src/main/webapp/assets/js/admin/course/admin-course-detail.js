const moveBtn = document.querySelector(".back-list");
const deleteBtn = document.querySelector(".button-cancel");
const dropModal = document.querySelector("#modal-background");
const submitBtn = document.querySelector("#submit");
const closeModal = document.querySelector("#close-modal");
const returnMsg = document.querySelector("#return-message");


moveBtn.addEventListener('click', () => {
  location.href = "/admin/courseListOk.ad?page=1";
});

deleteBtn.addEventListener('click', () => {
  if(confirm("정말로 삭제하시겠습니까?")){
    alert("수업이 삭제되었습니다.");
    location.href= "/admin/courseListOk.ad?page=1";
  }
});

