function loadImage(e) {
    const inputProfilePic = document.querySelector('#input-profile-pic-file');

    imgFileName = e.target.files[0].name;
    imgFile = e.target.files[0];

    inputProfilePic.value = imgFileName;
}

let imgFileName;
let imgFile;

function saveImage() {
    if (imgFile == null || imgFile == ""){
        alert("첨부파일이 없습니다.");
        return;
    }

    if (confirm("기존에 있던 첨부파일은 사라집니다.\n정말 등록하시겠습니까?")) {
        const fReader = new FileReader();
        fReader.readAsDataURL(imgFile);

        fReader.onloadend = function (event) {
            const profilePic = document.querySelector('#img-edit-profile-pic');

            const path = event.target.result;
            profilePic.src = path;
        }

        closeModal();
    }
}