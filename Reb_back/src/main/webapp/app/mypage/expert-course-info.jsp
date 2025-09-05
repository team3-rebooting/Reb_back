<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/expert-course-info.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/sidemenu.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/mypage-modal.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/course-rejection-reason.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mypage/mypage-list.css">

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
  <script defer src="${pageContext.request.contextPath}/assets/js/mypage/expert-course-info.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <jsp:include page="/header.jsp" />
  <main>
    <!-- 모달 -->
    <div class="mypage-modal">
    </div>
    <!-- 사이드 메뉴 -->
    <jsp:include page="${pageContext.request.contextPath}/app/mypage/sidemenu.jsp" />
    <!-- 메인 컨테이너 -->
    <div id="main-container">
    <div id="my-course-request" class="mypage-list" data-listType="myCourseRequest">
		<jsp:include page="${pageContext.request.contextPath}/app/mypage/mypage-list.jsp" />
	</div>
    <!-- 
      <div class="pagetitle">나의 수업 개설 내역</div>
      수업 개설 내역
      <div class="expert-course-list">
        수업 속성 값
        <div class="expert-course-col-type">
          <p class="font-main expert-course-title">제목</p>
          <p class="font-main expert-course-status">진행 사항</p>
          <p class="font-main expert-course-count">인원</p>
          <p class="font-main expert-course-date">신청일자</p>
        </div>
        수업 목록
        <ul class="ul-expert-course-list">
          수업 정보 행
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title">[IT]Java의 정석1</a>
            <p class="font-main expert-course-status">개설 신청</p>
            <p class="font-main expert-course-count">0/15</p>
            <p class="font-main expert-course-date">2025.08.02</p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title">[IT]Java의 정석2</a>
            <p class="font-main expert-course-status">개설 신청</p>
            <p class="font-main expert-course-count">-/15</p>
            <p class="font-main expert-course-date">2025.08.02</p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title">[디자인]처음부터 배우는 그림 그리기 - 상</a>
            <p class="font-main expert-course-status">개설 완료</p>
            <p class="font-main expert-course-count">15/15</p>
            <p class="font-main expert-course-date">2025.08.05</p>

          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title">[디자인]처음부터 배우는 그림 그리기 - 중</a>
            <p class="font-main expert-course-status">수정 신청</p>
            <p class="font-main expert-course-count">8/15</p>
            <p class="font-main expert-course-date">2025.08.05</p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title">[디자인]처음부터 배우는 그림 그리기 - 하</a>
            <p class="font-main expert-course-status">삭제 신청</p>
            <p class="font-main expert-course-count">5/15</p>
            <p class="font-main expert-course-date">2025.08.05</p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title">[디자인]처음부터 배우는 그림 그리기 - 최종</a>
            <p class="font-main expert-course-status">신청 반려</p>
            <p class="font-main expert-course-count">-/15</p>
            <p class="font-main expert-course-date">2025.08.05</p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title"></a>
            <p class="font-main expert-course-status"></p>
            <p class="font-main expert-course-count"></p>
            <p class="font-main expert-course-date"></p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title"></a>
            <p class="font-main expert-course-status"></p>
            <p class="font-main expert-course-count"></p>
            <p class="font-main expert-course-date"></p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title"></a>
            <p class="font-main expert-course-status"></p>
            <p class="font-main expert-course-count"></p>
            <p class="font-main expert-course-date"></p>
          </li>
          <li class="li-expert-course-content">
            <a href="./../course/course-detail-expert-basic.html" class="font-main expert-course-title"></a>
            <p class="font-main expert-course-status"></p>
            <p class="font-main expert-course-count"></p>
            <p class="font-main expert-course-date"></p>
          </li>
        </ul>
      </div>
      목록 페이지 번호
      <div class="page-list">
        <div class="pagenation">
          <a href="#">&lt;</a>
          <a href="#">1</a>
          <a href="#">2</a>
          <a href="#">3</a>
          <a href="#">4</a>
          <a href="#">5</a>
          <a href="#">&gt;</a>
        </div>
      </div>
      검색 창
      <div class="search-container">
        <form action="" method="get">
          <div class="search-form">
            검색 유형
            <select class="select-search">
              <option value="title" name="seachTitle">제목</option>
              <option value="courseStatus" name="searchCourseStatus">진행사항</option>
            </select>
            검색 입력
            <input class="input-search" type="text">
            <button type="button" class="button-search" name="searchList" onclick="search(event)"><img
                src="./../../assets/img/search.jpg" alt=""></button>
          </div>
        </form>
      </div>-->
    </div> 
  </main>
  <!-- 푸터 -->
  <jsp:include page="/footer.jsp" />
  <script src="${pageContext.request.contextPath}/assets/js/mypage/sidemenu.js"></script>
  <script src="${pageContext.request.contextPath}/assets/js/mypage/mypage-modal.js"></script>
  <script src="${pageContext.request.contextPath}/assets/js/mypage/mypage-list.js"></script>
</body>

</html>