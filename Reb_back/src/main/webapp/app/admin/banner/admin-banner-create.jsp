<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>배너 등록</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/banner/admin-banner-create.css">
  <script defer src="${pageContext.request.contextPath}/assets/js/admin/banner/admin-banner-create.js"></script>
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
    <p><strong>배너 등록</strong></p>
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
      <!-- 배너명, 배너 파일 등록, 취소 영역 -->
      <div id="main-banner-div">
        <!-- input 담은 form -->
        <form action="" method="get">
          <!-- 배너 명 입력 -->
          <input type="text" id="main-banner-input-name" placeholder="배너 명">
          <!-- 배너 이미지 파일 입력 -->
          <input type="file" placeholder="이미지 파일">
          <!-- 등록, 취소 버튼 영역 -->
          <div id="main-banner-btn">
            <!-- 등록 버튼 -->
            <button type="button">
              등록
            </button>
            <!-- 취소 버튼 -->
            <button type="button">
              취소
            </button>
          </div>
        </form>
      </div>
    </section>
  </main>
</body>

</html>