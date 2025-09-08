const addBtn = document.querySelector("#main-banner-btn>button:first-child");
const cancelBtn = document.querySelector("#main-banner-btn>button:nth-child(2)");

addBtn.addEventListener('click', () => {
  alert("배너 추가가 완료되었습니다.");
});

cancelBtn.addEventListener('click', (e) => {
  if (confirm("정말로 취소하시겠습니까 ?")) {
    alert("배너 등록을 취소하셨습니다.");
    location.href = "/admin/bannerListOk.ad";
  }
  else{
	e.preventDefault();
  }
});


const logoutBtn = document.querySelector("header>button");
logoutBtn.addEventListener('click', ()=>{
  location.href= "/admin/logoutOk.ad";
});

