<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../assets/css/mypage/expert-status.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/sidemenu.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/mypage-modal.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/expert-file-upload.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
  <link rel="stylesheet" href="./../../assets/css/footer.css">

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">

  <script defer src="./../../assets/js/mypage/expert-status.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <jsp:include page="/header.jsp" />
  <main>
    <!-- 모달 -->
    <div class="mypage-modal">
    </div>
    <!-- 사이드 메뉴 -->
    <aside id="mypage-sidemenu-container">
    </aside>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 페이지 제목 -->
      <div class="pagetitle">전문가 인증 정보</div>
      <form action="" method="post">
        <div class="expert-status-content-box">
          <div id="expert-progress-status" class="expert-status-info">
            <div class="expert-status-title">승인 상태</div>
            <div class="expert-status-text" id="expert-progress-status-text">
              <div>
                <button class="button-modal-open" type="button" onclick="openModal('expertRejectionReason')" id="button-expert-status-rejection-reason">반려</button>
              </div>
              <div>(일자 : 2025.08.17)</div>
            </div>
          </div>
          <div id="expert-file" class="expert-status-info">
            <div class="expert-status-title">첨부 파일</div>
            <div class="expert-status-text" id="expert-file-text">
              <a  href="./../../assets/img/yujin.jpg" download="expertfile.zip" id="a-expert-status-file">expertfile.zip</a>
              <div id="expert-status-file-date">등록일자 : 2025.08.15 18:07</div>
              <div>
                <button class="button-modal-open" type="button" onclick="openModal('expertFileUpload')">변경</button>
              </div>
            </div>
          </div>
          <div id="expert-specialization" class="expert-status-info">
            <div class="expert-status-title">전문 분야</div>
            <div class="expert-status-confirm-text" id="expert-specialization">
              IT
            </div>
          </div>
          <div id="expert-personal-history" class="expert-status-info">
            <div class="expert-status-title">경력</div>
            <div class="expert-status-confirm-text" id="expert-personal-history-text">
              총 경력 : 6년 8개월<br><br>

              회사명 : 000<br>
              직무 : 개발<br>
              근무 기간 : 1년 3개월<br><br>

              회사명 : 000<br>
              직무 : 개발<br>
              근무 기간 : 5년 5개월
            </div>
          </div>
          <div id="expert-certificate" class="expert-status-info">
            <div class="expert-status-title">자격증 정보</div>
            <div class="expert-status-confirm-text" id="expert-certificate-text">
              자격증 명 : 정보처리기사<br>
              취득일 : 2025.08.15<br>
              만료일 : -<br><br>

              자격증 명 : 네트워크 관리사 2급<br>
              취득일 : 2025.08.14<br>
              만료일 : -
            </div>
          </div>

        </div>
      </form>
    </div>
  </main>
  <!-- 푸터 -->
  <div id="footer">
  </div>
  <script src="./../../assets/js/mypage/sidemenu.js"></script>
  <script src="./../../assets/js/mypage/mypage-modal.js"></script>
  <script src="./../../assets/js/mypage/expert-file-upload.js"></script>
  <script src="./../../assets/js/footer.js"></script>
</body>

</html>