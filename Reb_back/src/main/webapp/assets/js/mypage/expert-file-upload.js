function loadFile(e) {
    const inputExpireFile = document.querySelector('#input-expert-file');

    fileName = e.target.files[0].name;
    file = e.target.files[0];

    inputExpireFile.value = fileName;
}

const expertInfoText = document.querySelectorAll('.expert-status-confirm-text');
const expertProgressStatus = document.querySelector('#expert-progress-status-text');
let fileName;
let file;

function saveFile() {
    if (file == null || file == ""){
        alert("첨부파일이 없습니다.");
        return;
    }

    if (confirm("기존에 있던 첨부파일은 사라집니다.\n정말 등록하시겠습니까?")) {
        const inputExpireFile = document.querySelector('#a-expert-status-file');
        inputExpireFile.innerHTML = fileName;

        expertInfoText.forEach((e) => {
            e.innerHTML = '-';
        });

        expertProgressStatus.innerHTML = '확인 중';
        
        closeModal();
    }
}