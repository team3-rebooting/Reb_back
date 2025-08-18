window.addEventListener('DOMContentLoaded', () => {
    fetch("header-login.html")
        .then(response => response.text())
        .then(data => {
            footer = document.querySelector(`#header`);
            footer.innerHTML = data;
        });
});