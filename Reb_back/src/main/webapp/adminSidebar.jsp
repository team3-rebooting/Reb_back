<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<section id="main-admin-list-menu">
			<!-- 사이드바 리스트 -->
			<ul id="main-admin-list">
				<li><a href="${pageContext.request.contextPath}/admin/noticeListOk.ad?page=1"> 
				<strong>공지사항 목록</strong>
					</a>
				</li>
				<li><a href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=1">
						수업 목록 </a></li>
				<li><a href="${pageContext.request.contextPath}/admin/routineListOk.ad?page=1">
				루틴 모임 목록 
					</a>
				</li>
				<li><a href="${pageContext.request.contextPath}/admin/memberListOk.ad?page=1"> 
				회원 목록 
					</a>
				</li>
				<li><a href="${pageContext.request.contextPath}/admin/sponsorListOk.ad?page=1">
				 후원자 목록 
				 </a>
				</li>
				<li><a href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad?page=1"> 전문가 승인 목록
				</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/routineReviewListOk.ad?page=1">
						활동 후기 </a></li>
				<li><a href="${pageContext.request.contextPath}/admin/bannerListOk.ad?page=1"> 배너 등록 </a></li>
			</ul>
		</section>