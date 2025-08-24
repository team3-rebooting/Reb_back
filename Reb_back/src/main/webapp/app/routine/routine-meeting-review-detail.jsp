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
	src="${pageContext.request.contextPath}/assets/js/routine-meeting/routine-meeting-review-detail.js"></script>

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
						<img src="./../../assets/img/stone.jpg" class="img-user-profile">
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
						<span class="span-likes">좋아요 수 : <c:out
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
							<p class="p-expert-detail-comment">
								<c:out value="${routineReview.getRoutineReviewContent()}" />
							</p>
						</div>
					</div>
					<c:if
						test="${sessionScope.memberNumber == routineReview.getMemberNumber()}">
						<div class="div-button-area">
							<a href="./routine-meeting-review-edit.html"><button
									class="button-application">수정</button></a>
							<button class="button-cancel">삭제</button>
						</div>
					</c:if>
					<div class="div-comment-area">
						<ul class="ul-comment-list">
							<li class="li-comment">
								<div class="div-user-profile">
									<img src="./../../assets/img/karina.jpg"
										class="img-user-profile">
								</div>
								<div class="div-user-info">
									<div class="div-user-name-area">
										<p class="p-user-name">곰융</p>
										<span class="span-comment-edit">수정</span>
									</div>
									<div class="div-user-text-area">
										<p class="p-comment-text">저도 한번 배워보고싶네요asddddddddd</p>
										<span class="span-comment-delete">삭제</span>
									</div>
									<p class="p-update-date">
										2025.07.02<span class="p-update-status">(수정됨)</span>
									</p>
								</div>
							</li>
							<li class="li-comment">
								<div class="div-user-profile">
									<img src="./../../assets/img/karina.jpg"
										class="img-user-profile">
								</div>
								<div class="div-user-info">
									<div class="div-user-name-area">
										<p class="p-user-name">곰융</p>
										<span class="span-comment-edit">수정</span>
									</div>
									<div class="div-user-text-area">
										<p class="p-comment-text">저도 한번 배워보고싶네요asddddddddd</p>
										<span class="span-comment-delete">삭제</span>
									</div>
									<p class="p-update-date">
										2025.07.02<span class="p-update-status">(수정됨)</span>
									</p>
								</div>
							</li>
						</ul>
						<div class="div-comment-write">
							<form action="" method="get" class="form-comment-write">
								<input type="text" placeholder="댓글을 입력해주세요" name="comment"
									class="input-comment">
								<button class="button-write" type="button">등록</button>
							</form>
						</div>
						<div class="div-page">
							<!-- a 태그 영역 -->
							<div class="div-pagenation">
								<a href="#">&lt;</a> <a href="#">1</a> <a href="#">2</a> <a
									href="#">3</a> <a href="#">4</a> <a href="#">5</a> <a href="#">&gt;</a>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</main>
	<div id="footer"></div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>