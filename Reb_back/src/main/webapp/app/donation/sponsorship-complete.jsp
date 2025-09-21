<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../assets/css/donation/sponsorship-complete.css">

  
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
  <script defer src="${pageContext.request.contextPath}/assets/js/donation/sponsorship-complete.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <jsp:include page="/header.jsp" />
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 후원 안내 문구 -->
      <div class="sponsorship-complete-text font-main">
       <c:out value="${amount}" /> 원 후원이 완료되었습니다.<br>
        자세한 사항은 마이페이지에서 확인 하실 수 있습니다.
      </div>
      <!-- 버튼 -->
      <div id="sponsorship-complete-bottom">
        <a href="${pageContext.request.contextPath}/"> 메인페이지로</a>
        <a href="${pageContext.request.contextPath}/myPage/mySponsorship.my">나의 후원 내역</a>
      </div>
    </div>
  </main>
  <!-- 푸터 -->
  <jsp:include page="/footer.jsp" />
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>