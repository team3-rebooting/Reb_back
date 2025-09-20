<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section id="main-admin-list-menu">
	<c:set var="uri" value="${pageContext.request.requestURI}" />
	<!-- 사이드바 리스트 -->
	<ul id="main-admin-list">
		<li><a
			href="${pageContext.request.contextPath}/admin/noticeListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/notice/admin-notice-list.jsp'}"><strong>공지사항 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/notice/admin-notice-list.jsp'}">공지사항 목록</c:if>
				 </a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/course/admin-course-request-list.jsp' || uri eq '/app/admin/course/admin-course-list.jsp'}"><strong>수업 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/course/admin-course-request-list.jsp' && uri ne '/app/admin/course/admin-course-list.jsp'}">수업 목록</c:if>
		</a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/routineListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/routine/admin-routine-list.jsp'}"><strong>루틴 모임 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/routine/admin-routine-list.jsp'}">루틴 모임 목록</c:if>
		</a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/leaderListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/leader/leader-list.jsp'}"><strong>모임장 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/leader/leader-list.jsp'}">모임장 목록</c:if></a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/memberListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/member/admin-member-list.jsp'}"><strong>회원 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/member/admin-member-list.jsp'}">회원 목록</c:if> </a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/sponsorListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/member/admin-sponsor-list.jsp'}"><strong>후원자 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/member/admin-sponsor-list.jsp'}">후원자 목록</c:if> </a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/member/admin-expert-access-list.jsp' || uri eq '/app/admin/member/admin-expert-list.jsp'}"><strong>전문가 승인 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/member/admin-expert-access-list.jsp' && uri ne '/app/admin/member/admin-expert-list.jsp'}">전문가 승인 목록</c:if>
				</a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/routineReviewListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/review/admin-routine-review-list.jsp' || uri eq '/app/admin/review/admin-course-review-list.jsp'}"><strong>후기 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/review/admin-routine-review-list.jsp' && uri ne '/app/admin/review/admin-course-review-list.jsp'}">후기 목록</c:if> </a></li>
		<li><a
			href="${pageContext.request.contextPath}/admin/bannerListOk.ad?page=1">
				<c:if test="${uri eq '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
				<c:if test="${uri ne '/app/admin/banner/admin-banner-list.jsp'}">배너 목록</c:if> </a></li>
	</ul>
</section>