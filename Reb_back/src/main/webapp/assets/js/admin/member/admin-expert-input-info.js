const license = document.querySelector("#license");
const career = document.querySelector("#career");
const addBtn = document.querySelector("#main-submit-btn");
const cancelBtn = document.querySelector("#main-cancel-btn");
const file = document.querySelector("#file");

addBtn.addEventListener('click', () => {
  if (file.value != "") {
    if (license.value == "" && career.value == "") {
      alert("자격증과 경력 중 적어도 1개는 입력해주셔야합니다.");
    } else {
      alert("등록이 완료되었습니다.");
      location.href = "./../../../app/admin/member/admin-expert-access-detail.html";
    }
  } else{
    alert("파일을 입력해주세요");
  }
});

cancelBtn.addEventListener('click', () => {
  if (confirm("등록을 취소하시겠습니까?")) {
    alert("등록을 취소하셨습니다.");
    location.href = "./../../../app/admin/member/admin-expert-access-list.html";
  }
})