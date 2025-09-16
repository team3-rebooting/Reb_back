window.addEventListener('DOMContentLoaded', () => {
	const buttonApp = document.querySelector(".button-application");
	const buttonCancel = document.querySelector(".button-cancel");
	const back = document.querySelector(".p-back");
	const courseNumber = document.querySelector("#courseNumber").value;
	const applicantCount = document.querySelector('#applicant-count');


	const modal = document.querySelector(".modal-background");
	const deleteBtn = document.querySelector(".button-delete");
	const modalClose = document.querySelector(".button-x");
	const buttonModalDelete = document.querySelector(".button-modal-delete");
	const textareaDelete = document.querySelector(".textarea-delete-modal");

	deleteBtn.addEventListener('click', () => {
		modal.style.display = "flex";
	});

	modalClose.addEventListener('click', () => {
		modal.style.display = "none";
	});

	buttonModalDelete.addEventListener('click', (e) => {
		console.log(textareaDelete.value.length);
		if (textareaDelete.value === "" || textareaDelete.value.length === 0) {
			e.preventDefault();
			alert("요청을 입력해주세요");
		}
		else {
			alert("삭제 요청 완료되었습니다");
			/*textareaDelete.value = null;*/
			modal.style.display = "none";
		}
	});


	back.addEventListener("click", () => {
		history.back();
	});

	// ====== 유틸 ======
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}

	buttonCancel.addEventListener("click", async () => {
		if (confirm("취소하시겠습니까?")) {
			try {
				const response = await fetch(`/course/courseApplyOk.co`, {
					method: "POST",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
					body: JSON.stringify({ courseNumber: courseNumber, apply: false }),
				});

				const result = await safeJson(response);
				if (result?.status === "success") {
					alert("신청 취소 완료");
					applicantCount.innerHTML = parseInt(applicantCount.innerHTML) - 1;
					buttonCancel.style.display = 'none';
					buttonApp.style.display = 'block';
				} else {
					alert("신청 취소  실패");
				}
			} catch (error) {
				console.error("신청 취소 실패:", error);
				alert("신청 취소 중 오류가 발생했습니다.");
			}
		}
	})

	buttonApp.addEventListener("click", async () => {
		if (confirm("신청하시겠습니까?")) {
			try {
				const response = await fetch(`/course/courseApplyOk.co`, {
					method: "POST",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
					body: JSON.stringify({ courseNumber: courseNumber, apply: true }),
				});

				const result = await safeJson(response);
				if (result?.status === "success") {
					alert("신청 완료");
					applicantCount.innerHTML = parseInt(applicantCount.innerHTML) + 1;
					buttonApp.style.display = 'none';
					buttonCancel.style.display = 'block';
				} else {
					alert("신청 실패");
				}
			} catch (error) {
				console.error("신청 실패:", error);
				alert("신청 중 오류가 발생했습니다.");
			}
		}
	})

})

