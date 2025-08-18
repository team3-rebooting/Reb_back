<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link rel="stylesheet" href="./../../../assets/css/admin/notice/admin-notice-detail.css" />

  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet" />
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet" />
  <script defer src="./../../../assets/js/admin/notice/admin-notice-detail.js"></script>
  <title>공지사항 상세페이지</title>
</head>

<body>
  <header>
    <a href="./../../../app/admin/notice/admin-notice-list.html">
      <img src="./../../../assets/img/team_logo.png" alt="">
    </a>
  </header>
  <main>
    <div id="main-container">

      <!-- 게시글상세 -->
      <div class="notice-detail-containter">
        <div id="detail-container-list">
          <!-- <div class="notice-detail-title-text-containter"> -->
          <div class="pagetitle font-main">
            사용자 편의성 UI 수정 사항
            <!-- 목록 이동 버튼 -->
          </div>
          <!-- </div> -->
          <div class="back-list">
            목록
          </div>
        </div>
        <div class="notice-detail-admin-image-containter">
          <div class="logo">
            <img src="./../../../assets/img/team_logo.png" class="logo-image" alt="로고" />
          </div>
          <div class="notice-detail-admin-containter">
            <div class="board-box-writer font-main">곰융</div>
            <div class="board-box-day font-main">2025.07.02</div>
          </div>
        </div>

        <div class="notice-detail-text-content-containter">
          <div class="notice-detail-text font-main">
            로그인 성공 후 마이페이지 진입 시 보여지는 페이지 내 배치를
            변경하였습니다. <br /><br />기존에 사용되어져왔던 배치는 내
            게시글과 내 댓글의 위치가 모호하여 사용자들이 이용하기에
            불편함이 있다고 생각되었습니다.<br />
            이런 불편함을 감소해드리고자 배치를 변경하게 되었습니다.<br /><br />
            항상 저희 사이트를 이용해주셔서 감사합니다. 오늘 하루도 행복한
            하루 되시길 바라겠습니다.
          </div>
        </div>
        <section id="attachment-section">
          <p class="attachment-title font-main">첨부파일</p>
          <ul id="attachment-list" class="font-main">
            <!-- 파일 1 -->
            <li class="attachment-item">
              <!-- 파일명 링크(밑줄) -->
              <a class="attachment-name" href="./../../../assets/img/karina.jpg" download="첨부파일">
                UI_수정사항.pdf
              </a>
            </li>
          </ul>
        </section>
        <div id="main-btn-div">
          <!-- 작성 버튼 -->
          <button class="main-btn">수정</button>
          <!-- 취소 버튼 -->
          <button class="main-btn">삭제</button>
        </div>
      </div>

    </div>
  </main>
  <footer>

  </footer>
</body>

</html>