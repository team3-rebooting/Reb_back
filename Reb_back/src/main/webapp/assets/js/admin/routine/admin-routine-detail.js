const updateBtn = document.querySelector(".button-update");
const deleteBtn = document.querySelector(".button-delete");

updateBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/routine/admin-routine-create.html";
});

deleteBtn.addEventListener('click', ()=>{
  if(confirm("삭제하시겠습니까?")){
    alert("삭제 완료되었습니다.");
    location.href= "./../../../app/admin/routine/admin-routine-list.html";
  }
});

const moveBtn = document.querySelector(".back-list");
moveBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/routine/admin-routine-list.html";
});