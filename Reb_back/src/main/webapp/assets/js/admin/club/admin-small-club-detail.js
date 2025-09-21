document.addEventListener("DOMContentLoaded", () => {
	const deleteBtn = document.querySelector(".button-cancel");
	const smallClubNumber = document.querySelector("#small-club-number").value;

	deleteBtn?.addEventListener("click", async () => {
		if (!smallClubNumber) return alert("smallClubNumber가 없습니다");
		if (!confirm("정말로 삭제하시겠습니까?")) return;

		try {
			const res = await fetch(`/admin/smallclubDeleteOk.ad?smallClubNumber=${encodeURIComponent(smallClubNumber)}`, {
				method: "GET",
				headers: { "X-Requested-With": "XMLHttpRequest" }
			});

			if (!res.ok) throw new Error("삭제 요청 실패");

			alert("게시글이 삭제되었습니다.");
			window.location.href = "/admin/smallclubListOk.ad";
		} catch (err) {
			console.error("게시글 삭제 실패 : ", err);
			alert("게시글 삭제에 실패했습니다.");
		}
	});

});