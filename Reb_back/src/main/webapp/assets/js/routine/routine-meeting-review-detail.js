window.addEventListener('DOMContentLoaded', () => {
	const deleteButton = document.querySelector(".button-cancel");
	const updateButton = document.querySelector(".button-application");

	const heart = document.querySelector(".fa-heart");
	const back = document.querySelector(".p-back");
	
	// ====== 유틸 ======
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}
	
	back.addEventListener("click", () => {
		history.back();
	});

	updateButton.addEventListener("click", (e) => {
		if (confirm("정말 수정하시겠습니까?")) {
			location.href = `/routine/routineReviewUpdateOk.ro?reviewNumber=${e.target.dataset.reviewnumber}`;
		}
		else {
			e.preventDefault();
		}
	});


	deleteButton.addEventListener("click", async (e) => {
		if (confirm("정말 삭제하시겠습니까?")) {
			try {
				const response = await fetch(`/routine/routineReviewDeleteOk.ro?reviewNumber=${e.target.dataset.reviewnumber}`);
				const result = await safeJson(response);
				if (result?.status === "success") {
					alert("삭제 완료");
					location.href = `/routine/routineReviewOk.ro`;
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

	heart.addEventListener('click', () => {
		if (heart.classList.contains('fa-regular')) {
			heart.classList.replace('fa-regular', 'fa-solid');
		}
		else {
			heart.classList.replace('fa-solid', 'fa-regular');
		}
	});

	//let edit = document.querySelectorAll(".span-comment-edit");
	//let commentAdd = document.querySelector(".input-comment");
	//const buttonWrite = document.querySelector(".button-write");
	//const commentList = document.querySelector(".ul-comment-list");
	//const commentDelete = document.querySelectorAll(".span-comment-delete");

	/*buttonWrite.addEventListener('click', (e) => {
		let newLi = document.createElement('li');
		newLi.setAttribute('class', 'li-comment');
		newLi.innerHTML = '<div class="div-user-profile"><img src="./../../assets/img/karina.jpg" class="img-user-profile"></div>' +
			'<div class="div-user-info">' +
			'<div class="div-user-name-area">' +
			'<p class="p-user-name">곰융</p><span class="span-comment-edit">수정</span>' +
			'</div>' +
			'<div class="div-user-text-area">' +
			'<p class="p-comment-text">' + commentAdd.value + '</p><span class="span-comment-delete">삭제</span>' +
			'</div>' +
			'<p class="p-update-date">2025.07.02<span class="p-update-status"></span></p>' +
			'</div>';
		if (commentAdd != null && commentAdd.length != 0) {
			commentList.appendChild(newLi);
			commentAdd.value = "";
		}
	});*/

	/*commentList.addEventListener('click', (e) => {
		console.log(e.target.classList);
		if (e.target.classList.value === 'span-comment-edit') {
			console.log(e.target.parentNode.nextNode);
			// const commentEdit = e.target.parentNode.nextSibling.firstChild;
			// console.log(commentEdit);
		}
		if (e.target.classList.value === 'span-comment-delete') {
			if (confirm("삭제하시겠습니까?")) {
				const comment = e.target.parentNode.parentNode.parentNode;
				comment.remove();
			}
		}
	});*/
})



