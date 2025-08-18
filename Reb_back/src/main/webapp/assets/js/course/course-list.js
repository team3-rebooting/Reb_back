const listClick = document.querySelector(".li-course-list");

const writeBtn = document.querySelector(".button-write");
const writeLink = './expert-course-create-request.html'
writeBtn.addEventListener('click', () => {
  location.href = writeLink;
})
//버튼 클래스를 계속 바꿔줘야됨 모집중, 모집전, 모집종료