const updateBtn = document.querySelector(".main-btn:first-child");
const deleteBtn = document.querySelector(".main-btn:last-child");
const backListBtn = document.querySelector(".back-list");

updateBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/notice/admin-notice-edit.html";
});

deleteBtn.addEventListener('click', ()=>{
  if(confirm("삭제하시겠습니까?")){
    alert("삭제 완료되었습니다.");
    location.href= "./../../../app/admin/notice/admin-notice-list.html";
  }
});

const moveBtn = document.querySelector(".back-list");
moveBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/notice/admin-notice-list.html"
});

backListBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/notice/admin-notice-list.html";
});