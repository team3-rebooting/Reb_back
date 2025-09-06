<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/course/course-detail-user-ing.css">

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
<script
	src="${pageContext.request.contextPath}/assets/js/course/course-detail.js"></script>

<body>
	<!-- 헤더 영역 -->
	<jsp:include page="/header.jsp" />
	<!-- 모달 전체 영역 -->
	<div class="modal-background">
		<!-- 모달 창 영역-->
		<div class="cancel-modal">
			<!-- 삭제 요청 이유 form -->
			<form action="" method="get">
				<!-- 취소 버튼 영역 -->
				<div class="div-modal-x">
					<button class="button-x" type="button">X</button>
				</div>
				<!-- 모달 제목 영역 -->
				<div class="div-modal-head">
					<span class="span-delete-title">삭제 요청 이유</span>
				</div>
				<!-- 모달 text 영역 -->
				<div class="div-modal-main">
					<textarea class="textarea-delete-modal"></textarea>
				</div>
				<!-- 모달 버튼 영역 -->
				<div class="div-modal-button-area">
					<button class="button-modal-delete" type="button">삭제 요청</button>
				</div>
			</form>
		</div>
	</div>
	<!-- 메인 영역 -->
	<main>
		<input type="hidden" id="courseNumber" value="${course.courseNumber}">
		<!-- 메인 컨테이너 영역 -->
		<div id="main-container">
			<!-- 수업 상세 컨테이너 -->
			<div class="course-detail-container">
				<div>
					<!-- 뒤로가기 버튼 -->
					<p class="p-back">
						<i class="fa-solid fa-arrow-left"></i>
					</p>
				</div>
				<!-- 제목 -->
				<p class="pagetitle">
					<c:out value="${course.courseTitle}" />
				</p>
				<!-- 내용 전체 영역 -->
				<div class="div-detail-area">
					<!-- 이미지 영역 -->
					<div class="div-img">
						<c:choose>
							<c:when test="${empty course.getFileCourse()}">
								<img
									src="${pageContext.request.contextPath}/assets/img/team_logo.png"
									class="img-detail">
							</c:when>
							<c:otherwise>
								<img
									src="${pageContext.request.contextPath}/upload/${course.getFileCourse().getFileSystemName()}"
									class="img-detail">
							</c:otherwise>
						</c:choose>
					</div>

					<!-- 작성일 영역 -->
					<div class="div-write-date">
						<p class="p-write-date">
							작성일 :
							<c:out value="${course.coursePostDate}" />
						</p>
					</div>
					<!-- 전문가 정보 영역 -->
					<div class="div-expert-detail">
						<p class="p-expert-info-title">전문가 정보</p>
						<div class="div-expert-info-detail">
							<p class="p-expert-name">
								성함 :
								<c:out value="${course.expertName}" />
							</p>
							<p class="p-expert-qualifi">
								보유 자격증 :
								<c:out value="${course.expertLicenseInfo}" />
							</p>
							<p class="p-expert-field">
								주요 분야 :
								<c:out value="${course.getFieldName()}" />
							</p>
						</div>
					</div>
					<!-- 전문가가 쓴 글 영역 -->
					<div class="div-expert-detail">
						<p class="p-expert-info-title">내용</p>
						<div class="div-expert-info-detail">
							<p class="p-expert-detail-comment"
								style="white-space: pre-line; word-break: break-all;">
								<c:out value="${course.courseContent}" />
							</p>
						</div>
					</div>
					<!-- 모집정보 영역 -->
					<div class="div-expert-detail">
						<p class="p-expert-info-title">모집 정보</p>
						<div class="div-expert-info-detail">
							<p>
								모집 기간 :
								<c:out value="${course.courseRecruitStartDate}" />
								~
								<c:out value="${course.courseRecruitEndDate}" />
							</p>
							<p>
								강의일 :
								<c:out value="${course.courseStartDate}" />
								~
								<c:out value="${course.courseEndDate}" />
							</p>
							<p>
								시간 :
								<c:out value="${course.courseStartTime}" />
								~
								<c:out value="${course.courseEndTime}" />
								[
								<c:out value="${course.courseDayOfWeek}" />
								]
							</p>
							<p>
								모집 인원 : <span id="applicant-count">${course.courseApplicantCount}</span>
								/
								<c:out value="${course.courseRecruitCount}" />
								명
							</p>
							<%-- <p>
								가격 :
								<c:out value="${course.coursePrice}" />
								원
							</p> --%>
						</div>
					</div>
					<!-- 일반 사용자가 보는 버튼 영역 -->
					<c:if test="${not empty sessionScope.memberNumber}">
						<div class="div-expert-detail-button">
							<c:choose>
								<c:when
									test="${course.expertNumber != sessionScope.expertNumber}">
									<c:choose>
										<c:when test="${course.getCourseRecruitStatusNumber() == 1}">
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
										</c:when>
										<c:otherwise>
											<button class="button-before" type="button">${course.getCourseStatusInfo()}</button>
										</c:otherwise>
									</c:choose>
								</c:when>
								<c:otherwise>
									<button class="button-status" type="button">${course.getCourseStatusInfo()}</button>
								</c:otherwise>
							</c:choose>
						</div>
					</c:if>
					<!-- 전문가가 자기 자신의 수업을 보는 버튼 영역 -->
					<c:if test="${course.expertNumber == sessionScope.expertNumber}">
						<div class="div-expert-detail-button">
							<c:choose>
								<c:when test="${course.getCourseOpenStatusNumber() != 1}">
									<a
										href="/course/expertCourseEditRequest.co?courseNumber=${course.courseNumber}"><button
											class="button-edit" type="button">수정 요청하기</button></a>
									<button class="button-delete" type="button">삭제 요청하기</button>
								</c:when>
								<c:otherwise>
									<div class="div-expert-detail-info">
										${course.getCourseRequestType()} 요청 중
									</div>
								</c:otherwise>
							</c:choose>
						</div>

					</c:if>
				</div>
			</div>
		</div>
	</main>
	<!-- 푸터 영역 -->
	<jsp:include page="/footer.jsp" />
</body>

</html>