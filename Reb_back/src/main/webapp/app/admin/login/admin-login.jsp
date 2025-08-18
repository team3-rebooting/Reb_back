<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>관리자 로그인</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/login/admin-login.css">
  <script defer src="./../../../assets/js/admin/login/admin-login.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">
</head>

<body>
  <!-- 메인 영역 -->  
  <main>
    <!-- 로그인 영역 -->
    <section id="main-login">
      <!-- 사이트 로고 -->
      <img src="./../../../assets/img/team_logo.png" alt="페이지 로고" id="main-login-logo">
      <p>틈새빛 관리 시스템</p>
      <!-- 아이디, 비밀번호 form -->
      <form action="" method="post">
        <!-- 아이디 입력 영역 -->
        <input type="text" id="main-login-id" name="id" placeholder="아이디" value="" autofocus>
        <!-- 비밀번호 입력 영역 -->
        <input type="password" id="main-login-pw" name="pw" placeholder="패스워드" autocomplete="off" value="">
        <!-- 경고 메세지 영역 -->
        <div>
          <p id="main-login-warning">잘못된 ID 또는 패스워드입니다. 입력을 확인해주세요.</p>
        </div>
        <!-- 로그인 버튼 -->
        <button type="button" id="main-login-submit">로그인</button>
      </form>
    </section>
  </main>
</body>

</html>