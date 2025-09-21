document.addEventListener("DOMContentLoaded", () => {
  const logoutBtns = document.querySelectorAll(".logout");

  logoutBtns.forEach(button => {
    button.addEventListener("click", () => {
      window.location.href = "/admin/logoutOk.ad";
    });
  });
});