window.addEventListener('DOMContentLoaded', () => {
	const buttonApp = document.querySelector(".button-application");
	const buttonCancel = document.querySelector(".button-cancel");
	const back = document.querySelector(".p-back");
	const routineNumber = document.querySelector("#routineNumber").value;
	const applicantCount = document.querySelector('#applicant-count');
	
	back.addEventListener("click", () => {
		history.back();
	});

	// ====== 유틸 ======
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}

	/*buttonApp.addEventListener("click", () => {
		if (confirm("신청하시겠습니까?")) {
			buttonApp.style.display = 'none';
			buttonCancel.style.display = 'block';
		}
	});

	buttonCancel.addEventListener("click", () => {
		if (confirm("취소하시겠습니까?")) {
			buttonCancel.style.display = 'none';
			buttonApp.style.display = 'block';
		}
	});
*/

	buttonCancel.addEventListener("click", async () => {
		if (confirm("취소하시겠습니까?")) {
			try {
				const response = await fetch(`/routine/routineApplyOk.ro`, {
					method: "POST",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
					body: JSON.stringify({ routineNumber: routineNumber, apply: false }),
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
				const response = await fetch(`/routine/routineApplyOk.ro`, {
					method: "POST",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
					body: JSON.stringify({ routineNumber: routineNumber, apply: true }),
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

