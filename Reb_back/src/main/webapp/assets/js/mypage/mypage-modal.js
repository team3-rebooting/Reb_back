window.addEventListener('DOMContentLoaded', () => {
	modalCloseBtn = document.querySelector(`.button-modal-close`);
	modal = document.querySelector(`.mypage-modal`);
	openModalButtonList = document.querySelectorAll(`.button-modal-open`);
	modalTitle = document.querySelector(`.modal-title`);
	modalContent = document.querySelector(`.modal-content`);

	modalCloseBtn.addEventListener('click', closeModal);

	openModalButtonList.forEach((button) => {
		button.addEventListener('click', (e) => {
			openModal(e.target.dataset.type);
		});
	});
})

let modalCloseBtn;
let modal;
let openModalButtonList;
let modalTitle;
let modalContent;

const expertFileUpload = "expertFileUpload";
const profilePicUpload = "profilePicUpload";
const expertStatus = "expertStatus";
const expertRejectionReason = "expertRejectionReason";
const courseRejectionReason = "courseRejectionReason";

function openModal(modalType, content) {
	console.log(modalType);

	if (expertFileUpload === modalType) {
		modalTitle.innerHTML = "전문가 인증";

		fetch("/app/mypage/expert-file-upload.jsp")
			.then(response => response.text())
			.then(data => {
				modalContent.innerHTML = data;
			});
	} else if (profilePicUpload === modalType) {
		modalTitle.innerHTML = "프로필 사진";

		fetch("/app/mypage/profile-pic-upload.jsp")
			.then(response => response.text())
			.then(data => {
				modalContent.innerHTML = data;
			});
	}
	else if (expertRejectionReason === modalType) {
		modalTitle.innerHTML = "전문가 인증 반려 사유"

		modalContent.innerHTML = document.querySelector('#expert-applicant-reason').value;

		/*fetch("/app/mypage/expert-rejection-reason.jsp")
			.then(response => response.text())
			.then(data => {
				modalContent.innerHTML = data;
			});	*/
	} else if (courseRejectionReason === modalType) {
		modalTitle.innerHTML = "반려 사유"

		fetch("/app/mypage/course-rejection-reason.jsp")
			.then(response => response.text())
			.then(data => {
				modalContent.innerHTML = data;
				modalContent.querySelector('#course-rejection-reason').innerHTML = content;				
			});
	} else {
		console.log("존재하지 않는 모달 유형. 확인 필요");
		return;
	}

	modal.style.display = "block";
}

function closeModal() {
	modal.style.display = "none";
}


