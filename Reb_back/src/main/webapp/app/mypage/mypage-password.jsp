<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/mypage-password.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">

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

<script defer
	src="${pageContext.request.contextPath}/assets/js/mypage/mypage-password.js"></script>
<title>틈새빛</title>
</head>

<body>
	<!-- 헤더 -->
	<jsp:include page="/header.jsp" />
	<main>
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<!-- 페이지 제목 -->
			<div class="pagetitle">마이페이지</div>
			<!-- 비밀번호 form -->
			<form class="form-pw"
				action="${pageContext.request.contextPath}/myPage/myPasswordOk.my"
				method="post">
				<!-- 비밀번호 입력 -->
				<label for="buttonPw" class="label-pw">비밀번호</label> <input
					type="password" name="memberPassword" id="input-pw"
					placeholder="비밀번호 입력">
				<button class="button-pw" value="button-pw">확인</button>
			</form>
			<!-- 비밀번호 틀렸을 경우 안내 문구 -->
			<c:if test="${ param.pw == 'fail'}">
				<div class="wrongpw font-main">올바르지 않은 비밀번호 입니다.</div>
			</c:if>
		</div>
	</main>
	<!-- 푸터 -->
	<div id="footer"></div>
	<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</body>

</html>