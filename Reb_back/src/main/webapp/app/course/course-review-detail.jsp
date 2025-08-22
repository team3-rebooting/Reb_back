<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/course/course-review-detail.css">

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
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
  <title>틈새빛</title>
</head>
<script defer src="${pageContext.request.contextPath}/assets/js/course/course-review-detail.js"></script>

<body>
  <!-- 헤더 영역 -->
<jsp:include page="/header.jsp" />
  <!-- 메인 영역 -->
  <main>
    <!-- 메인 컨테이너 영역 -->
    <div id="main-container">
      <!-- 상세 컨테이너 영역 -->
      <div class="detail-container">
        <div>
          <!-- 뒤로가기 -->
          <p class="p-back">
            <i class="fa-solid fa-arrow-left"></i>
          </p>
        </div>
        <!-- 제목 -->
        <p class="pagetitle">웹 보안 수업 후기</p>
        <!-- 유저 정보 영역 -->
        <div class="div-user-integration">
          <!-- 유저 프로필 영역 -->
          <div class="div-user-profile"><img src="./../../assets/img/karina.jpg" class="img-user-profile"></div>
          <!-- 유저 개인 정보(닉네임, 작성일) 영역 -->
          <div class="div-user-info">
            <p class="p-user-name">곰융</p>
            <p class="p-update-date">2025.07.02<span class="p-update-status">(수정됨)</span></p>
          </div>
          <!-- 좋아요 fontawesome -->
          <div class="div-font-awesome-line"><span class="span-likes">좋아요 수 : 30 </span><i
              class="fa-regular fa-heart"></i></div>
        </div>
        <!--상세 글 영역 -->
        <div class="div-detail-area">
          <!-- 대표 사진 영역 -->
          <div class="div-img">
            <img src="${pageContext.request.contextPath}/assets/img/stone.jpg" class="img-detail">
          </div>
          <!-- 글 영역 -->
          <div class="div-expert-detail">
            <!-- 글 영역  -->
            <div class="div-expert-info-detail">
              <p class="p-expert-detail-comment">
                강사님이 너무 친절하기구 수업도 열정적으로 알려주셔요! 과제도 그만큼 열정적으로 내주셔요!!!
                이분 수업 강력하게 추천합니다!
                저는 다음에 또 들을 기회가 생긴다면 또 듣고싶어요
                짧은 글 읽어주셔서 감사합니다
              </p>
            </div>
          </div>
          <!-- 버튼 영역 -->
          <div class="div-button-area">
            <a href="./course-review-edit.html"><button class="button-application">수정</button></a>
            <button class="button-cancel">삭제</button>
          </div>
          <!-- 댓글 영역 -->
          <div class="div-comment-area">
            <!-- 댓글 영역 ul -->
            <ul class="ul-comment-list">
              <!-- 댓글 li -->
              <li class="li-comment">
                <!-- 프로필사진 -->
                <div class="div-user-profile"><img src="./../../assets/img/karina.jpg" class="img-user-profile"></div>
                <!-- 유저 정보(닉네임, 수정하기 버튼) -->
                <div class="div-user-info">
                  <div class="div-user-name-area">
                    <p class="p-user-name">곰융</p><span class="span-comment-edit">수정</span>
                  </div>
                  <!-- 댓글/삭제 -->
                  <div class="div-user-text-area">
                    <p class="p-comment-text">저도 한번 배워보고싶네요asddddddzzddd</p><span class="span-comment-delete">삭제</span>
                  </div>
                  <!-- 날짜/수정 여부 -->
                  <p class="p-update-date">2025.07.02<span class="p-update-status">(수정됨)</span></p>
                </div>
              </li>
              <li class="li-comment">
                <div class="div-user-profile"><img src="./../../assets/img/karina.jpg" class="img-user-profile"></div>
                <div class="div-user-info">
                  <div class="div-user-name-area">
                    <p class="p-user-name">곰융</p><span class="span-comment-edit">수정</span>
                  </div>
                  <div class="div-user-text-area">
                    <p class="p-comment-text">저도 한번 배워보고싶네요asddddddddaad</p><span class="span-comment-delete">삭제</span>
                  </div>
                  <p class="p-update-date">2025.07.02<span class="p-update-status">(수정됨)</span></p>
                </div>
              </li>
            </ul>
            <!-- 댓글 작성 영역 -->
            <div class="div-comment-write">
              <!-- 댓글 작성 form -->
              <form action="" method="get" class="form-comment-write">
                <!-- 댓글 작성 input -->
                <input type="text" placeholder="댓글을 입력해주세요" name="comment" class="input-comment">
                <!-- 등록 버튼 -->
                <button class="button-write" type="button">등록</button>
              </form>

            </div>
              <!-- 페이지네이션 -->
            <div class="div-page">
              <!-- a 태그 영역 -->
              <div class="div-pagenation">
                <a href="#">&lt;</a>
                <a href="#">1</a>
                <a href="#">2</a>
                <a href="#">3</a>
                <a href="#">4</a>
                <a href="#">5</a>
                <a href="#">&gt;</a>
              </div>
            </div>
          </div>

        </div>
      </div>
    </div>
  </main>
  <!-- 푸터 영역 -->
  <div id="footer">
  </div>
</body>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>