<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
<c:set var="uri" value="${pageContext.request.requestURI}" />
		<!-- 헤더 메뉴명 -->
		<p>
			<c:if test="${uri === '/app/admin/notice/admin-notice-list.jsp'}"><strong>공지사항 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
			<c:if test="${uri === '/app/admin/banner/admin-banner-list.jsp'}"><strong>배너 목록</strong></c:if>
		</p>
		<!-- 로그아웃 버튼 -->
		<button>logout</button>
</header>