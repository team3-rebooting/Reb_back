<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/routine/routine-meeting-review-comment-write.css">

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
      <ul class="ul-comment-list">
        <li class="li-comment">
          <div class="div-user-profile"><img src="./../../assets/img/karina.jpg" class="img-user-profile"></div>
          <div class="div-user-info">
            <div class="div-user-name-area">
              <p class="p-user-name">곰융</p><span class="span-comment-edit">수정</span>
            </div>
            <div class="div-user-text-area">
              <p class="p-comment-text">저도 한번 배워보고싶네요asddddddddddd</p><span class="span-comment-delete">삭제</span>
            </div>
            <p class="p-update-date">2025.07.02<span class="p-update-status">(수정됨)</span></p>
          </div>
        </li>
        <li class="li-comment">
          <div class="div-user-profile"><img src="./../../assets/img/karina.jpg" class="img-user-profile"></div>
          <div class="div-user-info">
            <p class="p-user-name">곰융</p>
            <p class="p-comment-text">저도 한번 배워보고싶네요</p>
            <p class="p-update-date">2025.07.02<span class="p-update-status">(수정됨)</span></p>
          </div>
        </li>
      </ul>
      <div class="div-comment-write">
        <form action="" method="get"></form>
        <input type="text" placeholder="댓글을 입력해주세요" name="comment" class="input-comment">
        <button class="button-write" type="button">등록</button>
      </div>
    </div>
  </main>
  <div id="footer">
  </div>
</body>
<script src="./../../assets/js/footer.js"></script>
</html>