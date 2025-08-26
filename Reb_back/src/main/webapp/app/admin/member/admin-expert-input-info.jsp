<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>전문가 등록 페이지</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/member/admin-expert-input-info.css">
  <script defer src="${pageContext.request.contextPath}/assets/js/admin/member/admin-expert-input-info.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
    rel="stylesheet">
</head>

<body class="font-menu">
  <header>
    <!-- 목록으로 이동 -->
    <a href="${pageContext.request.contextPath}/admin/expertApplicantListOk.ad">
      <!-- 사이트 로고 -->
      <img src="${pageContext.request.contextPath}/assets/img/team_logo.png" alt="사이트 로고">
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
          <p><c:out value="${expert.memberName}"/></p>
        </div>
        <div>
          <p>성별 : </p>
          <p>
          <c:if test="${expert.memberGender eq 'M'}">
			남자
          </c:if>
          <c:if test="${expert.memberGender eq 'F'}">
			여자
          </c:if>
          </p>
        </div>
        <div>
          <p>전화번호 : </p>
          <p><c:out value="${expert.memberPhoneNumber}"/></p>
        </div>
        <div>
          <p>이메일 : </p>
          <p><c:out value="${expert.memberEmail}"/></p>
        </div>
      </div>
      <form action="${pageContext.request.contextPath}/admin/expertAcceptWriteOk.ad" method="post">
      	<input type="hidden" name = "memberNumber" value="${expert.memberNumber}">
        <div id="main-input-license">
          <div id="main-input-license-title">
            <p class="main-basic-info-title">자격증 입력</p>
          </div>
          <textarea name="expertLicenseInfo" id="license" placeholder="자격증을 입력해주세요"></textarea>
        </div>
        <div id="main-input-career">
          <div id="main-input-career-title">
            <p class="main-basic-info-title">경력 입력</p>
          </div>
          <textarea name="expertCareer" id="career" placeholder="경력을 입력해주세요"></textarea>
        </div>
        <div id="select-major">
          <p class="main-basic-info-title">분야 선택</p>
          <div id="radio-major-div">
            <div class="radio-major">
              <p>IT</p>
              <input type="radio" name="expertFieldNumber" value= 1 checked>
            </div>
            <div class="radio-major">
              <p>design</p>
              <input type="radio" name="expertFieldNumber" value= 2 >
            </div>
            <div class="radio-major">
              <p>language</p>
              <input type="radio" name="expertFieldNumber" value= 3 >
            </div>
            <div class="radio-major">
              <p>music</p>
              <input type="radio" name="expertFieldNumber" value= 4 >
            </div>
            <div class="radio-major">
              <p>cook</p>
              <input type="radio" name="expertFieldNumber" value= 5 >
            </div>
            
          </div>
        </div>
        <div id="main-submit-btn-div">
          <button type="submit" id="main-submit-btn">등록</button>
          <button type="button" id="main-cancel-btn">취소</button>
        </div>
      </form>
    </div>
  </main>
  <footer>

  </footer>
</body>

</html>