document.addEventListener("DOMContentLoaded", function() {
	const expertStatusText = document.querySelector("#button-expert-status-rejection-reason");

	if (expertStatusText.innerHTML === "반려") {
		expertStatusText.style.cursor = "pointer";
		expertStatusText.style.textDecoration = "underline";
		expertStatusText.addEventListener('click', () => {
			openModal("expertRejectionReason");
		})
	} else{
		expertStatusText.style.cursor = "default";
		expertStatusText.style.textDecoration = "none";
		expertStatusText.removeEventListener('click');
	}
})