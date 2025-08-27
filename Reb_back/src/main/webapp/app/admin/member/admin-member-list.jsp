<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 목록</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/member/admin-member-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/member/admin-member-list.js"></script>
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
			<strong>회원 목록</strong>
		</p>
		<!-- 로그아웃 -->
		<button>logout</button>
	</header>
	<!-- 메인 -->
	<main>
		<!-- 사이드바 리스트 영역 -->
		<jsp:include page="/adminSidebar.jsp" />
		<!-- 메인 영역 -->
		<section id="main-member">
			<div id="main-member-div">
				<!-- 회원 리스트 제목 -->
				<div id="main-admin-member-list-title">
					<!-- 회원 번호 영역 -->
					<p class="main-admin-member-list-number">회원 번호</p>
					<!-- 아이디 영역 -->
					<p class="main-admin-member-list-id">아이디</p>
					<!-- 닉네임 영역 -->
					<p class="main-admin-member-list-nickname">닉네임</p>
					<!-- 인적사항 영역 -->
					<p class="main-admin-member-list-info">인적사항</p>
					<!-- 회원 유형 영역 -->
				</div>
				<!-- 회원 목록 리스트 -->
				<ul id="main-admin-member-list">
					<!-- 회원 리스트 목록 -->
					<c:choose>
						<c:when test="${not empty memberList}">
							<c:forEach var="member" items="${memberList}">
								<li>
									<p class="main-admin-member-list-number">
										<c:out value="${member.memberNumber}" />
									</p>
									<p class="main-admin-member-list-id">
										<c:out value="${member.memberId}" />
									</p>
									<p class="main-admin-member-list-nickname">
										<c:out value="${member.memberNickname}" />
									</p>
									<div class="main-admin-member-list-info-li">
										<p>
											<c:out value="${member.address}" />
											<c:out value="${member.addressDetail}" />
										</p>
										<p>
											[핸드폰 번호]
											<c:out value="${member.memberPhoneNumber}" />
										</p>
									</div>
								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<div>
								<div colspan="5" align="center">등록된 회원이 없습니다.</div>
							</div>
						</c:otherwise>
					</c:choose>
				</ul>
				<!-- 페이지네이션 -->
				<div id="main-page-number">
					<ul>
						<c:if test="${prev}">
							<li><a
								href="${pageContext.request.contextPath}/admin/memberListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/memberListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/memberListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
				</div>
				<!-- 검색 영역 -->
				<div id="main-search" style="display:none;" >
					<!-- 검색 종류 -->
					<div id="main-search-basic">
						<select class="select-find">
							<option value="title">아이디</option>
							<option value="name">회원 번호</option>
							<option value="name">닉네임</option>
							<option value="name">회원 유형</option>
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