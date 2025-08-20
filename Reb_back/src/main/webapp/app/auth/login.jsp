<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/auth/login.css">

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header-login.css">
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
 <%--  <script defer src="${pageContext.request.contextPath}/assets/js/auth/login.js"></script> --%>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <div id="header">
  </div>
  <!-- 아이디찾기 모달 배경-->
  <div class="modal-id-background">
    <!-- 아이디 찾기 모달 창 -->
    <div class="div-findid-modal">
      <form action="" method="get">
        <!-- x 버튼 영역 -->
        <div class="div-modal-x"><button class="button-id-x" type="button">X</button></div>
        <!-- 모달 이름 영역 -->
        <div class="div-modal-head">
          <span class="span-modal-title">아이디 찾기</span>
        </div>
        <!-- 모달 내용(이름,전화번호) 영역 -->
        <div class="div-modal-main">
          <!-- 이름 작성 영역 -->
          <div class="div-modal-name"><span class="span-modal">이름 : </span>
            <input type="text" placeholder="이름을 입력해주세요" name="modalIdName" class="input-modal-name-id">
          </div>
          <!-- 전화번호 인증 영역 -->
          <div class="div-modal-pn"><span class="span-modal">전화번호 : </span>
            <!-- 전화번호 입력 영역-->
            <div class="div-phone-input-area">
              <div class="div-phone-input">
                <input type="text" placeholder="전화번호를 입력해주세요" name="modalIdPhone" class="input-modal-pn-id">
                <button type="button" class="button-injung-id">인증번호 받기</button>
                <button type="button" class="button-retry-id" disabled>초기화</button>
              </div>
              <!-- 인증번호 입력 영역 -->
              <div class="div-phone-input">
                <input type="text" placeholder="" name="modalIdPhoneInjung" class="input-modal-pn-injung" readonly>
                <button type="button" class="button-injung-do-id" disabled>인증하기</button>
              </div>
            </div>
          </div>
        </div>
        <!-- 아이디 찾기 버튼 영역 -->
        <div class="div-modal-button-area">
          <button class="button-modal-find-id" type="button">아이디 찾기</button>
        </div>
      </form>
    </div>
  </div>

  <!-- 아이디찾기 완료 모달 배경 -->
  <div class="modal-id-end-background">
    <!-- 아이디 찾기 완료 시 모달 -->
    <div class="div-findid-end-modal">
      <!-- 모달 제목 영역-->
      <div class="div-modal-head">
        <span class="span-modal-title">아이디</span>
      </div>
      <!-- ID 알려주는 text 영역 -->
      <div class="div-modal-main-findid-end">
        <span class="span-findid-end">ID : <span class="findid">test1234</span> (가입일자 : 2025.07.07)</span>
      </div>
      <!-- 버튼 영역  -->
      <div class="div-modal-button-area">
        <button class="button-modal-find-end-id" type="button">로그인 창으로 돌아가기</button>
      </div>
    </div>
  </div>
  <!-- 비밀번호찾기 모달 배경 -->
  <div class="modal-pw-background">
    <!-- 비밀번호 찾기 모달 창 -->
    <div class="div-findpw-modal">
      <form action="" method="get">
        <!-- x 버튼 영역 -->
        <div class="div-modal-x"><button class="button-pw-x" type="button">X</button></div>
        <!-- 모달 제목 영역 -->
        <div class="div-modal-head">
          <span class="span-modal-title">비밀번호 찾기</span>
        </div>
        <!-- 모달 본문 영역 -->
        <div class="div-modal-main">
          <!-- 이름 입력 영역 -->
          <div class="div-modal-name"><span class="span-modal">이름 : </span>
            <input type="text" placeholder="이름을 입력해주세요" name="modalPwName" class="input-modal-name-pw">
          </div>
          <!-- 전화번호 인증 입력 영역 -->
          <div class="div-modal-pn"><span class="span-modal">전화번호 : </span>
            <!-- 전화번호 입력 영역 -->
            <div class="div-phone-input-area">
              <div class="div-phone-input">
                <input type="text" placeholder="전화번호를 입력해주세요" name="modalPwPhone" class="input-modal-pn-pw">
                <button type="button" class="button-injung-pw">인증번호 받기</button>
                <button type="button" class="button-retry-pw">초기화</button>
              </div>
              <!-- 인증번호 입력 영역 -->
              <div class="div-phone-input">
                <input type="text" placeholder="" name="modalPwPhoneInjung" class="input-modal-pn-injung" readonly>
                <button type="button" class="button-injung-do-pw" disabled>인증하기</button>
              </div>
            </div>
          </div>
          <!-- 아이디 입력 영역 -->
          <div class="div-modal-id"><span class="span-modal">아이디 : </span>
            <input type="text" placeholder="아이디를 입력해주세요" name="modalPwId" class="input-modal-id-pw">
          </div>
        </div>
        <!-- 버튼 입력 영역 -->
        <div class="div-modal-button-area">
          <button class="button-modal-find-pw" type="button">비밀번호 찾기</button>
        </div>
      </form>
    </div>
  </div>
  <!-- 비밀번호찾기 완료 모달 배경-->
  <div class="modal-pw-end-background">
    <!-- 비밀번호 찾기 모달 -->
    <div class="div-findpw-end-modal">
      <!-- 모달 제목 영역 -->
      <div class="div-modal-head">
        <span class="span-modal-title">비밀번호</span>
      </div>
      <!-- 모달 text 영역 -->
      <div class="div-modal-main-findid-end">
        <span class="span-findid-end">홍길동님의 비밀번호는 <span class="findid">1q2w3e4r!</span> 입니다</span>
      </div>
      <!-- 모달 버튼 영역 -->
      <div class="div-modal-button-area">
        <button class="button-modal-find-end-pw" type="button">로그인 창으로 돌아가기</button>
      </div>
    </div>
  </div>
  <!-- 메인 -->
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 로그인 컨테이너 -->
      <div class="login-container">
        <!-- 로그인 폼 -->
        <form action="${pageContext.request.contextPath}/member/loginOk.me" method="post" class="form-login" autocomplete="off">
          <!-- id 입력 영역 -->
          <div class="div-id">
            <label for="id">
              <p class="font-main">아이디 : </p>
            </label>
            <input type="text" class="input-id" id="id" name="memberId">
          </div>
          <!-- 비밀번호 입력 영역 -->
          <div class="div-pw">
            <label for="pw">
              <p class="font-main">비밀번호 : </p>
            </label>
            <input type="password" class="input-pw" id="pw" name="memberPassword">
          </div>
          <!--일반 로그인 버튼 -->
          <button class="button-basic button-login" type="submit">
            로그인
          </button>
          <!-- 카카오로그인 버튼 -->
          <button class="button-kakao" type="button">
            <img src="${pageContext.request.contextPath}/assets/img/kakao.png" class="kakao-img">카카오 로그인
          </button>
        </form>
        <!-- 밑줄 -->
        <hr>
        <!-- 아이디찾기, 비밀번호찾기, 회원가입 영역 -->
        <div class="div-login-etc">
          <p class="p-findid font-main">아이디 찾기</p>
          <p class="p-findpw font-main">비밀번호 찾기</p>
          <a href="./signup.html">
            <p class="font-main">회원가입</p>
          </a>
        </div>
      </div>
    </div>
  </main>
  <!-- 푸터 영역 -->
  <div id="footer">
  </div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/header-nologin.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>