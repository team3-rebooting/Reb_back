<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/routine/routine-meeting-review-list.css">

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

<body>
  <jsp:include page="/header.jsp" />
  <main>
    <div id="main-container">
      <p class="pagetitle">루틴 모음 후기 게시판</p>
      <div class="div-review-list">
        <div class="div-review-title">
          <p class="font-main review-title">제목</p>
          <p class="font-main review-like">좋아요</p>
          <p class="font-main review-author">작성자</p>
          <p class="font-main review-date">작성날짜</p>
        </div>
        <ul class="ul-review-list">
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
          <li class="li-review-content">
            <p class="review-title">웹 보안 수업 후기</p>
            <p class="review-like">32</p>
            <p class="review-author">홍길동</p>
            <p class="review-date">2025.08.02</p>
          </li>
        </ul>
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
              <select class="select-find">
                <option value="title" name="findTitle">제목</option>
                <option value="name" name="findName">작성자</option>
              </select>
              <input class="input-find" type="text">
              <button type="button" class="button-find"><i class="fa-solid fa-magnifying-glass"></i></button>
              <button type="button" class="button-write">글 쓰기</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </main>
  <div id="footer">
  </div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/header-login.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</html>