<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="./../../assets/css/aboutUs/site-introduction.css" />

  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/header.css">
  <link rel="stylesheet" href="./../../assets/css/footer.css">

  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
    rel="stylesheet" />
  <link rel="preconnect" href="https://fonts.googleapis.com" />
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet" />
  <title>틈새빛 소개</title>
</head>

<body>
  <jsp:include page="/header.jsp" />
  <main>
    <!-- 메인 전체 -->
    <div id="main-container">
      <!-- 메인 최상단 제목 -->
      <div class="introduction-main-title">
        <div class="introduction-main-title-text font-main">
          작지만 확실한 성장, 당신과 함께 만들어갑니다.
        </div>
        <div class="introduction-main-title-logo">
          <img src="./../../assets/img/team_logo.png" class="logo-image" alt="로고" />
        </div>
      </div>

      <!-- 소개글 -->
      <div class="introduction-container">
        <div class="introduction-text-container font-main">
          <strong class="introduction-intro-bold">
            지금은 쉬고 있어도, 괜찮습니다.<br />
            지금까지 쉬고 있었어도, 괜찮습니다.<br />
            지금은 너무 늦은것 같아도, 늦지 않았습니다.<br />
            단절된 시간 속에서도, 누군가는 나처럼 다시 시작하고 있습니다.<br />
          </strong>
          <div class="introduction-intro-text">
            <span class="introduction-span-logo-name">틈새 빛</span> 은 일상 속 모임으로 느슨하게
            연결되고, 전문가의 수업을 통해 새롭게 배우며 나아갈 수 있는
            커뮤니티 플랫폼입니다.<br />
            취업 준비가 아니어도, 거창한 목표가 아니어도 괜찮습니다.<br />
            소소한 모임에서부터, 나와 비슷한 사람들과의 만남,<br />
            그리고 관심 있는 분야에 대한 배움이 쌓이며조금씩 ‘사회’와 다시
            연결될 수 있도록 돕고 싶습니다.<br />
            당신의 속도대로, 함께 걸을 준비가 되어 있습니다.지금, 작은 연결을
            시작해보세요.<br /><br />
            <!-- 이곳에서 여러분은 루틴 모임을 모집하거나 참여하시고,<br />원하시는
            수업을 들으실 수 있습니다.<br /><br />
            루틴 모임에 주기적으로 참여하면서 사람에 대한 불안감을 점차
            지워나가고,<br />
            수업을 수강하시면서 자신이 하고싶은 일을 찾아나가보시는건
            어떨까요? -->
          </div>
        </div>

        <!-- 루틴 모임 모집 소개 -->
        <div class="introduction-title font-main">· 루틴 모임 모집</div>
        <div class="introduction-routine-meeting-container">

          <div class="introduction-routine-meeting-image-container">
            <div id="introduction-routine-meeting">
              <img src="/assets/img/routine-img.png" width="700"
                class="introduction-routine-meeting-image" alt="첫번째루틴모임소개이미지" />
            </div>
          </div>

          <div class="introduction-routine-meeting-text-container font-main">
            원하는 주제의 모임을 모집하거나, 모임에 참여해보세요!<br />
            모임을 만들어서 마음이 맞는 다른 분들을 모집하셔도 좋고,<br />
            원하시는 주제의 모임에 참여하셔도 좋아요!<br /><br />
            타인과의 소통에 부담 가지실 필요 없이, 가벼운 마음으로
            참여해보세요!<br />
            그저 모임에 나와서, 듣기만 하셔도 좋습니다.<br />
            내 생활습관을 만든다는 마음으로, 루틴모임에 참여해보시는건
            어떨까요?<br /><br />
            여기에서 원하는 모임을
            찾아보세요!
          </div>
        </div>

        <!-- 수업 수강 소개 -->
         <div class="introduction-title font-main">· 수업 수강</div>
        <div class="introduction-class-container">
          

          <div class="introduction-class-image-container">
            <div class="first-class">
              <img src="/assets/img/course-img.png" width="1000" class="introduction-class-image"
                alt="첫번째수업수강소개이미지" />
            </div>
          </div>

          <div class="introduction-class-text-container font-main">
            또한, 만약 원하시는 분야의 수업이 있다면 부담없이 참여해서
            들어보세요!<br />
            해당 분야의 수업이 개설되어 있다면, <br />
            시작 전까지 언제든지 참여하실 수 있습니다.<br /><br />
            꼭 취업 목적이 아니더라도, 흥미가 있는 분야가 있다면 <br />
            들어보시는건 어떨까요?<br /><br />
            여기에서 원하는 수업을
            찾아보세요!<br /><br />
            ※ 수업 참여 비용은 지원되지 않습니다.
          </div>
        </div>
      </div>

      <!-- 클로징 -->
      <div class="introduction-closing-container">
        <div class="introduction-closing-text-container font-main">
          <span class="logo-name">틈새 빛</span> 은 여러분의 사회로 다시금 향하는 첫 발걸음을 진심으로
          응원합니다.<br />
          이곳에서 사람과의 만남에 대한 부담이 줄어들고 본인이 원하는 일을
          찾으실 수 있기를 바랍니다.
        </div>
      </div>
    </div>
  </main>
  <div id="footer"></div>
  <script src="./../../assets/js/footer.js"></script>
</body>

</html>