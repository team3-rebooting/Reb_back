<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>수업 목록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/course/admin-course-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/course/admin-course-list.js"></script>
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
				<strong>수업 목록</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button>logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=1">
						요청 목록 </a></li>
				<li><a href="${pageContext.request.contextPath}/admin/courseListOk.ad?page=1"> 
				<strong>수업 목록 리스트</strong>
				</a></li>
			</ul>
		</section>
	</header>
	<!-- 메인 -->
	<main>
		<!-- 사이드바 리스트 영역 -->
		<jsp:include page="/adminSidebar.jsp" />
		<!-- 메인 영역 -->
		<section id="main-course">
			<div id="main-course-div">
				<!-- 수업 목록 리스트 제목 -->
				<div id="main-course-list-title">
					<!-- 회원번호 영역 -->
					<p class="main-course-number">회원번호</p>
					<!-- 아이디 영역 -->
					<p class="main-course-id">아이디</p>
					<!-- 닉네임 영역 -->
					<p class="main-course-nickname">전문가</p>
					<!-- 제목 영역 -->
					<p class="main-course-title">제목</p>
					<!-- 개강 여부 영역 -->
					<p class="main-course-type">개강 여부</p>
					<!-- 시작 기간 영역 -->
					<p class="main-course-start">시작 기간</p>
					<!-- 종료 기간 영역 -->
					<p class="main-course-end">종료 기간</p>
				</div>
				<!-- 수업 목록 리스트 -->
				<ul id="main-course-list">
					<!-- 수업 리스트 목록 -->
					<c:choose>
						<c:when test="${not empty courseList}">
							<c:forEach var="courseList" items="${courseList}">
								<li class="main-must-read"><a
									href="${pageContext.request.contextPath}/admin/courseReadOk.ad?courseNumber=${courseList.courseNumber}"
									class="main-course-link">
										<p class="main-course-number">
											<c:out value="${courseList.memberNumber}" />
										</p>
										<p class="main-course-id">
											<c:out value="${courseList.memberId}" />
										</p>
										<p class="main-course-nickname">
											<c:out value="${courseList.memberName}" />
										</p>
										<p class="main-course-title">
											<c:out value="${courseList.courseTitle}" />
										</p>
										<p class="main-course-type">
											<c:out value="${courseList.courseStatusInfo}" />
										</p>
										<p class="main-course-start">
											<c:out value="${courseList.courseStartDate}" />
										</p>
										<p class="main-course-end">
											<c:out value="${courseList.courseEndDate}" />
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
								href="${pageContext.request.contextPath}/admin/courseListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/courseListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/courseListOk.ad?page=${endPage + 1}"
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
							<option value="name">회원 번호</option>
							<option value="name">아이디</option>
							<option value="name">닉네임</option>
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