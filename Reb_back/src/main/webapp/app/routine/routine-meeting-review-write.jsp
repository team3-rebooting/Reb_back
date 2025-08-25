<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/routine/routine-meeting-review-write.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css">

  <script defer src="${pageContext.request.contextPath}/assets/js/routine/routine-meeting-review-write.js"></script>
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
      <p class="pagetitle">루틴 모임 후기 작성</p>
      <form action="/routine/routineReviewWriteOk.ro" method="post" enctype="multipart/form-data">
        <div class="div-create-course">
          <input type="text" class="input-title input-bundle" name="routineReviewTitle" placeholder="제목을 입력해주세요" required>
        </div>
        <div class="div-create-course">
          <span class="font-main little-title">대표 이미지 : </span>
          <input type="file" name="fileRoutineReview" class="input-bundle" required>
        </div>
        <div class="div-create-course">
          <p class="font-main little-title">내용</p>
          <textarea class="textarea-text input-bundle" name="routineReviewContent" rows="20" cols="100" required></textarea>
        </div>
		<input type="hidden" name="routineNumber" value="${routineNumber}">
		
        <div class="div-create-course">
          <div class="div-button-line">
            <button class="button-ok">확인</button>
            <button class="button-cancel" type="button" onclick="cancel()">취소</button>
          </div>
        </div>
      </form>
    </div>
  </main>
  <div id="footer">
  </div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</html>