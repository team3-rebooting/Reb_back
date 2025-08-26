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
					<div class="back-list"
					data-noticeNumber="${notice.getNoticeNumber()}"
					data-adminNumber="${sessionScope.adminNumber}"
						>목록</div>
				</div>
				<div class="notice-detail-admin-image-containter">
					<div class="logo">
						<c:forEach var="adminFile" items="${board.fileAdminList}">
							<img
								src="${pageContext.request.contextPath}/upload/${adminFile.getFileSystemName()}"
								class="logo-image" alt="공지사항 파일" />
						</c:forEach>
					</div>
					<div class="notice-detail-admin-containter">
						<div class="board-box-writer font-main">${notice.adminNickname}</div>
						<div class="board-box-day font-main">
							<c:choose>
							<c:when
								test="${notice.noticeCreatedDate ne notice.noticeUpdatedDate}">
								<c:out value="${notice.noticeUpdatedDate}" />(수정됨)
							</c:when>
							<c:otherwise>
								<c:out value="${notice.noticeCreatedDate}" />
							</c:otherwise>
							
							</c:choose>
						</div>
					</div>
				</div>

				<div class="notice-detail-text-content-containter">
					<div class="notice-detail-text font-main">
						<c:out value="${notice.noticeContent}" />
					</div>
				</div>
				<section id="attachment-section">
					<p class="attachment-title font-main"></p>
					<ul id="attachment-list" class="font-main">
						<!-- 파일 1 -->
						<li class="attachment-item">
						<c:forEach var="noticeFile" items="${notice.fileNoticeList}">
							 <!-- 파일명 링크(밑줄) --> <a class="attachment-name"
							href="${pageContext.request.contextPath}/file/download.file?fileSystemName=${noticeFile.getFileSystemName()}&fileOriginalName=${noticeFile.getFileOriginalName()}">
								${noticeFile.getFileSystemName()}</a>  
								<%--  <img
									src="${pageContext.request.contextPath}/upload/${noticeFile.getFileSystemName()}"
									class="logo-image" alt="첨부파일" />  --%>
							</c:forEach>
						</li>
					</ul>
				</section>
				<div id="main-btn-div">
					<!-- 작성 버튼 -->
					<c:if
					test="${sessionScope.adminNumber == notice.getAdminNumber() }">
					<button class="main-btn"
					data-notice-number="${notice.noticeNumber}"
					data-admin-number="${sessionScope.adminNumber}">수정</button>
					<!-- 취소 버튼 -->
					<button class="main-btn"
					data-notice-number="${notice.noticeNumber}"
					data-admin-number="${sessionScope.adminNumber}">삭제</button>					
					</c:if>
				</div>
			</div>

		</div>
	</main>
	<footer> </footer>
</body>

</html>