const expertCourseStatus = document.querySelectorAll(".expert-course-status");

expertCourseStatus.forEach((e) => {
    if (e.innerText.includes("반려")) {
        e.style.textDecoration = "underline";
        e.style.cursor = "pointer";
        e.addEventListener('click', () => {
            openModal("courseRejectionReason");
        });
    }
});



class ListInfo {
    constructor(title, colText, data) {
        this.title = title;
        this.colText = colText;
        this.data = data;
    }
}

function ListRow(title, status, count, date) {
    this.title = title;
    this.status = status;
    this.count = count;
    this.date = date;
};

const listInfo = new ListInfo(
    '나의 수강 수업 내역',
    new ListRow('제목', '진행 사항', '인원', '신청일자'),
    [
        new ListRow("[IT]Java의 정석1", "개설 신청", "0/15", "2025.08.02"),
        new ListRow("[IT]Java의 정석2", "개설 신청", "-/15", "2025.08.02"),
        new ListRow("[디자인]처음부터 배우는 그림 그리기 - 상", "개설 완료", "15/15", "2025.08.02"),
        new ListRow("[디자인]처음부터 배우는 그림 그리기 - 중", "수정 신청", "8/15", "2025.08.05"),
        new ListRow("[디자인]처음부터 배우는 그림 그리기 - 하", "삭제 신청", "5/15", "2025.08.05"),
        new ListRow("[디자인]처음부터 배우는 그림 그리기 - 최종", "신청 반려", "-/15", "2025.08.03"),
    ]
);

const selectSearch = document.querySelector(`.select-search`);
const inputSearch = document.querySelector('.input-search');
const listContentList = document.querySelectorAll('.li-expert-course-content');

function search(e) {
    let selectedIndex = selectSearch.selectedIndex;

    listContentList.forEach((e) => {
        console.log(e);
        e.querySelector('.expert-course-title').setAttribute("href", "");

        e.querySelector('.expert-course-title').innerHTML = "";
        e.querySelector('.expert-course-status').innerHTML = "";
        e.querySelector('.expert-course-count').innerHTML = "";
        e.querySelector('.expert-course-date').innerHTML = "";
    })

    let searchList;

    if (selectedIndex == 0)
        searchList = listInfo.data.filter(data => data.title.includes(inputSearch.value));
    else if (selectedIndex == 1)
        searchList = listInfo.data.filter(data => data.status.includes(inputSearch.value));

    let count = 0;
    listContentList.forEach((e) => {
        if (searchList.length - 1 < count)
            return;

        e.querySelector('.expert-course-title').setAttribute("href", "./../course/course-detail.html");
        e.querySelector('.expert-course-title').innerHTML = searchList[count].title;
        const status = e.querySelector('.expert-course-status');
        status.innerHTML = searchList[count].status;
        e.querySelector('.expert-course-count').innerHTML = searchList[count].count;
        e.querySelector('.expert-course-date').innerHTML = searchList[count].date;

        if (searchList[count].status.includes('반려')) {
            status.style.textDecoration = "underline";
            status.style.cursor = "pointer";
            status.addEventListener('click', () => {
                openModal("courseRejectionReason");
            })
        }else{
            status.style.textDecoration = "none";
            status.style.cursor = "";
        }

        count++;
    });
}