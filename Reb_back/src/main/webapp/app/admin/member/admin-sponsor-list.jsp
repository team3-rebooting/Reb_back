<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>후원자 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/member/admin-sponsor-list.css">
  <script defer src="./../../../assets/js/admin/member/admin-sponsor-list.js"></script>
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
    <p><strong>후원자 목록</strong></p>
    <!-- 로그아웃 -->
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
            공지 사항 목록
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
            <strong>후원자 목록</strong>
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
    <section id="main-sponsor">
      <div id="main-sponsor-div">
        <!-- 후원 금액 영역 -->
        <div id="main-support-money">
          <div>
            <p>총 후원 금액 : </p>
            <p>100,000,000원</p>
          </div>
          <div>
            <p>최근 1년간 후원 금액 : </p>
            <p>80,000,000원</p>
          </div>
          <div>
            <p>최근 1달간 후원 금액 : </p>
            <p>10,000,000원</p>
          </div>
        </div>
        <!-- 후원자 리스트 제목 -->
        <div id="main-sponsor-list-title">
          <!-- 아이디 영역 -->
          <p class="main-sponsor-list-id">아이디</p>
          <!-- 닉네임 영역 -->
          <p class="main-sponsor-list-nickname">닉네임</p>
          <!-- 후원금액 영역 -->
          <p class="main-sponsor-list-support">총 후원금액(원)</p>
          <p class="main-sponsor-list-date">후원날짜</p>
        </div>
        <!-- 후원자 목록 리스트 -->
        <ul id="main-sponsor-list">
          <!-- 후원자 리스트 목록 -->
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2025-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
          <li>
            <p class="main-sponsor-list-id">gildong123</p>
            <p class="main-sponsor-list-nickname">gildong</p>
            <p class="main-sponsor-list-support">10,000,000</p>
            <p class="main-sponsor-list-date">2525-08-15</p>
          </li>
        </ul>
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
              <option value="title">회원 번호</option>
              <option value="name">아이디</option>
              <option value="name">닉네임</option>
            </select>
          </div>
          <!-- 검색 입력 창 -->
          <form action="" method="">
            <input type="text" id="main-search-input">
            <!-- 돋보기 이미지 -->
            <button><img src="./../../../assets/img/search.jpg" alt="돋보기"></button>
          </form>
        </div>
      </div>
    </section>
  </main>
</body>

</html>