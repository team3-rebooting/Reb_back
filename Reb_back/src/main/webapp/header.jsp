<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 헤더 -->
<header>
	<!-- 헤더 메뉴 -->
	<div class="header-container-menu font-menu">
		<div class="header-menu-bar">
			<!-- 가운데 이미지 -->
			<div id="header-menu-center">
				<a href="${pageContext.request.contextPath}/main.jsp"><img
					src="${pageContext.request.contextPath}/assets/img/team_logo.png"
					alt=""></a>
			</div>
			<!-- 헤더 상단 -->
			<div class="header-menu-bar-top">
				<!-- 헤더 상단 우측 버튼 -->
				<div id="header-menu-bar-top-right">
					<c:choose>
						<c:when test="${empty sessionScope.memberNumber}">
							<!-- 로그인 페이지 이동처리 -->
							<a href="${pageContext.request.contextPath}/member/login.me" class="font-main"
								class="login-btn">로그인/회원가입</a>
						</c:when>
						<c:otherwise>
							<a href="${pageContext.request.contextPath}/member/logoutOk.me" class="font-main"
								class="logout-btn">로그아웃</a>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<!-- 드롭 다운 가능한 메뉴 -->
			<div class="header-menu-dropdown-list">
				<div class="header-menu-dropdown-left">
					<div class="header-menu-dropdown">
						<!-- 소식 메뉴 -->
						<div class="header-menu-dropdown-menu">
							<a
								href="${pageContext.request.contextPath}/app/aboutUs/site-introduction.jsp">소식</a>
						</div>
						<!-- 드롭 다운 배경 -->
						<div class="header-menu-dropdown-bg"></div>
						<!-- 소식 드롭다운 메뉴 -->
						<div class="header-menu-dropdown-menu-content">
							<a
								href="${pageContext.request.contextPath}/app/aboutUs/site-introduction.jsp">소개글</a>
							<a
								href="${pageContext.request.contextPath}/app/notice/notice-list.jsp">공지사항</a>
							<a
								href="${pageContext.request.contextPath}/app/jobList/job-listings.jsp">채용공고</a>
						</div>
					</div>
					<div class="header-menu-dropdown">
						<!-- 수업 메뉴 -->
						<div class="header-menu-dropdown-menu">
							<a
								href="${pageContext.request.contextPath}/app/course/course-list.jsp">수업</a>
						</div>
						<!-- 드롭 다운 배경 -->
						<div class="header-menu-dropdown-bg"></div>
						<!-- 수업 드롭다운 메뉴 -->
						<div class="header-menu-dropdown-menu-content">
							<a
								href="${pageContext.request.contextPath}/app/course/course-list.jsp">수업
								게시판</a> <a
								href="${pageContext.request.contextPath}/app/course/course-review-list.jsp">수업
								후기 게시판</a>
						</div>
					</div>
					<div class="header-menu-dropdown">
						<!-- 루틴 모임 메뉴 -->
						<div class="header-menu-dropdown-menu">
							<a
								href="${pageContext.request.contextPath}/app/routine/routine-meetings-list.jsp">루틴
								모임</a>
						</div>
						<!-- 드롭 다운 배경 -->
						<div class="header-menu-dropdown-bg"></div>
						<!-- 루틴 모임 드롭다운 메뉴 -->
						<div class="header-menu-dropdown-menu-content">
							<a
								href="${pageContext.request.contextPath}/app/routine/routine-meetings-list.jsp">루틴
								모임 게시판</a> <a
								href="${pageContext.request.contextPath}/app/routine/routine-meeting-review-list.jsp">루틴
								모임 후기 게시판</a>
						</div>
					</div>
				</div>
				<!-- 헤더 우측 버튼 -->
				<div class="header-menu-right">
					<!-- 후원 버튼 -->
					<div id="div-a-donation-link">
						<a
							href="${pageContext.request.contextPath}/app/donation/sponsorship-input.jsp">후원</a>
					</div>
					<!-- 마이페이지 버튼 -->
					<a href="${pageContext.request.contextPath}/myPage/myPassword.my"><img
						src="${pageContext.request.contextPath}/assets/img/header/header_side_myPagebutton.png"
						alt=""></a>
				</div>
			</div>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/assets/js/header-login.js"></script>
</header>