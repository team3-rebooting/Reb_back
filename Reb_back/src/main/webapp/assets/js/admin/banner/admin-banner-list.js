const addBtn = document.querySelector("#main-banner-add");
const logoutBtn = document.querySelector("header>button");
const deleteBtn = document.querySelectorAll(".delete");
let bannerList = document.querySelectorAll("#main-banner-list>li");

addBtn.addEventListener('click', () => {
  let bannerCount = document.querySelectorAll("#main-banner-list>li");
  if (bannerCount.length >= 10) {
    alert("최대 10개까지 등록 가능합니다");
  } else {
    location.href = "./../../../app/admin/banner/admin-banner-create.html";
  }
});

logoutBtn.addEventListener('click', () => {
  location.href = "./../login/admin-login.html";
});

deleteBtn.forEach(btn => {
  btn.addEventListener('click', function (e) {
    if (confirm("정말로 삭제하시겠습니까?")) {
      alert("삭제 완료되었습니다.");
      const list = e.target.parentNode.parentNode.parentNode;
      list.remove();
    };
  });
});

