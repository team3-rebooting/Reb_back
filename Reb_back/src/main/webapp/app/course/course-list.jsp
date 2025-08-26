<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/course/course-list.css">

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
	src="${pageContext.request.contextPath}/assets/js/course/course-list.js"></script>

<body>
	<!-- 헤더 영역 -->
	<jsp:include page="/header.jsp" />
	<!-- 메인 영역 -->
	<main>
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<!-- 수업 목록 컨테이너 -->
			<div class="course-list-container">
				<!-- 제목 태그 -->
				<p class="pagetitle">수업 게시판</p>
				<!-- 수업 ul 영역 -->
				<ul class="ul-course-list">
					<c:choose>
						<c:when test="${not empty courseList}">
							<c:forEach var="course" items="${courseList}">
								<li class="li-course-list-box"><a
									href="${pageContext.request.contextPath}/course/courseDetailOk.co?courseNumber=${course.courseNumber}">
										<c:choose>
											<c:when test="${empty course.getFileCourse() }">
												<img
													src="${pageContext.request.contextPath}/assets/img/team_logo.png"
													class="img-box">
											</c:when>
											<c:otherwise>
												<img
													src="${pageContext.request.contextPath}/upload/course/${course.getFileCourse().getFileSystemName()}"
													class="img-box">
											</c:otherwise>
										</c:choose>

										<p class="p-list-comment">
											<c:out value="${course.courseTitle}" />
										</p>
										<div class="div-box-status">
											<button type="button" class="button-recruit-ing">
												<c:out value="${course.courseStatusInfo}" />
											</button>
											<p class="p-name-date">
												<c:out value="${course.expertName}" />
												<c:out value="${course.coursePostDate}" />
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
				<div class="div-page">
					<div class="div-pagenation">
						<c:if test="${prev}">
							<a
								href="${pageContext.request.contextPath}/course/courseListOk.co?page=${startPage - 1}"
								class="prev">&lt;</a>
						</c:if>

						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<a
										href="${pageContext.request.contextPath}/course/courseListOk.co?page=${i}">
										<c:out value="${i}" />
									</a>
								</c:when>
								<c:otherwise>
									<a href="#" class="active"> <c:out value="${i}" />
									</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:if test="${next}">
							<a
								href="${pageContext.request.contextPath}/course/courseListOk.co?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</div>
				</div>
				<div class="div-find">
					<form action="" method="get">
						<div class="div-find-form">
							<div class="find-container">
								<select class="select-find">
									<option value="title">제목</option>
									<option value="name">전문가 명</option>
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
					<form action="${pageContext.request.contextPath}/course/expertCourseCreateRequest.co" method="post">
						<c:if test="${not empty sessionScope.memberNumber}">
								<button class="button-write a-write" type="submit">글 쓰기</button>
						</c:if>
					</form>
				</div>
			</div>
		</div>
	</main>
	<!-- 푸터 영역 -->
	<div id="footer"></div>
</body>
<script src="./../../assets/js/footer.js"></script>

</html>