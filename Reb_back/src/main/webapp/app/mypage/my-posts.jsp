<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../assets/css/mypage/my-posts.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/sidemenu.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/mypage-modal.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/mypage-list.css">

  <link rel="stylesheet" href="./../../assets/css/header-login.css">
  <link rel="stylesheet" href="./../../assets/css/footer.css">


  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">

  <script defer src="./../../assets/js/mypage/my-posts.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <div id="header">
  </div>
  <main>
    <!-- 모달 -->
    <div class="mypage-modal">
    </div>
    <!-- 사이드 메뉴 -->
    <aside id="mypage-sidemenu-container">
    </aside>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 나의 게시글 목록 -->
      <div class="mypage-list" id="my-post">

      </div>
      <!-- 나의 댓글 목록 -->
      <div class="mypage-list" id="my-comment">

      </div>
    </div>
  </main>
  <!-- 푸터 -->
  <div id="footer">
  </div>
  <script src="./../../assets/js/mypage/sidemenu.js"></script>
  <script src="./../../assets/js/mypage/mypage-list.js"></script>
  <script src="./../../assets/js/mypage/mypage-modal.js"></script>
  <script src="./../../assets/js/header-login.js"></script>
  <script src="./../../assets/js/footer.js"></script>
</body>

</html>