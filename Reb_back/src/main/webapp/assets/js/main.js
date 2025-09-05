window.addEventListener('DOMContentLoaded', () => {
	const bannerContainer = document.querySelector('#main-ul-banner')
	const bannerImgList = document.querySelectorAll('.main-li-banner');
	const bannerPageNumber = document.querySelector('#banner-page-number');

	const imgWidth = bannerImgList[0].style.width;

	let currentIdx = 0;

	function moveBanner(add) {
		if ((currentIdx + add < 0) || (currentIdx + add >= bannerImgList.length))
			return;

		currentIdx += add;
		bannerContainer.style.transition = '0.5s ease';
		bannerContainer.style.transform = `translateX(${-currentIdx * 900}px)`;


		bannerPageNumber.innerHTML = (currentIdx + 1) + '/' + bannerImgList.length;
	}

	async function loadList() {
		try {
			const res = await fetch(`/main/reviewListOk.ma`, {
				headers: { "Accept": "application/json", "X-Requested-With": "XMLHttpRequest" }
			});
			
			if (!res.ok) throw new Error("목록을 불러오는 데 실패했습니다.");
			
			const listInfo = await safeJson(res);
			
			console.log(listInfo?.routineReviewList);
			console.log(listInfo?.courseReviewList);
			
		} catch (error) {
			console.error("실패:", error);
			alert("오류가 발생했습니다.");
		}
	}

	// ====== 유틸 ======
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}

	loadList();
})