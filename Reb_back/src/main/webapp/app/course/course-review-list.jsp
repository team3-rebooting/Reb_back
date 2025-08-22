<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/course/course-review-list.css">

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

<body>
<jsp:include page="/header.jsp" />
  <main>
    <div id="main-container">
      <p class="pagetitle">수업 후기 게시판</p>
      <div class="div-review-list">
        <div class="div-review-title">
          <p class="font-main review-title-title">제목</p>
          <p class="font-main review-author">작성자</p>
          <p class="font-main review-date">작성일</p>
          <p class="font-main review-like">좋아요</p>
        </div>
        <ul class="ul-review-list">
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
          </li>
          <li class="li-review-content">
            <a href="./course-review-detail.html">
              <div class="div-review-content">
                <p class="review-title">웹 보안 수업 후기</p>
                <p class="review-author">홍길동</p>
                <p class="review-date">2025.08.02</p>
                <p class="review-like">32</p>
              </div>
            </a>
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
              <button type="button" class="button-write"><a href="./course-review-write.html" class="a-write">글 쓰기</a></button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </main>
  <div id="footer">
  </div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>