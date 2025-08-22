<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공지 사항 목록</title>
<link rel="stylesheet"
	href="./../../../assets/css/admin/notice/admin-notice-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/notice/admin-notice-list.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
</head>

<body class="font-menu">
	<!-- 헤더 -->
	<header>
		<!-- 상단 목록 -->
		<p>
			<strong>공지 사항 목록</strong>
		</p>
		<!-- 로그아웃 버튼 -->
		<button>logout</button>
	</header>
	<!-- 메인 -->
	<main>
		<!-- 사이드바 리스트 영역 -->
		<section id="main-admin-list-menu">
			<!-- 사이드바 리스트 -->
			<ul id="main-admin-list">
				<li><a href="./../notice/admin-notice-list.html"> <strong>공지
							사항 목록</strong>
				</a></li>
				<li><a href="./../course/admin-course-request-list.html">
						수업 목록 </a></li>
				<li><a href="./../routine/admin-routine-list.html"> 루틴 모임
						목록 </a></li>
				<li><a href="./../member/admin-member-list.html"> 회원 목록 </a></li>
				<li><a href="./../member/admin-sponsor-list.html"> 후원자 목록 </a>
				</li>
				<li><a href="./../member/admin-expert-list.html"> 전문가 승인 목록
				</a></li>
				<li><a href="./../review/admin-routine-review-list.html">
						활동 후기 </a></li>
				<li><a href="./../banner/admin-banner-list.html"> 배너 등록 </a></li>
			</ul>
		</section>
		<!-- 메인 영역 -->
		<section id="main-notice">
			<div id="main-notice-div">
				<!-- 공지사항 리스트 제목 -->
				<div id="main-notice-list-title">
					<!-- 제목 영역 -->
					<p class="main-notice-title">제목</p>
					<!-- 작성자 영역 -->
					<p class="main-notice-author">작성자</p>
					<!-- 작성 날짜 영역 -->
					<p class="main-notice-create-date">작성날짜</p>
				</div>
				<!-- 공지사항 리스트 -->
				<ul id="main-notice-list">
					<!-- 공지사항 리스트 목록 -->
					<c:choose>
						<c:when test="${not empty noticeList}">
							<c:forEach var="notice" items="${noticeList}">
								<li class="main-notice-list-li"><a
									href="${pageContext.request.contextPath}/admin/noticeReadOk.ad?noticeNumber=${notice.noticeNumber}"
									class="main-must-read-link">
										<p class="main-notice-title">
											<c:out value="${notice.noticeTitle}" />
										</p>
										<p class="main-notice-author">
											<c:out value="${notice.adminNickname}" />
										</p>
										<p class="main-notice-create-date">
											<c:out value="${notice.noticeCreatedDate}" />
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
				<!-- 등록 버튼 -->
				<button type="button" id="main-create-notice">등록</button>
				<!-- 페이지네이션 -->
				<div id="main-page-number">
					<ul>
						<c:if test="${prev}">
							<li><a
								href="${pageContext.request.contextPath}/admin/noticeListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/noticeListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/noticeListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
					<!-- <p>&lt</p>
					<a href="">1</a> <a href="">2</a> <a href="">3</a> <a href="">4</a>
					<a href="">5</a>
					<p>&gt</p> -->
				</div>
				<!-- 검색 영역 -->
				<div id="main-search">
					<!-- 검색 종류 -->
					<div id="main-search-basic">
						<select class="select-find">
							<option value="title">제목</option>
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