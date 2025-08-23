window.addEventListener('DOMContentLoaded', () => {
	const sideMenuBtnClose = document.querySelector(".mypage-sidemenubtn-close");
	const sideMenuBtnOpen = document.querySelector(".mypage-sidemenubtn-open");
	const sideMenu = document.querySelector(".mypage-sidemenumove");

	const expertCourseMainMenu = document.querySelectorAll(`#li-expert-course-menu .a-mainsidemenu-title`);
	const expertCourseSubMenuLi = document.querySelectorAll(`#li-expert-course-menu .li-subsidemenu`);
	const expertCourseSubMenuA = document.querySelectorAll(`#li-expert-course-menu .li-subsidemenu a`);

	sideMenuBtnClose.addEventListener('click', () => { moveSideMenu("-300px"); });
	sideMenuBtnOpen.addEventListener('click', () => { moveSideMenu("0px"); });

	/*document.querySelector("#button-sidemenu-expert-status").addEventListener('click', () => {
		openModal('expertStatus');
	});*/

	const expertStatusText = getExpertStatus();
	if (expertStatusText !== null) {
		setActiveExpertMenu(expertStatusText === "인증 완료");
	}
	
	function moveSideMenu(left) {
		sideMenu.style.left = left;
		sideMenu.style.transition = '0.3s ease';

		sideMenuBtnClose.innerHTML = "&lt;";
	}

	function setActiveExpertMenu(isExpert) {
		if (isExpert) {
			expertCourseMainMenu.forEach((e) => {
				e.style.color = "#F38A6E"
				e.style.pointerEvents = "auto";
			});
			expertCourseSubMenuA.forEach((e) => {
				e.style.color = "#F59D85"
				e.style.pointerEvents = "auto";
			});
			expertCourseSubMenuLi.forEach((e) => {
				e.style.color = "#F59D85"
				e.style.pointerEvents = "auto";
			});
		} else {
			expertCourseMainMenu.forEach((e) => {
				e.style.color = "#6E6E6E";
				e.style.pointerEvents = "none";
			});
			expertCourseSubMenuA.forEach((e) => {
				e.style.color = "#6E6E6E";
				e.style.pointerEvents = "none";
			});
			expertCourseSubMenuLi.forEach((e) => {
				e.style.color = "#6E6E6E";
				e.style.pointerEvents = "none";
			});
		}
	}


	function getExpertStatus() {
		let expertStatus = document.querySelector("#personal-info-expert-status");
		if (expertStatus !== null)
			return expertStatus.innerHTML;
		else {
			expertStatus = document.querySelector("#edit-info-expert-status");

			if (expertStatus !== null)
				return expertStatus.innerHTML;
		}
		return null;
	}
})





