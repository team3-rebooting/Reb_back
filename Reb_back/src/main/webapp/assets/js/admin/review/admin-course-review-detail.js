const deleteButton = document.querySelector(".button-cancel");
const deleteCommentBtn = document.querySelectorAll(".div-comment-area>div>button");

deleteButton.addEventListener("click", async (e) => {
		if (confirm("정말 삭제하시겠습니까?")) {
			try {
				const response = await fetch(`/admin/courseReviewDeleteOk.ad?reviewNumber=${e.target.dataset.reviewNumber}&memberNumber=${e.target.dataset.memberNumber}`);
				const result = await safeJson(response);
				if (result?.status === "success") {
					alert("삭제 완료");
					location.href = `/admin/courseReviewListOk.ad`;
				} else {
					alert("삭제 실패");
				}
			} catch (error) {
				console.error("삭제 실패:", error);
				alert("삭제 중 오류가 발생했습니다.");
			}
		}
		else {
			e.preventDefault();
		}
	});


deleteCommentBtn.forEach(btn => {
  btn.addEventListener('click', function(e){
    const comment = e.target.parentNode;
    comment.remove();
  });
});

const moveBtn = document.querySelector(".back-list");
moveBtn.addEventListener('click', ()=>{
  location.href= "/admin/courseReviewListOk.ad?page=1";
});

async function safeJson(res) {
	const text = await res.text();
	try { return text ? JSON.parse(text) : null; } catch { return null; }
}