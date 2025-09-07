window.addEventListener('DOMContentLoaded', () => {
	const id = document.querySelector('.comment-list').getAttribute("id");

	// ====== 목록 로드 ======
	async function loadListAsync(id, reviewNumber, page) {
		try {
			const res = await fetch(`/comment/commentListOk.cm?listType=${encodeURIComponent(id)}&reviewNumber=${reviewNumber}&page=${page}`, {
				headers: { "Accept": "application/json", "X-Requested-With": "XMLHttpRequest" },
			});

			if (!res.ok) throw new Error("목록을 불러오는 데 실패했습니다.");

			const listInfo = await safeJson(res);

			this.reviewNumber = reviewNumber;

			renderList(listInfo, id, listInfo.page.rowCount);
			renderPage(listInfo.page, reviewNumber, id);
		} catch (error) {
			console.error("목록 불러오기 실패:", error);
			alert("목록을 불러오는데 실패했습니다.");
		}
	}

	let reviewNumber;

	function loadList(e) {
		let page;

		if (e === null || e === undefined) {
			page = 1;

			const commentList = document.querySelectorAll('.comment-list');

			console.log(commentList);
			commentList.forEach((i) => {
				reviewNumber = i.dataset.reviewnumber;
				loadListAsync(i.getAttribute("id"), reviewNumber, page);
			})
		}
		else {
			page = e.target.dataset.page;
			console.log(e.target.dataset);
			loadListAsync(e.target.dataset.listtype, e.target.dataset.reviewnumber, page);
		}
	}

	function deleteComment(e){
		deleteCommentAsync(e);
	}
	
	async function deleteCommentAsync(e) {
		let num = e.target.dataset.num;
		let id = e.target.dataset.listtype;
		
		try {
			const res = await fetch(`/comment/commentDeleteOk.cm?listType=${encodeURIComponent(id)}&commentNumber=${num}`, {
				headers: { "Accept": "application/json", "X-Requested-With": "XMLHttpRequest" },
			});

			if (!res.ok) throw new Error("댓글 삭제 실패");
			
			loadList();
		} catch (error) {
			console.error("댓글 삭제 실패:", error);
			alert("댓글 삭제를 실패 했습니다.");
		}
	}


	// ====== 목록 렌더링 ======
	function renderList(listInfo, id, rowCount) {
		const pageNum = document.querySelectorAll(`.a-page-number`);
		pageNum.forEach((e) => {
			e.addEventListener('click', (e) => {
				loadList(e);
			})
		})

		const list = document.querySelector(`#${id}`);

		const ul = list.querySelector('.comment-ul-list');
		ul.innerHTML = '';

		listInfo.list.forEach(function(l, i) {

			console.log(listInfo);
			let updated = '';
			let deleteButton = '';
			if (l.reviewCreatedDate !== l.reviewUpdatedDate)
				if (l.reviewUpdatedDate !== null && l.reviewUpdatedDate !== undefined)
					updated = '(수정됨)';
			if(l.currentMemberNumber === l.memberNumber){
				deleteButton =  `<span class="span-comment-delete" data-num="${l.reviewCommentNumber}"
								data-mem="${l.memberNumber}" data-listtype="${id}">삭제</span>`
			}	
		

			let li = `				<li class="li-comment">
										<div class="div-user-profile">
											<img src="/assets/img/profile.png" class="img-user-profile">
										</div>
										<div class="div-user-info">
											<div class="div-user-name-area">
												<p class="p-user-name">${l.memberNickname}</p>
											</div>
											<div class="div-user-text-area">
												<p class="p-comment-text">${l.reviewContent}</p>
												${deleteButton}
											</div>
											<p class="p-update-date">
												${l.reviewCreatedDate}<span class="p-update-status">${updated}</span>
											</p>
										</div>
									</li>`;
			ul.innerHTML += li;
		});
		
		document.querySelectorAll('.span-comment-delete').forEach((e)=>{
					e.addEventListener('click', deleteComment);
				})
	}

	function renderPage(pageInfo, reviewNumber, id) {
		const pagenation = document.querySelector(`#${id}`).querySelector(".pagenation");

		console.log('pageInfo', pageInfo);
		let innerHTML = ``;
		let page = pageInfo.page;
		let startPage = pageInfo.startPage;
		let endPage = pageInfo.endPage;
		let prev = pageInfo.prev;
		let next = pageInfo.next;

		let realStartPage = startPage < 0 ? 0 : startPage;

		if (prev) {
			innerHTML += `<a href="#" data-page="${startPage - 1}" class="a-page-number prev" data-listtype="${id}" data-reviewnumber="${reviewNumber}">&lt;</a>`
		}

		for (let i = realStartPage; i <= endPage; i++) {
			if (i === page) {
				innerHTML += `<a href="#" class="a-page-number" data-page="${i}" data-listType="${id}">${i}</a>`;
			} else {
				innerHTML += `<a href="#" class="a-page-number" class="active" data-page="${i}" data-listtype="${id}" data-reviewnumber="${reviewNumber}">${i}</a>`
			}
		}

		if (next) {
			innerHTML += `<a href="#" data-page="${endPage + 1}" class="a-page-number next" data-listtype="${id}" data-reviewnumber="${reviewNumber}">&gt;</a>`;
		}

		pagenation.innerHTML = innerHTML;
		pagenation.querySelectorAll(".a-page-number").forEach((i) => {
			i.addEventListener('click', loadList);
		})
	}

	// ====== 유틸 ======
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}

	const submitBtn = document.querySelector(".button-write");

	submitBtn?.addEventListener("click", async () => {
		const contentEl = document.querySelector(".input-comment");
		const content = contentEl?.value.trim();

		if (!content) return alert("댓글 내용을 입력해주세요.");
		if (!reviewNumber) return alert("reviewNumber가 없습니다.");

		try {
			const response = await fetch(`/comment/commentWriteOk.cm?listType=${encodeURIComponent(id)}`, {
				method: "POST",
				headers: {
					"Content-Type": "application/json; charset=utf-8",
					"X-Requested-With": "XMLHttpRequest",
				},
				body: JSON.stringify({ reviewNumber: reviewNumber, comment: content }),
			});

			const result = await safeJson(response);
			if (result?.status === "success") {
				alert("댓글이 작성되었습니다.");
				if (contentEl) contentEl.value = "";
				loadList();
			} else {
				alert("댓글 작성에 실패했습니다.");
			}
		} catch (error) {
			console.error("댓글 작성 실패:", error);
			alert("댓글 작성 중 오류가 발생했습니다.");
		}
	});


	// 초기 로드
	loadList();
})

