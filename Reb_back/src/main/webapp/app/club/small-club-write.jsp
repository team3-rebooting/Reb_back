<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/club/small-club-write.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css">

  <script defer src="${pageContext.request.contextPath}/assets/js/club/small-club-write.js"></script>
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
      <p class="pagetitle">소모임 작성</p>
      <form action="${pageContext.request.contextPath}/club/smallClubWriteOk.cl" method="post" enctype="multipart/form-data">
        <div class="div-create-smallClub">
          <input type="text" class="input-title input-bundle" name="smallClubTitle" placeholder="제목을 입력해주세요" required>
        </div>
        <div class="div-create-small-club">
          <span class="font-main little-title">대표 이미지 : </span>
          <input type="file" name="smallClubFile" class="input-bundle" required>
        </div>
        <div class="div-create-small-club">
          <p class="font-main little-title">내용</p>
          <textarea class="textarea-text input-bundle" name="smallClubContent" rows="20" cols="100" required></textarea>
        </div>
		<div class="div-create-small-club">
          <p class="font-main little-title">모집 관련 정보</p>
          <div class="div-recruit-info">
            <div class="div-info-line">
              <p class="font-main">모임일</p>
              <div class="div-input-info">
                <input type="date" name="smallClubStartDate" class="font-main" required>
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">시간</p>
              <div class="div-input-info">
                <input type="time" name="smallClubStartTime" class="input-in font-main" required>
                <input type="time" name="smallClubEndTime" class="input-in font-main" required>
              </div>
            </div>
            <div class="div-info-line">
              <p class="font-main">모집 인원</p>
              <div class="div-input-info">
                <input type="number" name="recruitmentNumber" required>
              </div>
            </div>
          </div>
        </div>
        <div class="div-create-small-club">
          <div class="div-button-line">
            <button class="button-ok" type="submit">확인</button>
            <a href="${pageContext.request.contextPath}/app/club/small-club-list.jsp"><button class="button-cancel" type="button">취소</button></a>
          </div>
        </div>
      </form>
    </div>
  </main>
	<jsp:include page="/footer.jsp" />
	<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</body>
</html>