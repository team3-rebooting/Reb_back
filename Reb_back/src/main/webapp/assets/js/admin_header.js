const logoutBtns = document.querySelectorAll("header>button");

logoutBtns.forEach(button =>{
	button.addEventListener('click', ()=>{
	  window.location.href= "/admin/logoutOk.ad";
	});	
});



