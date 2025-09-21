<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>루틴 모임 목록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/club/admin-small-club-list.css">
<%-- <script defer
	src="${pageContext.request.contextPath}/assets/js/admin/club/admin-club-list.js"></script> --%>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
</head>

<body class="font-menu">
	<jsp:include page="/admin_header.jsp" />
	<main>
		<jsp:include page="/adminSidebar.jsp" />

		<section id="main-club">
			<div id="main-club-div">
				<div id="main-club-list-title">
					<div class="class-club-number">
						<p class="main-club-number">번호</p>
					</div>
					<div class="class-club-name">
						<p class="main-club-name">작성자</p>
					</div>
					<div class="class-club-title">
						<p class="main-club-title">소모임 제목</p>
					</div>
					<div class="class-club-start">
						<p class="main-club-start">작성일</p>
					</div>
				</div>
				<ul id="main-club-list">
					<c:choose>
						<c:when test="${not empty smallClubList}">
							<c:forEach var="smallClub" items="${smallClubList}">
								<li class="main-must-read"><a
									href="${pageContext.request.contextPath}/admin/smallclubReadOk.ad?smallClubNumber=${smallClub.smallClubNumber}"
									class="main-club-link">
										<div class="class-club-number">
											<p class="main-club-number">
												<c:out value="${smallClub.smallClubNumber}" />
											</p>
										</div>
										<div class="class-club-name">
											<p class="main-club-name">
												<c:out value="${smallClub.memberNickname}" />
											</p>
										</div>
										<div class="class-club-title class-club-title-add">
											<p class="main-club-title">
												<c:out value="${smallClub.smallClubTitle}" />
											</p>
										</div>
										<div class="class-club-start">
											<p class="main-club-start">
												<c:out value="${smallClub.smallClubCreatedDate}" />
											</p>
										</div>
								</a></li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<div>
								<div colspan="5" align="center">등록된 소모임이 없습니다.</div>
							</div>
						</c:otherwise>
					</c:choose>
				</ul>
				<div id="main-page-number">
					<ul>
						<c:if test="${prev}">
							<li><a
								href="${pageContext.request.contextPath}/admin/smallClubListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/smallClubListOk.ad?page=${i}">
											<c:out value="${i}" />
									</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="#" class="active"> <c:out value="${i}" />
									</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:if test="${next}">
							<li><a
								href="${pageContext.request.contextPath}/admin/smallClubListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
				</div>

			</div>
		</section>
	</main>
</body>

</html>