<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../../assets/css/admin/course/admin-course-request-detail.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <title>전문가 수업 요청</title>
</head>
<script defer src="./../../../assets/js/admin/course/admin-course-request-detail.js"></script>

<body>
  <!-- 헤더 -->
  <header>
    <!-- 목록으로 이동 -->
    <a href="./admin-course-request-list.html">
      <!-- 사이트 로고 -->
      <img src="./../../../assets/img/team_logo.png" alt="사이트 로고 사진">
    </a>
  </header>
  <!-- 반려 모달 뒷배경 -->
  <div id="modal-background">
    <!-- 반려 모달 영역 -->
    <div id="cancel-modal">
      <!-- 반려 모달 입력 -->
      <div id="cancel-modal-in">
        <!-- 반려 모달 제목 -->
        <p>요청 반려 사유</p>
        <!-- 반려 모달 입력 영역 -->
        <form action="" method="get" id="cancel-input">
          <!-- 반려 모달 입력 -->
          <textarea name="modal" placeholder="사유 입력" id="return-message"></textarea>
          <!-- 반려 모달 등록 버튼 -->
          <button type="button" id="submit">등록</button>
        </form>
      </div>
      <!-- 반려 모달 닫기 버튼 -->
      <button type="button" id="close-modal">X</button>
    </div>
  </div>
  <!-- 메인 -->
  <main>
    <!-- 메인 영역 -->
    <div id="main-container">
      <!-- 메인 컨테이너 영역 -->
      <div class="course-detail-container">
        <!-- 제목, 목록 이동 버튼 영역 -->
        <div id="detail-container-list">
          <!-- 제목 -->
          <p class="pagetitle">틈새빛에 오신 여러분 환영합니다</p>
          <!-- 목록 이동 버튼 -->
          <div class="back-list">
            목록
          </div>
        </div>
        <!-- 내용 영역 -->
        <div class="div-detail-area">
          <!-- 이미지 영역 -->
          <div class="div-img">
            <!-- 대표 이미지 -->
            <img src="./../../../assets/img/karina.jpg" class="img-detail">
          </div>
          <!-- 작성날짜 영역 -->
          <div class="div-write-date">
            <!-- 작성 날짜 -->
            <p class="p-write-date">작성일 : 2025.08.03(일)</p>
          </div>
          <!-- 전문가 정보 영역 -->
          <div class="div-expert-detail">
            <p class="p-expert-info-title">전문가 정보</p>
            <div class="div-expert-info-detail">
              <p class="p-expert-name">성함 : 카리나 전문가님</p>
              <p class="p-expert-qualifi">보유 자격증 : 정보처리기사, SQLD, 네트워크관리사 1급</p>
              <p class="p-expert-field">주요 분야 : IT</p>
            </div>
          </div>
          <!-- 수업 내용 설명 -->
          <div class="div-expert-detail">
            <p class="p-expert-info-title">내용</p>
            <div class="div-expert-info-detail">
              <p class="p-expert-detail-comment">
                안녕하세요 이건 어떤 강의이고
                이 강의를 들으면 당신도 이런느낌으로 이렇게 이렇게 이렇게 이렇게 이렇게 이렇게 해서
                당신도 달인이 될 수 있습니다
                이런이런내용으로
                이러이런걸 가르칠 예정입니다
              </p>
            </div>
          </div>
          <!-- 지도 영역 -->
          <div class="div-expert-detail">
            <p class="p-expert-info-title">오시는 길</p>
            <div class="div-expert-info-detail">
              <h1>지도 api 자리</h1>
            </div>
          </div>
          <!-- 모집 정보 영역 -->
          <div class="div-expert-detail">
            <p class="p-expert-info-title">모집 정보</p>
            <div class="div-expert-info-detail">
              <p>모집 기간 : 2025.08.03 ~ 2025.08.27</p>
              <p>강의일 : 2025.08.28 ~ 2025.09.03</p>
              <p>시간 : 09:00 ~ 13 : 00 [월,화,수]</p>
              <p>모집 인원 : 15/30 명</p>
              <p>가격 : 24,000 원</p>
            </div>
          </div>
          <!-- 개설 버튼 영역 -->
          <div id="div-admin-detail-button-create">
            <!-- 개설 승인 버튼 -->
            <button class="button-application" type="button">개설 승인</button>
            <!-- 개설 반려 버튼 -->
            <button class="button-cancel" type="button">개설 반려</button>
          </div>
          <!-- 수정 버튼 영역 -->
          <div id="div-admin-detail-button-update">
            <!-- 수정 승인 버튼 -->
            <button class="button-application" type="button">수정 승인</button>
            <!-- 수정 반려 버튼 -->
            <button class="button-cancel" type="button">수정 반려</button>
          </div>
          <!-- 삭제 버튼 영역 -->
          <div id="div-admin-detail-button-delete">
            <!-- 삭제 승인 버튼 -->
            <button class="button-application" type="button">삭제 승인</button>
            <!-- 삭제 반려 버튼 -->
            <button class="button-cancel" type="button">삭제 반려</button>
          </div>
          <!-- 개설 버튼만 보이게하는 버튼 -->
          <button id="choose-create">create</button>
          <!-- 숨겨져있는 버튼 보이게 하는 버튼 -->
          <button id="view-button">view</button>
        </div>
      </div>
    </div>
  </main>
  <!-- 푸터 -->
  <footer>

  </footer>

</body>

</html>