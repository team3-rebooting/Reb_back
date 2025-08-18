<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>공지 사항 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/notice/admin-notice-list.css">
  <script defer src="./../../../assets/js/admin/notice/admin-notice-list.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>

<body class="font-menu">
  <!-- 헤더 -->
  <header>
    <!-- 상단 목록 -->
    <p><strong>공지 사항 목록</strong></p>
    <!-- 로그아웃 버튼 -->
    <button>
      logout
    </button>
  </header>
  <!-- 메인 -->
  <main>
    <!-- 사이드바 리스트 영역 -->
    <section id="main-admin-list-menu">
      <!-- 사이드바 리스트 -->
      <ul id="main-admin-list">
        <li>
          <a href="./../notice/admin-notice-list.html">
            <strong>공지 사항 목록</strong>
          </a>
        </li>
        <li>
          <a href="./../course/admin-course-request-list.html">
            수업 목록
          </a>
        </li>
        <li>
          <a href="./../routine/admin-routine-list.html">
            루틴 모임 목록
          </a>
        </li>
        <li>
          <a href="./../member/admin-member-list.html">
            회원 목록
          </a>
        </li>
        <li>
          <a href="./../member/admin-sponsor-list.html">
            후원자 목록
          </a>
        </li>
        <li>
          <a href="./../member/admin-expert-list.html">
            전문가 승인 목록
          </a>
        </li>
        <li>
          <a href="./../review/admin-routine-review-list.html">
            활동 후기
          </a>
        </li>
        <li>
          <a href="./../banner/admin-banner-list.html">
            배너 등록
          </a>
        </li>
      </ul>
    </section>
    <!-- 메인 영역 -->
    <section id="main-notice">
      <div id="main-notice-div">
        <!-- 공지사항 리스트 제목 -->
        <div id="main-notice-list-title">
          <!-- 제목 영역 -->
          <p class="main-notice-title">제목</p>
          <!-- 작성자 영역 -->
          <p class="main-notice-author">작성자</p>
          <!-- 작성 날짜 영역 -->
          <p class="main-notice-create-date">작성날짜</p>
        </div>
        <!-- 공지사항 리스트 -->
        <ul id="main-notice-list">
          <!-- 공지사항 리스트 목록 -->
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
          <li class="main-notice-list-li">
            <a href="./admin-notice-detail.html" class="main-must-read-link">
              <p class="main-notice-title">틈새빛 사이트 이용 수칙</p>
              <p class="main-notice-author">관리자</p>
              <p class="main-notice-create-date">2025.08.07</p>
            </a>
          </li>
        </ul>
        <!-- 등록 버튼 -->
        <button id="main-create-notice">등록</button>
        <!-- 페이지네이션 -->
        <div id="main-page-number">
          <p>&lt</p>
          <a href="">1</a>
          <a href="">2</a>
          <a href="">3</a>
          <a href="">4</a>
          <a href="">5</a>
          <p>&gt</p>
        </div>
        <!-- 검색 영역 -->
        <div id="main-search">
          <!-- 검색 종류 -->
          <div id="main-search-basic">
            <select class="select-find">
              <option value="title">제목</option>
            </select>
          </div>
          <!-- 검색 입력 창 -->
          <form action="" method="">
            <input type="text" id="main-search-input">
            <!-- 돋보기 이미지 -->
            <button><img src="./../../../assets/img/search.jpg" alt="돋보기"></button>
          </form>
        </div>
    </section>
  </main>
  </main>
</body>

</html>