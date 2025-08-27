<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/personal-info.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/mypage-modal.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/expert-file-upload.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/footer.css">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">

<script
	src="${pageContext.request.contextPath}/assets/js/mypage/personal-info.js"></script>
<title>틈새빛</title>
</head>

<body>
	<!-- 헤더 -->
	<jsp:include page="/header.jsp" />
	<main>
		<!-- 모달 -->
		<div class="mypage-modal"></div>
		<!-- 사이드 메뉴 -->
		<jsp:include
			page="${pageContext.request.contextPath}/app/mypage/sidemenu.jsp" />
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<div class="pagetitle">개인정보 조회</div>
			<form action="/myPage/editInfoOk.my" method="post">
				<!-- 개인정보 조회 -->
				<div id="personal-info-container">
					<!-- ID -->
					<div class="personal-info-list">
						<div class="personal-info-type">ID</div>
						<div class="personal-info-data">${myMemberDTO.memberId}</div>
					</div>
					<!-- 이름 -->
					<div class="personal-info-list">
						<div class="personal-info-type">이름</div>
						<div class="personal-info-data">${myMemberDTO.memberName}</div>
					</div>
					<!-- 닉네임 -->
					<div class="personal-info-list">
						<div class="personal-info-type">닉네임</div>
						<div class="personal-info-data">${myMemberDTO.memberNickname}</div>
					</div>
					<!-- 생년월일 -->
					<div class="personal-info-list">
						<div class="personal-info-type">생년월일</div>
						<div class="personal-info-data">${myMemberDTO.memberBirthDate}</div>
					</div>
					<!-- 성별 -->
					<div class="personal-info-list">
						<div class="personal-info-type">성별</div>
						<div class="personal-info-data">
							<c:choose>
								<c:when test="${(myMemberDTO.memberGender == 'M') }">
            			남
            		</c:when>
								<c:otherwise>
            			여
            		</c:otherwise>
							</c:choose>

						</div>
					</div>
					<!-- 주소 -->
					<div class="personal-info-list">
						<div class="personal-info-type">주소</div>
						<div class="personal-info-data">
							${myMemberDTO.address}
							<c:if test="${not empty myMemberDTO.addressDetail}">, ${myMemberDTO.addressDetail}</c:if>
						</div>
						<div id="personal-info-data-postcode">${myMemberDTO.zipCode}</div>
					</div>
					<!-- 이메일 -->
					<div class="personal-info-list">
						<div class="personal-info-type">이메일</div>
						<div class="personal-info-data">${myMemberDTO.memberEmail}</div>
					</div>
					<!-- 전화번호 -->
					<div class="personal-info-list">
						<div class="personal-info-type">전화번호</div>
						<div class="personal-info-data">${myMemberDTO.memberPhoneNumber}</div>
					</div>
					<!-- 전문가 인증 -->
					<div class="personal-info-list">
						<div class="personal-info-type">전문가 인증</div>
						<!-- 전문가 인증 상태 -->
						<div class="personal-info-data" id="personal-info-expert-status">
							<c:choose>
								<c:when test="${not empty myMemberDTO.expertCertStatusInfo}">
   						${myMemberDTO.expertCertStatusInfo}
   					</c:when>
								<c:otherwise>
   						-
   					</c:otherwise>
							</c:choose>
						</div>
					</div>
					<!-- 프로필 사진 -->
					<div class="personal-info-list">
						<div class="personal-info-type">프로필 사진</div>
						<div class="personal-info-data">
							<div id="profile-picture">
								<img
									src="${pageContext.request.contextPath}/assets/img/profile.png"
									alt="프로필">
							</div>
						</div>
					</div>
				</div>
				<!-- 버튼 -->
				<div id="form-bottom-button">
					<button id="button-edit-user">수정</button>
					<button type="button" id="button-del-user">회원 탈퇴</button>
				</div>
			</form>
		</div>
	</main>
	<!-- 푸터 -->
	<div id="footer"></div>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/sidemenu.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/mypage-modal.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/expert-file-upload.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</body>

</html>