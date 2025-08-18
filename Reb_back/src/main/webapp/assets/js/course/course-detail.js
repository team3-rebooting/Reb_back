const buttonApp = document.querySelector(".button-application");
const buttonCancel = document.querySelector(".button-cancel");
const modal = document.querySelector(".modal-background");
const deleteBtn = document.querySelector(".button-delete");
const modalClose = document.querySelector(".button-x");
const buttonModalDelete = document.querySelector(".button-modal-delete");
const textareaDelete = document.querySelector(".textarea-delete-modal");
const back = document.querySelector(".p-back");

buttonApp.addEventListener("click",()=>{
  if(confirm("신청하시겠습니까?")){
    buttonApp.style.display= 'none';
    buttonCancel.style.display = 'block';
  }
});

buttonCancel.addEventListener("click",()=>{
  if(confirm("취소하시겠습니까?")){
    buttonCancel.style.display= 'none';
    buttonApp.style.display = 'block';
  }
});

deleteBtn.addEventListener('click', () => {
  modal.style.display = "flex";
});

modalClose.addEventListener('click',()=>{
  modal.style.display = "none";
});

buttonModalDelete.addEventListener('click',()=>{
  console.log(textareaDelete.value.length);
   if(textareaDelete.value === "" || textareaDelete.value.length === 0){
      alert("요청을 입력해주세요");
    }
    else{
      alert("삭제 요청 완료되었습니다");
      textareaDelete.value = null;
      modal.style.display ="none";
      location.href= "./course-detail-expert-delete-ing.html";
    }
});


back.addEventListener("click",()=>{
  history.back();
});
