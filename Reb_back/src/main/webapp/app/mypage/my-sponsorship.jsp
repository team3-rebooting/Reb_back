<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./../../assets/css/mypage/my-sponsorship.css">
    <link rel="stylesheet" href="./../../assets/css/mypage/sidemenu.css">
    <link rel="stylesheet" href="./../../assets/css/mypage/mypage-modal.css">
    <link rel="stylesheet" href="./../../assets/css/mypage/mypage-list.css">

    <link rel="stylesheet" href="./../../assets/css/header-login.css">
    <link rel="stylesheet" href="./../../assets/css/footer.css">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
        rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
        rel="stylesheet">

    <script defer src="./../../assets/js/mypage/my-sponsorship.js"></script>
    <title>틈새빛</title>
</head>

<body>
    <!-- 헤더 -->
    <jsp:include page="/header.jsp" />
    <main>
        <!-- 모달 -->
        <div class="mypage-modal">
        </div>
        <!-- 사이드 메뉴 -->
        <aside id="mypage-sidemenu-container">
        </aside>
        <!-- 메인 컨테이너 -->
        <div id="main-container">
            <div class="pagetitle">후원 정보</div>
            <!-- 후원 정보 -->
            <div class="my-sponsorship-container font-main">
                <!-- 후원 상세 정보 -->
                <div class="my-sponsorship-data">
                    <div class="my-sponsorship-data-title">총 후원 금액</div>
                    <div class="my-sponsorship-data-content">1,150,000원</div>
                </div>
                <div class="my-sponsorship-data">
                    <div class="my-sponsorship-data-title">총 후원 횟수</div>
                    <div class="my-sponsorship-data-content">3회</div>
                </div>
            </div>
            <!-- 후원 목록 -->
            <div class="my-sponsorship-list-container font-main" id="my-sponsorship">
                <div class="my-sponsorship-list">
                    <!-- 목록 속성 -->
                    <div class="my-sponsorship-list-col-type">
                        <p class="font-main list-money">후원 금액</p>
                        <p class="font-main list-date">후원일자</p>
                    </div>
                    <!-- 후원 목록 -->
                    <ul class="my-sponsorship-ul-list">
                        <li class="li-sponsorship-content">
                            <p class="font-main list-money">700,000원</p>
                            <p class="font-main list-date">2025.08.02</p>
                        </li>
                        <li class="li-sponsorship-content">
                            <p class="font-main list-money">300,000원</p>
                            <p class="font-main list-date">2025.08.02</p>
                        </li>
                        <li class="li-sponsorship-content">
                            <p class="font-main list-money">150,000원</p>
                            <p class="font-main list-date">2025.08.01</p>
                        </li>
                    </ul>
                </div>
                <!-- 페이지 번호 -->
                <div class="page-list">
                    <div class="pagenation">
                        <a href="#">&lt;</a>
                        <a href="#">1</a>
                        <a href="#">2</a>
                        <a href="#">3</a>
                        <a href="#">4</a>
                        <a href="#">5</a>
                        <a href="#">&gt;</a>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <!-- 푸터 -->
    <div id="footer">
    </div>
    <script src="./../../assets/js/mypage/sidemenu.js"></script>
    <script src="./../../assets/js/mypage/mypage-list.js"></script>
    <script src="./../../assets/js/mypage/mypage-modal.js"></script>
    <script src="./../../assets/js/footer.js"></script>
</body>

</html>