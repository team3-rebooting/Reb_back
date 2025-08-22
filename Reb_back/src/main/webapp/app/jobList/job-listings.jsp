<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="./../../assets/css/jobList/job-listings.css" />


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
    rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css">
  <title>체용공고</title>
</head>


<body>
  <jsp:include page="/header.jsp" />
  <main>
    <div id="main-container">


      <!-- 채용공고 -->
      <div class="job-container">
        <div class="job-title pagetitle">채용공고</div>
        <div class="job-board-box-container">
          <div class="job-board-box-title font-main">제목/기업명</div>
          <div class="job-board-box-requirements font-main">조건</div>
          <div class="job-board-box-day font-main">작성날짜</div>
        </div>
        <!-- API를 활용하여 동적으로 만들예정 -->


        <!-- 채용공고리스트 -->
        <ul id="job-list">
          <!-- 채용공고 1 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 2 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 3 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 4 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스)</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 5 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 6 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 7 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 8 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 9 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>

          <!-- 채용공고 10 -->
          <li class="job-item">
            <a href="">
              <div class="job-emphasize-container">
                <div class="job-emphasize-company-name-title-container">
                  <div class="job-emphasize-company-name font-main">(주)플러스휴먼리소스</div>
                  <div class="job-emphasize-company-title font-main">해외영업, 반도체 외 경력 채용</div>
                </div>

                <div class="job-emphasize-company-requirements-container">
                  <div class="job-emphasize-company-requirements-pay font-main">[급여] 회사내 규율에 따름</div>
                  <div class="job-emphasize-company-requirements-first-career font-main">[경력] 신입/경력 1년 | 학력무관</div>
                  <div class="job-emphasize-company-requirements-working-day font-main">[근무일수] 주 5일</div>
                  <div class="job-emphasize-company-requirements-location font-main">[위치] 서울 종로구</div>
                </div>

                <div class="job-emphasize-company-day-container">
                  <div class="job-emphasize-company-requirements-D-Day font-main">D-7</div>
                  <div class="job-emphasize-company-requirements-deadline font-main">마감일: 2025.08.10</div>
                  <div class="job-emphasize-company-requirements-registration-date font-main">등록일: 2025.07.11</div>
                </div>
              </div>
            </a>
          </li>
        </ul>



                <div class="div-page">
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
        <div class="div-find">
          <form action="" method="get">
            <div class="div-find-form">
              <div class="find-container">
                <select class="select-find">
                  <option value="title">제목</option>
                  <option value="name">작성자명</option>
                </select>
                <div class="input-group">
                  <input class="input-find" type="text" />
                  <button type="button" class="button-find">
                    <i class="fa-solid fa-magnifying-glass"></i>
                  </button>
                </div>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </main>
  <div id="footer"></div>
</body>
<script src="./../../assets/js/footer.js"></script>


</html>