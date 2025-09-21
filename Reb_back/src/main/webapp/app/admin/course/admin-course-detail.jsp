<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/course/admin-course-detail.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <title>수업 디테일</title>
</head>
<script defer src="${pageContext.request.contextPath}/assets/js/admin/course/admin-course-detail.js"></script>

<body class="font-menu">
  <!-- 헤더 -->
  <header>
    <!-- 수업 목록 이동 -->
    <a href="${pageContext.request.contextPath}/admin/courseListOk.ad?page=1">
      <!-- 사이드 로고 -->
      <img src="${pageContext.request.contextPath}/assets/img/team_logo.png" alt="사이트 로고 사진">
    </a>
  </header>
  <!-- 반려 모달 뒷배경 -->
  <div id="modal-background">
    <!-- 반려 모달 영역 -->
    <div id="cancel-modal">
      <!-- 반려 모달 입력 -->
      <div id="cancel-modal-in">
        <!-- 반려 모달 제목 -->
        <p>삭제 사유</p>
        <!-- 반려 모달 입력 영역 -->
        <form action="" method="get" id="cancel-input">
          <!-- 반려 모달 입력 -->
          <textarea name="modal" placeholder="사유 입력" id="return-message"></textarea>
          <!-- 반려 모달 등록 버튼 -->
          <button type="button" id="submit">등록</button>
        </form>
      </div>
      <!-- 반려 모달 닫기 버튼 -->
      <button type="button" id="close-modal">X</button>
    </div>
  </div>
  <!-- 메인 -->
  <main>
    <!-- 메인 영역 -->
    <div id="main-container">
      <!-- 메인 컨테이너 영역 -->
      <div class="course-detail-container">
        <!-- 제목, 목록 이동 버튼 영역 -->
        <div id="detail-container-list">
          <!-- 제목 -->
          <p class="pagetitle">
          	<c:out value="${course.courseTitle}" />
          </p>
          <!-- 목록 이동 버튼 -->
          <div class="back-list">
            목록
          </div>
        </div>
        <!-- 내용 영역 -->
        <div class="div-detail-area">
          <!-- 이미지 영역 -->
          <div class="div-img">
            <!-- 대표 이미지 -->
             <c:forEach var="courseFile" items="${course.fileCourseList}">
            <img 
            src="${pageContext.request.contextPath}/upload/${courseFile.getFileSystemName()}" 
            class="img-detail">             
             </c:forEach>
          </div>
          <!-- 작성날짜 영역 -->
          <div class="div-write-date">
            <!-- 작성 날짜 -->
            <p class="p-write-date">작성일 : <c:out value="${course.coursePostDate}"/></p>
          </div>
          <!-- 전문가 정보 영역 -->
          <div class="div-expert-detail">
            <p class="p-expert-info-title">전문가 정보</p>
            <div class="div-expert-info-detail">
              <p class="p-expert-name">성함 : <c:out value="${course.memberName}"/></p>
              <p class="p-expert-qualifi">보유 자격증 : <c:out value="${course.expertLicenseInfo}"/></p>
              <p class="p-expert-qualifi">경력 : <c:out value="${course.expertCareer}"/></p>
              <p class="p-expert-field">주요 분야 : <c:out value="${course.fieldName}"/></p>
            </div>
          </div>
          <!-- 수업 내용 설명 -->
          <div class="div-expert-detail">
            <p class="p-expert-info-title">내용</p>
            <div class="div-expert-info-detail">
              <p class="p-expert-detail-comment">
               <c:out value="${course.courseContent}"/>
              </p>
            </div>
          </div>
          <!-- 모집 정보 영역 -->
          <div class="div-expert-detail">
            <p class="p-expert-info-title">모집 정보</p>
            <div class="div-expert-info-detail">
              <p>모집 기간 :<c:out value="${course.courseRecruitStartDate}"/> ~ <c:out value="${course.courseRecruitEndDate}"/></p>
              <p>강의일 : <c:out value="${course.courseStartDate}"/> ~ <c:out value="${course.courseEndDate}"/></p>
              <p>시간 : <c:out value="${course.courseStartTime}"/> ~ <c:out value="${course.courseEndTime}"/> [<c:out value="${course.courseDayOfWeek}"/>]</p>
              <p>모집 인원 : <c:out value="${course.courseCount}"/>/<c:out value="${course.courseRecruitCount}"/> 명</p>
              
            </div>
          </div>
        <%-- <div id="div-admin-detail-button-delete">
          <!-- 삭제 반려 버튼 -->
          <c:if test="${course.courseStatusInfo=='모집전'}">
          <button class="button-cancel" type="button"
          data-course-number="${course.courseNumber}">삭제</button>          
          </c:if>
        </div> --%>
      </div>
     </div>
    </div>
  </main>
  <footer></footer>

</body>

</html>