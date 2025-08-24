const addBtn = document.querySelector(".main-btn:first-child");
const cancelBtn = document.querySelector(".main-btn:last-child");
const inputIn = document.querySelectorAll(".input-in");

// addBtn.addEventListener('click', ()=>{
//   if(confirm("작성하시겠습니까?")){
//     alert("작성 완료되었습니다.");
//     location.href= "./../../../app/admin/notice/admin-notice-detail.html";
//   }
// });

cancelBtn.addEventListener('click', ()=>{
  if(confirm("작성하신 내용은 사라집니다.작성을 취소하시겠습니까?")){
    alert("작성을 취소하셨습니다.");
    window.location.href= "/admin/noticeListOk.ad";
  }
});

addBtn.addEventListener("click", (e) => {
  let tf = true;
  if (confirm("작성하시겠습니까?")) {
    for (let i = 0; i < inputIn.length; i++) {
      if (inputIn[i].value === null || inputIn[i].value.length === 0) {
        tf = false;
      }
    }
    if (tf === true) {
      alert("작성 완료");
    }
    else {
      alert("모든 정보가 입력되어야 합니다");
    }
  }

});