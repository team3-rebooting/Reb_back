<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>루틴 모임 후기</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/review/admin-routine-review-list.css">
  <script defer src="./../../../assets/js/admin/review/admin-routine-review-list.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>

<body class="font-menu">
  <!-- 헤더 -->
  <header>
    <!-- 상단 목록 영역 -->
    <section>
      <!-- 상단 목록 -->
      <p><strong>활동 후기</strong></p>
      <!-- 로그아웃 버튼 -->
      <button>
        logout
      </button>
    </section>
    <!-- 하단 목록 영역 -->
    <section>
      <!-- 하단 목록 리스트 -->
      <ul>
        <li>
          <a href="./../review/admin-routine-review-list.html">
            <strong>루틴 모임 후기</strong>
          </a>
        </li>
        <li>
          <a href="./../review/admin-course-review-list.html">
            수업 후기
          </a>
        </li>
      </ul>
    </section>
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
            <strong>활동 후기</strong>
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
    <section id="main-rt-review">
      <div id="main-rt-review-div">
        <!-- 루틴 모임 후기 리스트 제목 -->
        <div id="main-rt-review-title">
          <!-- 제목 영역 -->
          <p class="main-rt-review-name">후기 제목</p>
          <!-- 좋아요 영역 -->
          <p class="main-rt-review-heart">좋아요수</p>
          <!-- 작성자 영역 -->
          <p class="main-rt-review-nickname">작성자</p>
          <!-- 작성 날짜 영역 -->
          <p class="main-rt-review-date">작성 날짜</p>
        </div>
        <!-- 루틴 모임 후기 리스트 -->
        <ul id="main-rt-review-list">
          <!-- 루틴 모임 후기 리스트 목록 -->
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
          </li>
          <li>
            <a href="./admin-routine-review-detail.html">
              <p class="main-rt-review-name">★27기 모임 후기★</p>
              <p class="main-rt-review-heart">32</p>
              <p class="main-rt-review-nickname">전보라라라</p>
              <p class="main-rt-review-date">2025-08-02</p>
            </a>
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
              <option value="title">제목</option>
              <option value="name">작성자</option>
            </select>
          </div>
          <!-- 검색입력 창 -->
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