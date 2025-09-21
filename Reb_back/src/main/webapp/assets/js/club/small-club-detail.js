document.addEventListener("DOMContentLoaded", () => {
	const deleteBtn = document.querySelector(".button-cancel");
	const back = document.querySelector(".p-back");
	const editBtn = document.querySelector(".button-application-edit");

	const smallClubNumber = document.querySelector("#small-club-number").value;

	const courseReviewNumber = editBtn?.dataset.courseReviewNumber ?? window.courseReviewNumber;
	const memberNumber = editBtn?.dataset.memberNumber ?? window.memberNumber;

	const buttonApp = document.querySelector(".button-application");
	const buttonCancel = document.querySelector(".button-application-cancel");
	const applicantCount = document.querySelector('#applicant-count');



	// ====== 유틸 ======
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}

	back.addEventListener("click", () => {
		history.back();
	});

	editBtn?.addEventListener("click", () => {
		console.log("수정 버튼 클릭");
		console.log(memberNumber);
		if (!smallClubNumber) return alert("smallClubNumber가 없습니다");
		window.location.href = `/club/smallClubEdit.cl?smallClubNumber=${encodeURIComponent(smallClubNumber)}`;
	});


	deleteBtn?.addEventListener("click", async () => {
		if (!smallClubNumber) return alert("smallClubNumber가 없습니다");
		if (!confirm("정말로 삭제하시겠습니까?")) return;

		try {
			const res = await fetch(`/club/smallClubDeleteOk.cl?smallClubNumber=${encodeURIComponent(smallClubNumber)}`, {
				method: "GET",
				headers: { "X-Requested-With": "XMLHttpRequest" }
			});

			if (!res.ok) throw new Error("삭제 요청 실패");

			alert("게시글이 삭제되었습니다.");
			window.location.href = "/club/smallClubListOk.cl";
		} catch (err) {
			console.error("게시글 삭제 실패 : ", err);
			alert("게시글 삭제에 실패했습니다.");
		}
	});
	
	

	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}

	buttonCancel.addEventListener("click", async () => {
		if (confirm("취소하시겠습니까?")) {
			try {
				const response = await fetch(`/club/smallClubApplyOk.cl`, {
					method: "POST",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
					body: JSON.stringify({ smallClubNumber: smallClubNumber, apply: false }),
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
				const response = await fetch(`/club/smallClubApplyOk.cl`, {
					method: "POST",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
					body: JSON.stringify({ smallClubNumber: smallClubNumber, apply: true }),
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

});