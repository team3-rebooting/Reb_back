<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>전문가 등록 페이지</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/member/admin-expert-input-info.css">
  <script defer src="./../../../assets/js/admin/member/admin-expert-input-info.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>

<body class="font-menu">
  <header>
    <!-- 목록으로 이동 -->
    <a href="./../../../app/admin/member/admin-expert-list.html">
      <!-- 사이트 로고 -->
      <img src="./../../../assets/img/team_logo.png" alt="사이트 로고">
    </a>
  </header>
  <main>
    <div id="main-div">
      <div id="main-title-div">
        <h1>전문가 정보 입력</h1>
      </div>
      <div id="main-basic-info">
        <p class="main-basic-info-title">전문가 기본정보</p>
        <div>
          <p>이름 : </p>
          <p>신짱구</p>
        </div>
        <div>
          <p>성별 : </p>
          <p>남</p>
        </div>
        <div>
          <p>전화번호 : </p>
          <p>010-1234-5678</p>
        </div>
        <div>
          <p>이메일 : </p>
          <p>admin123@abcde.com</p>
        </div>
      </div>
      <form action="" method="get">
        <div id="main-input-license">
          <div id="main-input-license-title">
            <p class="main-basic-info-title">자격증 입력</p>
          </div>
          <textarea name="license" id="license" placeholder="자격증을 입력해주세요"></textarea>
        </div>
        <div id="main-input-career">
          <div id="main-input-career-title">
            <p class="main-basic-info-title">경력 입력</p>
          </div>
          <textarea name="career" id="career" placeholder="경력을 입력해주세요"></textarea>
        </div>
        <div id="select-major">
          <p class="main-basic-info-title">분야 선택</p>
          <div id="radio-major-div">
            <div class="radio-major">
              <p>IT</p>
              <input type="radio" name="major" value="IT" checked>
            </div>
            <div class="radio-major">
              <p>design</p>
              <input type="radio" name="major" value="design">
            </div>
            <div class="radio-major">
              <p>language</p>
              <input type="radio" name="major" value="language">
            </div>
            <div class="radio-major">
              <p>music</p>
              <input type="radio" name="major" value="music">
            </div>
            <div class="radio-major">
              <p>cook</p>
              <input type="radio" name="major" value="cook">
            </div>
            
          </div>
        </div>
        <div id="main-submit-btn-div">
          <!-- 추후 submit으로 변경 예정 -->
          <button type="button" id="main-submit-btn">등록</button>
          <button type="button" id="main-cancel-btn">취소</button>
        </div>
      </form>
    </div>
  </main>
  <footer>

  </footer>
</body>

</html>