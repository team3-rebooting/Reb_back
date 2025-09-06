window.addEventListener('DOMContentLoaded', () => {
	const okButton = document.querySelector(".button-ok");
	const cancelButton = document.querySelector(".button-cancel");
	const inputBundle = document.querySelectorAll(".input-bundle");

	okButton.addEventListener("click", (e) => {
		let isWrite = true;
		if (confirm("정말로 수정하시겠습니까?")) {
			for (let i = 0; i < inputBundle.length; i++) {
				if (inputBundle[i].value === null || inputBundle[i].value.length === 0) {
					isWrite = false;
				}
			}
			if (isWrite) {
				
			}
			else {
				alert("제목, 이미지, 내용 확인해주세요");
			}
		}
		else {
			e.preventDefault();
		}
	});

	cancelButton.addEventListener("click", (e) => {
		if (confirm("정말로 취소하시겠습니까? 내용은 전부 삭제됩니다")) {
			history.back();
		}
		else {
			e.preventDefault();
		}
	});
})