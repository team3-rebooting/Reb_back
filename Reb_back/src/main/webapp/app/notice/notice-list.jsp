<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="./../../assets/css/notice/notice-list.css" />

  <link rel="stylesheet" href="./../../assets/css/header-login.css">
  <link rel="stylesheet" href="./../../assets/css/footer.css">

  <script defer src="./../../assets/js/notice/notice-list.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet" />
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
  <title>공지사항 리스트</title>
</head>

<body>
  <jsp:include page="/header.jsp" />
  <main>
    <div id="main-container">
      <!-- 공지사항 -->
      <div class="notice-container">

        <p class="pagetitle">공지사항</p>

        <div class="notice-board-box-container">
          <p class="notice-board-box-title font-main">제목</p>
          <p class="notice-board-box-writer font-main">작성자</p>
          <p class="notice-board-box-day font-main">작성날짜</p>
        </div>
        <ul id="notice-list">
          <!-- 필독 1 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="notice-must-read-emphasize-container">
                <p class="notice-must-read-emphasize-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-must-read-emphasize-writer font-main">관리자</p>
                <p class="notice-must-read-emphasize-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 필독 2-->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="notice-must-read-emphasize-container">
                <p class="notice-must-read-emphasize-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-must-read-emphasize-writer font-main">관리자</p>
                <p class="notice-must-read-emphasize-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 일반 공지 -->

          <!-- 공지1 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 공지2 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 공지3 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 공지4 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 공지5 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 공지6 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 공지7 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>

          <!-- 공지8 -->
          <li class="notice-item">
            <a href="./../../app/notice/notice-detail.html">
              <div class="class-notice-list-container">
                <p class="notice-list-title font-main">사용자 편의성 UI 수정 사항</p>
                <p class="notice-list-writer font-main">관리자</p>
                <p class="notice-list-day font-main">2025.07.02</p>
              </div>
            </a>
          </li>
        </ul>
        <!-- 공지 끝 -->

        <div class="div-page">
          <div class="div-pagenation">
            <a href="#">&lt;</a>
            <a href="#">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">&gt;</a>
          </div>
        </div>
        <div class="div-find">
          <form action="" method="get">
            <div class="div-find-form">
              <div class="find-container">
                <select class="select-find">
                  <option value="title">제목</option>
                  <option value="name">작성자명</option>
                </select>
                <div class="input-group">
                  <input class="input-find" type="text" />
                  <button type="button" class="button-find">
                    <i class="fa-solid fa-magnifying-glass"></i>
                  </button>
                </div>
              </div>
            </div>
          </form>
        </div>
      </div>
  </main>
  <div id="footer"></div>
</body>
<script src="./../../assets/js/footer.js"></script>
</html>