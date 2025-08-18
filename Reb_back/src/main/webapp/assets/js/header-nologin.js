window.addEventListener('DOMContentLoaded', () => {
  fetch("header-nologin.html")
    .then(response => response.text())
    .then(data => {
      footer = document.querySelector(`#header`);
      footer.innerHTML = data
    });
});