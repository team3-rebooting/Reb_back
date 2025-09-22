<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>후원자 목록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/member/admin-sponsor-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/member/admin-sponsor-list.js"></script>
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
		<section id="main-sponsor">
			<div id="main-sponsor-div">
				<!-- 후원 금액 영역 -->
				<div id="main-support-money">
					<div>
						<p>총 후원 금액 :</p>
						<p>
							<c:set var="total" value="0" />
							<c:choose>
								<c:when test="${not empty sponsorList}">
									<c:forEach var="sponsor" items="${sponsorList}">
										<c:set var="total" value="${total + sponsor.sponsorAmount}" />
									</c:forEach>
									<c:out value="${total}"></c:out>원
								</c:when>
								<c:otherwise>
								후원 금액이 없습니다
								</c:otherwise>
							</c:choose>
						</p>
					</div>
					<%-- <div>
						<p>최근 1년간 후원 금액 :</p>
						<p>${total}원
							<!-- 보류 -->
						</p>
					</div>
					<div>
						<p>최근 1달간 후원 금액 :</p>
						<p>${total}원</p>
					</div> --%>
				</div>
				<!-- 후원자 리스트 제목 -->
				<div id="main-sponsor-list-title">
					<!-- 아이디 영역 -->
					<p class="main-sponsor-list-id">아이디</p>
					<!-- 닉네임 영역 -->
					<p class="main-sponsor-list-nickname">닉네임</p>
					<!-- 후원금액 영역 -->
					<p class="main-sponsor-list-support">후원금액(원)</p>
					<p class="main-sponsor-list-date">후원날짜</p>
				</div>
				<!-- 후원자 목록 리스트 -->
				<ul id="main-sponsor-list">
					<!-- 후원자 리스트 목록 -->
					<c:choose>
						<c:when test="${not empty sponsorList}">
							<c:forEach var="sponsor" items="${sponsorList}">
								<li>
									<p class="main-sponsor-list-id">
										<c:out value="${sponsor.memberId}" />
									</p>
									<p class="main-sponsor-list-nickname">
										<c:out value="${sponsor.memberNickname}" />
									</p>
									<p class="main-sponsor-list-support">
										<c:out value="${sponsor.sponsorAmount}" />원
									</p>
									<p class="main-sponsor-list-date">
										<c:out value="${sponsor.sponsorDate}" />
									</p>
								</li>
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
								href="${pageContext.request.contextPath}/admin/sponsorListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/sponsorListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/sponsorListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
				</div>
				<!-- 검색 영역 -->
				<div id="main-search" style="display:none;">
					<!-- 검색 종류 -->
					<div id="main-search-basic">
						<select class="select-find">
							<option value="title">회원 번호</option>
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