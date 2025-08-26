document.addEventListener("DOMContentLoaded", function() {
	const expertStatusText = document.querySelector("#button-expert-status-rejection-reason");
	const expertCertStatusNumber = document.querySelector("#expert-cert-status_number");
	console.log('expertCertStatusNumber ',expertCertStatusNumber.value);
	//onclick="openModal('expertFileUpload')"
	if (expertCertStatusNumber.value === 3) {
		expertStatusText.style.cursor = "pointer";
		expertStatusText.style.textDecoration = "underline";
	} else {
		expertStatusText.style.cursor = "default";
		expertStatusText.style.textDecoration = "none";
		expertStatusText.disabled = true;
		//expertStatusText.removeEventListener('click');
		
		/*
		expertStatusText.style.cursor = "pointer";
		expertStatusText.style.textDecoration = "underline";*/
	}
})