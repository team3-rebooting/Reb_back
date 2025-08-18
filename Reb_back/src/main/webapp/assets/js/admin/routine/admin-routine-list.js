const createBtn = document.querySelector("#main-create-routine");
const logoutBtn = document.querySelector("header>button");

createBtn.addEventListener('click', ()=>{
  location.href= "./../../../app/admin/routine/admin-routine-create.html";
});

logoutBtn.addEventListener('click', ()=>{
  location.href= "./../login/admin-login.html";
});
