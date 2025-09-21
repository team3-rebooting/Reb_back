<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/footer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/notice/notice-detail.css" />

<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
	rel="stylesheet" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet" />
<title>공지사항 상세페이지</title>
</head>

<body>
	<jsp:include page="/header.jsp" />
	<main>
		<div id="main-container">

			<!-- 게시글상세 -->
			<div class="notice-detail-containter">
				<div class="notice-detail-title-text-containter">
					<div class="notice-detail-title-text pagetitle font-main">
						<c:out value="${notice.noticeTitle}" />
					</div>
					<!-- 뒤로가기 버튼 -->
					<p class="p-back">
						<i class="fa-solid fa-arrow-left"></i>
					</p>
				</div>
				<div class="notice-detail-admin-image-containter">
					<div class="logo">
							<img
								src="${pageContext.request.contextPath}/assets/img/admin.png"
								class="logo-image" alt="관리자 이미지" />
					</div>
					<div class="notice-detail-admin-containter">
						<div class="board-box-writer font-main">${notice.adminNickname}</div>
						<div class="board-box-day font-main">
						<c:choose>
  								<c:when test="${notice.noticeCreatedDate ne notice.noticeUpdatedDate}">
    								${fn:substring(notice.noticeUpdatedDate, 0, 10)}(수정됨)
  								</c:when>
  							<c:otherwise>
    								${fn:substring(notice.noticeCreatedDate, 0, 10)}
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
					<p class="attachment-title font-main">첨부파일</p>
					<ul id="attachment-list" class="font-main">
						<!-- 파일 1 -->
						<li class="attachment-item">
							<c:forEach var="noticeFile" items="${notice.fileNoticeList}">
							 <!-- 파일명 링크(밑줄) --> <a class="attachment-name"
							href="${pageContext.request.contextPath}/file/download.file?fileSystemName=${noticeFile.getFileSystemName()}&fileOriginalName=${noticeFile.getFileOriginalName()}">
								${noticeFile.getFileSystemName()}</a>  
								
							</c:forEach>
						</li>
					</ul>
				</section>

			</div>
		</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
<script src="${pageContext.request.contextPath}/assets/js/header-login.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
<script defer src="${pageContext.request.contextPath}/assets/js/notice/notice-detail.js"></script>

</html>