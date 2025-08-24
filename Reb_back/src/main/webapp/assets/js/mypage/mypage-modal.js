window.addEventListener('DOMContentLoaded', () => {
	const modalCloseBtn = document.querySelector(`.button-modal-close`);
	const modal = document.querySelector(`.mypage-modal`);
	const openModalButtonList = document.querySelectorAll(`.button-modal-open`);
	const modalTitle = document.querySelector(`.modal-title`);
	const modalContent = document.querySelector(`.modal-content`);
	
	modalCloseBtn.addEventListener('click', closeModal);

	openModalButtonList.forEach((button) => {
		button.addEventListener('click', (e) => {
			openModal(e.target.name);
		});
	});
	

	const expertFileUpload = "expertFileUpload";
	const profilePicUpload = "profilePicUpload";
	const expertStatus = "expertStatus";
	const expertRejectionReason = "expertRejectionReason";
	const courseRejectionReason = "courseRejectionReason";

	function openModal(modalType) {
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
		// else if(expertStatus === modalType){
		//     modalTitle.innerHTML = "전문가 인증 상태";

		//     fetch("./../../app/mypage/expert-status.html")
		//     .then(response => response.text())
		//     .then(data => {
		//         modalContent.innerHTML = data;
		//         });
		// }
		else if (expertRejectionReason === modalType) {
			modalTitle.innerHTML = "전문가 인증 반려 사유"

			fetch("./../../app/mypage/expert-rejection-reason.html")
				.then(response => response.text())
				.then(data => {
					modalContent.innerHTML = data;
				});
		} else if (courseRejectionReason === modalType) {
			modalTitle.innerHTML = "반려 사유"

			fetch("./../../app/mypage/course-rejection-reason.html")
				.then(response => response.text())
				.then(data => {
					modalContent.innerHTML = data;
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
})




