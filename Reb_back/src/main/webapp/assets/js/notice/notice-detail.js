document.addEventListener("DOMContentLoaded", function () {
  const backButton = document.querySelector(".back-list");

  backButton.addEventListener("click", function () {
    // 브라우저 뒤로 가기
    window.history.back();

    // 또는 특정 페이지로 이동하려면 아래 사용
    // window.location.href = "./../../app/notice/notice-list.html";
  });
});