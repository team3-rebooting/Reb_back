<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/edit-info.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/mypage-modal.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/expert-rejection-reason.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/expert-file-upload.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/profile-pic-upload.css">

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
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/mypage/edit-info.js"></script>
<title>틈새빛</title>
</head>

<body>
	<!-- 헤더 -->
	<jsp:include page="/header.jsp" />
	<main>
		<!-- 모달 -->
		<jsp:include page="${pageContext.request.contextPath}/app/mypage/mypage-modal.jsp" />
		<!-- 사이드 메뉴 -->
		<jsp:include
			page="${pageContext.request.contextPath}/app/mypage/sidemenu.jsp" />
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<div class="pagetitle">개인정보 수정</div>
			<!-- 개인정보 수정 form -->
			<form action="${pageContext.request.contextPath}/myPage/editCompleteOk.my"
				method="post" id="formEdit" enctype="multipart/form-data">
				<div class="edit-info-container">
					<!-- ID -->
					<div class="edit-info-list">
						<div class="edit-info-type">ID</div>
						<div class="edit-info-data" id="edit-info-id">${myMemberDTO.memberId}</div>
					</div>
					<!-- 비밀번호 -->
					<div class="edit-info-list edit-info-two-row">
						<div class="edit-info-type">비밀번호</div>
						<div class="edit-info-data edit-info-input-two-row">
							<!-- 비밀번호 첫번째 입력 -->
							<div id="password-first-input">
								<input type="password" name="memberPassword"
									id="input-password-first" placeholder="패스워드 입력">
								<div class="edit-info-pw-warning"
									id="edit-info-pw-first-warning">
									숫자, 특수 문자(!,@,#,$), 문자 조합<br>8문자 이상 입력 필요
								</div>
							</div>
							<!-- 비밀번호 두번째 입력 -->
							<div id="password-re-input">
								<input type="password" name="memberPasswordRe"
									id="input-password-re" placeholder="패스워드 재입력">
								<div class="edit-info-pw-warning" id="edit-info-pw-re-warning">비밀번호
									불일치</div>
							</div>
						</div>
					</div>
					<!-- 이름 -->
					<div class="edit-info-list">
						<div class="edit-info-type">이름</div>
						<div class="edit-info-data">${myMemberDTO.memberName}</div>
					</div>
					<!-- 닉네임 -->
					<div class="edit-info-list">
						<div class="edit-info-type">닉네임</div>
						<!-- 닉네임 입력 -->
						<div class="edit-info-data">
							<input type="text" id="input-edit-info-nickname"
								name="memberNickname" value="${myMemberDTO.memberNickname}"
								placeholder="닉네임">
							<div id="possible-nickname-text">사용 가능</div>
							<button type="button" name="editInfoNicname"
								id="button-edit-info-nickname" value="edit-info-nickname">중복
								확인</button>
						</div>
					</div>
					<!-- 생년월일 -->
					<div class="edit-info-list">
						<div class="edit-info-type">생년월일</div>
						<div class="edit-info-data" id="edit-info-birth-date">${myMemberDTO.memberBirthDate}</div>
					</div>
					<!-- 성별 -->
					<div class="edit-info-list">
						<div class="edit-info-type">성별</div>
						<div class="edit-info-data" id="edit-info-gender">
							<c:choose>
								<c:when test="${(myMemberDTO.memberGender == 'M')}">
            			남
            		</c:when>
								<c:otherwise>
            			여
            		</c:otherwise>
							</c:choose>
						</div>
					</div>
					<!-- 주소 -->
					<div class="edit-info-list edit-info-two-row">
						<div class="edit-info-type">실거주지</div>
						<div class="edit-info-data edit-info-input-two-row">
							<div id="edit-info-address-main">
								<input type="hidden" id="input-edit-info-address-text" name="address" value="${myMemberDTO.address}">
								<input type="hidden" id="input-edit-info-address-post" name="zipCode" value="${myMemberDTO.zipCode}">
								<div id="edit-info-address-text">${myMemberDTO.address}</div>
								<div id="edit-info-address-post">${myMemberDTO.zipCode}</div>
								<!-- 주소 검색 -->
								<button type="button" name="addressSearchBtn"
									id="button-search-address">주소 검색</button>
							</div>
							<!-- 실거주지 입력 -->
							<div id="address-re-input">
								<input type="text" name="addressDetail"
									value=<c:if test="${not empty myMemberDTO.addressDetail}">"${myMemberDTO.addressDetail}"</c:if>
									placeholder="상세 주소">
							</div>
						</div>
					</div>
					<!-- 이메일 -->
					<div class="edit-info-list">
						<div class="edit-info-type">이메일</div>
						<div class="edit-info-data">
							<input type="email" id="input-edit-info-email" name="memberEmail"
								value="${myMemberDTO.memberEmail}" placeholder="이메일 주소">
						</div>
					</div>
					<!-- 전화번호 -->
					<div class="edit-info-list edit-info-two-row">
						<!-- 라벨 - 전화번호/인증번호 -->
						<div class="edit-info-type">
							<div>전화번호</div>
							<div>인증번호</div>
						</div>
						<!-- 전화번호 입력 - 전화번호/인증번호 -->
						<div class="edit-info-data edit-info-input-two-row">
							<div id="div-send-verification-code">
								<!-- 전화번호 입력 -->
								<input type="text" id="input-edit-info-phone-number"
									name="memberPhoneNumber" disabled
									value="${myMemberDTO.memberPhoneNumber}" placeholder="전화번호">
								<!-- 버튼 - 변경/인증번호 전송 -->
								<div id="div-button-update-phone-number">
									<button type="button" name="updatePhoneNumber"
										id="button-update-phone-number" value="update-phone-number">변경</button>
									<button type="button" name="sendVerificationCode"
										id="button-send-verification-code"
										value="send-verification-code" disabled>인증번호 전송</button>
								</div>
							</div>
							<!-- 인증번호 입력/ 확인 버튼 -->
							<div id="div-check-verification-code">
								<input type="text" id="input-verification-code"
									name="verificationCode" placeholder="인증번호" disabled>
								<button type="button" name="checkVerificationCode"
									id="button-check-verification-code"
									value="check-verification-code" disabled>확인</button>
							</div>
						</div>
					</div>
					<!-- 전문가 인증 -->
					<div class="edit-info-list">
						<div class="edit-info-type">전문가 인증</div>
						<div class="edit-info-data">
							<!-- 전문가 인증 상태 -->
							<div id="edit-info-expert-status">
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
					</div>
					<!-- 프로필 사진 -->
					<div class="edit-info-list">
						<div class="edit-info-type">프로필 사진</div>
						<div class="edit-info-data">
							<!-- 프로필 사진 이미지 -->
							<c:set var="file" value="${myMember.getFileMemberProfile()}"></c:set>
							<c:if test="${empty file}">
								<div id="profile-picture">
									<img id="img-edit-profile-pic"
										src="${pageContext.request.contextPath}/assets/img/profilePicture/dog.jpg" alt="프로필">
								</div>
							</c:if>
							<c:if test="${not empty file}">
								<div id="profile-picture">
									<img id="img-edit-profile-pic"
										src="${pageContext.request.contextPath}/upload/profile/${file.getFileSystemName()}">
								</div>
							</c:if>
							<!-- 프로필 사진 수정 버튼 -->
							<button type="button" id="button-edit-profile-pic" class="button-modal-open" name="profilePicUpload">수정</button>
						</div>
					</div>
				</div>
				<!-- 개인정보 수정/취소 버튼 -->
				<div id="bottom-button">
					<button type="submit" id="button-edit-user-complete">수정</button>
					<button type="button" id="button-edit-user-cancel">취소</button>
				</div>
			</form>
		</div>
	</main>
	<!-- 푸터 -->
	<div id="footer"></div>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/mypage-modal.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/sidemenu.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/expert-file-upload.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/profile-pic-upload.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</body>

</html>