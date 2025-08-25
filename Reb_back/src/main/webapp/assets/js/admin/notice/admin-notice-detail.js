document.addEventListener("DOMContentLoaded", () => {

	const updateBtn = document.querySelector(".main-btn:first-child");
	const deleteBtn = document.querySelector(".main-btn:last-child");
	const backListBtn = document.querySelector(".back-list");
	

	updateBtn.addEventListener('click', (e) => {
		const noticeNumber = e.target.dataset.noticeNumber;
		console.log(noticeNumber);
		if (!noticeNumber) return alert("noticeNumber가 없습니다");
		window.location.href = `/admin/noticeUpdate.ad?noticeNumber=${encodeURIComponent(noticeNumber)}`;
	});

	deleteBtn.addEventListener('click', () => {
		if (!noticeNumber) return alert("noticeNumber가 없습니다");
		if (!confirm("정말 삭제하시겠습니까?")) return;
		window.location.href = `/admin/noticeDeleteOk.ad?noticeNumber=${encodeURIComponent(noticeNumber)}`;
		
	});

	const moveBtn = document.querySelector(".back-list");
	moveBtn.addEventListener('click', () => {
		window.location.href = "/admin/noticeListOk.ad?page=1";
	});

	backListBtn.addEventListener('click', () => {
		location.href = "/admin/noticeListOk.ad?page=1";
	});

});