<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/review/admin-course-review-detail.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/comment/comment.css">
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
<title>수업 후기 디테일</title>
</head>
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/review/admin-course-review-detail.js"></script>

<body>
	<!-- 헤더 -->
	<header>
		<!-- 목록 이동 -->
		<a
			href="${pageContext.request.contextPath}/admin/courseReviewListOk.ad">
			<!-- 사이트 로고 --> <img
			src="${pageContext.request.contextPath}/assets/img/team_logo.png"
			alt="사이트 로고">
		</a>
	</header>
	<!-- 메인 -->
	<main>
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<!-- 디테일 컨테이너 -->
			<div class="detail-container">
				<!-- 페이지 제목 -->
				<div id="detail-container-list">
					<p class="pagetitle">
						<c:out value="${review.courseReviewTitle}" />
					</p>
					<!-- 목록 이동 버튼 -->
					<div class="back-list">목록</div>
				</div>
				<!-- 개인 정보 영역 -->
				<div class="div-user-integration">
					<!-- 프로필 -->
					<div class="div-user-profile">
						<c:forEach var="profile" items="${review.fileMemberProfileList}">
							<img
								src="${pageContext.request.contextPath}/upload/${profile.getFileSystemName()}"
								class="img-user-profile">
						</c:forEach>
					</div>
					<!-- 세부 개인 정보 -->
					<div class="div-user-info">
						<!-- 닉네임 -->
						<p class="p-user-name">
							<c:out value="${review.memberNickname}" />
						</p>
						<!-- 작성날짜 -->
						<p class="p-update-date">
							<c:choose>
  								<c:when test="${review.courseReviewCreatedDate ne review.courseReviewUpdatedDate}">
    							${fn:substring(review.courseReviewUpdatedDate, 0, 10)}(수정됨)
  								</c:when>
  								<c:otherwise>
    							${fn:substring(review.courseReviewCreatedDate, 0, 10)}
  								</c:otherwise>
							</c:choose>
						</p>
					</div>
					<!-- 내용 영역 -->
					<div class="div-detail-area">
						<!-- 이미지 영역 -->
						<div class="div-img">
							<c:forEach var="reviewFile"
								items="${review.fileCourseReviewList}">
								<img
									src="${pageContext.request.contextPath}/upload/${reviewFile.getFileSystemName()}"
									class="img-detail">
							</c:forEach>
						</div>
						<!-- 내용 글 영역 -->
						<div class="div-admin-detail">
							<div class="div-admin-info-detail">
								<p class="p-admin-detail-comment">
									<c:out value="${review.courseReviewContent}" />
								</p>
							</div>
						</div>
						<!-- 버튼 영역 -->
						<div class="div-button-area">
							<!-- 삭제 버튼 -->
							<button class="button-cancel"
								data-review-number="${review.courseReviewNumber}"
								data-member-number="${review.memberNumber}">삭제</button>
						</div>
						<!-- 댓글 영역 -->
						<div class="div-comment-area">
							<div id="course" class="comment-list" data-listType="course"
								data-reviewnumber="${review.courseReviewNumber}">
								<jsp:include
									page="${pageContext.request.contextPath}/app/comment/comment.jsp" />
							</div>

						</div>
					</div>
				</div>
			</div>
	</main>
	<footer> </footer>
</body>
<script
	src="${pageContext.request.contextPath}/assets/js/comment/admincomment.js"></script>
</html>