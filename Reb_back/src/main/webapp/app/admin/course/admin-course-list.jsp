<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>수업 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/course/admin-course-list.css">
  <script defer src="./../../../assets/js/admin/course/admin-course-list.js"></script>
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
      <p><strong>수업 목록</strong></p>
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
          <a href="./../course/admin-course-request-list.html">
            요청 목록
          </a>
        </li>
        <li>
          <a href="./../course/admin-course-list.html">
            <strong>수업 목록 리스트</strong>
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
            <strong>수업 목록</strong>
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
    <section id="main-course">
      <div id="main-course-div">
        <!-- 수업 목록 리스트 제목 -->
        <div id="main-course-list-title">
          <!-- 회원번호 영역 -->
          <p class="main-course-number">회원번호</p>
          <!-- 아이디 영역 -->
          <p class="main-course-id">아이디</p>
          <!-- 닉네임 영역 -->
          <p class="main-course-nickname">닉네임</p>
          <!-- 제목 영역 -->
          <p class="main-course-title">제목</p>
          <!-- 개강 여부 영역 -->
          <p class="main-course-type">개강 여부</p>
          <!-- 시작 기간 영역 -->
          <p class="main-course-start">시작 기간</p>
          <!-- 종료 기간 영역 -->
          <p class="main-course-end">종료 기간</p>
        </div>
        <!-- 수업 목록 리스트 -->
        <ul id="main-course-list">
          <!-- 수업 리스트 목록 -->
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">모집중</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">모집 전</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">모집 종료</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">수업중</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">종강</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">종강</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">종강</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">종강</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">종강</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-course-detail.html" class="main-course-link">
              <p class="main-course-number">123123</p>
              <p class="main-course-id">gildong123</p>
              <p class="main-course-nickname">길동이에유</p>
              <p class="main-course-title">웹 보안 수업 개설</p>
              <p class="main-course-type">종강</p>
              <p class="main-course-start">2025-07-01</p>
              <p class="main-course-end">2025-08-01</p>
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
              <option value="name">회원 번호</option>
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