<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/course/course-review-list.css">

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
			<p class="pagetitle">수업 후기 게시판</p>
			<div class="div-review-list">
				<div class="div-review-title">
					<p class="font-main review-title-title">제목</p>
					<p class="font-main review-author">작성자</p>
					<p class="font-main review-date">작성일</p>
					<p class="font-main review-like">좋아요</p>
				</div>
				<!-- <ul class="ul-review-list">
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
        </ul> -->
				<ul class="ul-review-list">
					<c:choose>
						<c:when test="${not empty courseReviewList}">
							<c:forEach var="courseReview" items="${courseReviewList}">
								<li class="li-review-content" class="course-list">
									<div class="review-title">
										<a
											href="${pageContext.request.contextPath}/course/courseReviewDetailOk.co?courseReviewNumber=${courseReview.courseReviewNumber}">
											<c:out value="${courseReview.getCourseReviewTitle()}" />
										</a>
									</div>
									<div class="review-author">
										<c:out value="${courseReview.getMemberNickname()}" />
									</div>
									<div class="review-date">
												<c:out value="${courseReview.getCourseReviewCreatedDate()}" />
									</div>
									<div class="review-like">
										<c:out value="${courseReview.getCourseReviewLike()}" />
									</div>
								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<div>
								<div class="no-list">등록된 게시물이 없습니다.</div>
							</div>
						</c:otherwise>
					</c:choose>
				</ul>
				<div class="div-page">
					<div class="div-pagenation">
						<!-- <a href="#">&lt;</a>
            <a href="#">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">&gt;</a> -->
						<ul>
							<c:if test="${prev }">
								<li><a
									href="${pageContext.request.contextPath}/course/courseListOk.co?page=${startPage - 1}"
									class="prev">&lt;</a></li>
							</c:if>
							<c:set var="realStartPage"
								value="${startPage < 0 ? 0 : startPage }" />
							<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
								<c:choose>
									<c:when test="${!(i == page) }">
										<li><a
											href="${pageContext.request.contextPath}/course/courseReviewListOk.co?page=${i}">
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
									href="${pageContext.request.contextPath}/course/courseReviewListOk.co?page=${endPage + 1}"
									class="next">&ge;</a></li>
							</c:if>
						</ul>
					</div>
				</div>
				<div class="div-find">
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
							<c:if test="${not empty sessionScope.memberNumber}">
								<a href="${pageContext.request.contextPath}/course/courseReviewWrite.co" class="a-write">
									<button type="button" class="button-write">글 쓰기</button>
								</a>
							</c:if>
						</div>
					</form>
				</div>
			</div>
		</div>
	</main>
	<div id="footer"></div>
	<script>
		let memberNumber = "{sessionScope.memberNumber}";
	</script>
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>