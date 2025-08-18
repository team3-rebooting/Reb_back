<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/member/admin-member-list.css">
  <script defer src="./../../../assets/js/admin/member/admin-member-list.js"></script>
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
    <p><strong>회원 목록</strong></p>
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
            <strong>회원 목록</strong>
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
    <section id="main-member">
      <div id="main-member-div">
        <!-- 회원 리스트 제목 -->
        <div id="main-admin-member-list-title">
          <!-- 회원 번호 영역 -->
          <p class="main-admin-member-list-number">회원 번호</p>
          <!-- 아이디 영역 -->
          <p class="main-admin-member-list-id">아이디</p>
          <!-- 닉네임 영역 -->
          <p class="main-admin-member-list-nickname">닉네임</p>
          <!-- 인적사항 영역 -->
          <p class="main-admin-member-list-info">인적사항</p>
          <!-- 회원 유형 영역 -->
        </div>
        <!-- 회원 목록 리스트 -->
        <ul id="main-admin-member-list">
          <!-- 회원 리스트 목록 -->
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
          </li>
          <li>
            <p class="main-admin-member-list-number">123123</p>
            <p class="main-admin-member-list-id">gildong123</p>
            <p class="main-admin-member-list-nickname">돌굴러가유</p>
            <div class="main-admin-member-list-info-li">
              <p>[주소] 서울특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
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
              <option value="title">아이디</option>
              <option value="name">회원 번호</option>
              <option value="name">닉네임</option>
              <option value="name">회원 유형</option>
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