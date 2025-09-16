//window.addEventListener('DOMContentLoaded', () => {
const bannerContainer = document.querySelector('#main-ul-banner');
//const bannerImgList = document.querySelectorAll('.main-li-banner');
const bannerPageNumber = document.querySelector('#banner-page-number');

const routineReview = document.querySelector('#routine-review-list');
const courseReview = document.querySelector('#course-review-list');

//const imgWidth = bannerImgList[0].style.width;

let currentIdx = 0;

function moveBanner(add) {
	const bannerImgList = document.querySelectorAll('.main-li-banner');
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

		if (listInfo !== null && listInfo !== undefined) {
			loadCourseList(listInfo.courseReviewList);
			loadRoutineList(listInfo.routineReviewList);
			loadBannerList(listInfo.bannerList);
		}
	} catch (error) {
		console.error("실패:", error);
		alert("오류가 발생했습니다.");
	}
}

function loadBannerList(list) {
	let innerHTML = '';

	let total = 1;

	if (list === null || list === undefined) {
		innerHTML = `<li class="main-li-banner"><img src="/assets/img/routine-img.png" alt=""></li>`;
	} else if (list.length == 0) {
		innerHTML = `<li class="main-li-banner"><img src="/assets/img/routine-img.png" alt=""></li>`;
	} else {
		total = list.length;
	}

	let src = '/assets/img/team_logo.png';

	list.forEach((banner) => {
		if (banner !== null && banner !== undefined) {
			src = `/upload/${banner}`;
		}

		innerHTML += `<li class="main-li-banner"><img src="${src}" alt=""></li>`;
	});

	bannerContainer.innerHTML = innerHTML;
	bannerPageNumber.innerHTML = '1/' + total;
}

function loadCourseList(list) {
	let innerHTML = '';

	if (list === null || list === undefined) {
		innerHTML = '등록된 게시글이 없습니다.';
	}

	let src = '/assets/img/team_logo.png';

	list.forEach((course) => {
		if (course.file !== null && course.file !== undefined) {
			src = `/upload/${course.file}`;
		}

		innerHTML +=
			`<div class="review-box">
						<a
							href="/course/courseReviewDetailOk.co?courseReviewNumber=${course.reviewNumber}"
								class="a-review-box"> <!-- 리뷰 이미지 -->
									<div class="review-img-box">
										<img src="${src}" class="img-box">
											
									</div> 
									<div class="review-title"> ${course.reviewTitle} </div>
									<div class="review-text">
										<div class="routine-review-person"> ${course.memberNickname} </div>
										<div class="routine-review-date"> ${course.reviewCreatedDate} </div>
									</div>
						</a>
					</div>
			`;
	})



	courseReview.innerHTML = innerHTML;
}


function loadRoutineList(list) {
	let innerHTML = '';

	if (list === null || list === undefined) {
		innerHTML = '등록된 게시글이 없습니다.';
	}

	let src = '/assets/img/team_logo.png';

	list.forEach((routine) => {


		if (routine.file !== null && routine.file !== undefined) {
			src = `/upload/routine/${routine.file}`;
		}

		innerHTML +=
			`<div class="review-box">
							<a
								href="/routine/routineReviewReadOk.ro?routineReviewNumber=${routine.reviewNumber}"
									class="a-review-box"> <!-- 리뷰 이미지 -->
										<div class="review-img-box">
											<img src="${src}" class="img-box">
												
										</div> 
										<div class="review-title"> ${routine.reviewTitle} </div>
										<div class="review-text">
											<div class="routine-review-person"> ${routine.memberNickname} </div>
											<div class="routine-review-date"> ${routine.reviewCreatedDate} </div>
										</div>
							</a>
						</div>
				`;
	})



	routineReview.innerHTML = innerHTML;
}

// ====== 유틸 ======
async function safeJson(res) {
	const text = await res.text();
	try { return text ? JSON.parse(text) : null; } catch { return null; }
}

loadList();
//})