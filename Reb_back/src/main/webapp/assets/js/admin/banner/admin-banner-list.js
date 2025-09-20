const addBtn = document.querySelector("#main-banner-add");
const deleteBtn = document.querySelectorAll(".delete");
let bannerList = document.querySelectorAll("#main-banner-list>li");
const upBtn = document.querySelectorAll(".up");
const downBtn = document.querySelectorAll(".down");

addBtn.addEventListener('click', () => {
	let bannerCount = document.querySelectorAll("#main-banner-list>li");
	if (bannerCount.length >= 10) {
		alert("최대 10개까지 등록 가능합니다");
	} else {
		location.href = "/admin/bannerWrite.ad";
	}
});


deleteBtn.forEach(btn => {
	btn.addEventListener('click', async () => {
		if (confirm("정말로 삭제하시겠습니까?")) {
			try {
				const bannerNumber = btn.dataset.bannerNumber;
				const response = await fetch(`/admin/bannerDeleteOk.ad?bannerNumber=${bannerNumber}`, {
					method: "GET",
					headers: {
						"Content-Type": "application/json; charset=utf-8",
						"X-Requested-With": "XMLHttpRequest",
					},
				});
				if (!response.ok) throw new Error("삭제 실패");
				window.location.href = "/admin/bannerListOk.ad";
			} catch (error) {
				console.error("삭제 실패:", error);
				alert("삭제 중 오류가 발생했습니다.");
			}

		};
	});
});

upBtn.forEach(btn => {
	btn.addEventListener('click', async () => {
		try {
			const bannerNumber = btn.dataset.bannerNumber;
			const bannerOrderNumber = btn.dataset.bannerOrderNumber;
			const response = await fetch(`/admin/bannerUpdateOk.ad?bannerNumber=${bannerNumber}&bannerOrderNumber=${bannerOrderNumber}&up=true`, {
				method: "GET",
				headers: {
					"Content-Type": "application/json; charset=utf-8",
					"X-Requested-With": "XMLHttpRequest",
				},
			});
			window.location.href = "/admin/bannerListOk.ad";
		} catch (error) {
			console.error("변경 실패:", error);
			/*alert("변경 중 오류가 발생했습니다.");*/
		}
	});
});
downBtn.forEach(btn => {
	btn.addEventListener('click', async () => {
		try {
			const bannerNumber = btn.dataset.bannerNumber;
			const bannerOrderNumber = btn.dataset.bannerOrderNumber;
			const response = await fetch(`/admin/bannerUpdateOk.ad?bannerNumber=${bannerNumber}&bannerOrderNumber=${bannerOrderNumber}&up=false`, {
				method: "GET",
				headers: {
					"Content-Type": "application/json; charset=utf-8",
					"X-Requested-With": "XMLHttpRequest",
				},
			});
			window.location.href = "/admin/bannerListOk.ad";
		} catch (error) {
			console.error("변경 실패:", error);
			/*alert("변경 중 오류가 발생했습니다.");*/
		}
	});
});

