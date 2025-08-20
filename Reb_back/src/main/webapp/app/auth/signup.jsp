<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/auth/signup.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/header-login.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/footer.css">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&family=Noto+Sans+KR&family=Yeon+Sung&display=swap"
	rel="stylesheet">
<title>틈새빛</title>
</head>
<!-- 우편번호 api -->
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<!-- JS 적용 -->
<script defer
	src="${pageContext.request.contextPath}/assets/js/auth/signup.js"></script>

<body>
	<!-- 헤더 -->
	<div id="header"></div>
	<!-- 메인 -->
	<main>
		<!-- 메인 컨테이너 -->
		<div id="main-container">
			<!-- 회원가입 컨테이너 -->
			<div class="signup-container">
				<!-- 회원가입 form -->
				<form action="${pageContext.request.contextPath}/member/signupOk.me"
					method="post" class="form-signup" id="joinForm" autocomplete="off">
					<!-- 아이디 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 아이디 : </span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-hide">
							<input class="input-basic input-essential" type="text"
								placeholder="아이디 입력" name="memberId">
							<p class="p-warning">아이디는 6~20자 사이 영문자,숫자를 사용해야합니다</p>
							<p class="p-nodupli-id">중복된 아이디입니다</p>
						</div>
					</div>
					<!-- 비밀번호 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 비밀번호 : </span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-hide">
							<input class="input-basic input-password-first input-essential"
								type="password" placeholder="비밀번호 입력" name="memberPassword">
							<input class="input-basic" type="password" placeholder="비밀번호 재입력"
								name="pwRe">
							<p class="p-warning">비밀번호는 최소 8자, 최대 20자 영문과 숫자, !@#$ 1개씩 반드시
								포함되어야 합니다</p>
							<p class="p-nosame">입력한 비밀번호와 다릅니다</p>
							<p class="p-same">입력한 비밀번호와 같습니다</p>
						</div>
					</div>
					<!-- 생년월일 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 생년월일 : </span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-hide">
							<input class="input-basic input-essential" type="date"
								name="memberBirth">
							<p class="p-warning">생년월일은 필수 입력입니다</p>
						</div>
					</div>
					<!-- 주소 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 주소 : </span>
						<!-- 기본 주소, 추가 주소 입력 영역 -->
						<div class="div-signup-address ">
							<input class="input-address-basic input-essential" type="text"
								name="addressBasic" placeholder="기본 주소">
							<p class="p-warning">기본 주소는 필수 입력입니다</p>
							<!-- 추가 주소 입력 영역 -->
							<div class="div-signup-address-add">
								<input class="input-address-add" type="text" name="addressAdd"
									placeholder="추가 주소">
								<button class="button-find" type="button">찾기</button>
							</div>
						</div>
					</div>
					<!-- 이메일 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">이메일 :</span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-hide">
							<!-- 이메일 아이디,주소 입력 영역 -->
							<input class="input-basic input-essential" type="email"
								name="email" placeholder="예시 : aaa@gmail.com">
							<p class="p-warning">이메일 형식에 맞춰주세요</p>
						</div>
					</div>
					<!-- 이름 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 이름 : </span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-hide">
							<input class="input-basic input-essential" type="text"
								name="name">
							<p class="p-warning">이름은 필수 입력입니다</p>
						</div>
					</div>
					<!-- 성별 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 성별 :</span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-radio">
							<input type='radio' name='gender' value='male' id="male" /><label
								for="male">남자</label> <input type='radio' name='gender'
								value='female' id="female" /><label for="female">여자</label>
							<p class="p-warning">성별은 필수 입력입니다</p>
						</div>
					</div>
					<!-- 닉네임 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 닉네임 :</span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-hide">
							<input class="input-basic input-essential" type="text"
								name="nickName">
							<button class="button-no-duplication" type="button">중복확인</button>
							<p class="p-warning">닉네임은 필수 입력입니다</p>
							<p class="p-duplication">중복입니다</p>
							<p class="p-no-duplication">사용가능</p>
						</div>
					</div>
					<!-- 전화번호 입력 영역 -->
					<div class="div-signup">
						<span class="span-signup">* 전화번호 :</span>
						<!-- input, 아래 숨겨져있는 문구 영역 -->
						<div class="div-signup-hide">
							<input class="input-basic" type="text" name="phoneNumber">
							<div>
								<button type="button" class="button-retry" disabled>초기화</button>
								<button class="button-injung" type="button">인증번호받기</button>
							</div>
							<input class="input-cert input-essential" type="text" readonly>
							<button class="button-injunging" type="button" disabled>인증하기</button>
							<p class="p-warning">전화번호는 필수 입력입니다</p>
						</div>
					</div>
					<!-- 필수 동의 항목 영역 -->
					<div class="div-signup">
						<input class="input-terms input-essential" type="checkbox"
							id="id-terms"> <label for="id-terms" class="label-terms">개인정보
							수집 및 이용 동의(필수)</label></span> <span class="span-add">보기</span>
					</div>
					<!-- 회원가입 버튼, 뒤로가기 버튼 영역 -->
					<div class="div-signup">
						<button type="button" class="button-back">뒤로가기</button>
						<%-- <a href="${pageContext.request.contextPath}/member/signupOk.me"> --%>
							<button type="submit" class="button-basic button-signup">회원가입하기</button>
						<!-- </a> -->
					</div>
				</form>
			</div>
		</div>
	</main>
	<!-- 푸터 영역 -->
	<div id="footer"></div>
</body>
<script
	src="${pageContext.request.contextPath}/assets/js/header-nologin.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/footer.js"></script>

</html>