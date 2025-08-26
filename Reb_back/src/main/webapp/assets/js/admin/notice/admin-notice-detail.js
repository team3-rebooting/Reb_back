document.addEventListener("DOMContentLoaded", () => {

	const updateBtn = document.querySelector(".main-btn:first-child");
	const deleteBtn = document.querySelector(".main-btn:last-child");
	const backListBtn = document.querySelector(".back-list");
	

	updateBtn.addEventListener('click', () => {
		const noticeNumber = updateBtn.dataset.noticeNumber;
		console.log(noticeNumber);
		if (!noticeNumber) return alert("noticeNumber가 없습니다");
		window.location.href = `/admin/noticeUpdate.ad?noticeNumber=${encodeURIComponent(noticeNumber)}`;
	});

	deleteBtn.addEventListener('click', async () => {
		const noticeNumber = deleteBtn.dataset.noticeNumber;
		if (!noticeNumber) return alert("noticeNumber가 없습니다");
	
		if (!confirm("정말 삭제하시겠습니까?")) return;
		try{
			const res = await fetch(`/admin/noticeDeleteOk.ad?noticeNumber=${encodeURIComponent(noticeNumber)}`,{
				method : "GET",
				headers : {"X-Requested-With": "XMLHttpRequest"},
			});
		if (!res.ok) throw new Error("삭제 실패");	
		window.location.href = "/admin/noticeListOk.ad";
		}
		catch(err){
			console.error("공지사항 삭제 실패 :", err);
			alert("공지사항 삭제에 실패했습니다.");
		}
		
	});

	const moveBtn = document.querySelector(".back-list");
	moveBtn.addEventListener('click', () => {
		window.location.href = "/admin/noticeListOk.ad?page=1";
	});

	backListBtn.addEventListener('click', () => {
		location.href = "/admin/noticeListOk.ad?page=1";
	});

});