<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>수업 후기</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/review/admin-course-review-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/review/admin-course-review-list.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
</head>

<body class="font-menu">
	<!-- 헤더 -->
	<header>
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>활동 후기</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button>logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a href="${pageContext.request.contextPath}/admin/routineReviewListOk.ad?page=1">
						루틴 모임 후기 </a></li>
				<li><a href="${pageContext.request.contextPath}/admin/courseReviewListOk.ad?page=1"> 
					<strong>수업 후기</strong>
				</a></li>
			</ul>
		</section>
	</header>
	<!-- 메인 -->
	<main>
		<!-- 사이드바 리스트 영역 -->
		<jsp:include page="/adminSidebar.jsp" />
		<!-- 메인 영역 -->
		<section id="main-course-review">
			<div id="main-course-review-div">
				<!-- 수업 후기 리스트 제목 -->
				<div id="main-course-review-title">
					<!-- 제목 영역 -->
					<p class="main-course-review-name">후기 제목</p>
					<!-- 좋아요 영역 -->
					<p class="main-course-review-heart">좋아요수</p>
					<!-- 작성자 영역 -->
					<p class="main-course-review-nickname">작성자</p>
					<!-- 작성 날짜 영역 -->
					<p class="main-course-review-date">작성 날짜</p>
				</div>
				<!-- 수업 후기 리스트 -->
				<ul id="main-course-review-list">
					<!-- 수업 후기 리스트 목록 -->
					<c:choose>
						<c:when test="${not empty courseReviewList}">
							<c:forEach var="courseReview" items="${courseReviewList}">
								<li><a
									href="${pageContext.request.contextPath}/admin/courseReviewReadOk.ad?courseReviewNumber=${courseReview.courseReviewNumber}">
										<p class="main-course-review-name">
											<c:out value="${courseReview.courseReviewTitle}" />
										</p>
										<p class="main-course-review-heart">6</p>
										<p class="main-course-review-nickname">
											<c:out value="${courseReview.memberNickname}" />
										</p>
										<p class="main-course-review-date">
											<c:if
												test="${courseReview.courseReviewCreatedDate ne courseReview.courseReviewUpdatedDate}">
												<c:out value="${courseReview.courseReviewUpdatedDate}" />
											</c:if>
											<c:if
												test="${courseReview.courseReviewCreatedDate eq courseReview.courseReviewUpdatedDate}">
												<c:out value="${courseReview.courseReviewCreatedDate}" />
											</c:if>
										</p>
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
				<!-- 페이지네이션 -->
				<div id="main-page-number">
					<ul>
						<c:if test="${prev}">
							<li><a
								href="${pageContext.request.contextPath}/admin/courseReviewListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/courseReviewListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/courseReviewListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
				</div>
				<!-- 검색 영역 -->
				<div id="main-search" style="display:none;" >
					<!-- 검색 종류 -->
					<div id="main-search-basic">
						<select class="select-find">
							<option value="title">제목</option>
							<option value="name">작성자</option>
						</select>
					</div>
					<!-- 검색 입력 창 -->
					<form action="" method="">
						<input type="text" id="main-search-input">
						<!-- 돋보기 이미지 -->
						<button>
							<img src="./../../../assets/img/search.jpg" alt="돋보기">
						</button>
					</form>
				</div>
			</div>
		</section>
	</main>
</body>

</html>