<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/review/admin-routine-review-detail.css">
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
<script defer src="${pageContext.request.contextPath}/assets/js/admin/review/admin-routine-review-detail.js"></script>

<body>
  <!-- 헤더 -->
  <header>
    <!-- 목록 이동 -->
    <a href="${pageContext.request.contextPath}/admin/routineReviewListOk.ad">
      <!-- 사이트 로고 -->
      <img src="${pageContext.request.contextPath}/assets/img/team_logo.png" alt="사이트 로고">
    </a>
  </header>
  <main>
    <!-- 메인 -->
    <div id="main-container">
      <!-- 디테일 컨테이너 -->
      <div class="detail-container">
        <!-- 페이지 제목 -->
        <div id="detail-container-list">
          <p class="pagetitle">
          	<c:out value="${review.routineReviewTitle}" />
          </p>
          <!-- 목록 이동 버튼 -->
          <div class="back-list">
            목록
          </div>
        </div>
        <!-- 개인 정보 영역 -->
        <div class="div-user-integration">
          <!-- 프로필 -->
          <div class="div-user-profile">
          <c:forEach var="profile" items="${review.fileMemberProfileList}">
          <img src="${pageContext.request.contextPath}/upload/${profile.getFileSystemName()}" class="img-user-profile">
          </c:forEach>
          </div>          
          <!-- 세부 개인 정보 -->
          <div class="div-user-info">
            <!-- 닉네임 -->
            <p class="p-user-name">
            		<c:out value="${review.memberNickname}" />
            </p>
            <!-- 작성날짜 -->
            <c:choose>
            	<c:when test="${review.routineReviewCreatedDate == review.routineReviewUpdatedDate}">
		            <p class="p-update-date"><c:out value="${review.routineReviewCreatedDate}"/></p>
            	</c:when>
            	<c:otherwise>
            		<p class="p-update-date"><c:out value="${review.routineReviewUpdatedDate}"/><span class="p-update-status">(수정됨)</span></p>
            	</c:otherwise>
            </c:choose>
          </div>
          <!-- 내용 영역 -->
          <div class="div-detail-area">
            <!-- 이미지 영역 -->
            <div class="div-img">
            	<c:forEach var="reviewFile" items="${review.fileRoutineReviewList}">
              		<img src="${pageContext.request.contextPath}/upload/${reviewFile.getFileSystemName()}" class="img-detail">
            	</c:forEach>
            </div>
            <!-- 내용 글 영역 -->
            <div class="div-admin-detail">
              <div class="div-admin-info-detail">
                <p class="p-admin-detail-comment">
                  <c:out value="${review.routineReviewContent}" />
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
                <img src="${pageContext.request.contextPath}/assets/img/karina.jpg" alt="">
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
                <img src="${pageContext.request.contextPath}/assets/img/karina.jpg" alt="">
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