<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../../assets/css/admin/routine/admin-routine-create.css">
  <script defer src="./../../../assets/js/admin/routine/admin-routine-create.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <title>루틴 모임 개설</title>
</head>

<body>
    <!-- 헤더 -->
  <header>
    <!-- 목록 이동 경로 -->
    <a href="./admin-routine-list.html">
      <!-- 사이트 로고 -->
      <img src="./../../../assets/img/team_logo.png" alt="사이트 로고">
    </a>
  </header>
  <!-- 메인 -->
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <p class="pagetitle">루틴 모임 개설</p>
      <!-- 내용 입력 영역 -->
      <form action="" method="post">
        <!-- 제목 입력 영역 -->
        <div class="div-create-routine">
          <input type="text" class="input-title" name="routineTitle" placeholder="제목을 입력해주세요" class="input-in">
        </div>
        <!-- 이미지 파일 입력 영역 -->
        <div class="div-create-routine">
          <span class="font-main little-title">대표 이미지 : </span>
          <input type="file" name="routineFile" class="input-in">
        </div>
        <!-- 내용 입력 영역 -->
        <div class="div-create-routine">
          <p class="font-main little-title">내용(summernote 자리)</p>
          <textarea class="textarea-text" name="routineText" rows="20" cols="130" class="input-in"></textarea>
        </div>
        <!-- 지도 입력 영역 -->
        <div class="div-create-routine">
          <p class="font-main little-title">장소</p>
          <h1>지도 자리</h1>
        </div>
        <!-- 모집 관련 정보 영역 -->
        <div class="div-create-routine">
          <p class="font-main little-title">모집 관련 정보</p>
          <div class="div-recruit-info">
            <div class="div-info-line">
              <p class="font-main">모집 기간</p>
              <!-- 모집기간 입력 영역 -->
              <div class="div-input-info">
                <input type="date" name="recruitmentStartDate" id="start-date" class="input-in">
                <input type="date" name="recruitmentEndDate" id="end-date" class="input-in">
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">모임 날짜</p>
              <!-- 모임 날짜 입력 영역 -->
              <div class="div-input-info">
                <input type="date" name="routineStartDate" id="routine-start-date" class="input-in" readonly="readonly">
                <input type="date" name="routineEndDate" id="routine-end-date" class="input-in" readonly="readonly">
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">시간</p>
              <!-- 모임 시간 입력 영역 -->
              <div class="div-input-info">
                <input type="time" name="courseStartTime" id="start-time" class="input-in" readonly="readonly">
                <input type="time" name="courseEndTime" id="end-time" class="input-in" readonly="readonly">
              </div>
            </div>
            <!-- 요일 선택 영역 -->
            <div class="div-info-line">
              <p class="font-main">요일</p>
              <div class="div-input-info">
                <label for="monday">월요일</label><input type="checkbox" id="monday" name="dow" class="checkbox-input">
                <label for="tuesday">화요일</label><input type="checkbox" id="tuesday" name="dow" class="checkbox-input">
                <label for="wednesday">수요일</label><input type="checkbox" id="wednesday" name="dow"
                  class="checkbox-input">
                <label for="thursday">목요일</label><input type="checkbox" id="thursday" name="dow" class="checkbox-input">
                <label for="friday">금요일</label><input type="checkbox" id="friday" name="dow" class="checkbox-input">
                <label for="saturday">토요일</label><input type="checkbox" id="saturday" name="dow" class="checkbox-input">
                <label for="sunday">일요일</label><input type="checkbox" id="sunday" name="dow" class="checkbox-input">
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">모집 인원</p>
              <!-- 모집 인원 입력 영역 -->
              <div class="div-input-info">
                <input type="number" name="recruitmentNumber" class="input-in">
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">가격</p>
              <!-- 가격 입력 영역 -->
              <div class="div-input-info">
                <input type="number" name="recruitmentPrice" class="input-in">
              </div>
            </div>
          </div>
        </div>
        <!-- 버튼 배치 영역 -->
        <div class="div-create-routine">
          <div class="div-button-line">
            <!-- 등록 버튼 -->
            <button class="button-ok" type="button">등록</button>
            <!-- 취소 버튼 -->
            <button class="button-cancel" type="button">취소</button>
          </div>
        </div>
      </form>
    </div>
  </main>
  <footer></footer>
</body>

</html>