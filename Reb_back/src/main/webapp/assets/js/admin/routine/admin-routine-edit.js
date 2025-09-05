const okBtn = document.querySelector(".button-ok");
const cancelBtn = document.querySelector(".button-cancel");
const startDate = document.querySelector("#start-date");
const endDate = document.querySelector("#end-date");
const rStartDate = document.querySelector("#routine-start-date");
const rEndDate = document.querySelector("#routine-end-date");
const startTime = document.getElementById("start-time");
const endTime = document.getElementById("end-time");
let now = new Date();
let today = new Date(now.getTime() + 9 * 60 * 60 * 1000).toISOString().split('T')[0];
startDate.setAttribute('min', today);
rStartDate.setAttribute('min', today);
const inputIn = document.querySelectorAll(".input-in");

cancelBtn.addEventListener('click', () => {
  if (confirm("작성하신 내용을 지우시겠습니까?")) {
    alert("작성을 취소하셨습니다.");
    location.href = "/admin/routineList.ad";
  }
});

startDate.addEventListener('change', function () {
  if (startDate.value) {
    endDate.min = startDate.value;
  }
}, false);

endDate.addEventListener('change', function () {
  if (endDate.value) {
    startDate.max = endDate.value;
    rStartDate.setAttribute('min', endDate.value);
  }
  rStartDate.readOnly = false;
  rEndDate.readOnly = false;
}, false);

rStartDate.addEventListener('change', function () {
  if (rStartDate.value) {
    rEndDate.min = rStartDate.value;
  }
}, false);

rEndDate.addEventListener('change', function () {
  if (rEndDate.value) {
    rStartDate.max = rEndDate.value;
  }
  startTime.readOnly= false;
  endTime.readOnly= false;
}, false);

startTime.addEventListener('input', function () {
  endTime.min = startTime.value;

  if (endTime.value && endTime.value < startTime.value) {
    endTime.value = "";
  }
});

endTime.addEventListener('input', function () {
  startTime.max = endTime.value;

  if (startTime.value && startTime.value > endTime.value) {
    startTime.value = "";
  }
});

okBtn.addEventListener("click", (e) => {
  let tf = true;
  if (confirm("정말로 수정하시겠습니까?")) {
    for (let i = 0; i < inputIn.length; i++) {
      if (inputIn[i].value === null || inputIn[i].value.length === 0) {
        tf = false;
      }
    }
    if (tf === true) {
      alert("수정 완료되었습니다.");
    }
    else {
      alert("모든 정보가 입력되어야 합니다");
	  e.preventDefault();
    }
  }
  else{
	e.preventDefault();
  }

});