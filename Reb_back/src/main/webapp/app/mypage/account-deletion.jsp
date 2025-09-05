<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/account-deletion.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
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
  <script defer src="${pageContext.request.contextPath}/assets/js/mypage/account-deletion.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <jsp:include page="/header.jsp" />
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <div id="account-deletion">회원 탈퇴가 완료되었습니다.<br>그동안 감사했습니다.</div>
    </div>
  </main>
  <!-- 푸터 -->
  <jsp:include page="/footer.jsp" />
</body>

</html>