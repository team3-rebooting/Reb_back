<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/my-courses.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/mypage-modal.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/mypage-list.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/footer.css">


<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">

<script defer src="./../../assets/js/mypage/my-courses.js"></script>
<title>틈새빛</title>
</head>
<body>
	<!-- 헤더 -->
	<jsp:include page="/header.jsp" />
	<main>
		<!-- 모달 -->
		<jsp:include page="${pageContext.request.contextPath}/app/mypage/mypage-modal.jsp" />
		<!-- 사이드 메뉴 -->
		<jsp:include page="${pageContext.request.contextPath}/app/mypage/sidemenu.jsp" />
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<!-- 나의 루틴 모임 목록 -->
			<div id="my-courses-routine" class="mypage-list">
				<jsp:include page="${pageContext.request.contextPath}/app/mypage/mypage-list.jsp" />
			</div>
			<!-- 나의 수강 수업 목록 -->
			<div id="my-courses-courses" class="mypage-list">
				<jsp:include page="${pageContext.request.contextPath}/app/mypage/mypage-list.jsp" />
			</div>
		</div>
	</main>
	<!-- 푸터 -->
	<div id="footer"></div>
	<script>
		let listType=1;
	</script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/sidemenu.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/mypage-list.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/mypage-modal.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</body>
</html>