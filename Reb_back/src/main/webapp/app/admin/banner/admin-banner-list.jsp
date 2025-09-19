<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>배너 목록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/banner/admin-banner-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/banner/admin-banner-list.js"></script>
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
		<p>
			<strong>배너 목록</strong>
		</p>
		<!-- 로그아웃 버튼 -->
		<button>logout</button>
	</header>
	<!-- 메인 -->
	<main>
		<!-- 사이드바 리스트 영역 -->
		<jsp:include page="/adminSidebar.jsp" />
		<!-- 메인 영역 -->
		<section id="main-banner">
			<div id="main-banner-div">
				<!-- 배너 리스트 제목 -->
				<div class="main-banner-title">
					<!-- 업다운 영역 -->
					<div class="main-banner-up-down"></div>
					<!-- 배너 번호 영역 -->
					<p class="main-banner-number">순서</p>
					<!-- 배너명 영역 -->
					<p class="main-banner-name">배너명</p>
					<!-- 배너 이미지명 영역 -->
					<p class="main-banner-image">이미지 명</p>
					<!-- 삭제 버튼 영역 -->
					<div class="main-banner-delete"></div>
				</div>
				<!-- 배너 리스트 -->
				<ul id="main-banner-list">
					<c:choose>
						<c:when test="${not empty bannerList}">
							<c:forEach var="banner" items="${bannerList}">
								<li>
									<div class="main-banner-up-down">
										<form action="" method="get">
											<c:choose>
												<c:when test="${banner.bannerOrderNumber eq 1 }">
													<button class="down" 
													data-banner-number="${banner.bannerNumber}"
													data-banner-order-number="${banner.bannerOrderNumber}">▼</button>
												</c:when>
												<c:when test="${banner.bannerOrderNumber eq 10 }">
													<button class="up"
													data-banner-number="${banner.bannerNumber}"
													data-banner-order-number="${banner.bannerOrderNumber}">▲</button>
												</c:when>
												<c:otherwise>
													<button class="up"
													data-banner-number="${banner.bannerNumber}"
													data-banner-order-number="${banner.bannerOrderNumber}">▲</button>
													<button class="down"
													data-banner-number="${banner.bannerNumber}"
													data-banner-order-number="${banner.bannerOrderNumber}">▼</button>
												</c:otherwise>
											</c:choose>
										</form>
									</div>
									<p class="main-banner-number">
										<c:out value="${banner.bannerOrderNumber}" />
									</p>
									<p class="main-banner-name">
										<c:out value="${banner.bannerTitle}" />
									</p>
									<p class="main-banner-image">
										<c:out value="${banner.fileSystemName}" />
									</p>
									<div class="main-banner-delete">
											<button class="delete"
											data-banner-number="${banner.bannerNumber}">삭제</button>
									</div>
								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<div>
								<div colspan="5" align="center">등록된 배너가 없습니다.</div>
							</div>
						</c:otherwise>
					</c:choose>

				</ul>
				<!-- 배너 추가 버튼 -->
				<button id="main-banner-add">추가</button>
			</div>
		</section>
		<c:set var="uri" value="${pageContext.request.requestURI}" />
	</main>
		<c:if test="${uri eq '/app/admin/banner/admin-banner-list.jsp'}">ㅋㅋㅋ</c:if>
</body>

</html>