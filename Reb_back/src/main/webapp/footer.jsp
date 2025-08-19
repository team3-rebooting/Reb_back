<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 푸터 -->
<footer>
  <div id="footer-title">
    틈새빛
  </div>
  <div id="footer-content">
    <div id="footer-div-logo"><img id="footer-img-logo" src="${pageContext.request.contextPath}/assets/img/team_logo.png" alt=""></div>
    <div id="footer-information-right">
      <div>
        <nav>
          <!-- 푸터 링크 -->
          <ul id="footer-ul-link-list">
            <li><a href="${pageContext.request.contextPath}/app/aboutUs/site-introduction.html">소개글</a></li>
            <li><a href="${pageContext.request.contextPath}/app/aboutUs/privacy-policy.html">개인정보처리방침</a></li>
          </ul>
        </nav>
      </div>
      <!-- 사이트 관리 정보 -->
      <div id="footer-infomation-text">
        문의 : help@example.com<br>
        계좌번호 : (번호) 틈새빛<br>
        Copyright © 틈새빛 All right reserved
      </div>
    </div>
  </div>
      <script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>
</footer>