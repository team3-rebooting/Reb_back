document.addEventListener("DOMContentLoaded", function() {
	const expertStatusText = document.querySelector("#personal-info-expert-status");

	document.querySelector("#button-edit-user").addEventListener('click', () => {
		editUserInfo();
	});

	document.querySelector("#button-del-user").addEventListener('click', () => {
		deleteUserInfo();
	});




	if (expertStatusText.innerHTML === "반려") {
		expertStatusText.style.cursor = "pointer";
		expertStatusText.style.textDecoration = "underline";
		expertStatusText.addEventListener('click', () => {
			openModal("expertRejectionReason");
		})
	}

	function editUserInfo() {
		location.href = "edit-info.html";
		location.replace(link);
	}
	// ====== 유틸 ======
	async function safeJson(res) {
		const text = await res.text();
		try { return text ? JSON.parse(text) : null; } catch { return null; }
	}
	async function deleteUserInfo() {
		if (confirm("정말 탈퇴하시겠습니까?")) {
			try {
				const response = await fetch(`/myPage/accountDeletionOk.my`);
				const result = await safeJson(response);
				if (result?.status === "success") {
					alert("회원 탈퇴 완료");
					location.href = "/myPage/accountDeletion.my";
				} else {
					alert("개설 수업이 존재하여 회원 탈퇴에 실패했습니다.");
					location.href = "/myPage/myInfoOk.my";
				}
			} catch (error) {
				//console.error("회원 탈퇴 실패:", error);
				//alert("회원 탈퇴 중 오류가 발생했습니다.");
			}
		}
	}
})