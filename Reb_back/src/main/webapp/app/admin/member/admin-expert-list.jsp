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
	href="${pageContext.request.contextPath}/assets/css/admin/member/admin-expert-list.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/member/admin-expert-list.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
</head>


<body class="font-menu">
	<!-- 헤더 -->
	<header>
		<!-- 상단 목록 영역 -->
		<section>
			<!-- 상단 목록 -->
			<p>
				<strong>전문가 승인 목록</strong>
			</p>
			<!-- 로그아웃 버튼 -->
			<button id="logout">logout</button>
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
	</header>
	<!-- 반려 모달 전체 창 -->
	<div id="modal-background">
		<!-- 반려 모달 -->
		<div id="cancel-modal">
			<!-- 반려 모달 입력창 -->
			<div id="cancel-modal-in">
				<p>전문가 승인 반려 사유</p>
				<!-- 반려 모달 입력 form  -->
				<form action="${pageContext.request.contextPath}/admin/expertCompanionOk.ad" method="get" id="cancel-input">
					<!-- 반려 모달 입력 영역 -->
					<textarea name="modal" placeholder="사유 입력" id="return-message"
						autofocus></textarea>
					<!-- 반려 모달 등록 버튼 -->
					<button type="button" id="submit">등록</button>
				</form>
			</div>
			<!-- 반려 모달 나가기 버튼 -->
			<button type="button" id="close-modal">X</button>
		</div>
	</div>
	<!-- 메인 -->
	<main>
		<!-- 사이드바 리스트 영역 -->
		<jsp:include page="/adminSidebar.jsp" />
		<!-- 메인 영역 -->
		<section id="main-expert">
			<div id="main-expert-div">
				<!-- 전문가 리스트 제목 -->
				<div id="main-expert-list-title">
					<!-- 전문가 승인 상태 영역 -->
					<p class="main-expert-list-status">승인 상태</p>
					<!-- 전문가 아이디 영역 -->
					<p class="main-expert-list-id">아이디</p>
					<!-- 전문가 닉네임 영역 -->
					<p class="main-expert-list-nickname">닉네임</p>
					<!-- 전문가 인적사항 영역 -->
					<p class="main-expert-list-info">인적사항</p>
					<!-- 전문가 승인/반려 영역 -->
					<p class="main-expert-list-approval">승인/반려</p>
					<!-- 전문가 첨부파일 영역 -->
					<p class="main-expert-list-file">첨부 파일</p>
				</div>
				<!-- 전문가 요청 리스트 -->
				<ul id="main-expert-list">
					<!-- 전문가 요청 리스트 목록 -->
					<c:choose>
						<c:when test="${not empty applicantList}">
							<c:forEach var="applicant" items="${applicantList}">
								<li>
									<p class="main-expert-list-status">
										<c:out value="${applicant.expertCertStatusInfo}" />
									</p>
									<p class="main-expert-list-id">
										<c:out value="${applicant.memberId}" />
									</p>
									<p class="main-expert-list-nickname">
										<c:out value="${applicant.memberNickname}" />
									</p>
									<div class="main-expert-list-info">
										<p>
											[주소]
											<c:out value="${applicant.address}" />
											<c:out value="${applicant.addressDetail}" />
										</p>
										<p>
											[핸드폰 번호]
											<c:out value="${applicant.memberPhoneNumber}" />
										</p>
									</div>
									<div class="main-expert-list-approval">
										<!-- 승인 버튼 -->
										<button type="button" class="accept"
										data-member-number="${applicant.memberNumber}">승인</button>
										<!-- 반려 버튼 -->
										<button type="button" class="cancel"
										data-member-number="${applicant.memberNumber}">반려</button>
									</div>
									<div class="main-expert-list-file">
										<a href="./../../../assets/img/yujin.jpg" download="유진.jpg">
											<button type="button" class="file">다운로드</button>
										</a>
									</div>
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
								href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad?page=${startPage - 1}"
								class="prev">&lt;</a></li>
						</c:if>
						<c:set var="realStartPage"
							value="${startPage < 0 ? 0 : startPage}" />
						<c:forEach var="i" begin="${realStartPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(i == page) }">
									<li><a
										href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad?page=${i}">
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
								href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad?page=${endPage + 1}"
								class="next">&gt;</a>
						</c:if>
					</ul>
				</div>
				<!-- 검색 영역 -->
				<div id="main-search">
					<!-- 검색 종류 -->
					<select class="select-find">
						<option value="title">아이디</option>
						<option value="name">닉네임</option>
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