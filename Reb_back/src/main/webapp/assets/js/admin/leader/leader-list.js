const addBtn = document.querySelector("#main-leader-add");
const delBtn = document.querySelectorAll(".deleteBtn");

addBtn.addEventListener("click", () => {
	window.location.href = "/admin/leaderWrite.ad";
});


delBtn?.forEach(button => {
	button.addEventListener("click", async () => {
		if (confirm("정말로 삭제하시겠습니까?")) {
			try {
				const leaderNumber = button.dataset.leaderNumber;
				const response = await fetch(`/admin/leaderDeleteOk.ad?leaderNumber=${leaderNumber}`, {
					method: "GET",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
				});
				
				const result = await response.json();

				if (result.status === "success") {
				  alert("삭제 완료되었습니다.");
				  window.location.href = "/admin/leaderListOk.ad";
				} else {
				  alert(result.message);
				}
			} catch (error) {
				console.error("삭제 실패:", error);
				alert("삭제 중 오류가 발생했습니다.");
			}
		}

	});
});