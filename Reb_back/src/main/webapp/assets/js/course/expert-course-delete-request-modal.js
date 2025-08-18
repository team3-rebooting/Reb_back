const modal = document.querySelector(".modal-background");
const deleteBtn = document.querySelector(".button-delete");
const modalClose = document.querySelector(".button-x");


deleteBtn.addEventListener('click', () => {
  modal.style.display = "flex";
});

modalClose.addEventListener('click',()=>{
  modal.style.display = "none";
});