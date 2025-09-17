const okBtn = document.querySelector(".button-ok");
const cancelBtn = document.querySelector(".button-cancel");
const startDate = document.querySelector("#start-date");
const endDate = document.querySelector("#end-date");
const rStartDate = document.querySelector("#routine-start-date");
const rEndDate = document.querySelector("#routine-end-date");
const startTime = document.getElementById("start-time");
const endTime = document.getElementById("end-time");
let now = new Date();
let today = new Date(now.getTime() + 9 * 60 * 60 * 1000).toISOString().split('T')[0];
startDate.setAttribute('min', today);
rStartDate.setAttribute('min', today);
const inputIn = document.querySelectorAll(".input-in");

cancelBtn.addEventListener('click', () => {
	if (confirm("작성하신 내용을 지우시겠습니까?")) {
		alert("작성을 취소하셨습니다.");
		window.location.href = "/admin/routineListOk.ad";
	}
});

startDate.addEventListener('change', function() {
	if (startDate.value) {
		endDate.min = startDate.value;
	}
}, false);

endDate.addEventListener('change', function() {
	if (endDate.value) {
		startDate.max = endDate.value;
		rStartDate.setAttribute('min', endDate.value);
	}
	rStartDate.readOnly = false;
	rEndDate.readOnly = false;
}, false);

rStartDate.addEventListener('change', function() {
	if (rStartDate.value) {
		rEndDate.min = rStartDate.value;
	}
}, false);

rEndDate.addEventListener('change', function() {
	if (rEndDate.value) {
		rStartDate.max = rEndDate.value;
	}
	startTime.readOnly = false;
	endTime.readOnly = false;
}, false);

startTime.addEventListener('input', function() {
	endTime.min = startTime.value;

	if (endTime.value && endTime.value < startTime.value) {
		endTime.value = "";
	}
});

endTime.addEventListener('input', function() {
	startTime.max = endTime.value;

	if (startTime.value && startTime.value > endTime.value) {
		startTime.value = "";
	}
});

okBtn.addEventListener("click", (e) => {
	let tf = true;
	if (confirm("정말로 개설하시겠습니까?")) {
		for (let i = 0; i < inputIn.length; i++) {
			if (inputIn[i].value === null || inputIn[i].value.length === 0) {
				tf = false;
			}
		}
		if (tf === true) {
			alert("등록 완료되었습니다.");
		}
		else {
			alert("모든 정보가 입력되어야 합니다");
			e.preventDefault();
		}
	}
	else {
		e.preventDefault();
	}

});
var mapContainer = document.getElementById('map'), // 지도를 표시할 div
	mapOption = {
		center: new daum.maps.LatLng(37.537187, 127.005476), // 지도의 중심좌표
		level: 5 // 지도의 확대 레벨
	};

//지도를 미리 생성
var map = new daum.maps.Map(mapContainer, mapOption);
//주소-좌표 변환 객체를 생성
var geocoder = new daum.maps.services.Geocoder();
//마커를 미리 생성
var marker = new daum.maps.Marker({
	position: new daum.maps.LatLng(37.537187, 127.005476),
	map: map
});


function DaumPostcode() {
	new daum.Postcode({
		oncomplete: function(data) {
			var addr = data.address; // 최종 주소 변수

			// 주소 정보를 해당 필드에 넣는다.
			document.querySelector(".input-zip-code").value = addr;
			// 주소로 상세 정보를 검색
			geocoder.addressSearch(data.address, function(results, status) {
				// 정상적으로 검색이 완료됐으면
				if (status === daum.maps.services.Status.OK) {

					var result = results[0]; //첫번째 결과의 값을 활용

					// 해당 주소에 대한 좌표를 받아서
					var coords = new daum.maps.LatLng(result.y, result.x);
					// 지도를 보여준다.
					mapContainer.style.display = "block";
					map.relayout();
					// 지도 중심을 변경한다.
					map.setCenter(coords);
					// 마커를 결과값으로 받은 위치로 옮긴다.
					marker.setPosition(coords)
				}
			});
		}
	}).open();
}
