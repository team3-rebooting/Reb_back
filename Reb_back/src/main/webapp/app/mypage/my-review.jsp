<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/my-posts.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/mypage-modal.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/mypage-list.css">

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

  <script defer src="${pageContext.request.contextPath}/assets/js/mypage/my-posts.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <jsp:include page="/header.jsp" />
  <main>
    <!-- 모달 -->
    <div class="mypage-modal">
    </div>
    <!-- 사이드 메뉴 -->
    <jsp:include page="${pageContext.request.contextPath}/app/mypage/sidemenu.jsp" />
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 나의 게시글 목록 -->
      <div class="mypage-list" id="my-review">
			<jsp:include page="${pageContext.request.contextPath}/app/mypage/mypage-list.jsp" />
      </div>
      <!-- 나의 댓글 목록 -->
      <div class="mypage-list" id="my-comment">
			<jsp:include page="${pageContext.request.contextPath}/app/mypage/mypage-list.jsp" />
      </div>
    </div>
  </main>
  <!-- 푸터 -->
  <jsp:include page="/footer.jsp" />
  <script src="${pageContext.request.contextPath}/assets/js/mypage/sidemenu.js"></script>
  <script src="${pageContext.request.contextPath}/assets/js/mypage/mypage-list.js"></script>
  <script src="${pageContext.request.contextPath}/assets/js/mypage/mypage-modal.js"></script>
</body>

</html>