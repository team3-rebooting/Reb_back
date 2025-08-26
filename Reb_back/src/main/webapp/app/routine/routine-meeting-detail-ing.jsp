<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/routine/routine-meeting-detail-ing.css">

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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
<title>틈새빛</title>
</head>

<body>
	<jsp:include page="/header.jsp" />
	<main>
		<div id="main-container">
			<input type="hidden" id="routineNumber"
				value="${routine.routineNumber}">
			<div class="routine-detail-container">
				<div>
					<p class="p-back">
						<i class="fa-solid fa-arrow-left"></i>
					</p>
				</div>
				<p class="pagetitle">
					<c:out value="${routine.routineTitle}" />
				</p>
				<p class="p-host">
					이번 모임은 <span class="span-host-name"><c:out
							value="${routine.routineLeaderName}" /></span> 모임장과 함께합니다
				</p>
				<div class="div-detail-area">
					<div class="div-img">
						<c:choose>
							<c:when test="${empty routine.getFileRoutine() }">
								<img
									src="${pageContext.request.contextPath}/assets/img/team-logo.png"
									class="img-box">
							</c:when>
							<c:otherwise>
								<img
									src="${pageContext.request.contextPath}/upload/routine/${routine.getFileRoutine().getFileSystemName()}"
									class="img-box">
							</c:otherwise>
						</c:choose>
					</div>
					<div class="div-write-date">
						<p class="p-write-date">
							작성일 :
							<c:out value="${routine.routineCreatedDate}" />
						</p>
					</div>

					<div class="div-expert-detail">
						<p class="p-expert-info-title">내용</p>
						<div class="div-expert-info-detail">
							<p class="p-expert-detail-comment">
								<c:out value="${routine.routineContent}" />
							</p>
						</div>
					</div>
					<div class="div-expert-detail">
						<p class="p-expert-info-title">모이는 장소</p>
						<div class="div-expert-info-detail">
							<h1>지도 API 연동 예정</h1>
							<c:out value="${routine.routineLocation}" />
						</div>
					</div>
					<div class="div-expert-detail">
						<p class="p-expert-info-title">모집 정보</p>
						<div class="div-expert-info-detail">
							<p>
								모집 기간 :
								<c:out value="${routine.routineRecruitStartDate}" />
								~
								<c:out value="${routine.routineRecruitEndDate}" />
							</p>
							<p>
								모임 기간 :
								<c:out value="${routine.routineStartDate}" />
								~
								<c:out value="${routine.routineEndDate}" />
							</p>
							<p>
								시간 :
								<c:out value="${routine.routineStartTime}" />
								~
								<c:out value="${routine.routineEndTime}" />
								[
								<c:out value="${routine.routineDayOfWeek}" />
								]
							</p>
							<p>
								모집 인원 : <span id="applicant-count">${routine.routineApplicantCount}</span>
								/
								<c:out value="${routine.routineRecruitCount}" />
								명
							</p>

						</div>
					</div>
					<div class="div-expert-detail-button">
						<c:if test="${not empty sessionScope.memberNumber}">
							<c:if test="${routine.routineStatusNumber == 1}">
								<c:choose>
									<c:when test="${applicant}">
										<button class="button-cancel" type="button">취소</button>
										<button class="button-application" type="button"
											style="display: none;">신청하기</button>
									</c:when>
									<c:otherwise>
										<button class="button-cancel" type="button"
											style="display: none;">취소</button>
										<button class="button-application" type="button">신청하기</button>
									</c:otherwise>
								</c:choose>
							</c:if>
							<c:if test="${routine.routineStatusNumber != 1}">
								<button class="button-before" type="button">
									<c:out value="${routine.routineStatusInfo}" />
								</button>
							</c:if>
						</c:if>

					</div>
				</div>
			</div>
	</main>
	<div id="footer"></div>
</body>
<script
	src="${pageContext.request.contextPath}/assets/js/routine/routine-meeting-detail.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>