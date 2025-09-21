<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/club/admin-small-club-detail.css">

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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
<title>틈새빛</title>
</head>
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/club/admin-small-club-detail.js"></script>

<body>
	<header>
		<!-- 소모임 목록 이동 -->
		<a
			href="${pageContext.request.contextPath}/admin/smallclubListOk.ad?">
			<!-- 사이드 로고 --> <img
			src="${pageContext.request.contextPath}/assets/img/team_logo.png"
			alt="사이트 로고 사진">
		</a>
	</header>
	<!-- 메인 영역 -->
	<main>
		<!-- 메인 컨테이너 영역 -->
		<div id="main-container">
			<!-- 상세 컨테이너 영역 -->
			<div class="detail-container">
				<input type="hidden" id="small-club-number"
					value="${smallClub.smallClubNumber}">
				<div>
					<!-- 뒤로가기 -->
					<p class="p-back">
						<i class="fa-solid fa-arrow-left"></i>
					</p>
				</div>
				<!-- 제목 -->
				<p class="pagetitle">
					<!-- 웹 보안 수업 후기 -->
					<c:out value="${smallClub.getSmallClubTitle()}" />
				</p>
				<!-- 유저 정보 영역 -->
				<div class="div-user-integration">
					<!-- 유저 프로필 영역 -->
					<div class="div-user-profile">
						<c:set var="profiles"
							value="${smallClub.getFileWriterProFileList()}"></c:set>
						<c:choose>
							<c:when test="${not empty profiles}">
								<img
									src="${pageContext.request.contextPath}/upload/${profiles.getFileSystemName()}"
									class="img-user-profile" />
							</c:when>
							<c:otherwise>
								<img
									src="${pageContext.request.contextPath}/assets/img/profile.png"
									class="img-user-profile">
							</c:otherwise>
						</c:choose>
					</div>
					<!-- 유저 개인 정보(닉네임, 작성일) 영역 -->
					<div class="div-user-info">
						<p class="p-user-name">
							<c:out value="${smallClub.getMemberNickname()}" />
						</p>
						<p class="p-update-date">
							<c:choose>
								<c:when test="${not empty smallClub.smallClubUpdatedDate}">
									<c:out value="${smallClub.getSmallClubUpdatedDate() }" />(수정됨)
								</c:when>
								<c:otherwise>
									<c:out value="${smallClub.getSmallClubCreatedDate()}" />
								</c:otherwise>
							</c:choose>
						</p>
					</div>
					<!-- 좋아요 fontawesome -->
					<%-- <div class="div-font-awesome-line">
						<span>참여 루틴 모임 : ${courseReview.courseTitle}</span> <br> <input
							type="hidden" id="like" value="${like}"> <span
							class="span-likes">좋아요 수 : <span id="span-like-count"><c:out
									value="${courseReview.getLikeCount()}" /></span>
						</span>
						<c:if test="${not empty sessionScope.memberNumber}">
							<c:choose>
								<c:when test="${like}">
									<i id="i-heart" class="fa-solid fa-heart"></i>
								</c:when>
								<c:otherwise>
									<i id="i-heart" class="fa-regular fa-heart"></i>
								</c:otherwise>
							</c:choose>
						</c:if>
					</div> --%>
				</div>
				<!--상세 글 영역 -->
				<div class="div-detail-area">
					<!-- 대표 사진 영역 -->
					<c:forEach var="file" items="${smallClub.getFileSmallClubList()}">
						<div class="div-img">
							<img
								src="${pageContext.request.contextPath}/upload/${file.getFileSystemName()}"
								class="img-detail" />
						</div>
					</c:forEach>
					<!-- 글 영역 -->
					<div class="div-expert-detail">
						<!-- 글 영역  -->
						<div class="div-expert-info-detail">
							<p class="p-expert-detail-comment"
								style="white-space: pre-line; word-break: break-all;">
								<c:out value="${smallClub.getSmallClubContent()}" />
							</p>
							<!-- 강사님이 너무 친절하기구 수업도 열정적으로 알려주셔요! 과제도 그만큼 열정적으로 내주셔요!!!
                이분 수업 강력하게 추천합니다!
                저는 다음에 또 들을 기회가 생긴다면 또 듣고싶어요
                짧은 글 읽어주셔서 감사합니다 -->
						</div>
					</div>
					<!-- 버튼 영역 -->
					<div class="div-button-area">
						<button class="button-cancel" type="button"
							data-small-club-number="${smallClub.smallClubNumber}"
							data-member-number="${smallClub.memberNumber}">삭제</button>
					</div>
					<!-- 댓글 영역 -->
					<div class="div-comment-area">
						<!-- 댓글 영역 ul -->
						<div id="smallClub" class="comment-list" data-listType="smallClub"
							data-reviewnumber="${smallClub.smallClubNumber}">
							<jsp:include
								page="${pageContext.request.contextPath}/app/comment/comment.jsp" />
						</div>

					</div>
				</div>
			</div>
		</div>
	</main>
</body>
<script
	src="${pageContext.request.contextPath}/assets/js/comment/admincomment.js"></script>

</html>