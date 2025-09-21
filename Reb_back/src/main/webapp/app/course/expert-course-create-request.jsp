<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="/assets/css/course/expert-course-create-request.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css">

  <script defer src="${pageContext.request.contextPath}/assets/js/course/expert-course-create-request.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
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
      <p class="pagetitle">수업 개설 요청</p>
      <form action="/course/expertCourseCreateRequestOk.co" method="post" enctype="multipart/form-data">
        <div class="div-create-course">
          <input type="text" class="input-title" name="courseTitle" placeholder="제목을 입력해주세요" required>
        </div>
        <div class="div-create-course">
          <span class="font-main little-title">대표 이미지 : </span>
          <input type="file" class="font-main input-file" name="courseFile" accept="image/*" required>
        </div>
        <div class="div-create-course">
          <p class="font-main little-title">내용</p>
          <textarea class="textarea-text font-main" class="input-content" name="courseText" rows="20" cols="130" required></textarea>
        </div>
        <div class="div-create-course">
          <p class="font-main little-title">모집 관련 정보</p>
          <div class="div-recruit-info">
            <div class="div-info-line">
              <p class="font-main">강의일</p>
              <div class="div-input-info">
                <input type="date" name="courseStartDate" class="font-main" required>
                <input type="date" name="courseEndDate" class="font-main" required>
              </div>
              <p class="p-warning">강의일이 모집기간보다 빠를 수 없습니다</p>
            </div>
            <div class="div-info-line">
              <p class="font-main">시간</p>
              <div class="div-input-info">
                <input type="time" name="courseStartTime" class="input-in font-main" required>
                <input type="time" name="courseEndTime" class="input-in font-main" required>
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">요일</p>
              <div class="div-input-info">
                <label for="monday">월요일</label><input type="checkbox" id="monday" name="dow" class="checkbox-input input-day" value="mon" class="font-main">
                <label for="tuesday">화요일</label><input type="checkbox" id="tuesday" name="dow" class="checkbox-input input-day" value="tue" class="font-main">
                <label for="wednesday">수요일</label><input type="checkbox" id="wednesday" name="dow"
                  class="checkbox-input" value="wed">
                <label for="thursday">목요일</label><input type="checkbox" id="thursday" name="dow" class="checkbox-input input-day" value="thu" class="font-main">
                <label for="friday">금요일</label><input type="checkbox" id="friday" name="dow" class="checkbox-input input-day" value="fri" class="font-main">
                <label for="saturday">토요일</label><input type="checkbox" id="saturday" name="dow" class="checkbox-input input-day" value="sat" class="font-main"> 
                <label for="sunday">일요일</label><input type="checkbox" id="sunday" name="dow" class="checkbox-input input-day" value="sun" class="font-main">
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">모집 인원</p>
              <div class="div-input-info">
                <input type="number" name="recruitmentNumber" required>
              </div>
            </div>
            <!-- <div class="div-info-line">
              <p class="font-main">가격</p>
              <div class="div-input-info">
                <input type="number" name="recruitmentPrice" required>
              </div>
            </div> -->
          </div>
        </div>
        <div class="div-create-course">
          <div class="div-button-line">
            <button class="button-ok" type="submit">확인</button>
            <button class="button-cancel" type="button">취소</button>
          </div>
        </div>
      </form>
    </div>
  </main>
  <jsp:include page="/footer.jsp" />
</body>
</html>