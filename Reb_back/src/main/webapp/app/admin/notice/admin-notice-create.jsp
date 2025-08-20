<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../../assets/css/admin/notice/admin-notice-create.css">
  <script defer src="${pageContext.request.contextPath}/assets/js/admin/notice/admin-notice-create.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">
  <title>공지 사항 등록</title>
</head>

<body>
  <!-- 헤더 -->
  <header>
    <!-- 목록으로 이동 -->
    <a href="./admin-notice-list.html">
      <!-- 사이트 로고 -->
      <img src="./../../../assets/img/team_logo.png" alt="사이트 로고">
    </a>
  </header>
  <!-- 메인 -->
  <main>
    <!-- 페이지 제목 -->
    <div id="main-admin-notice-create"  class="font-menu">
      <strong>공지 사항 등록</strong>
    </div>
    <!-- 제목, 파일, 내용 입력 --> 
    <form action="" method="get">
      <!-- 제목 입력 -->
      <input type="text" name="title" id="main-admin-notice-create-title" placeholder="제목을 입력해 주세요" class="input-in">
      <!-- 파일 입력 -->
      <input type="file" name="file" id="main-admin-notice-create-file" placeholder="추가 파일">
      <!-- 내용 입력 -->
      <textarea name="content" id="main-admin-notice-create-content" placeholder="내용을 입력해주세요" class="input-in"></textarea>
    </form>
    <!-- 작성, 취소 버튼 영역 -->
    <div>
      <!-- 작성 버튼 -->
      <button class="main-btn">작성</button>
      <!-- 취소 버튼 -->
      <button class="main-btn">취소</button>
    </div>
  </main>
  <footer>

  </footer>
</body>

</html>