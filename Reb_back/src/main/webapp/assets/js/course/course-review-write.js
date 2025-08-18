const okButton = document.querySelector(".button-ok");
const cancelButton = document.querySelector(".button-cancel");
const inputBundle = document.querySelectorAll(".input-bundle");

okButton.addEventListener("click",(e)=>{
  let isWrite = true;
  if(confirm("정말로 작성하시겠습니까?")){
    for(let i = 0 ; i<inputBundle.length;i++){
      if(inputBundle[i].value === null || inputBundle[i].value.length === 0 ){
        isWrite = false;
      } 
    }
    if(isWrite){
      alert("작성 완료");
      location.href="./course-review-list.html";
    }
    else{
      alert("제목, 이미지, 내용 확인해주세요");
    }
  }
  else{
    e.preventDefault();
  }
});

cancelButton.addEventListener("click",()=>{
  if(confirm("정말로 취소하시겠습니까? 내용은 전부 삭제됩니다")){
    location.href="./course-review-list.html";
  }
});