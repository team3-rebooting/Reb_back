<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/club/small-club-list.css">

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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">

<title>틈새빛</title>
</head>
<script defer
	src="${pageContext.request.contextPath}/assets/js/club/small-club-list.js"></script>

<body>
	<jsp:include page="/header.jsp" />
	<main>
		<div id="main-container">
			<div class="small-club-list-container">
				<p class="pagetitle">소모임 게시판</p>
				<ul class="ul-small-club-list">
					<c:choose>
						<c:when test="${not empty smallClubList}">
							<c:forEach var="smallClub" items="${smallClubList}">

								<li class="li-small-club-list-box"><a
									href="${pageContext.request.contextPath}/club/smallClubDetailOk.cl?smallClubNumber=${smallClub.smallClubNumber}">
										<c:choose>
											<c:when test="${empty smallClub.getFileSmallClubList() }">
												<img
													src="${pageContext.request.contextPath}/assets/img/team_logo.png"
													class="img-box">
											</c:when>
											<c:otherwise>
												<img
													src="${pageContext.request.contextPath}/upload/${smallClub.getFileSmallClub().getFileSystemName()}"
													class="img-box">
											</c:otherwise>
										</c:choose>

										<p class="p-list-comment">
											<c:out value="${smallClub.smallClubTitle}" />
										</p>
										<div class="div-box-status">
											<%-- <c:choose>
												<c:when test="${smallClub.getSmallClubStatusNumber() == 1}">
													<button type="button" class="button-recruit-ing">
														<c:out value="${club.getSmallClubStatusInfo()}" />
													</button>
												</c:when>
												<c:otherwise>
													<button type="button" class="button-recruit-ing" style="background-color: gray;">
														<c:out value="${smallClub.getSmallClubStatusInfo()}" />
													</button>
												</c:otherwise>
											</c:choose> --%>
											<p class="p-name-date">
												<c:out value="${smallClub.memberName}" />
												<c:out value="${smallClub.smallClubCreatedDate}" />
											</p>
										</div>
								</a></li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<div>
								<div colspan="5" align="center">등록된 게시물이 없습니다.</div>
							</div>
						</c:otherwise>
					</c:choose>
				</ul>
				<div class="div-page">
					<div class="div-pagenation">
						<c:if test="${prev}">
							<a
								href="${pageContext.request.contextPath}/club/smallClubListOk.cl?page=${startPage - 1}"
								class="prev">&lt;</a>
						</c:if>

						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<a
										href="${pageContext.request.contextPath}/club/smallClubListOk.cl?page=${i}">
										<c:out value="${i}" />
									</a>
								</c:when>
								<c:otherwise>
									<a href="#" class="active"> <c:out value="${i}" />
									</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:if test="${next}">
							<a
								href="${pageContext.request.contextPath}/club/smallClubListOk.cl?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</div>
				</div>
				<!-- <div class="div-page">
					<div class="div-pagenation">
						<a href="#">&lt;</a> <a href="#">1</a> <a href="#">2</a> <a
							href="#">3</a> <a href="#">4</a> <a href="#">5</a> <a href="#">&gt;</a>
					</div>
				</div> -->
				<div class="div-find" style="display:none;">
					<form action="" method="get">
						<div class="div-find-form">
							<div class="find-container">
								<select class="select-find">
									<option value="title">제목</option>
									<option value="name">모임장명</option>
								</select>
								<div class="input-group">
									<input class="input-find" type="text" />
									<button type="button" class="button-find">
										<i class="fa-solid fa-magnifying-glass"></i>
									</button>
								</div>
							</div>
						</div>
					</form>
				</div>
				<c:if test="${not empty sessionScope.memberNumber}">
					<a href="${pageContext.request.contextPath}/club/smallClubWrite.cl">
						<button type="button" class="button-write">글 쓰기</button>
					</a>
				</c:if>
			</div>
		</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
</html>