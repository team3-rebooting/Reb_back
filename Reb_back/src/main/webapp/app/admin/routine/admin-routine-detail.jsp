<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../../assets/css/admin/routine/admin-routine-detail.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <title>루틴 모임 디테일</title>
</head>
<script defer src="./../../../assets/js/admin/routine/admin-routine-detail.js"></script>

<body>
  <header>
    <a href="./admin-routine-list.html">
      <img src="./../../../assets/img/team_logo.png" alt="대표 사진">
    </a>
  </header>
  <main>
    <div id="main-container">
      <div class="routine-detail-container">
        <div id="detail-container-list">
          <p class="pagetitle">틈새빛에 오신 여러분 환영합니다</p>
          <div class="back-list">
            목록
          </div>
        </div>
        <div class="div-detail-area">
          <div class="div-img">
            <img src="./../../../assets/img/karina.jpg" class="img-detail">
          </div>
          <div class="div-write-date">
            <p class="p-write-date">작성일 : 2025.08.03(일)</p>
          </div>

          <div class="div-expert-detail">
            <p class="p-expert-info-title">내용</p>
            <div class="div-expert-info-detail">
              <p class="p-expert-detail-comment">
                안녕하세요 이번에 할 루틴 모임은 “사진찍는걸 좋아하는 사람들의 모임” 입니다
                만나서 사진을 찍을 계획이고 각자 카메라 하나씩 들고오셔야 해요~

              </p>
            </div>
          </div>
          <div class="div-expert-detail">
            <p class="p-expert-info-title">모이는 장소</p>
            <div class="div-expert-info-detail">
              <h1>지도 api 자리</h1>
            </div>
          </div>
          <div class="div-expert-detail">
            <p class="p-expert-info-title">모집 정보</p>
            <div class="div-expert-info-detail">
              <p>모집 기간 : 2025.08.03 ~ 2025.08.27</p>
              <p>모임 날짜 : 2025.08.28 ~ 2025.09.03 </p>
              <p>모임 시간 : 09:00 ~ 13 : 00 [월,화,수]</p>
              <p>모집 인원 : 15/30 명</p>

            </div>
          </div>
          <div class="div-expert-detail-button">
            <button class="button-update" type="button">수정</button>
            <button class="button-delete" type="button">삭제</button>
          </div>
        </div>
      </div>
    </div>
  </main>
  <footer>

  </footer>
</body>

</html>