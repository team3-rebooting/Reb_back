const createBtn = document.querySelector("#main-create-notice");

createBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/notice/admin-notice-create.html";
});

const logoutBtn = document.querySelector("header>button");
logoutBtn.addEventListener('click', ()=>{
  location.href= "./../login/admin-login.html";
});