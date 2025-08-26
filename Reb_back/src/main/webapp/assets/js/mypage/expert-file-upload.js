window.addEventListener('DOMContentLoaded', () => {
	const form = document.querySelector('#form-expert-file-upload');
	const fileSearch = document.querySelector('#input-expert-file-search');

	form.addEventListener("submit", async function(e) {
		if (file == null || file == "") {
			e.preventDefault();
			alert("첨부파일이 없습니다.");
			return;
		}

		if (!confirm("기존에 있던 첨부파일은 사라집니다.\n정말 등록하시겠습니까?")) {
			//값 변경 성공 시 페이지 다시 가기로 변경
			e.preventDefault();
			return;
		}
	});

	console.log('fileSearch', fileSearch);
	fileSearch.addEventListener('change', (e) => {
		loadFile(e);
	});

	function loadFile(e) {
		const inputExpireFile = document.querySelector('#input-expert-file');

		fileName = e.target.files[0].name;
		file = e.target.files[0];

		inputExpireFile.value = fileName;
	}
})

console.log("test");



const expertInfoText = document.querySelectorAll('.expert-status-confirm-text');
const expertProgressStatus = document.querySelector('#expert-progress-status-text');
let fileName;
let file;

function saveFile() {
	if (file == null || file == "") {
		alert("첨부파일이 없습니다.");
		return;
	}

	if (confirm("기존에 있던 첨부파일은 사라집니다.\n정말 등록하시겠습니까?")) {
		/*const inputExpireFile = document.querySelector('#a-expert-status-file');
		inputExpireFile.innerHTML = fileName;

		expertInfoText.forEach((e) => {
			e.innerHTML = '-';
		});

		expertProgressStatus.innerHTML = '확인 중';
		closeModal();*/

		//값 변경 성공 시 페이지 다시 가기로 변경
	}
}