window.addEventListener('DOMContentLoaded', () => {
    fetch("footer.html")
        .then(response => response.text())
        .then(data => {
            footer = document.querySelector(`#footer`);
            footer.innerHTML = data;
        });
});