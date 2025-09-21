<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="${pageContext.request.contextPath}/assets/js/admin_header.js"></script>
<header>
	<c:set var="uri" value="${pageContext.request.requestURI}" />
	<!-- 헤더 메뉴명 -->
	<c:if test="${uri eq '/app/admin/notice/admin-notice-list.jsp'}">
		<!-- 상단 목록 -->
		<p>
			<strong>공지 사항 목록</strong>
		</p>
		<!-- 로그아웃 버튼 -->
		<button class="logout">logout</button>
	</c:if>
	<c:if
		test="${uri eq '/app/admin/course/admin-course-request-list.jsp'}">
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>수업 목록</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button class="logout">logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a
					href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=1">
						<strong>요청 목록</strong>
				</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/courseListOk.ad?page=1">
						수업 목록 리스트 </a></li>
			</ul>
		</section>
	</c:if>
	<c:if test="${uri eq '/app/admin/course/admin-course-list.jsp'}">
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>수업 목록</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button class="logout">logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a
					href="${pageContext.request.contextPath}/admin/courseRequestListOk.ad?page=1">
						요청 목록
				</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/courseListOk.ad?page=1">
						<strong>수업 목록 리스트</strong> </a></li>
			</ul>
		</section>
	</c:if>
	<c:if test="${uri eq '/app/admin/routine/admin-routine-list.jsp'}">
		<p>
			<strong>루틴 모임 목록</strong>
		</p>
		<button class="logout">logout</button>
	</c:if>
	<c:if test="${uri eq '/app/admin/leader/leader-list.jsp'}">
		<!-- 상단 목록 -->
		<p>
			<strong>모임장 목록</strong>
		</p>
		<!-- 로그아웃 -->
		<button class="logout">logout</button>
	</c:if>
	<c:if test="${uri eq '/app/admin/member/admin-member-list.jsp'}">
		<!-- 상단 목록 -->
		<p>
			<strong>회원 목록</strong>
		</p>
		<!-- 로그아웃 -->
		<button class="logout">logout</button>
	</c:if>
	<c:if test="${uri eq '/app/admin/member/admin-sponsor-list.jsp'}">
		<!-- 상단 목록 -->
		<p>
			<strong>후원자 목록</strong>
		</p>
		<!-- 로그아웃 -->
		<button class="logout">logout</button>
	</c:if>
	<c:if test="${uri eq '/app/admin/member/admin-expert-list.jsp'}">
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>전문가 승인 목록</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button class="logout">logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a
					href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad?page=1">
						<strong>전문가 인증 신청</strong>
				</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/expertListOk.ad?page=1">
						전문가 목록 </a></li>
			</ul>
		</section>
	</c:if>
	<c:if test="${uri eq '/app/admin/member/admin-expert-access-list.jsp'}">
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>전문가 승인 목록</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button class="logout">logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a
					href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad?page=1">
						전문가 인증 신청
				</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/expertListOk.ad?page=1">
						<strong>전문가 목록</strong> </a></li>
			</ul>
		</section>
	</c:if>
	<c:if test="${uri eq '/app/admin/review/admin-routine-review-list.jsp'}">
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>활동 후기</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button class="logout">logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a
					href="${pageContext.request.contextPath}/admin/routineReviewListOk.ad?page=1">
						<strong>루틴 모임 후기</strong>
				</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/courseReviewListOk.ad?page=1">
						수업 후기 </a></li>
			</ul>
		</section>
	</c:if>
	<c:if test="${uri eq '/app/admin/review/admin-course-review-list.jsp'}">
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>활동 후기</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button class="logout">logout</button>
		</section>
		<!-- 하단 목록 영역 -->
		<section>
			<!-- 하단 목록 리스트 -->
			<ul>
				<li><a
					href="${pageContext.request.contextPath}/admin/routineReviewListOk.ad?page=1">
						루틴 모임 후기
				</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/courseReviewListOk.ad?page=1">
						<strong>수업 후기</strong> </a></li>
			</ul>
		</section>
	</c:if>
	<c:if test="${uri eq '/app/admin/banner/admin-banner-list.jsp'}">
		<!-- 헤더 메뉴명 -->
		<p>
			<strong>배너 목록</strong>
		</p>
		<!-- 로그아웃 버튼 -->
		<button class="logout">logout</button>
	</c:if>
</header>