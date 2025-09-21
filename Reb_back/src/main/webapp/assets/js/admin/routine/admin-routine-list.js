const createBtn = document.querySelector("#main-create-routine");
const logoutBtn = document.querySelector("header>button");

createBtn.addEventListener('click', ()=>{
  location.href= "/admin/routineWrite.ad";
});

/*logoutBtn.addEventListener('click', ()=>{
  location.href= "/admin/logoutOk.ad";
});*/
