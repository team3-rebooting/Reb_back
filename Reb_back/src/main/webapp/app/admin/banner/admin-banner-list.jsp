<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>배너 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/banner/admin-banner-list.css">
  <script defer src="./../../../assets/js/admin/banner/admin-banner-list.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>

<body class="font-menu">
  <!-- 헤더 -->
  <header>
    <!-- 헤더 메뉴명 -->
    <p><strong>배너 목록</strong></p>
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
            활동 후기
          </a>
        </li>
        <li>
          <a href="./../banner/admin-banner-list.html">
            <strong>배너 등록</strong>
          </a>
        </li>
      </ul>
    </section>
    <!-- 메인 영역 -->
    <section id="main-banner">
      <div id="main-banner-div">
        <!-- 배너 리스트 제목 -->
        <div class="main-banner-title">
          <!-- 업다운 영역 -->
          <div class="main-banner-up-down"></div>
          <!-- 배너 번호 영역 -->
          <p class="main-banner-number">번호</p>
          <!-- 배너명 영역 -->
          <p class="main-banner-name">배너명</p>
          <!-- 배너 이미지명 영역 -->
          <p class="main-banner-image">이미지 명</p>
          <!-- 삭제 버튼 영역 -->
          <div class="main-banner-delete"></div>
        </div>
        <!-- 배너 리스트 -->
        <ul id="main-banner-list">
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">1</p>
            <p class="main-banner-name">환영 인사1</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">2</p>
            <p class="main-banner-name">환영 인사2</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">3</p>
            <p class="main-banner-name">환영 인사3</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">4</p>
            <p class="main-banner-name">환영 인사4</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">5</p>
            <p class="main-banner-name">환영 인사5</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">6</p>
            <p class="main-banner-name">환영 인사6</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">7</p>
            <p class="main-banner-name">환영 인사7</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">8</p>
            <p class="main-banner-name">환영 인사8</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">9</p>
            <p class="main-banner-name">환영 인사9</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
          <li>
            <div class="main-banner-up-down">
              <form action="" method="get">
                <button class="up">▲</button>
                <button class="down">▼</button>
              </form>
            </div>
            <p class="main-banner-number">10</p>
            <p class="main-banner-name">환영 인사10</p>
            <p class="main-banner-image">인사이미지.jpg</p>
            <div class="main-banner-delete">
              <form action="" method="get">
                <button class="delete">삭제</button>
              </form>
            </div>
          </li>
        </ul>
        <!-- 배너 추가 버튼 -->
        <button id="main-banner-add">추가</button>
      </div>
    </section>
  </main>
</body>

</html>