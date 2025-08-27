const createBtn = document.querySelector("#main-create-notice");

createBtn.addEventListener('click', ()=>{
  location.href= "/admin/noticeWrite.ad";
});

const logoutBtn = document.querySelector("header>button");
logoutBtn.addEventListener('click', ()=>{
  location.href= "/admin/logoutOk.ad";
});