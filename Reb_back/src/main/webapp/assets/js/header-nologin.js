window.addEventListener('DOMContentLoaded', () => {
  fetch("${pageContext.request.contextPath}/header-nologin.jsp")
    .then(response => response.text())
    .then(data => {
      footer = document.querySelector(`#header`);
      footer.innerHTML = data
    });
});