window.addEventListener('DOMContentLoaded', () => {
	
	
	
	
	// 목록 로드 비동기 처리
	async function loadListAsync(id, page) {
		console.log(id);
		try {
			// 쿼리스트링을 통해 어떠한 리스트인지 값과 목록 페이지 번호 전달
			const res = await fetch(`/mypage/mypageListOk.my?listType=${encodeURIComponent(id)}&page=${page}`, {
				headers: { "Accept": "application/json", "X-Requested-With": "XMLHttpRequest" },
			});

			if (!res.ok) throw new Error("목록을 불러오는 데 실패했습니다.");

			const listInfo = await safeJson(res);

			console.log(listInfo);
			// 목록 로드
			renderList(listInfo, id, listInfo.page.rowCount, listInfo.etcArr);
			// 페이지 번호 로드
			renderPage(listInfo.page, id);
		} catch (error) {
			console.error("목록 불러오기 실패:", error);
			alert("목록을 불러오는데 실패했습니다.");
		}
	}


	// 목록 로드
	function loadList(e) {
		//로드할 페이지
		let page;

		//이벤트 헨들러가 존재하지 않을 경우
		if (e === null || e === undefined) {
			page = 1;

			const mypageList = document.querySelectorAll('.mypage-list');

			// 페이지 내 모든 목록 초기화
			mypageList.forEach((list) => {
				loadListAsync(list.getAttribute("id"), page);
			})
		}
		//목록 페이지 버튼 클릭 이벤트를 통해 호출된 경우
		else {
			page = e.target.dataset.page;
			loadListAsync(e.target.dataset.listtype, page);
		}
	}

	// 초기 로드
	loadList();

	// 목록 초기화
	function renderList(listInfo, id, rowCount, etcArr) {
		// 리스트 부모 요소
		const list = document.querySelector(`#${id}`);
		// 목록 ul
		const ul = list.querySelector('.mypage-ul-list');

		ul.innerHTML = ``;

		// 목록 행 초기화
		listInfo.list.forEach(function(l, i) {
			let li = `<li class="li-content">`;

			l.forEach(function(item, index) {
				// href 값 있을 경우, 첫번째 열에 한하여 a tag로 설정
				if (index === 0) {
					if (etcArr[i]?.href !== undefined) {
						li += `<a href="${etcArr[i].href}" class="font-main list-title">${item}</a>`;
					} else {
						li += `<li class="li-content"><p class="font-main list-title">${item}</p>`;
					}
				}
				else
					li += `<p class="font-main list-content">${item}</p>`;
			})

			li += '</li>';

			ul.innerHTML += li;
		});

		
		const listPageTitle = list.querySelector('.pagetitle');
		const col = list.querySelector('.list-col-type');

		// 검색 기능 관련 요소에 목록 타입 dataset 설정
		list.querySelector('.button-search img').dataset.search = id;
		list.querySelector('.select-search').dataset.search = id;

		// 목록 리스트 설정
		listPageTitle.innerHTML = listInfo.listTitle;
		col.innerHTML = ``;
		// 목록 열 정보 행 초기화
		listInfo.cols.forEach(function(c, i) {
			if (i === 0) {
				col.innerHTML += `<p class="font-main list-title">${c}</p>`;
			}
			else {
				col.innerHTML += `<p class="font-main list-content">${c}</p>`;
			}
		});
		// 행 개수 유지를 위해 비어있는 행 추가
		let start = 0;
		if (listInfo.list !== null && listInfo.list !== undefined)
			start = listInfo.list.length;

		for (let i = start; i < rowCount; i++) {
			ul.innerHTML += `<li  class="li-content"></li>`;
		}
	}

	// 페이지네이션 초기화
	function renderPage(pageInfo, id) {
		const pagenation = document.querySelector(`#${id}`).querySelector(".pagenation");

		let innerHTML = ``;
		let page = pageInfo.page;
		let startPage = pageInfo.startPage;
		let endPage = pageInfo.endPage;
		let prev = pageInfo.prev;
		let next = pageInfo.next;

		let realStartPage = startPage < 0 ? 0 : startPage;

		// < 버튼
		if (prev) {
			innerHTML += `<a href="#" data-page="${startPage - 1}" class="a-page-number prev" data-listtype="${id}">&lt;</a>`
		}

		// 페이지 번호
		for (let i = realStartPage; i <= endPage; i++) {
			if (i === page) {
				innerHTML += `<a href="#" class="a-page-number" data-page="${i}" data-listtype="${id}">${i}</a>`;
			} else {
				innerHTML += `<a href="#" class="a-page-number" class="active" data-page="${i}" data-listtype="${id}">${i}</a>`
			}
		}

		// > 버튼
		if (next) {
			innerHTML += `<a href="#" data-page="${endPage + 1}" class="a-page-number next" data-listtype="${id}">&gt;</a>`;
		}

		pagenation.innerHTML = innerHTML;

		// 클릭 이벤트 추가
		pagenation.querySelectorAll(".a-page-number").forEach((i) => {
			i.addEventListener('click', loadList);
		})
	}

	// text -> json으로 변환
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}


})

