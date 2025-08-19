window.addEventListener('DOMContentLoaded', () => {
    fetch("${pageContext.request.contextPath}/footer.jsp")
        .then(response => response.text())
        .then(data => {
            footer = document.querySelector(`#footer`);
            footer.innerHTML = data;
        });
});