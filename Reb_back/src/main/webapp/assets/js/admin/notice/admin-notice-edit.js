const addBtn = document.querySelector(".main-btn:first-child");
const cancelBtn = document.querySelector(".main-btn:last-child");
const inputIn = document.querySelectorAll(".input-in");


cancelBtn.addEventListener('click', ()=>{
  if(confirm("수정하신 내용은 사라집니다.수정을 취소하시겠습니까?")){
    alert("수정을 취소하셨습니다.");
    window.location.href= `/admin/noticeListOk.ad`;
  }
});

let tf = true;
addBtn.addEventListener("click", (e) => {
  if (confirm("수정하시겠습니까?")) {
    for (let i = 0; i < inputIn.length; i++) {
      if (inputIn[i].value === null || inputIn[i].value.length === 0) {
        tf = false;
      }
    }
    if (tf === true) {
      alert("수정 완료되었습니다.");
    }
    else {
      alert("모든 정보가 입력되어야 합니다");
    }
  }

});