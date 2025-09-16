document.addEventListener("DOMContentLoaded", () => {
	const deleteBtn = document.querySelector(".button-cancel");
	const heart = document.querySelector("#i-heart");
	const back = document.querySelector(".p-back");
	const editBtn = document.querySelector(".button-application");
	
	const heartCount = document.querySelector("#span-like-count");

	const like = document.querySelector("#like");
	const courseNumber = document.querySelector("#course-review-number");

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
		if (!courseReviewNumber) return alert("courseReviewNumber가 없습니다");
		window.location.href = `/course/courseReviewEdit.co?courseReviewNumber=${encodeURIComponent(courseReviewNumber)}`;
	});


	deleteBtn?.addEventListener("click", async () => {
		if (!courseReviewNumber) return alert("courseReviewNumber가 없습니다");
		if (!confirm("정말로 삭제하시겠습니까?")) return;

		try {
			const res = await fetch(`/course/courseReviewDeleteOk.co?courseReviewNumber=${encodeURIComponent(courseReviewNumber)}`, {
				method: "GET",
				headers: { "X-Requested-With": "XMLHttpRequest" }
			});

			if (!res.ok) throw new Error("삭제 요청 실패");

			alert("게시글이 삭제되었습니다.");
			window.location.href = "/course/courseReviewListOk.co";
		} catch (err) {
			console.error("게시글 삭제 실패 : ", err);
			alert("게시글 삭제에 실패했습니다.");
		}
	});



	heart?.addEventListener('click', async () => {
		try {
			const response = await fetch(`/course/courseReviewLikeOk.co`, {
				method: "POST",
				headers: {
					"Content-Type": "application/json; charset=utf-8",
					"X-Requested-With": "XMLHttpRequest",
				},
				body: JSON.stringify({ courseNumber: courseNumber.value, like: like.value }),
			});

			const result = await safeJson(response);
			console.log(result);
			if (result?.status === "success") {
				if (heart.classList.contains('fa-regular')) {
					heart.classList.replace('fa-regular', 'fa-solid');
				}
				else {
					heart.classList.replace('fa-solid', 'fa-regular');
				}

				if (like.value == 'true') {
					heartCount.innerHTML = Number(heartCount.innerHTML) - 1;
					like.value = 'false';
				} else {
					heartCount.innerHTML = Number(heartCount.innerHTML) + 1;
					like.value = 'true';
				}
			}
		} catch (error) {
			console.error("좋아요 실패", error);
			alert("좋아요 중 오류가 발생했습니다.");
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
		if (commentAdd.value != null && commentAdd.value.length != 0) {
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
});


