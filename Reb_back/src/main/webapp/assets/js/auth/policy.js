const closePrivacy = document.querySelector("#close-privacy");
const privacy = document.querySelector("#privacy");

closePrivacy.addEventListener('click', ()=>{
	privacy.style.display= "none";
});

const closeTerms = document.querySelector("#close-terms");
const termsOfService = document.querySelector("#terms-of-service");

closeTerms.addEventListener('click', ()=>{
	termsOfService.style.display= "none";
});