window.addEventListener('DOMContentLoaded', () => {
    //불러오기
    fetch("./../../app/mypage/mypage-list.html")
        .then(response => response.text())
        .then(data => {
            list = document.querySelectorAll(`.mypage-list`);

            list.forEach((item) => {
                item.innerHTML = data;
                const listPageTitle = item.querySelector('.pagetitle');
                const listColType = item.querySelector('.list-col-type');
                const listContentList = item.querySelectorAll('.li-content');
                const searchTypeFirst = item.querySelector('.search-type-first');
                const searchTypeSecond = item.querySelector('.search-type-second');

                let id = item.getAttribute("id");

                item.querySelector('.button-search img').setAttribute('value', id + "_search");
                item.querySelector('.select-search').setAttribute('id', id + "_search");

                inputList(listPageTitle, listColType, listContentList, searchTypeFirst, searchTypeSecond, id);
            });
        });
})

class ListInfo {
    constructor(title, colText, data) {
        this.title = title;
        this.colText = colText;
        this.data = data;
    }
}

function ListRow(title, userName, date) {
    this.title = title;
    this.userName = userName;
    this.date = date;
};

const myRoutine = new ListInfo(
    '나의 신청 루틴 모임 내역',
    new ListRow('제목', '지도자', '신청일자'),
    [
        new ListRow("[26기 틈새빛]성장하는 빛", "전보라", "2025.08.02"),
        new ListRow("[26기 틈새빛]성장하는 빛", "전보라", "2025.08.02"),
        new ListRow("[26기 틈새빛]성장하는 빛", "전보라", "2025.08.02"),
        new ListRow("[26기 틈새빛]성장하는 빛", "전보라", "2025.08.02"),
    ]
);

const myCourse = new ListInfo(
    '나의 수강 수업 내역',
    new ListRow('제목', '전문가', '신청일자'),
    [
        new ListRow("[IT]Java의 정석1", "김영선", "2025.08.02"),
        new ListRow("[IT]Java의 정석2", "김영선", "2025.08.02")
    ]
);


const myPosts = new ListInfo(
    '나의 게시글 내역',
    new ListRow('제목', '게시판', '작성일자'),
    [
        new ListRow("정말 즐거운 모임~~~~", "루틴 모임 후기", "2025.08.02"),
        new ListRow("알찬 수업 구성에 놀라운 전문가의 실력", "수업 후기", "2025.08.02")
    ]
);

const myComments = new ListInfo(
    '나의 댓글 내역',
    new ListRow('댓글 내용', '글 제목', '작성일자'),
    [
        new ListRow("오~~~~저도 정말 가고싶네요ㅎㅎㅎㅎ 기회가 된다면 꼭 루틴 모임에 나가겠습니다. 모두모두모두 행복하세요!", "정말 즐거운 모임!", "2025.08.02"),
        new ListRow("오~~~~저도 정말 가고싶네요ㅎㅎㅎㅎ 기회가 된다면 꼭 루틴 모임에 나가겠습니다. 모두모두모두 행복하세요!", "정말 즐거운 모임!", "2025.08.02")
    ]
);

function inputList(listPageTitle, listColType, listContentList, searchTypeFirst, searchTypeSecond, id) {
    if (id === "my-courses-routine")
        loadList(listPageTitle, listColType, listContentList, searchTypeFirst, searchTypeSecond, "./../routine-meeting/routine-meeting-detail-ing.html", myRoutine);
    else if (id === "my-courses-courses")
        loadList(listPageTitle, listColType, listContentList, searchTypeFirst, searchTypeSecond, "./../course/course-detail-user-ing.html", myCourse);
    else if (id === "my-post")
        loadList(listPageTitle, listColType, listContentList, searchTypeFirst, searchTypeSecond, "./../course/course-review-detail.html", myPosts);
    else if (id === "my-comment")
        loadList(listPageTitle, listColType, listContentList, searchTypeFirst, searchTypeSecond, "./../routine-meeting/routine-meeting-review-detail.html", myComments);
}

function loadList(listPageTitle, listColType, listContentList, searchTypeFirst, searchTypeSecond, href, listInfo) {
    listPageTitle.innerHTML = listInfo.title;

    listColType.querySelector('.list-title').innerHTML = listInfo.colText['title'];
    listColType.querySelector('.list-user-name').innerHTML = listInfo.colText.userName;
    listColType.querySelector('.list-date').innerHTML = listInfo.colText.date;

    searchTypeFirst.innerHTML = listInfo.colText['title'];
    searchTypeSecond.innerHTML = listInfo.colText.userName;

    let count = 0;

    listContentList.forEach((e) => {
        if (listInfo.data.length - 1 < count)
            return;

        e.querySelector('.list-title').setAttribute("href", href);
        e.querySelector('.list-title').innerHTML = listInfo.data[count].title;
        e.querySelector('.list-user-name').innerHTML = listInfo.data[count].userName;
        e.querySelector('.list-date').innerHTML = listInfo.data[count].date;

        count++;
    });
}

function search(e) {
    let id = e.target.getAttribute('value').split('_')[0];
    selectedIndex = document.querySelector(`#${e.target.getAttribute('value')}`).selectedIndex;
    listContentList = document.querySelector(`#${id}`).querySelectorAll('.li-content');
    const inputSearch = document.querySelector(`#${id}`).querySelector('.input-search');

    listContentList.forEach((e) => {
        console.log(e);
        e.querySelector('.list-title').setAttribute("href", "");
        e.querySelector('.list-title').innerHTML = "";
        e.querySelector('.list-user-name').innerHTML = "";
        e.querySelector('.list-date').innerHTML = "";
    })

    let listInfo;
    let href;
    if (id === "my-courses-routine") {
        listInfo = myRoutine;
        href = "./../routine-meeting/routine-meeting-detail-ing.html";
    }
    else if (id === "my-courses-courses") {
        listInfo = myCourse;
        href = "./../course/course-detail-user-ing.html";
    }
    else if (id === "my-post") {
        listInfo = myPosts;
        href = "./../course/course-review-detail.html";
    }
    else if (id === "my-comment") {
        listInfo = myComments;
        href = "./../routine-meeting/routine-meeting-review-detail.html";
    }

    let searchList;

    if (selectedIndex == 0)
        searchList = listInfo.data.filter(data => data.title.includes(inputSearch.value));
    else if (selectedIndex == 1)
        searchList = listInfo.data.filter(data => data.userName.includes(inputSearch.value));

    let count = 0;
    listContentList.forEach((e) => {
        if (searchList.length - 1 < count)
            return;

        e.querySelector('.list-title').setAttribute("href", href);
        e.querySelector('.list-title').innerHTML = searchList[count].title;
        e.querySelector('.list-user-name').innerHTML = searchList[count].userName;
        e.querySelector('.list-date').innerHTML = searchList[count].date;
        console.log(searchList[count].title);

        count++;
    });
}