const cancelBtn = document.querySelector(".button-cancel");
const deleteCommentBtn = document.querySelectorAll(".div-comment-area>div>button");

cancelBtn.addEventListener('click', ()=>{
  if(confirm("삭제하시겠습니까?")){
    alert("삭제 되었습니다.");
    location.href= "./../../../app/admin/review/admin-routine-review-list.html";
  }
});


deleteCommentBtn.forEach(btn => {
  btn.addEventListener('click', function(e){
    const comment = e.target.parentNode;
    comment.remove();
  });
});

const moveBtn = document.querySelector(".back-list");
moveBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/review/admin-course-review-list.html";
});