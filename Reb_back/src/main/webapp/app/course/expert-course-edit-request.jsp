<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/course/expert-course-edit-request.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/footer.css">

<script defer
	src="./../../assets/js/course/expert-course-edit-request.js"></script>
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
<title>틈새빛</title>
</head>

<body>
	<jsp:include page="/header.jsp" />
	<main>
		<div id="main-container">
			<p class="pagetitle">수업 수정 요청</p>
			<form action="/course/expertCourseEditRequestOk.co" method="post"
				enctype="multipart/form-data">
				<input type="hidden" name="courseNumber"
					value="${course.courseNumber}">
				<div class="div-create-course">
					<input type="text" class="input-title input-in" name="courseTitle"
						placeholder="제목을 입력해주세요" value="${course.courseTitle}" required>
				</div>
				<div class="div-create-course">
					<span class="font-main little-title">대표 이미지 : </span> 
					<input type="file" name="courseFile" class="input-in">
					<span class="font-main" id="original-file">기존 파일 : <c:out value="${course.getFileCourse().getFileOriginalName()}"/></span>
				</div>
				<div class="div-create-course">
					<p class="font-main little-title">내용</p>
					<textarea class="textarea-text input-in font-main"
						name="courseText" rows="20" cols="130" required>${course.courseContent}</textarea>
				</div>
				<div class="div-create-course">
					<p class="font-main little-title">모집 관련 정보</p>
					<div class="div-recruit-info">
						<!-- <div class="div-info-line">
							<p class="font-main">모집 기간</p>
							<div class="div-input-info">
								<input type="date" name="recruitmentStartDate" class="input-in">
								<input type="date" name="recruitmentEndDate" class="input-in">
							</div>
						</div> -->
						<div class="div-info-line">
							<p class="font-main">강의일</p>
							<div class="div-input-info">
								<input type="date" name="courseStartDate" class="input-in" value="${course.getCourseStartDateForEdit()}" required> 
								<input type="date" name="courseEndDate" class="input-in" value="${course.getCourseEndDateForEdit()}" required>
							</div>
						</div>
						<div class="div-info-line">
							<p class="font-main">시간</p>
							<div class="div-input-info">
								<input type="time" name="courseStartTime" class="input-in" value="${course.getCourseStartTime()}" required> 
								<input type="time" name="courseEndTime" class="input-in" value="${course.getCourseEndTime()}" required>
							</div>
						</div>
						<div class="div-info-line">
							<p class="font-main">요일</p>
							<div class="div-input-info">
								<label for="monday">월요일</label>
								<input 
									type="checkbox" id="monday" name="dow" class="checkbox-input input-day"
									value="mon" class="font-main" <c:if test="${course.existMonday()}"> checked </c:if> > 
								<label for="tuesday">화요일</label>
								<input
									type="checkbox" id="tuesday" name="dow"
									class="checkbox-input input-day" value="tue" class="font-main" <c:if test="${course.existTuesday()}"> checked </c:if> >
								<label for="wednesday" <c:if test="${course.existWednesday()}"> checked </c:if>>수요일</label>
								<input type="checkbox"
									id="wednesday" name="dow" class="checkbox-input" value="wen">
								<label for="thursday">목요일</label>
								<input type="checkbox"
									id="thursday" name="dow" class="checkbox-input input-day"
									value="thu" class="font-main" <c:if test="${course.existThursday()}"> checked </c:if>> 
								<label for="friday">금요일</label>
								<input
									type="checkbox" id="friday" name="dow"
									class="checkbox-input input-day" value="fri" class="font-main" <c:if test="${course.existFriday()}"> checked </c:if> >
								<label for="saturday">토요일</label>
								<input type="checkbox"
									id="saturday" name="dow" class="checkbox-input input-day"
									value="sat" class="font-main" <c:if test="${course.existSaturday()}"> checked </c:if> > 
								<label for="sunday">일요일</label>
								<input
									type="checkbox" id="sunday" name="dow"
									class="checkbox-input input-day" value="sun" class="font-main" <c:if test="${course.existSunday()}"> checked </c:if> >
							</div>
						</div>
						<div class="div-info-line">
							<p class="font-main">모집 인원</p>
							<div class="div-input-info">
								<input type="number" name="recruitmentNumber" class="input-in"
									value="${course.courseRecruitCount}" required>
							</div>
						</div>
					</div>
				</div>
				<div class="div-create-course">
					<div class="div-button-line">
						<button class="button-ok" type="submit">수정 요청</button>
						<a
							href="/course/courseDetailOk.co?courseNumber=${course.courseNumber}"><button
								class="button-cancel" type="button">취소</button></a>
					</div>
				</div>
			</form>
		</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
</html>