<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./../../assets/css/course/course-list.css">

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
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">

  <title>틈새빛</title>
</head>
<script defer src="./../../assets/js/course/course-list.js"></script>

<body>
  <!-- 헤더 영역 -->
  <div id="header">
  </div>
  <!-- 메인 영역 -->
  <main>
    <!-- 메인 컨테이너 -->
    <div id="main-container">
      <!-- 수업 목록 컨테이너 -->
      <div class="course-list-container">
        <!-- 제목 태그 -->
        <p class="pagetitle">수업 게시판</p>
        <!-- 수업 ul 영역 -->
        <ul class="ul-course-list">
          <!-- 수업 리스트 영역 -->
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 상세 화면-->
            <a href="./course-detail-user-ing.html">
              <!-- 이미지 -->
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <!-- 제목 -->
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <!-- 모집상태 & 작성자, 작성일 영역 -->
              <div class="div-box-status"><button type="button" class="button-recruit-ing">모집중</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 상세 화면-->
            <a href="./course-detail-user-ing.html">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-ing">모집중</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 전문가가 보는 자기 자신의 수업 상세 화면-->
            <a href="./course-detail-expert-basic.html">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-ing">모집중</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 모집 종료 화면-->
            <a href="./course-detail-user-after.html">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-end">모집종료</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 모집 종료 화면-->
            <a href="./course-detail-user-after.html">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-end">모집종료</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 모집 종료 화면-->
            <a href="./course-detail-user-after.html">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-end">모집종료</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 모집 전 화면-->
            <a href="./course-detail-user-before.html">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-before">모집
                  전</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 모집 전 화면-->
            <a href="./course-detail-user-before.html" class="a-list">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-before">모집
                  전</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>
          <li class="li-course-list-box">
            <!-- detail로 넘어가는 a 태그 -> 일반 사용자가 보는 모집 전 화면-->
            <a href="./course-detail-user-before.html">
              <img src="./../../assets/img/stone.jpg" class="img-box">
              <p class="p-list-comment">틈새빛에 처음 오신 여러분 환영합니다.</p>
              <div class="div-box-status"><button type="button" class="button-recruit-before">모집
                  전</button>
                <p class="p-name-date"> 카리나 2025.08.03(일)</p>
              </div>
            </a>
          </li>

        </ul>
        <!-- 페이징 영역 -->
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
        <!-- 검색 영역 -->
        <div class="div-find">
          <!-- 검색 form -->
          <form action="" method="get">
            <!-- form 안에 들어갈 데이터 선택, 작성 영역 -->
            <div class="div-find-form">
              <!-- 제목,전문가명 선택 -->
              <div class="find-container">
                <select class="select-find">
                  <option value="title">제목</option>
                  <option value="name">전문가명</option>
                </select>
                <div class="input-group">
                  <input class="input-find" type="text"/>
                  <button type="button" class="button-find">
                    <i class="fa-solid fa-magnifying-glass"></i>
                  </button>
                </div>
              </div>
              <!-- 전문가일 때만 보여주면 되는 버튼 -->
              <button type="button" class="button-write">글 쓰기</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </main>
  <!-- 푸터 영역 -->
  <div id="footer">
  </div>
</body>
<script src="./../../assets/js/header-login.js"></script>
<script src="./../../assets/js/footer.js"></script>

</html>