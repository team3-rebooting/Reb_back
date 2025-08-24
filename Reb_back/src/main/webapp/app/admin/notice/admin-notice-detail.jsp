<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/notice/admin-notice-detail.css" />

<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
	rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet" />
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/notice/admin-notice-detail.js"></script>
<title>공지사항 상세페이지</title>
</head>

<body>
	<header>
		<a href="${pageContext.request.contextPath}/admin/noticeListOk.ad">
			<img
			src="${pageContext.request.contextPath}/assets/img/team_logo.png"
			alt="">
		</a>
	</header>
	<main>
		<div id="main-container">

			<!-- 게시글상세 -->
			<div class="notice-detail-containter">
				<div id="detail-container-list">
					<!-- <div class="notice-detail-title-text-containter"> -->
					<div class="pagetitle font-main">
						<c:out value="${notice.noticeTitle}" />
						<!-- 목록 이동 버튼 -->
					</div>
					<!-- </div> -->
					<div class="back-list">목록</div>
				</div>
				<div class="notice-detail-admin-image-containter">
					<div class="logo">
						<img
							src="${pageContext.request.contextPath}/assets/img/team_logo.png"
							class="logo-image" alt="로고" />
					</div>
					<div class="notice-detail-admin-containter">
						<div class="board-box-writer font-main">${notice.memberNickname}</div>
						<div class="board-box-day font-main">
							<c:if
								test="${notice.noticeCreatedDate ne notice.noticeUpdatedDate}">
								<c:out value="${notice.noticeUpdatedDate}" />(수정됨)
							</c:if>
							<c:if
								test="${notice.noticeCreatedDate eq notice.noticeUpdatedDate}">
								<c:out value="${courseReview.noticeCreatedDate}" />
							</c:if>
						</div>
					</div>
				</div>

				<div class="notice-detail-text-content-containter">
					<div class="notice-detail-text font-main">
						<c:out value="${notice.noticeContent}" />
					</div>
				</div>
				<section id="attachment-section">
					<p class="attachment-title font-main">첨부파일</p>
					<ul id="attachment-list" class="font-main">
						<!-- 파일 1 -->
						<li class="attachment-item">
							<!-- 파일명 링크(밑줄) --> <a class="attachment-name"
							href="./../../../assets/img/karina.jpg" download="첨부파일">
								UI_수정사항.pdf </a>
						</li>
					</ul>
				</section>
				<div id="main-btn-div">
					<!-- 작성 버튼 -->
					<button class="main-btn">수정</button>
					<!-- 취소 버튼 -->
					<button class="main-btn">삭제</button>
				</div>
			</div>

		</div>
	</main>
	<footer> </footer>
</body>

</html>