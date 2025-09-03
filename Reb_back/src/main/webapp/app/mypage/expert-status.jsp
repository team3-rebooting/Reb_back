<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/mypage/expert-status.css">
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
	src="${pageContext.request.contextPath}/assets/js/mypage/expert-status.js"></script>
<title>틈새빛</title>
</head>

<body>
	<!-- 헤더 -->
	<jsp:include page="/header.jsp" />
	<main>
		<!-- 모달 -->
		<jsp:include
			page="${pageContext.request.contextPath}/app/mypage/mypage-modal.jsp" />
		<!-- 사이드 메뉴 -->
		<jsp:include
			page="${pageContext.request.contextPath}/app/mypage/sidemenu.jsp" />
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<!-- 페이지 제목 -->
			<div class="pagetitle">전문가 인증 정보</div>
			<form action="" method="post">
				<input type="hidden" id="expert-cert-status_number"
					value="${expert.expertCertStatusNumber}"> <input
					type="hidden" id="expert-applicant-reason"
					value="${expert.expertApplicantReason}">
				<div class="expert-status-content-box">
					<div id="expert-progress-status" class="expert-status-info">
						<div class="expert-status-title">승인 상태</div>
						<div class="expert-status-text" id="expert-progress-status-text">
							<div>
								<button class="button-modal-open" type="button"
									id="button-expert-status-rejection-reason"
									data-type="expertRejectionReason">
									<c:out value="${expert.expertCertStatusInfo}" />
								</button>
							</div>
							<div>
								(신청 일자 :
								<c:out value="${expert.expertCheckDate}" />
								)
							</div>
						</div>
					</div>
					<div id="expert-file" class="expert-status-info">
						<div class="expert-status-title">첨부 파일</div>
						<div class="expert-status-text" id="expert-file-text">
							<div>
								<c:choose>
									<c:when test="${empty sessionScope.expertNumber}">
										<button class="button-modal-open" type="button"
											data-type="expertFileUpload">변경</button>
									</c:when>
									<c:otherwise>
										<button class="button-modal-open" type="button"
											data-type="expertFileUpload" disabled style="background-color:gray;">-</button>
									</c:otherwise>
								</c:choose>
							</div>
							<c:choose>
								<c:when test="${ not empty expert.getFileExpert()}">
									<a
										href="${pageContext.request.contextPath}/upload/${expert.getFileExpert().getFileSystemName()}"
										download="${expert.getFileExpert().getFileOriginalName()}"
										id="a-expert-status-file">${expert.getFileExpert().getFileOriginalName()}</a>
								</c:when>
								<c:otherwise>
								등록한 첨부 파일이 없습니다.
							</c:otherwise>
							</c:choose>
							<%-- <div id="expert-status-file-date">등록일자 : <c:out value="${expert}"/></div> --%>

						</div>
					</div>
					<div id="expert-specialization" class="expert-status-info">
						<div class="expert-status-title">전문 분야</div>
						<div class="expert-status-confirm-text" id="expert-specialization">
							<c:out value="${expert.fieldName}" />
						</div>
					</div>
					<div id="expert-personal-history" class="expert-status-info">
						<div class="expert-status-title">경력</div>
						<div class="expert-status-confirm-text"
							id="expert-personal-history-text">
							<p style="white-space: pre-line; word-break: break-all;">
								<c:out value="${expert.expertCareer}" />
							</p>
						</div>
					</div>
					<div id="expert-certificate" class="expert-status-info">
						<div class="expert-status-title">자격증 정보</div>
						<div class="expert-status-confirm-text"
							id="expert-certificate-text">
							<p style="white-space: pre-line; word-break: break-all;">
								<c:out value="${expert.expertLicenseInfo}" />
							</p>
						</div>
					</div>

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
	<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/mypage/expert-file-upload.js"></script>
</body>

</html>