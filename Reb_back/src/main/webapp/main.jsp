<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./assets/css/main.css">

  <link rel="stylesheet" href="./assets/css/header-login.css">
  <link rel="stylesheet" href="./assets/css/footer.css">

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <script defer src="./assets/js/main.js"></script>
  
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <div id="header" class="main-page">
  </div>
  <main>
    <!-- 배너 영역 -->
    <div id="main-top-banner-container">
      <!-- 배너 이미지 영역 -->
      <div id="main-top-banner-img-box">
        <div id="main-top-banner-img">
          <!-- 배너 좌측 버튼 -->
          <div class="div-button-banner" onclick="moveBanner(-1)">&lt;</div>
          <!-- 배너 이미지 목록 -->
          <div id="main-banner-box">
            <ul id="main-ul-banner">
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
              <li class="main-li-banner"><img src="./assets/img/stone.jpg" alt=""></li>
            </ul>
          </div>
          <!-- 배너 우측 버튼 -->
          <div class="div-button-banner" onclick="moveBanner(1)">&gt;</div>
        </div>
        <!-- 배너 페이지 번호 -->
        <div id="banner-page-number">
          1/10
        </div>
      </div>
    </div>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 메뉴 링크 -->
      <div id="main-link-box">
        <a href="./app/aboutUs/site-introduction.html">게시판 소개글</a>
        <a href="./app/routine-meeting/routine-meeting-review-list.html">루틴 모임 후기 바로가기</a>
        <a href="./app/routine-meeting/routine-meetings-list.html">루틴 모임 바로가기</a>
        <a href="./app/course/course-list.html">수업 신청 바로가기</a>
        <a href="./app/course/course-review-list.html">수업 후기 바로가기</a>
      </div>
      <!-- 모집중인 루틴 모임 후기글 -->
      <div class="review-container">
        <div class="pagetitle" id="routine-pagetitle">모집중인 루틴 모임 후기글</div>
        <!-- 리뷰 리스트 -->
        <div id="review-list">
          <!-- 리뷰 -->
          <div class="review-box">
            <a href="./app/routine-meeting/routine-meeting-review-detail.html" clas="a-review-box">
              <!-- 리뷰 이미지 -->
              <div class="review-img-box">
                <img src="./assets/img/routine.png" alt="">
              </div>
              <!-- 리뷰 정보 -->
              <!-- 리뷰 제목 -->
              <div class="review-title">즐거운 루틴 모임 시간이었습니다!</div>
              <div class="review-text">
                <!-- 리뷰 작성자 -->
                <div class="routine-review-person">전보라</div>
                <!-- 작성일자 -->
                <div class="routine-review-date">2025.08.03(일)</div>
              </div>
            </a>
          </div>
          <div class="review-box">
            <a href="./app/routine-meeting/routine-meeting-review-detail.html" clas="a-review-box">
              <div class="review-img-box">
                <img src="./assets/img/routine.png" alt="">
              </div>
              <div class="review-title">즐거운 루틴 모임 시간이었습니다!</div>
              <div class="review-text">
                <div class="review-person">전보라</div>
                <div class="review-date">2025.08.03(일)</div>
              </div>
            </a>
          </div>
          <div class="review-box">
            <a href="./app/routine-meeting/routine-meeting-review-detail.html" clas="a-review-box">
              <div class="review-img-box">
                <img src="./assets/img/routine.png" alt="">
              </div>
              <div class="review-title">즐거운 루틴 모임 시간이었습니다!</div>
              <div class="review-text">
                <div class="review-person">전보라</div>
                <div class="review-date">2025.08.03(일)</div>
              </div>
            </a>
          </div>
        </div>
      </div>
      <div class="review-container">
        <div class="pagetitle">모집중인 수업 후기글</div>
        <div id="review-list">
          <div class="review-box">
            <a href="./app/course/course-review-detail.html" clas="a-review-box">
              <div class="review-img-box">
                <img src="./assets/img/routine.png" alt="">
              </div>
              <div class="review-title">알찬 구성 수업과 실력있는 선생님~</div>
              <div class="review-text">
                <div class="routine-review-person">전보라</div>
                <div class="routine-review-date">2025.08.03(일)</div>
              </div>
            </a>
          </div>
          <div class="review-box">
            <a href="./app/course/course-review-detail.html" clas="a-review-box">
              <div class="review-img-box">
                <img src="./assets/img/routine.png" alt="">
              </div>
              <div class="review-title">알찬 구성 수업과 실력있는 선생님~</div>
              <div class="review-text">
                <div class="review-person">전보라</div>
                <div class="review-date">2025.08.03(일)</div>
              </div>
            </a>
          </div>
          <div class="review-box">
            <a href="./app/course/course-review-detail.html" clas="a-review-box">
              <div class="review-img-box">
                <img src="./assets/img/routine.png" alt="">
              </div>
              <div class="review-title">알찬 구성 수업과 실력있는 선생님~</div>
              <div class="review-text">
                <div class="review-person">전보라</div>
                <div class="review-date">2025.08.03(일)</div>
              </div>
            </a>
          </div>
        </div>
      </div>
    </div>
  </main>
  <!-- 푸터 -->
  <div id="footer">
  </div>
  <script src="./assets/js/main.js"></script>
  <script src="./assets/js/header-login.js"></script>
  <script src="./assets/js/footer.js"></script>
</body>

</html>