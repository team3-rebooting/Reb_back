<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>루틴 모임 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/routine/admin-routine-list.css">
  <script defer src="./../../../assets/js/admin/routine/admin-routine-list.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>

<body class="font-menu">
  <header>
    <p><strong>루틴 모임 목록</strong></p>
    <button type="button">
      logout
    </button>
  </header>

  <main>
    <section id="main-admin-list-menu">
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
            <strong>루틴 모임 목록</strong>
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
    <section id="main-routine">
      <div id="main-routine-div">
        <div id="main-routine-list-title">
          <p class="main-routine-number">모임 번호</p>
          <p class="main-routine-name">모임장</p>
          <p class="main-routine-title">제목</p>
          <p class="main-routine-count">모집 인원</p>
          <p class="main-routine-type">진행 상태</p>
          <p class="main-routine-start">모임 시작</p>
          <p class="main-routine-end">모임 종료</p>
        </div>
        <ul id="main-routine-list">
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">10</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 국토대장정</p>
              <p class="main-routine-count">0/30</p>
              <p class="main-routine-type">모집전</p>
              <p class="main-routine-start">2025-10-01</p>
              <p class="main-routine-end">2025-10-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">9</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 한강 걷기</p>
              <p class="main-routine-count">0/30</p>
              <p class="main-routine-type">모집전</p>
              <p class="main-routine-start">2025-09-01</p>
              <p class="main-routine-end">2025-09-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">8</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">0/30</p>
              <p class="main-routine-type">모집전</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">7</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">10/30</p>
              <p class="main-routine-type">모집중</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">6</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">18/30</p>
              <p class="main-routine-type">모집 종료</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">5</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">27/30</p>
              <p class="main-routine-type">모임 진행중</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">4</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">27/30</p>
              <p class="main-routine-type">모임 진행중</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">3</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">24/30</p>
              <p class="main-routine-type">모임 완료</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">2</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">30/30</p>
              <p class="main-routine-type">모임 완료</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>
          <li class="main-must-read">
            <a href="./admin-routine-detail.html" class="main-routine-link">
              <p class="main-routine-number">1</p>
              <p class="main-routine-name">전보라</p>
              <p class="main-routine-title">다 같이 서울 걷기</p>
              <p class="main-routine-count">30/30</p>
              <p class="main-routine-type">모임 완료</p>
              <p class="main-routine-start">2025-08-01</p>
              <p class="main-routine-end">2025-08-30</p>
            </a>
          </li>

        </ul>
        <div id="main-page-number">
          <p>&lt</p>
          <a href="">1</a>
          <a href="">2</a>
          <a href="">3</a>
          <a href="">4</a>
          <a href="">5</a>
          <p>&gt</p>
        </div>
        <div id="main-search">
          <div id="main-search-basic">
            <select class="select-find">
              <option value="title">제목</option>
              <option value="name">전문가명</option>
            </select>
          </div>
          <form action="" method="get">
            <input type="text" id="main-search-input">
            <button><img src="./../../../assets/img/search.jpg" alt="돋보기"></button>
            <button type="button" id="main-create-routine">등록</button>
          </form>
        </div>
      </div>
    </section>
  </main>
</body>

</html>