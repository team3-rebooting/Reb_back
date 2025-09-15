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
						const userName = response.kakao_account.name;
						let userGender;
						if(response.kakao_account.gender === 'male'){
							userGender = 'M';
						}
						else if(response.kakao_account.gender === 'female'){
							userGender = "F";
						}
						const userNickname = response.properties.nickname;
						const userPhone = response.kakao_account.phone_number;
						const userBirth = response.kakao_account.birthyear + "-" + response.kakao_account.birthday.substr(0, 2) + 
											"-" + response.kakao_account.birthday.substr(2, 2);
						
						const user = {
							memberId : userId,
							memberPassword : 'a',
							zipCode : '',
							address : '',
							memberEmail : userEmail,
							memberName : userName,
							memberGender : userGender,
							memberNickname : userNickname,
							memberPhoneNumber : userPhone,
							memberBirthDay : userBirth
						};
						
						console.log(user);
						
						/*fetch(`/member/checkIdOk.me?memberId=${encodeURIComponent(userId)}`, {
							headers: { "Content-type": "application/json" }
						})
						.then(r => { if (!r.ok) throw new Error(r.status); return r.json(); })
						.then(data => {
							if(data.available){
								console.log("로그인 진행");
								
							} else{
								console.log('회원가입 진행');
								signup(user);
							}
						}*/
						
						
						
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
	
	function signup(user){
		fetch('/member/kakaosignup.me')
	}
	
});