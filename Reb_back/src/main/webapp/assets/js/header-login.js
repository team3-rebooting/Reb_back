window.addEventListener('DOMContentLoaded', () => {
    fetch("${pageContext.request.contextPath}/header-login.jsp")
        .then(response => response.text())
        .then(data => {
            footer = document.querySelector(`#header`);
            footer.innerHTML = data;
        });
});