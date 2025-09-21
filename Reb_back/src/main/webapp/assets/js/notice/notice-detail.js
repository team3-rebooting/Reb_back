document.addEventListener("DOMContentLoaded", function () {
  const back = document.querySelector(".p-back");

  back.addEventListener("click", () => {
  		history.back();
  	});
});