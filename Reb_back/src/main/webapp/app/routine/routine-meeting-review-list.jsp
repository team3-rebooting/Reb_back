<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/routine/routine-meeting-review-list.css">

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

<body>
	<jsp:include page="/header.jsp" />
	<main>
		<div id="main-container">
			<p class="pagetitle">루틴 모임 후기 게시판</p>

			<div class="div-review-title">
				<p class="font-main review-title-title">제목</p>
				<p class="font-main review-author">작성자</p>
				<p class="font-main review-date">작성일</p>
				<p class="font-main review-like" style="display:none">좋아요</p>
			</div>
			<!-- 게시글 목록 -->
			<div class="board-body">
				<ul class="ul-review-list">
					<c:choose>
						<c:when test="${not empty routineReviewList}">
							<c:forEach var="routine" items="${routineReviewList}">
								<li class="li-review-content">
									<p class="review-title">
										<a
											href="${pageContext.request.contextPath}/routine/routineReviewReadOk.ro?routineReviewNumber=${routine.routineReviewNumber}">
											<c:out value="${routine.routineReviewTitle}" />
										</a>
									</p>
									<p class="review-author">
										<c:out value="${routine.memberNickname}" />
									</p>
									<p class="review-date">
										<c:out value="${routine.routineReviewCreatedDate}" />
									</p>
									<p class="review-like" style="display:none">
										<c:out value="${routine.likeCount}" />
									</p>
								</li>
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
								href="${pageContext.request.contextPath}/routine/routineReviewOk.ro?page=${startPage - 1}"
								class="prev">&lt;</a>
						</c:if>

						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<a
										href="${pageContext.request.contextPath}/routine/routineReviewOk.ro?page=${i}">
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
								href="${pageContext.request.contextPath}/routine/routineReviewOk.ro?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</div>
				</div>

				<div class="div-find">
					<form action="" method="get">
						<div class="div-find-form" style="display:none;">
							<div class="find-container">
								<select class="select-find">
									<option value="title">제목</option>
									<option value="name">작성자명</option>
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
					<form action="/routine/routineReviewWrite.ro" method="get">
						<c:if test="${not empty sessionScope.memberNumber}">
							<button class="button-write a-write">글 쓰기</button>
						</c:if>
					</form>
				</div>

			</div>
		</div>


	</main>
	<div id="footer"></div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</html>