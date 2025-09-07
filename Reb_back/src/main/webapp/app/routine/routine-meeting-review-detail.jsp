<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/routine/routine-meeting-review-detail.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/comment/comment.css">

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
			<div class="detail-container">
				<div>
					<!-- 뒤로가기 -->
					<p class="p-back">
						<i class="fa-solid fa-arrow-left"></i>
					</p>
				</div>
				<p class="pagetitle">
					<c:out value="${routineReview.getRoutineReviewTitle()}" />
				</p>
				<div class="div-user-integration">
					<div class="div-user-profile">
						<%-- img
						src="${pageContext.request.contextPath}/assets/img/profile.png"
						class="img-user-profile">--%>
						<c:set var="file" value="${routineReview.getFileMemberProfile()}"></c:set>
						<c:choose>
							<c:when test="${empty file}">
								<img class="img-user-profile"
									src="${pageContext.request.contextPath}/assets/img/profile.png"
									alt="프로필">
							</c:when>
							<c:otherwise>
								<img class="img-user-profile"
									src="${pageContext.request.contextPath}/upload/${file.getFileSystemName()}">
							</c:otherwise>
						</c:choose>
					</div>
					<div class="div-user-info">
						<p class="p-user-name">
							<c:out value="${routineReview.getMemberNickname()}" />
						</p>
						<p class="p-update-date">
							<c:out value="${routineReview.getRoutineReviewCreatedDate()}" />
							<c:if test="${routineReview.isUpdated()}">
								<span class="p-update-status">(수정됨)</span>
							</c:if>
						</p>
					</div>
					<div class="div-font-awesome-line">
						<span>루틴 모임 : ${routineReview.routineTitle}</span><br> <span
							class="span-likes">좋아요 수 : <c:out
								value="${routineReview.getLikeCount()}" />
						</span><i class="fa-regular fa-heart"></i>
					</div>
				</div>
				<div class="div-detail-area">
					<div class="div-img">
						<c:choose>
							<c:when test="${ not empty routineReview.getFileRoutineReview()}">
								<img
									src="${pageContext.request.contextPath}/upload/routine/${routineReview.getFileRoutineReview().getFileSystemName()}"
									class="img-detail">
							</c:when>
							<c:otherwise>
								<img
									src="${pageContext.request.contextPath}/assets/img/stone.jpg"
									class="img-detail">
							</c:otherwise>
						</c:choose>
					</div>
					<div class="div-expert-detail">
						<div class="div-expert-info-detail">
							<p class="p-expert-detail-comment"
								style="white-space: pre-line; word-break: break-all;">
								<c:out value="${routineReview.getRoutineReviewContent()}" />
							</p>
						</div>
					</div>
					<c:if
						test="${sessionScope.memberNumber == routineReview.getMemberNumber()}">
						<div class="div-button-area">
							<button class="button-application"
								data-reviewnumber="${routineReview.routineReviewNumber}">수정</button>
							<button class="button-cancel"
								data-reviewnumber="${routineReview.routineReviewNumber}">삭제</button>
						</div>
					</c:if>
					<div class="div-comment-area">
						<div id="routine" class="comment-list" data-listType="routine"
							data-reviewnumber="${routineReview.routineReviewNumber}">
							<jsp:include
								page="${pageContext.request.contextPath}/app/comment/comment.jsp" />
						</div>
						<c:if test="${not empty sessionScope.memberNumber}">
							<div class="div-comment-write">
								<form action="" method="get" class="form-comment-write">
									<input type="hidden" name="routineReviewNumber"
										value="${routineReview.routineReviewNumber}"> <input
										type="hidden" name="memberNumber"
										value="${sessionScope.memberNumber}"> <input
										type="text" placeholder="댓글을 입력해주세요" name="comment"
										class="input-comment">
									<button class="button-write" type="button">등록</button>
								</form>
							</div>
						</c:if>
					</div>

				</div>
			</div>
		</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
<script
	src="${pageContext.request.contextPath}/assets/js/comment/comment.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/routine/routine-meeting-review-detail.js"></script>

</html>