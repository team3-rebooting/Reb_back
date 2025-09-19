<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>개설 신청</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/course/admin-course-request-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/course/admin-course-request-list.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
</head>

<body class="font-menu">
	<!-- 헤더 -->
	<jsp:include page="/admin_header.jsp" />
	<!-- 메인 -->
	<main>
		<!-- 사이드바 리스트 영역 -->
		<jsp:include page="/adminSidebar.jsp" />
		<!-- 메인 영역 -->
		<section id="main-course-request">
			<div id="main-course-request-div">
				<!-- 수업 요청 리스트 제목 -->
				<div id="main-course-request-list-title">
					<!-- 회원번호 영역 -->
					<p class="main-course-request-number">회원번호</p>
					<!-- 아이디 영역 -->
					<p class="main-course-request-id">아이디</p>
					<!-- 전문가 영역 -->
					<p class="main-course-request-nickname">전문가</p>
					<!-- 제목 영역 -->
					<p class="main-course-request-title">제목</p>
					<!-- 요청 유형 영역 -->
					<p class="main-course-request-type">유형</p>
					<!-- 시작 기간 영역 -->
					<p class="main-course-request-start">시작 기간</p>
					<!-- 종료 기간 영역 -->
					<p class="main-course-request-end">종료 기간</p>
				</div>
				<!-- 요청 목록 리스트 -->
				<ul id="main-course-request-list">
					<!-- 요청 리스트 목록 -->
					<c:choose>
						<c:when test="${not empty courseRequestList}">
							<c:forEach var="courseRequestList" items="${courseRequestList}">
								<li><a href="${pageContext.request.contextPath}/admin/courseRequestReadOk.ad?courseNumber=${courseRequestList.courseNumber}"
									class="main-course-request-link">
										<p class="main-course-request-number">
											<c:out value="${courseRequestList.memberNumber}" />
										</p>
										<p class="main-course-request-id">
											<c:out value="${courseRequestList.memberId}" />
										</p>
										<p class="main-course-request-nickname">
											<c:out value="${courseRequestList.memberName}" />
										</p>
										<p class="main-course-request-title">
											<c:out value="${courseRequestList.courseTitle}" />
										</p>
										<p class="main-course-request-type">
											<c:out value="${courseRequestList.courseRequestType}" />
										</p>
										<p class="main-course-request-start">
											<c:out value="${courseRequestList.courseStartDate}" />
										</p>
										<p class="main-course-request-end">
											<c:out value="${courseRequestList.courseEndDate}" />
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
								href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=${endPage + 1}"
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