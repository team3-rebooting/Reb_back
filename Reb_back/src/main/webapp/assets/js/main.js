const bannerContainer = document.querySelector('#main-ul-banner')
const bannerImgList = document.querySelectorAll('.main-li-banner');
const bannerPageNumber = document.querySelector('#banner-page-number');

const imgWidth = bannerImgList[0].style.width;

let currentIdx = 0;

function moveBanner(add) {
    if ((currentIdx + add < 0) || (currentIdx + add >= bannerImgList.length))
        return;

    currentIdx += add;
    bannerContainer.style.transition = '0.5s ease';
    bannerContainer.style.transform = `translateX(${-currentIdx * 900}px)`;
    
   
    bannerPageNumber.innerHTML = (currentIdx + 1) + '/'+ bannerImgList.length;
}