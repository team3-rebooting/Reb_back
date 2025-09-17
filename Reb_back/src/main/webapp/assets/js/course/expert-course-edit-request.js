window.addEventListener('DOMContentLoaded', () => {
	let warning = document.querySelector(".p-warning");
	let inputIn = document.querySelectorAll(".input-in");

	const days = document.querySelectorAll('.input-day');

	const form = document.querySelector('form');
	//const startDate = document.querySelector("input[name='recruitmentStartDate']");
	//const endDate = document.querySelector("input[name='recruitmentEndDate']");
	const rStartDate = document.querySelector("input[name='courseStartDate']");
	const rEndDate = document.querySelector("input[name='courseEndDate']");

	const imgFile = document.querySelector("input[type='file']");
	const orinalImgFile = document.querySelector("#original-file");
	/*const cStartTime = document.querySelector("input[name='courseStartTime']");
	const cEndTime = document.querySelector("input[name='courseEndTime']");*/
	const today = new Date();
	today.setDate(today.getDate() + 60);
	const futureday = today.toISOString().split('T')[0];
	/*startDate.setAttribute('min', today);*/
	rStartDate.setAttribute('min', futureday);
	rEndDate.setAttribute('min', futureday);

	const okButton = document.querySelector(".button-ok");
	const cancelButton = document.querySelector(".button-cancel");

	imgFile.addEventListener('change', (e) => {
		if (!confirm("정말로 수정하시겠습니까? 기존 이미지는 삭제됩니다")) {
			e.preventDefault();
		}else{
			orinalImgFile.innerHTML = "";
		}
	})

	form.addEventListener("submit", (e) => {
		let tf = true;
		if (confirm("정말로 수정 요청하시겠습니까?")) {
			for (let i = 0; i < inputIn.length; i++) {
				if (inputIn[i].value === null || inputIn[i].value.length === 0 || warning.style.display === 'block') {
					e.preventDefault();
					alert("모든 정보가 입력되어야 합니다");
					return;
				}

				let checkDay = false;
				days.forEach((d) => {
					if (d.checked)
						checkDay = true;
				})

				if (!checkDay) {
					e.preventDefault();
					alert("요일을 선택해주세요");
					return;
				}
			}
		}
	});

	cancelButton.addEventListener("click", (e) => {
		if (confirm("정말로 취소하시겠습니까? 내용은 전부 삭제됩니다")) {
			window.location.href = "/app/course/expert-course-create-request.jsp";
		}
		else {
			e.preventDefault();
		}
	});

	rStartDate.addEventListener('change', function() {
		if (rStartDate.value) {
			rEndDate.min = rStartDate.value;
		}
	}, false);

	rEndDate.addEventListener('change', function() {
		if (rEndDate.value) {
			rStartDate.max = rEndDate.value;
		}
	}, false);
})

/*let warning = document.querySelector(".p-warning");
let inputIn = document.querySelectorAll(".input-in");

const startDate = document.querySelector("input[name='recruitmentStartDate']");
const endDate = document.querySelector("input[name='recruitmentEndDate']");
const rStartDate = document.querySelector("input[name='courseStartDate']");
const rEndDate = document.querySelector("input[name='courseEndDate']");
const cStartTime = document.querySelector("input[name='courseStartTime']");
const cEndTime = document.querySelector("input[name='courseEndTime']");
const today = new Date();
today.setDate(today.getDate() + 60);
const futureday = today.toISOString().split('T')[0];
startDate.setAttribute('min', today);
rStartDate.setAttribute('min', futureday);

const okButton = document.querySelector(".button-ok");
const cancelButton = document.querySelector(".button-cancel");

okButton.addEventListener("click", (e) => {
  let tf = true;
  if (confirm("정말로 수정 요청하시겠습니까?")) {
	for (let i = 0; i < inputIn.length; i++) {
	  if (inputIn[i].value === null || inputIn[i].value.length === 0 ) {
		tf = false;
	  }
	}
	console.log(tf);
	if (tf === true) {
	  location.href = "./course-list.html";
	}
	else {
	  alert("모든 정보가 입력되어야 합니다");
	}
  }
  
});

cancelButton.addEventListener("click", (e) => {
  if (confirm("정말로 취소하시겠습니까? 내용은 전부 삭제됩니다")) {
	location.href = "./course-list.html";
  }
  else{
	e.preventDefault();
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
}, false);

rStartDate.addEventListener('change', function () {
  if (rStartDate.value) {
	rEndDate.min = rStartDate.value;
  }
}, false);

endDate.addEventListener('change', function () {
  if (rEndDate.value) {
	rStartDate.max = rEndDate.value;
  }
}, false);

*/