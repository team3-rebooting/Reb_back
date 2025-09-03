<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/routine/admin-routine-detail.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
  <title>루틴 모임 디테일</title>
</head>
<script defer src="${pageContext.request.contextPath}/assets/js/admin/routine/admin-routine-detail.js"></script>

<body>
  <header>
    <a href="${pageContext.request.contextPath}/admin/routineListOk.ad?page=1">
      <img src="${pageContext.request.contextPath}/assets/img/team_logo.png" alt="대표 사진">
    </a>
  </header>
  <main>
    <div id="main-container">
      <div class="routine-detail-container">
        <div id="detail-container-list">
          <p class="pagetitle">
          	<c:out value="${routine.routineTitle}" />
          </p>
          <div class="back-list">
            목록
          </div>
        </div>
          <p class="p-host">이번 모임은 <span class="span-host-name">	<c:out value="${routine.routineLeaderName}"/></span> 모임장과 함께합니다</p>
        <div class="div-detail-area">
          <div class="div-img">
           <c:forEach var="routineFile" items="${routine.fileRoutineList}">
            <img src="${pageContext.request.contextPath}/upload/${routineFile.getFileSystemName()}" class="img-detail" alt="루틴 모임 대표 사진">           
           </c:forEach>
          </div>
          <div class="div-write-date">
            <p class="p-write-date">작성일 : <c:out value="${routine.routineCreatedDate}"/></p>
          </div>

          <div class="div-expert-detail">
            <p class="p-expert-info-title">내용</p>
            <div class="div-expert-info-detail">
               <pre class="p-expert-detail-comment"><c:out value="${routine.routineContent}"/></pre>
            </div>
          </div>
          <div class="div-expert-detail">
            <p class="p-expert-info-title">모이는 장소</p>
            <div class="div-expert-info-detail">
             	<c:out value="${routine.routineLocation }"/>
            </div>
          </div>
          <div class="div-expert-detail">
            <p class="p-expert-info-title">모집 정보</p>
            <div class="div-expert-info-detail">
              <p>모집 기간 : <c:out value="${routine.routineRecruitStartDate}"/> ~ <c:out value="${routine.routineRecruitEndDate}"/></p>
              <p>모임 기간 : <c:out value="${routine.routineStartDate}"/> ~ <c:out value="${routine.routineEndDate}"/></p>
              <p>시간 : <c:out value="${routine.routineStartTime}"/> ~ <c:out value="${routine.routineEndTime}"/> [<c:out value="${routine.routineDayOfWeek}"/>]</p>
              <p>모집 인원 : <c:out value="${routine.routineCount}"/>/<c:out value="${routine.routineRecruitCount}"/> 명</p>

            </div>
          </div>
          <div class="div-expert-detail-button">
          	<c:if test="${routine.adminNumber == sessionScope.adminNumber}">
            <button class="button-update" type="button"
            data-routine-number="${routine.routineNumber}"
			data-admin-number="${sessionScope.adminNumber}">수정</button>
            <button class="button-delete" type="button"
            data-routine-number="${routine.routineNumber}"
			data-admin-number="${sessionScope.adminNumber}">삭제</button>          	
          	</c:if>
          </div>
        </div>
      </div>
    </div>
  </main>
  <footer>

  </footer>
</body>

</html>