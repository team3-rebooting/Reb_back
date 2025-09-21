<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin/routine/admin-routine-edit.css">
<script defer
	src="${pageContext.request.contextPath}/assets/js/admin/routine/admin-routine-edit.js"></script>
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
<script type="text/javascript"
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<title>루틴 모임 수정</title>
</head>

<body>
	<!-- 헤더 -->
	<header>
		<!-- 목록 이동 경로 -->
		<a href="${pageContext.request.contextPath}/admin/routineListOk.ad">
			<!-- 사이트 로고 --> <img
			src="${pageContext.request.contextPath}/assets/img/team_logo.png"
			alt="사이트 로고">
		</a>
	</header>
	<!-- 메인 -->
	<main>
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<p class="pagetitle">루틴 모임 수정</p>
			<!-- 내용 입력 영역 -->
			<form
				action="${pageContext.request.contextPath}/admin/routineUpdateOk.ad"
				method="post" enctype="multipart/form-data">
				<input type="hidden" name="routineNumber"
					value="${routine.getRoutineNumber()}">
				<!-- 제목 입력 영역 -->
				<div class="div-create-routine">
					<input type="text" class="input-title" name="routineTitle"
						placeholder="제목을 입력해주세요" class="input-in"
						value="${routine.getRoutineTitle()}">
				</div>
				<!-- 이미지 파일 입력 영역 -->
				<div class="div-create-routine">
					<span class="font-main little-title">대표 이미지 : </span> <input
						type="file" name="routineFile" class="input-in">
				</div>
				<!-- 내용 입력 영역 -->
				<div class="div-create-routine">
					<p class="font-main little-title">내용</p>
					<textarea class="textarea-text" name="routineContent" rows="20"
						cols="130" class="input-in">${routine.getRoutineContent()}</textarea>
				</div>
				<!-- 지도 입력 영역 -->
				<div class="div-create-routine">
					<p class="font-main little-title">장소</p>
					기본주소 <input class="input-in input-address-basic" type="text"
						name="routineLocation" value="${routine.getRoutineLocation()}"
						readonly>
					<button class="button-find" type="button">찾기</button>
					<br> 추가주소 <input class="input-in" type="text"
						name="routineLocationAdd"
						value="${routine.getRoutineLocationAdd()}">
				</div>
				<!-- 모집 관련 정보 영역 -->
				<div class="div-create-routine">
					<p class="font-main little-title">모집 관련 정보</p>
					<div class="div-recruit-info">
						<div class="div-info-line">
							<p class="font-main">모집 기간</p>
							<!-- 모집기간 입력 영역 -->
							<div class="div-input-info">
								<input type="date" name="routineRecruitStartDate"
									id="start-date" class="input-in"
									value="${routine.getRoutineRecruitStartDate()}"> <input
									type="date" name="routineRecruitEndDate" id="end-date"
									class="input-in" value="${routine.getRoutineRecruitEndDate()}">
							</div>
						</div>
						<div class="div-info-line">
							<p class="font-main">모임 날짜</p>
							<!-- 모임 날짜 입력 영역 -->
							<div class="div-input-info">
								<input type="date" name="routineStartDate"
									id="routine-start-date" class="input-in" readonly="readonly"
									value="${routine.getRoutineStartDate()}"> <input
									type="date" name="routineEndDate" id="routine-end-date"
									class="input-in" readonly="readonly"
									value="${routine.getRoutineEndDate()}">
							</div>
						</div>
						<div class="div-info-line">
							<p class="font-main">시간</p>
							<!-- 모임 시간 입력 영역 -->
							<div class="div-input-info">
								<input type="time" name="routineStartTime" id="start-time"
									class="input-in" readonly="readonly"
									value="${routine.getRoutineStartTime()}"> <input
									type="time" name="routineEndTime" id="end-time"
									class="input-in" readonly="readonly"
									value="${routine.getRoutineEndTime()}">
							</div>
						</div>
						<!-- 요일 선택 영역 -->
						<div class="div-info-line">
							<p class="font-main">요일</p>
							<div class="div-input-info">
								<label for="monday">월요일</label><input type="checkbox"
									id="monday" name="days" class="checkbox-input" value="mon"
									<c:if test="${not empty days['월'] }">checked</c:if>> <label
									for="tuesday">화요일</label><input type="checkbox" id="tuesday"
									name="days" class="checkbox-input" value="tue"
									<c:if test="${not empty days['화'] }">checked</c:if>> <label
									for="wednesday">수요일</label><input type="checkbox"
									id="wednesday" name="days" class="checkbox-input" value="wed"
									<c:if test="${not empty days['수'] }">checked</c:if>> <label
									for="thursday">목요일</label><input type="checkbox" id="thursday"
									name="days" class="checkbox-input" value="thu"
									<c:if test="${not empty days['목'] }">checked</c:if>> <label
									for="friday">금요일</label><input type="checkbox" id="friday"
									name="days" class="checkbox-input" value="fri"
									<c:if test="${not empty days['금'] }">checked</c:if>> <label
									for="saturday">토요일</label><input type="checkbox" id="saturday"
									name="days" class="checkbox-input" value="sat"
									<c:if test="${not empty days['토'] }">checked</c:if>> <label
									for="sunday">일요일</label><input type="checkbox" id="sunday"
									name="days" class="checkbox-input" value="sun"
									<c:if test="${not empty days['일'] }">checked</c:if>>
							</div>
						</div>
						<div class="div-info-line">
							<p class="font-main">모집 인원</p>
							<!-- 모집 인원 입력 영역 -->
							<div class="div-input-info">
								<input type="number" name="routineRecruitCount" class="input-in"
									value="${routine.getRoutineRecruitCount()}">
							</div>
						</div>
						<div class="div-info-line">
							<p class="font-main">모임장</p>
							<!-- 모집 인원 입력 영역 -->
							<div class="div-input-info">
								<select name="routineLeaderNumber" class="select-leader">
									<c:forEach var="leader" items="${leader}">
										<option value="${leader.routineLeaderNumber}"><c:out
												value="${leader.routineLeaderName}" /></option>
									</c:forEach>
								</select>
							</div>
						</div>

					</div>
				</div>
				<!-- 버튼 배치 영역 -->
				<div class="div-create-routine">
					<div class="div-button-line">
						<!-- 수정 버튼 -->
						<button class="button-ok" type="submit"
							data-routine-number="${routine.routineNumber}">수정</button>
						<!-- 취소 버튼 -->
						<button class="button-cancel" type="button"
							data-routine-number="${routine.routineNumber}">취소</button>
					</div>
				</div>
			</form>
		</div>
	</main>
	<footer></footer>
</body>

</html>