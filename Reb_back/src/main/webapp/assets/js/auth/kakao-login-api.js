window.addEventListener('DOMContentLoaded', () => {
	
	Kakao.init('');	// javascript api 키 입력
	console.log(Kakao.isInitialized());	// sdk 초기화 여부 판단
	
	const kakaoBtn = document.querySelector(".button-kakao");
	const kakaoLogoutBtn = document.querySelector(".button-kakao-logout");
	
	// 카카오 로그인
	function kakaoLogin(){
		Kakao.Auth.login({
			success : function(response){
				Kakao.API.request({
					url : '/v2/user/me',
					success : function(response){
						console.log(response);
						const userId = response.id;
						// 비밀번호
						const userEmail = response.kakao_account.email;
						const userNmae = response.kakao_account.name;
						const userGender = null;
						if(response.kakao_account.gender === 'male'){
							userGender = 'M';
						}
						else if(response.kakao_account.gender === 'female'){
							userGender = "F";
						}
						const userNickname = response.properties.nickname;
						const userPhone = response.kakao_account.phone_number;
						
						const user = {
							memberId : userId,
							memberEmail : userEmail,
							memberName : userName,
							memberGender : userGender,
							memberNickname : userNickname,
							memberPhoneNumber : userPhone
						};
						
					},
					fail : function(response){
						console.log(error);
					},
				})
			},
			fail : function(response){
				console.log(error);
			}
		});
	}
	
	kakaoBtn.addEventListener('click', () => {
		kakaoLogin();
		console.log("로그인");
	});
	
	function kakaoLogout(){
		if(Kakao.Auth.getAccessToken()){
			Kakao.API.request({
				url : '/v1/user/unlink',
				success : function(response){
					console.log(response)
				},
				fail : function(error){
					console.log(error);
				},
			})
			Kakao.Auth.setAccessToken(undefined);
		}
	}
	
	kakaoLogoutBtn.addEventListener('click', ()=>{
		kakaoLogout();
		console.log("로그아웃");
	});
	
});