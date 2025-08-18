const deleteButton = document.querySelector(".button-cancel");
const heart = document.querySelector(".fa-heart");
const back = document.querySelector(".p-back");

back.addEventListener("click",()=>{
  history.back();
});

deleteButton.addEventListener("click",(e)=>{
  if(confirm("정말 삭제하시겠습니까?")){
    alert("삭제 완료");
    location.href = "./course-review-list.html";
  }
  else{
    e.preventDefault();
  }
});

heart.addEventListener('click',()=>{
  if(heart.classList.contains('fa-regular')){
    heart.classList.replace('fa-regular','fa-solid');
  }
  else{
    heart.classList.replace('fa-solid','fa-regular');
  }
});

let edit = document.querySelectorAll(".span-comment-edit");
let commentAdd = document.querySelector(".input-comment");
const buttonWrite = document.querySelector(".button-write");
const commentList = document.querySelector(".ul-comment-list");
const commentDelete = document.querySelectorAll(".span-comment-delete");

buttonWrite.addEventListener('click', (e) => {
    let newLi = document.createElement('li');
    newLi.setAttribute('class', 'li-comment');
    newLi.innerHTML = '<div class="div-user-profile"><img src="./../../assets/img/karina.jpg" class="img-user-profile"></div>' +
      '<div class="div-user-info">' +
      '<div class="div-user-name-area">' +
      '<p class="p-user-name">곰융</p><span class="span-comment-edit">수정</span>' +
      '</div>' +
      '<div class="div-user-text-area">' +
      '<p class="p-comment-text">' + commentAdd.value + '</p><span class="span-comment-delete">삭제</span>' +
      '</div>' +
      '<p class="p-update-date">2025.07.02<span class="p-update-status"></span></p>' +
      '</div>';
    if (commentAdd.value != null && commentAdd.value.length != 0) {
      commentList.appendChild(newLi);
      commentAdd.value = "";
    }
});

commentList.addEventListener('click',(e)=>{
  console.log(e.target.classList);
  if(e.target.classList.value ==='span-comment-edit'){
    console.log(e.target.parentNode.nextNode);
    // const commentEdit = e.target.parentNode.nextSibling.firstChild;
    // console.log(commentEdit);
  }
  if(e.target.classList.value ==='span-comment-delete'){
    if(confirm("삭제하시겠습니까?")){
       const comment = e.target.parentNode.parentNode.parentNode;
       comment.remove();
    }
  }
});




