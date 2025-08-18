<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>전문가 승인 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/member/admin-expert-access-list.css">
  <script defer src="./../../../assets/js/admin/member/admin-expert-access-list.js"></script>
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
      <p><strong>전문가 승인 목록</strong></p>
      <!-- 로그아웃 버튼 -->
      <button id="logout">
        logout
      </button>
    </section>
    <!-- 하단 목록 영역 -->
    <section>
      <!-- 하단 목록 리스트 -->
      <ul>
        <li>
          <a href="./../../../app/admin/member/admin-expert-list.html">
            전문가 인증 신청
          </a>
        </li>
        <li>
          <a href="./../../../app/admin/member/admin-expert-access-list.html">
            <strong>전문가 목록</strong>
          </a>
        </li>
      </ul>
    </section>
  </header>
  <!-- 반려 모달 전체 창 -->
  <div id="modal-background">
    <!-- 반려 모달 -->
    <div id="cancel-modal">
      <!-- 반려 모달 입력창 -->
      <div id="cancel-modal-in">
        <p>전문가 승인 반려/승인 취소 사유</p>
        <!-- 반려 모달 입력 form  -->
        <form action="" method="get" id="cancel-input">
          <!-- 반려 모달 입력 영역 -->
          <textarea name="modal" placeholder="사유 입력" id="return-message" autofocus></textarea>
          <!-- 반려 모달 등록 버튼 -->
          <button type="button" id="submit">등록</button>
        </form>
      </div>
      <!-- 반려 모달 나가기 버튼 -->
      <button type="button" id="close-modal">X</button>
    </div>
  </div>
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
            <strong>전문가 승인 목록</strong>
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
    <section id="main-expert-access">
      <!-- 전문가 목록 영역 -->
      <div id="main-expert-access-div">
        <!-- 승인된 전문가 리스트 제목 -->
        <div id="main-expert-access-list-title">
          <!-- 회원번호 영역 -->
          <p class="main-expert-access-list-number">회원 번호</p>
          <!-- 아이디 영역 -->
          <p class="main-expert-access-list-id">아이디</p>
          <!-- 닉네임 영역 -->
          <p class="main-expert-access-list-nickname">닉네임</p>
          <!-- 빈 공간 -->
          <p class="main-garbage-area"></p>
          <!-- 전문가 분야 영역 -->
          <p class="main-expert-access-list-type">분야</p>
          <!-- 전문가 승인 날짜 영역 -->
          <p class="main-expert-access-list-date">승인 날짜</p>
        </div>
        <ul id="main-expert-access-list">
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
            </a>
          </li>
          <li>
            <a href="./../../../app/admin/member/admin-expert-access-detail.html">
              <p class="main-expert-access-list-number">123123</p>
              <p class="main-expert-access-list-id">gildong123</p>
              <p class="main-expert-access-list-nickname">gildong</p>
              <div class="main-garbage-area"></div>
              <p class="main-expert-access-list-type">IT</p>
              <p class="main-expert-access-list-date">2025-08-15</p>
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
          <select class="select-find">
            <option value="title">아이디</option>
            <option value="name">닉네임</option>
            <option value="name">분야</option>
          </select>
          <!-- 검색 입력창 -->
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