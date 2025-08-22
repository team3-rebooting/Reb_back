<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>루틴 모임 목록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/routine/admin-routine-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/routine/admin-routine-list.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
</head>

<body class="font-menu">
	<header>
		<p>
			<strong>루틴 모임 목록</strong>
		</p>
		<button type="button">logout</button>
	</header>

	<main>
		<jsp:include page="/adminSidebar.jsp" />

		<section id="main-routine">
			<div id="main-routine-div">
				<div id="main-routine-list-title">
					<p class="main-routine-number">모임 번호</p>
					<p class="main-routine-name">모임장</p>
					<p class="main-routine-title">제목</p>
					<p class="main-routine-count">모집 인원</p>
					<p class="main-routine-type">진행 상태</p>
					<p class="main-routine-start">모임 시작</p>
					<p class="main-routine-end">모임 종료</p>
				</div>
				<ul id="main-routine-list">
					<c:choose>
						<c:when test="${not empty routineList}">
							<c:forEach var="routine" items="${routineList}">
								<li class="main-must-read"><a
									href="${pageContext.request.contextPath}/admin/routineReadOk.ad?routineNumber=${routine.routineNumber}"
									 class="main-routine-link">
										<p class="main-routine-number">
											<c:out value="${routine.routineNumber}" />
										</p>
										<p class="main-routine-name">
											<c:out value="${routine.routineLeaderName}" />
										</p>
										<p class="main-routine-title">
											<c:out value="${routine.routineTitle}" />
										</p>
										<p class="main-routine-count">
											<c:out value="${routine.routineCount}"/> / <c:out value="${routine.routineRecruitCount}" />
										</p>
										<p class="main-routine-type">
											<c:out value="${routine.routineStatusInfo}" />
										</p>
										<p class="main-routine-start">
											<c:out value="${routine.routineStartDate}" />
										</p>
										<p class="main-routine-end">
											<c:out value="${routine.routineEndDate}" />
										</p>
								</a></li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<div>
								<div colspan="5" align="center">등록된 루틴모임이 없습니다.</div>
							</div>
						</c:otherwise>
					</c:choose>
				</ul>
				<div id="main-page-number">
					<ul>
						<c:if test="${prev}">
							<li><a
								href="${pageContext.request.contextPath}/admin/routineListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/routineListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/routineListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
				</div>
				<div id="main-search">
					<div id="main-search-basic">
						<select class="select-find">
							<option value="title">제목</option>
							<option value="name">전문가명</option>
						</select>
					</div>
					<form action="" method="get">
						<input type="text" id="main-search-input">
						<button>
							<img src="./../../../assets/img/search.jpg" alt="돋보기">
						</button>
						<button type="button" id="main-create-routine">등록</button>
					</form>
				</div>
			</div>
		</section>
	</main>
</body>

</html>