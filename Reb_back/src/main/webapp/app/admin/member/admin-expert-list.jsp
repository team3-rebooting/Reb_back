<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>전문가 승인 목록</title>
  <link rel="stylesheet" href="./../../../assets/css/admin/member/admin-expert-list.css">
  <script defer src="./../../../assets/js/admin/member/admin-expert-list.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>


<body class="font-menu">
  <!-- 헤더 -->
  <header>
    <!-- 상단 목록 영역 -->
    <section>
      <!-- 상단 목록 -->
      <p><strong>전문가 승인 목록</strong></p>
      <!-- 로그아웃 버튼 -->
      <button id="logout">
        logout
      </button>
    </section>
    <!-- 하단 목록 영역 -->
    <section>
      <!-- 하단 목록 리스트 -->
      <ul>
        <li>
          <a href="./../../../app/admin/member/admin-expert-list.html">
            <strong>전문가 인증 신청</strong>
          </a>
        </li>
        <li>
          <a href="./../../../app/admin/member/admin-expert-access-list.html">
            전문가 목록
          </a>
        </li>
      </ul>
    </section>
  </header>
  <!-- 반려 모달 전체 창 -->
  <div id="modal-background">
    <!-- 반려 모달 -->
    <div id="cancel-modal">
      <!-- 반려 모달 입력창 -->
      <div id="cancel-modal-in">
        <p>전문가 승인 반려 사유</p>
        <!-- 반려 모달 입력 form  -->
        <form action="" method="get" id="cancel-input">
          <!-- 반려 모달 입력 영역 -->
          <textarea name="modal" placeholder="사유 입력" id="return-message" autofocus></textarea>
          <!-- 반려 모달 등록 버튼 -->
          <button type="button" id="submit">등록</button>
        </form>
      </div>
      <!-- 반려 모달 나가기 버튼 -->
      <button type="button" id="close-modal">X</button>
    </div>
  </div>
  <!-- 메인 -->
  <main>
    <!-- 사이드바 리스트 영역 -->
    <section id="main-admin-list-menu">
      <!-- 사이드바 리스트 -->
      <ul id="main-admin-list">
        <li>
          <a href="./../notice/admin-notice-list.html">
            공지 사항 목록
          </a>
        </li>
        <li>
          <a href="./../course/admin-course-request-list.html">
            수업 목록
          </a>
        </li>
        <li>
          <a href="./../routine/admin-routine-list.html">
            루틴 모임 목록
          </a>
        </li>
        <li>
          <a href="./../member/admin-member-list.html">
            회원 목록
          </a>
        </li>
        <li>
          <a href="./../member/admin-sponsor-list.html">
            후원자 목록
          </a>
        </li>
        <li>
          <a href="./../member/admin-expert-list.html">
            <strong>전문가 승인 목록</strong>
          </a>
        </li>
        <li>
          <a href="./../review/admin-routine-review-list.html">
            활동 후기
          </a>
        </li>
        <li>
          <a href="./../banner/admin-banner-list.html">
            배너 등록
          </a>
        </li>
      </ul>
    </section>
    <!-- 메인 영역 -->
    <section id="main-expert">
      <div id="main-expert-div">
        <!-- 전문가 리스트 제목 -->
        <div id="main-expert-list-title">
          <!-- 전문가 승인 상태 영역 -->
          <p class="main-expert-list-status">승인 상태</p>
          <!-- 전문가 아이디 영역 -->
          <p class="main-expert-list-id">아이디</p>
          <!-- 전문가 닉네임 영역 -->
          <p class="main-expert-list-nickname">닉네임</p>
          <!-- 전문가 인적사항 영역 -->
          <p class="main-expert-list-info">인적사항</p>
          <!-- 전문가 승인/반려 영역 -->
          <p class="main-expert-list-approval">승인/반려</p>
          <!-- 전문가 첨부파일 영역 -->
          <p class="main-expert-list-file">첨부 파일</p>
        </div>
        <!-- 전문가 요청 리스트 -->
        <ul id="main-expert-list">
          <!-- 전문가 요청 리스트 목록 -->
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <!-- 승인 버튼 -->
              <button type="button" class="accept">승인</button>
              <!-- 반려 버튼 -->
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/yujin.jpg" download="유진.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/karina.jpg" download="카리나.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
          <li>
            <p class="main-expert-list-status">확인중</p>
            <p class="main-expert-list-id">gildong123</p>
            <p class="main-expert-list-nickname">gildong123</p>
            <div class="main-expert-list-info">
              <p>[주소] 서울 특별시 동작구 대방동 27길 65 202호</p>
              <p>[핸드폰 번호] 010-7652-8846</p>
            </div>
            <div class="main-expert-list-approval">
              <button type="button" class="accept">승인</button>
              <button type="button" class="cancel">반려</button>
            </div>
            <div class="main-expert-list-file">
              <a href="./../../../assets/img/winter.jpg" download="윈터.jpg">
                <button type="button" class="file">
                  다운로드
                </button>
              </a>
            </div>
          </li>
        </ul>
        <!-- 페이지네이션 -->
        <div id="main-page-number">
          <p>&lt</p>
          <a href="">1</a>
          <a href="">2</a>
          <a href="">3</a>
          <a href="">4</a>
          <a href="">5</a>
          <p>&gt</p>
        </div>
        <!-- 검색 영역 -->
        <div id="main-search">
          <!-- 검색 종류 -->
          <select class="select-find">
            <option value="title">아이디</option>
            <option value="name">닉네임</option>
          </select>
          <!-- 검색 입력창 -->
          <form action="" method="">
            <input type="text" id="main-search-input">
            <!-- 돋보기 이미지 -->
            <button><img src="./../../../assets/img/search.jpg" alt="돋보기"></button>
          </form>
        </div>
      </div>
    </section>
  </main>

</body>

</html>