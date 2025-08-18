<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../../assets/css/admin/review/admin-routine-review-detail.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <title>루틴 모임 후기 디테일</title>
</head>
<script defer src="./../../../assets/js/admin/review/admin-routine-review-detail.js"></script>

<body>
  <!-- 헤더 -->
  <header>
    <!-- 목록 이동 -->
    <a href="./admin-routine-review-list.html">
      <!-- 사이트 로고 -->
      <img src="./../../../assets/img/team_logo.png" alt="사이트 로고">
    </a>
  </header>
  <main>
    <!-- 메인 -->
    <div id="main-container">
      <!-- 디테일 컨테이너 -->
      <div class="detail-container">
        <!-- 페이지 제목 -->
        <div id="detail-container-list">
          <p class="pagetitle">★26기 사진찍기 후기★</p>
          <!-- 목록 이동 버튼 -->
          <div class="back-list">
            목록
          </div>
        </div>
        <!-- 개인 정보 영역 -->
        <div class="div-user-integration">
          <!-- 프로필 -->
          <div class="div-user-profile"><img src="./../../../assets/img/karina.jpg" class="img-user-profile"></div>
          <!-- 세부 개인 정보 -->
          <div class="div-user-info">
            <!-- 닉네임 -->
            <p class="p-user-name">곰융</p>
            <!-- 작성날짜 -->
            <p class="p-update-date">2025.07.02<span class="p-update-status">(수정됨)</span></p>
          </div>
          <!-- 내용 영역 -->
          <div class="div-detail-area">
            <!-- 이미지 영역 -->
            <div class="div-img">
              <img src="./../../../assets/img/karina.jpg" class="img-detail">
            </div>
            <!-- 내용 글 영역 -->
            <div class="div-admin-detail">
              <div class="div-admin-info-detail">
                <p class="p-admin-detail-comment">
                  이번 모임 너무 좋았어염~~ 경치도 너무 좋구여 먹을 거리도 넌무너무 많아서 좋았어염 다음에도 이런 모임 있으면
                  다시 한번 꼭 참가했으면 좋겠어염!
                  그럼 다음에 또 글 쓰러 올게영~!
                  담에봐요 뿅!
                  죄송합니다 귀여운척 한 번 했습니다...
                </p>
              </div>
            </div>
            <!-- 버튼 영역 -->
            <div class="div-button-area">
              <!-- 삭제 버튼 -->
              <button class="button-cancel">삭제</button>
            </div>
            <!-- 댓글 영역 -->
            <div class="div-comment-area">
              <div>
                <!-- 개인 프로필 -->
                <img src="./../../../assets/img/karina.jpg" alt="">
                <!-- 닉네임, 내용, 작성날짜 -->
                <div>
                  <p class="comment-nickname">최장현12</p>
                  <p class="comment-component">와 너무너무 이뻐요</p>
                  <p class="comment-date">2025.07.02</p>
                </div>
                <!-- 댓글 삭제 버튼 -->
                <button>삭제</button>
              </div>
              <div>
                <img src="./../../../assets/img/karina.jpg" alt="">
                <div>
                  <p class="comment-nickname">최장현12</p>
                  <p class="comment-component">와 너무너무 이뻐요</p>
                  <p class="comment-date">2025.07.02</p>
                </div>
                <button>삭제</button>
              </div>
            </div>
            <div id="main-page-number">
          <p>&lt</p>
          <a href="">1</a>
          <a href="">2</a>
          <a href="">3</a>
          <a href="">4</a>
          <a href="">5</a>
          <p>&gt</p>
        </div>
          </div>
        </div>
      </div>
  </main>
  <footer>

  </footer>
</body>

</html>