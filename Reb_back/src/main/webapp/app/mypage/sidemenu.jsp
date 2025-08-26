<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 사이드 메뉴 -->
<!-- 사이드 메뉴 열기 버튼 -->

<aside id="mypage-sidemenu-container">
	<div class="mypage-sidemenubtn-open">&gt;</div>
	<!-- 사이드 메뉴 창 -->
	<div class="mypage-sidemenumove">
		<div class="mypage-sidemenu">
			<!-- 사이드 메뉴 닫기 버튼 -->
			<div class="mypage-sidemenubtn-close">&gt;</div>
			<!-- 사이드 메뉴 리스트 -->
			<nav class="nav-mypage-sidemenu">
				<ul class="ul-mainsidemenu">
					<!-- 개인정보 -->
					<li class="li-mainsidemenu"><a class="a-mainsidemenu-title"
						href="${pageContext.request.contextPath}/myPage/myInfoOk.my">개인정보</a>
						<ul class="ul-subsidemenu">
							<li class="li-subsidemenu"><a
								href="${pageContext.request.contextPath}/myPage/editInfoOk.my">개인정보
									수정</a></li>
							<li class="li-subsidemenu"><a
								href="${pageContext.request.contextPath}/myPage/mySponsorship.my">후원
									정보</a></li>
							<li class="li-subsidemenu"><a
								href="${pageContext.request.contextPath}/myPage/expertStatusOk.my">전문가
									인증 정보</a></li>
						</ul></li>
					<!-- 활동내역 -->
					<li class="li-mainsidemenu"><a class="a-mainsidemenu-title"
						href="${pageContext.request.contextPath}/mypage/myApplicant.my">활동내역</a>
						<ul class="ul-subsidemenu">
							<li class="li-subsidemenu"><a
								href="${pageContext.request.contextPath}/mypage/myApplicant.my">나의
									신청/수강 정보</a></li>
							<li class="li-subsidemenu"><a
								href="${pageContext.request.contextPath}/mypage/myReview.my">나의
									후기/댓글</a></li>
						</ul></li>
					<!-- 수업 -->
					<input type="hidden" id="expertNumber" value="${sessionScope.expertNumber}">
					<li class="li-mainsidemenu" id="li-expert-course-menu"><a
								class="a-mainsidemenu-title"
								href="${pageContext.request.contextPath}/myPage/myCourseRequest.my">수업</a>
								<ul class="ul-subsidemenu">
									<li class="li-subsidemenu"><a
										href="${pageContext.request.contextPath}/myPage/myCourseRequest.my">나의 수업 개설 정보</a></li>
								</ul></li>
					<%-- <c:choose>
						<c:when test="${not empty sessionScope.expertNumber}">
							<li class="li-mainsidemenu" id="li-expert-course-menu"><a
								class="a-mainsidemenu-title"
								href="${pageContext.request.contextPath}/myPage/myCourseRequest.my"
								style="color: #F38A6E; pointer: auto;">수업</a>
								<ul class="ul-subsidemenu">
									<li class="li-subsidemenu"
										style="color: #F59D85; pointer: auto;"><a
										href="${pageContext.request.contextPath}/myPage/myCourseRequest.my"
										style="color: #F59D85; cursor: pointer;">나의 수업 개설 정보</a></li>
								</ul></li>
						</c:when>
						<c:otherwise>
							<li class="li-mainsidemenu" id="li-expert-course-menu"><a
								class="a-mainsidemenu-title"
								href="${pageContext.request.contextPath}/myPage/myCourseRequest.my"
								style="color: #6E6E6E; pointer: none;">수업</a>
								<ul class="ul-subsidemenu">
									<li class="li-subsidemenu"
										style="color: #6E6E6E; cursor: default;"><a
										href="${pageContext.request.contextPath}/myPage/myCourseRequest.my"
										style="color: #6E6E6E; cursor: default;">나의 수업 개설 정보</a></li>
								</ul></li>
						</c:otherwise>
					</c:choose> --%>
				</ul>
			</nav>
		</div>
	</div>
</aside>