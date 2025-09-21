<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>모임장 등록</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/banner/admin-banner-create.css">
  <script defer src="${pageContext.request.contextPath}/assets/js/admin/leader/leader-create.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>

<body class="font-menu">
  <!-- 헤더 -->
  <header>
    <!-- 상단 목록 -->
    <p><strong>모임장 등록</strong></p>
    <!-- 로그아웃 버튼 -->
    <button>
      logout
    </button>
  </header>
  <!-- 메인 -->
  <main>
    <!-- 사이드바 리스트 영역 -->
		<jsp:include page="/adminSidebar.jsp" />
    <!-- 메인 영역 -->
    <section id="main-banner">
      <!-- 루틴모임장 만들기 -->
      <div id="main-banner-div">
        <!-- input 담은 form -->
        <form action="${pageContext.request.contextPath}/admin/leaderWriteOk.ad" method="post" >
          <!-- 배너 명 입력 -->
          <input type="text" id="main-banner-input-name" placeholder="모임장 명" name="leaderName">
          <!-- 등록, 취소 버튼 영역 -->
          <div id="main-banner-btn">
            <!-- 등록 버튼 -->
            <button type="submit">
              등록
            </button>
            <!-- 취소 버튼 -->
            <button type="button">
              취소
            </button>
          </div>
        </form>
      </div>
    </section>
  </main>
</body>

</html>