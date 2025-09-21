<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/club/small-club-edit.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/footer.css">

  <script defer src="${pageContext.request.contextPath}/assets/js/club/small-club-edit.js"></script>
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
  <!-- 헤더 영역 -->
<jsp:include page="/header.jsp" />
  <!-- 메인 영역 -->
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 제목 -->
      <p class="pagetitle">소모임 수정</p>
      <!-- 수정 form -->
      <form action="${pageContext.request.contextPath}/club/smallClubEditOk.cl" method="post" enctype="multipart/form-data">
      	<input type="hidden" name="smallClubNumber" value="${smallClub.smallClubNumber}" />
        <!-- 제목 입력 input -->
        <div class="div-create-small-club">
          <input type="text" class="input-title input-bundle" name="smallClubTitle" placeholder="제목을 입력해주세요" value="${smallClub.getSmallClubTitle() }" required />
        </div>
        <!-- 대표 이미지 input -->
        <div class="div-create-small-club">
          <span class="font-main little-title">대표 이미지 : </span>
          <input type="file" name="smallClubFile" class="input-bundle" id="file">
          <span class="font-main" id="original-file">기존 파일 : <c:out value="${smallClub.getFileSmallClubList().get(0).getFileOriginalName()}"/></span>
        </div>
        <!-- 리뷰 작성 textarea -->
        <div class="div-create-small-club">
          <p class="font-main little-title">내용</p>
          <textarea class="textarea-text input-bundle" name="smallClubContent" rows="20" cols="100" required><c:out value="${smallClub.getSmallClubContent()}" /></textarea>
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
        <!-- 버튼 영역 -->
        <div class="div-create-small-club">
          <div class="div-button-line">
            <button class="button-ok" type="submit">확인</button>
            <button class="button-cancel" type="button" onclick="history.back()">취소</button>
          </div>
        </div>
      </form>
    </div>
  </main>
  <!-- 푸터 영역 -->
	<jsp:include page="/footer.jsp" />
	<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</body>
</html>