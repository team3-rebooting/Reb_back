<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/mypage-password.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header-login.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css">

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">

  <script defer src="${pageContext.request.contextPath}/assets/js/mypage/mypage-password.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <div id="header">
  </div>
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 페이지 제목 -->
      <div class="pagetitle">마이페이지</div>
      <!-- 비밀번호 form -->
      <form class="form-pw" action="" method="post">
        <!-- 비밀번호 입력 -->
        <label for="buttonPw" class="label-pw">비밀번호</label>
        <input type="password" name="memberPassword" id="input-pw" placeholder="비밀번호 입력">
        <button class="button-pw" value="button-pw" type="button">확인</button>
      </form>
      <!-- 비밀번호 틀렸을 경우 안내 문구 -->
      <div class="wrongpw font-main">올바르지 않은 비밀번호 입니다.</div>
    </div>
  </main>
  <!-- 푸터 -->
  <div id="footer">
  </div>
  <script src="${pageContext.request.contextPath}/assets/js/header-login.js"></script>
  <script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</body>

</html>