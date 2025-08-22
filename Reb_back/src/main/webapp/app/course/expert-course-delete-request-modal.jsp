<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/course/expert-course-delete-request-modal.css">

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
  <title>틈새빛</title>
</head>
<script defer src="${pageContext.request.contextPath}/assets/js/course/expert-course-delete-request-modal.js"></script>

<body>
<jsp:include page="/header.jsp" />
  <div class="modal-background">
    <div class="cancel-modal">
      <form action="" method="get">
        <div class="div-modal-x"><button class="button-x" type="button">X</button></div>
        <div class="div-modal-head">
          <span class="span-delete-title">삭제 요청 이유</span>
        </div>
        <div class="div-modal-main">
          <textarea class="textarea-delete-modal">dd</textarea>
        </div>
        <div class="div-modal-button-area">
          <button class="button-modal-delete" type="button">삭제 요청</button>
        </div>
      </form>
    </div>
  </div>
  <main>
    <div id="main-container">
      <div class="course-detail-container">
        <p class="pagetitle">틈새빛에 오신 여러분 환영합니다</p>
        <div class="div-detail-area">
          <div class="div-img">
            <img src="${pageContext.request.contextPath}/assets/img/karina.jpg" class="img-detail">
          </div>
          <div class="div-write-date">
            <p class="p-write-date">작성일 : 2025.08.03(일)</p>
          </div>
          <div class="div-expert-detail">
            <p class="p-expert-info-title">전문가 정보</p>
            <div class="div-expert-info-detail">
              <p class="p-expert-name">성함 : 카리나 전문가님</p>
              <p class="p-expert-qualifi">보유 자격증 : 정보처리기사, SQLD, 네트워크관리사 1급</p>
              <p class="p-expert-field">주요 분야 : IT</p>
            </div>
          </div>
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
          <div class="div-expert-detail">
            <p class="p-expert-info-title">오시는 길</p>
            <div class="div-expert-info-detail">
              <h1>지도 api 자리</h1>
            </div>
          </div>
          <div class="div-expert-detail">
            <p class="p-expert-info-title">모집 정보</p>
            <div class="div-expert-info-detail">
              <p>모집 기간 : 2025.08.03 ~ 2025.08.27</p>
              <p>강의일 : 2025.08.28 ~ 2025.09.03 09:00 ~ 13 : 00 [월,화,수]</p>
              <p>모집 인원 : 15/30 명</p>
              <p>가격 : 24,000 원</p>
            </div>
          </div>
          <div class="div-expert-detail-button">
            <button class="button-application" type="button">신청하기</button>
            <button class="button-cancel" type="button">취소</button>
          </div>
          <div class="div-expert-edit-button">
            <button class="button-edit" type="button">수정 요청하기</button>
            <button class="button-delete" type="button">삭제 요청하기</button>
          </div>
        </div>
      </div>
    </div>
  </main>
  <div id="footer">
  </div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</html>