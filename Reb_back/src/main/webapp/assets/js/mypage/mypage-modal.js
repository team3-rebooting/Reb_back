
window.addEventListener('DOMContentLoaded', () => {
    //불러오기
    fetch("./../../app/mypage/mypage-modal.html")
        .then(response => response.text())
        .then(data => {
            modal = document.querySelector(`.mypage-modal`);

            modal.innerHTML = data;

            modalCloseBtn = document.querySelector(`.button-modal-close`);
            modalCloseBtn.addEventListener('click', closeModal);

            openModalButtonList = document.querySelectorAll(`.button-modal-open`);

            openModalButtonList.forEach((button) => {
                button.addEventListener('click', (e)=>{
                    openModal( e.target.name);
                });
            });

            modalTitle = document.querySelector(`.modal-title`);
            modalContent = document.querySelector(`.modal-content`);
        });
})

let modalCloseBtn;
let modal;
let openModalButtonList;
let modalTitle;
let modalContent;


const expertFileUpload = "expertFileUpload";
const profilePicUpload = "profilePicUpload";
const expertStatus = "expertStatus";
const expertRejectionReason = "expertRejectionReason";
const courseRejectionReason = "courseRejectionReason";

function openModal(modalType) {
    if(expertFileUpload === modalType){
        modalTitle.innerHTML = "전문가 인증";

        fetch("./../../app/mypage/expert-file-upload.html")
        .then(response => response.text())
        .then(data => {
            modalContent.innerHTML = data;
            });
    }else if(profilePicUpload === modalType){
        modalTitle.innerHTML = "프로필 사진";

        fetch("./../../app/mypage/profile-pic-upload.html")
        .then(response => response.text())
        .then(data => {
            modalContent.innerHTML = data;
            });
    }
    // else if(expertStatus === modalType){
    //     modalTitle.innerHTML = "전문가 인증 상태";

    //     fetch("./../../app/mypage/expert-status.html")
    //     .then(response => response.text())
    //     .then(data => {
    //         modalContent.innerHTML = data;
    //         });
    // }
    else if(expertRejectionReason === modalType){
        modalTitle.innerHTML = "전문가 인증 반려 사유"
        
        fetch("./../../app/mypage/expert-rejection-reason.html")
        .then(response => response.text())
        .then(data => {
            modalContent.innerHTML = data;
            });
    }else if(courseRejectionReason === modalType){
        modalTitle.innerHTML = "반려 사유"
        
        fetch("./../../app/mypage/course-rejection-reason.html")
        .then(response => response.text())
        .then(data => {
            modalContent.innerHTML = data;
            });
    }else{
        console.log("존재하지 않는 모달 유형. 확인 필요");
        return;
    }
    
    modal.style.display = "block";
}

function closeModal() {
    modal.style.display = "none";
}