<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../assets/css/donation/sponsorship-input.css">

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
  <script defer src="./../../assets/js/donation/sponsorship-input.js"></script>
  <title>틈새빛</title>
</head>

<body>
  <!-- 헤더 -->
  <div id="header">
  </div>
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <div class="pagetitle">함께 해주셔서 감사합니다</div>
      <section class="sponsorship-input-section-content">
        <form action="" method="post">
          <!-- 후원 금액 선택 -->
          <div id="choose-money">
            <div id="choose-money-label" class="font-main">후원금액</div>
            <!-- 후원 금액 버튼 -->
            <div id="money-buttons">
              <button type="button" name="money10000" value="10000" class="div-money-button font-main">10,000원</button>
              <button type="button" name="money30000" value="30000" class="div-money-button font-main">30,000원</button>
              <button type="button" name="money50000" value="50000" class="div-money-button font-main">50,000원</button>
            </div>
            <!-- 후원 금액 직접 입력 -->
            <div id="money-input-text font-main">
              <input type="number" min="0" step="10000" id="input-donation-money" name="donationMoney" class="font-main"
                placeholder="직접 금액 입력">원
            </div>
          </div>
          <!-- 버튼 -->
          <div id="sponsorship-bottom" class="font-main">
            <button type="button" id="button-ok-donation" name="donationBtn">확인</button>
            <button type="button" id="button-cancle-donation" name="donationCancelBtn">취소</button>
          </div>
        </form>
      </section>
    </div>
  </main>
  <!-- 푸터 -->
  <div id="footer">
  </div>
</body>
<script src="./../../assets/js/header-login.js"></script>
<script src="./../../assets/js/footer.js"></script>

</html>