<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>전문가 승인 목록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/member/admin-expert-access-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/member/admin-expert-access-list.js"></script>
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
		<section id="main-expert-access">
			<!-- 전문가 목록 영역 -->
			<div id="main-expert-access-div">
				<!-- 승인된 전문가 리스트 제목 -->
				<div id="main-expert-access-list-title">
					<!-- 회원번호 영역 -->
					<p class="main-expert-access-list-number">회원 번호</p>
					<!-- 아이디 영역 -->
					<p class="main-expert-access-list-id">아이디</p>
					<!-- 닉네임 영역 -->
					<p class="main-expert-access-list-nickname">닉네임</p>
					<!-- 빈 공간 -->
					<p class="main-garbage-area"></p>
					<!-- 전문가 분야 영역 -->
					<p class="main-expert-access-list-type">분야</p>
					<!-- 전문가 승인 날짜 영역 -->
					<p class="main-expert-access-list-date">승인 날짜</p>
				</div>
				<ul id="main-expert-access-list">
					<c:choose>
						<c:when test="${not empty expertList}">
							<c:forEach var="expertList" items="${expertList}">
								<li><a
									href="${pageContext.request.contextPath}/admin/expertReadOk.ad?expertNumber=${expertList.expertNumber}">
										<p class="main-expert-access-list-number">
											<c:out value="${expertList.memberNumber}" />
										</p>
										<p class="main-expert-access-list-id">
											<c:out value="${expertList.memberId}" />
										</p>
										<p class="main-expert-access-list-nickname">
											<c:out value="${expertList.memberNickname}" />
										</p>
										<div class="main-garbage-area"></div>
										<p class="main-expert-access-list-type">
											<c:out value="${expertList.fieldName}" />
										</p>
										<p class="main-expert-access-list-date">
											<c:out value="${expertList.expertCheckDate}" />
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
								href="${pageContext.request.contextPath}/admin/expertListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/expertListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/expertListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
				</div>
				<!-- 검색 영역 -->
				<div id="main-search" style="display:none;" >
					<!-- 검색 종류 -->
					<select class="select-find">
						<option value="title">아이디</option>
						<option value="name">닉네임</option>
						<option value="name">분야</option>
					</select>
					<!-- 검색 입력창 -->
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