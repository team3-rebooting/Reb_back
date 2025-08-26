const license = document.querySelector("#license");
const career = document.querySelector("#career");
const addBtn = document.querySelector("#main-submit-btn");
const cancelBtn = document.querySelector("#main-cancel-btn");
const file = document.querySelector("#file");

addBtn.addEventListener('click', (e) => {
    if (license.value == "" && career.value == "") {
      alert("자격증과 경력 중 적어도 1개는 입력해주셔야합니다.");
		e.preventDefault();
    } else {
      alert("등록이 완료되었습니다.");
    }
});

cancelBtn.addEventListener('click', () => {
  if (confirm("등록을 취소하시겠습니까?")) {
    alert("등록을 취소하셨습니다.");
    window.location.href = "/admin/expertApplicantListOk.ad";
  }
})