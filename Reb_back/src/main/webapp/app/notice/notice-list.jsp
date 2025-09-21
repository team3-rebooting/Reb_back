<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/notice/notice-list.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/footer.css">

<script defer src="${pageContext.request.contextPath}/assets/js/notice/notice-list.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
	rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
<title>공지사항 리스트</title>
</head>

<body>
	<jsp:include page="/header.jsp" />
	<main>
		<div id="main-container">
			<!-- 공지사항 -->
			<div class="notice-container">

				<p class="pagetitle">공지사항</p>

				<div class="notice-board-box-container">
					<p class="notice-board-box-title font-main">제목</p>
					<p class="notice-board-box-writer font-main">작성자</p>
					<p class="notice-board-box-day font-main">작성날짜</p>
				</div>
				<ul id="notice-list">
					<!-- 공지1 -->
					<c:choose>
						<c:when test="${not empty noticeList}">
							<c:forEach var="notice" items="${noticeList}">
								<li class="notice-item"><a
									href="${pageContext.request.contextPath}/tidings/noticeReadOk.ti?noticeNumber=${notice.noticeNumber}">
										<div class="class-notice-list-container">
											<p class="notice-list-title font-main">
												<c:out value="${notice.noticeTitle}" />
											</p>
											<p class="notice-list-writer font-main">
												<c:out value="${notice.adminNickname}" />
											</p>
											<p class="notice-list-day font-main">
												<c:choose>
  													<c:when test="${notice.noticeCreatedDate ne notice.noticeUpdatedDate}">
    												${fn:substring(notice.noticeUpdatedDate, 0, 10)}(수정됨)
  													</c:when>
  												<c:otherwise>
    												${fn:substring(notice.noticeCreatedDate, 0, 10)}
  												</c:otherwise>
												</c:choose>
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
				<!-- 공지 끝 -->

				<div class="div-page">
					<div class="div-pagenation">
						<ul>
						<c:if test="${prev}">
							<li><a
								href="${pageContext.request.contextPath}/tidings/noticeListOk.ti?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/tidings/noticeListOk.ti?page=${i}">
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
								href="${pageContext.request.contextPath}/tidings/noticeListOk.ti?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
					</div>
				</div>
				<div class="div-find" style="display:none;">
					<form action="" method="get">
						<div class="div-find-form">
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
				</div>
			</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
</html>