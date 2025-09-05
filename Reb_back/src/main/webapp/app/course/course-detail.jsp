<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/course/course-detail.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css">

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
  <title>틈새빛</title>
</head>
<script defer src="${pageContext.request.contextPath}/assets/js/course/course-detail.js"></script>

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
        <div class="div-modal-x"><button class="button-x" type="button">X</button></div>
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
        <p class="pagetitle">틈새빛에 오신 여러분 환영합니다</p>
        <!-- 내용 전체 영역 -->
        <div class="div-detail-area">
          <!-- 이미지 영역 -->
          <div class="div-img">
            <img src="./../../assets/img/stone.jpg" class="img-detail">
          </div>
          <!-- 작성일 영역 -->
          <div class="div-write-date">
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
          <!-- 전문가가 쓴 글 영역 -->
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
          <!-- 모집정보 영역 -->
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
          <!-- 일반 사용자가 보는 버튼 영역 -->
          <div class="div-expert-detail-button">
            <button class="button-application" type="button">신청하기</button>
            <button class="button-cancel" type="button">취소</button>
          </div>
          <!-- 전문가가 자기 자신의 수업을 보는 버튼 영역 -->
          <div class="div-expert-edit-button">
            <a href="./expert-course-edit-request.html"><button class="button-edit" type="button">수정 요청하기</button></a>
            <button class="button-delete" type="button">삭제 요청하기</button>
          </div>
          <!-- 전문가가 자기 자신 수업 수정 요청 시 보여지는 버튼 영역 -->
          <div class="div-expert-edit-ing-button">
            <button class="button-edit-ing" type="button">수정 요청중</button>
          </div>
          <!-- 전문가가 자기 자신 수업 삭제 요청 시 보여지는 버튼 영역 -->
          <div class="div-expert-delete-ing-button">
            <button class="button-delete-ing" type="button">삭제 요청중</button>
          </div>
          <!-- 모집 전인 수업 시 보여지는 버튼 영역 -->
          <div class="div-expert-before-button">
            <button class="button-before" type="button">모집 전</button>
          </div>
          <!-- 모집 종료 시 보여지는 버튼 영역 -->
          <div class="div-expert-after-button">
            <button class="button-after" type="button">모집 종료</button>
          </div>
          <!-- 수업 시작 시 보여지는 버튼 영역 -->
          <div class="div-course-start-button">
            <button class="button-course-start" type="button">수업 중</button>
          </div>
          <!-- 모집 종료 시 보여지는 버튼 영역 -->
          <div class="div-course-end-button">
            <button class="button-course-end" type="button">수업 종료</button>
          </div>
        </div>
      </div>
    </div>
  </main>
  <!-- 푸터 영역 -->
  <jsp:include page="/footer.jsp" />
</body>

</html>