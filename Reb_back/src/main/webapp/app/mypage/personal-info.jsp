<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../assets/css/mypage/personal-info.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/sidemenu.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/mypage-modal.css">
  <link rel="stylesheet" href="./../../assets/css/mypage/expert-file-upload.css">

  <link rel="stylesheet" href="./../../assets/css/header-login.css">
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

  <script defer src="./../../assets/js/mypage/personal-info.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <div id="header">
  </div>
  <main>
    <!-- 모달 -->
    <div class="mypage-modal">
    </div>
    <!-- 사이드 메뉴 -->
    <aside id="mypage-sidemenu-container">
    </aside>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <div class="pagetitle">개인정보 조회</div>
      <form action="" method="post">
        <!-- 개인정보 조회 -->
        <div id="personal-info-container">
          <!-- ID -->
          <div class="personal-info-list">
            <div class="personal-info-type">ID</div>
            <div class="personal-info-data">boradori</div>
          </div>
          <!-- 이름 -->
          <div class="personal-info-list">
            <div class="personal-info-type">이름</div>
            <div class="personal-info-data">전보라</div>
          </div>
          <!-- 닉네임 -->
          <div class="personal-info-list">
            <div class="personal-info-type">닉네임</div>
            <div class="personal-info-data">보라도리짱</div>
          </div>
          <!-- 생년월일 -->
          <div class="personal-info-list">
            <div class="personal-info-type">생년월일</div>
            <div class="personal-info-data">1995.01.21</div>
          </div>
          <!-- 성별 -->
          <div class="personal-info-list">
            <div class="personal-info-type">성별</div>
            <div class="personal-info-data">여</div>
          </div>
          <!-- 주소 -->
          <div class="personal-info-list">
            <div class="personal-info-type">주소</div>
            <div class="personal-info-data">서울시 송파구 잠실동</div>
            <div id="personal-info-data-postcode">00000</div>
          </div>
          <!-- 이메일 -->
          <div class="personal-info-list">
            <div class="personal-info-type">이메일</div>
            <div class="personal-info-data">boradori@naver.com</div>
          </div>
          <!-- 전화번호 -->
          <div class="personal-info-list">
            <div class="personal-info-type">전화번호</div>
            <div class="personal-info-data">010-1234-5678</div>
          </div>
          <!-- 전문가 인증 -->
          <div class="personal-info-list">
            <div class="personal-info-type">전문가 인증</div>
            <!-- 전문가 인증 상태 -->
            <div class="personal-info-data" id="personal-info-expert-status">반려</div>
          </div>
          <!-- 프로필 사진 -->
          <div class="personal-info-list">
            <div class="personal-info-type">프로필 사진</div>
            <div class="personal-info-data">
              <div id="profile-picture"><img src="../../assets/img/profilePicture/dog.jpg" alt="프로필"></div>
            </div>
          </div>
        </div>
        <!-- 버튼 -->
        <div id="form-bottom-button">
          <button type="button" name="personalInfoEdit" id="button-edit-user">수정</button>
          <button type="button" name="personalInfoDel" id="button-del-user">회원 탈퇴</button>
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
  <script src="./../../assets/js/header-login.js"></script>
  <script src="./../../assets/js/footer.js"></script>
</body>

</html>