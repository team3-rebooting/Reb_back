const updateBtn = document.querySelector(".button-update");
const deleteBtn = document.querySelector(".button-delete");

updateBtn.addEventListener('click', () => {
		const routineNumber = updateBtn.dataset.routineNumber;
		if (!routineNumber) return alert("routineNumber가 없습니다");
		window.location.href = `/admin/routineUpdate.ad?routineNumber=${encodeURIComponent(routineNumber)}`;
	});
	
deleteBtn.addEventListener('click', async () => {
		const routineNumber = deleteBtn.dataset.routineNumber;
			if (!routineNumber) return alert("routineNumber가 없습니다");
		
			if (!confirm("정말 삭제하시겠습니까?")) return;
			try{
				const res = await fetch(`/admin/routineDeleteOk.ad?routineNumber=${encodeURIComponent(routineNumber)}`,{
					method : "GET",
					headers : {"X-Requested-With": "XMLHttpRequest"},
				});
			if (!res.ok) throw new Error("삭제 실패");	
			window.location.href = "/admin/routineListOk.ad";
			}
			catch(err){
				console.error("공지사항 삭제 실패 :", err);
				alert("공지사항 삭제에 실패했습니다.");
			}
			
		});	
const moveBtn = document.querySelector(".back-list");
moveBtn.addEventListener('click', ()=>{
  location.href= "/admin/routineListOk.ad?page=1";
});