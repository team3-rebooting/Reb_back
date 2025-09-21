document.addEventListener("DOMContentLoaded", () => {
	const deleteBtn = document.querySelector(".button-cancel");
	const back = document.querySelector(".p-back");
	const editBtn = document.querySelector(".button-application");

	const smallClubNumber = document.querySelector("#small-club-number").value;

	const courseReviewNumber = editBtn?.dataset.courseReviewNumber ?? window.courseReviewNumber;
	const memberNumber = editBtn?.dataset.memberNumber ?? window.memberNumber;

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

});