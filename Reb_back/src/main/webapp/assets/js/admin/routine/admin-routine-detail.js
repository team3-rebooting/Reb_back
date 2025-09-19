document.addEventListener("DOMContentLoaded", () => {
	const updateBtn = document.querySelector(".button-update");
	const deleteBtn = document.querySelector(".button-delete");
	
	updateBtn?.addEventListener('click', () => {
		const routineNumber = updateBtn.dataset.routineNumber;
		if (!routineNumber) return alert("routineNumber가 없습니다");
		window.location.href = `/admin/routineUpdate.ad?routineNumber=${encodeURIComponent(routineNumber)}`;
	});
	deleteBtn?.addEventListener('click', async () => {
		const routineNumber = deleteBtn.dataset.routineNumber;
		if (!routineNumber) return alert("routineNumber가 없습니다");

		if (!confirm("정말 삭제하시겠습니까?")) return;
		try {
			const res = await fetch(`/admin/routineDeleteOk.ad?routineNumber=${encodeURIComponent(routineNumber)}`, {
				method: "GET",
				headers: { "X-Requested-With": "XMLHttpRequest" },
			});
			if (!res.ok) throw new Error("삭제 실패");
			window.location.href = "/admin/routineListOk.ad";
		}
		catch (err) {
			console.error("공지사항 삭제 실패 :", err);
			alert("공지사항 삭제에 실패했습니다.");
		}

	});
	const moveBtn = document.querySelector(".back-list");
	moveBtn.addEventListener('click', () => {
		window.location.href = "/admin/routineListOk.ad";
	});
	
	// 지도 컨테이너
	var mapContainer = document.getElementById('map');
	var mapOption = {
	    center: new kakao.maps.LatLng(37.537187, 127.005476),
	    level: 3
	};
	var map = new kakao.maps.Map(mapContainer, mapOption);

	// 주소-좌표 변환 객체
	var geocoder = new kakao.maps.services.Geocoder();

	// 마커
	var marker = new kakao.maps.Marker({ map: map });

	// DB에서 불러온 주소
	var dbAddr = document.querySelector(".routineLocation").innerText;

	geocoder.addressSearch(dbAddr, function(results, status) {
	    if (status === kakao.maps.services.Status.OK) {
	        var result = results[0];
	        var coords = new kakao.maps.LatLng(result.y, result.x);

	        map.setCenter(coords);
	        marker.setPosition(coords);
	    }
	});
});