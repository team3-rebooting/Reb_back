package com.sol.app.member;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.dto.MemberDTO;

public class KakaoService {
	private Gson gson = new Gson();

	// Access Token 요청
	public String getAccessToken(String code) throws Exception {
		String reqUrl = "https://kauth.kakao.com/oauth/token";
        URL url = new URL(reqUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // POST 방식 설정
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        // URL 인코딩 필수
        String redirectUri = "http://localhost:8888/member/kakaoCallback.me";
        String encodedCode = URLEncoder.encode(code, "UTF-8");

        // 요청 파라미터 작성
        StringBuilder sb = new StringBuilder();
        sb.append("grant_type=authorization_code");
        sb.append("&client_id=");
        sb.append("&redirect_uri=").append(redirectUri);
        sb.append("&code=").append(encodedCode);

        // 요청 전송
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()))) {
            bw.write(sb.toString());
            bw.flush();
        }

        // 응답 처리 (200 OK이면 inputStream, 오류면 errorStream)
        int responseCode = conn.getResponseCode();
        InputStream is = (responseCode == 200) ? conn.getInputStream() : conn.getErrorStream();

        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }

        // 서버가 반환한 응답 확인
        System.out.println("Kakao Response: " + result.toString());

        // JSON 파싱
        JsonObject json = JsonParser.parseString(result.toString()).getAsJsonObject();

        // access_token 존재 여부 확인
        if (!json.has("access_token")) {
            throw new RuntimeException("Access Token 획득 실패: " + json.toString());
        }

        return json.get("access_token").getAsString();
	}

	// 사용자 정보 요청
	public MemberDTO getUserInfo(String accessToken) throws Exception {
		String reqUrl = "https://kapi.kakao.com/v2/user/me";
		URL url = new URL(reqUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("POST");
		conn.setRequestProperty("Authorization", "Bearer " + accessToken);

		StringBuilder result = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
			String line;
			while ((line = br.readLine()) != null) {
				result.append(line);
			}
		}

		JsonObject json = JsonParser.parseString(result.toString()).getAsJsonObject();

		// 카카오 JSON 구조 파싱
		Long id = json.get("id").getAsLong();
		JsonObject kakaoAccount = json.getAsJsonObject("kakao_account");
		JsonObject properties = json.getAsJsonObject("properties");

		String email = kakaoAccount.has("email") ? kakaoAccount.get("email").getAsString() : "";
		String name = kakaoAccount.has("name") ? kakaoAccount.get("name").getAsString() : "";
		String nickname = properties.has("nickname") ? properties.get("nickname").getAsString() : "";
		String phone = kakaoAccount.has("phone_number") ? kakaoAccount.get("phone_number").getAsString() : "";
		String birthYear = kakaoAccount.has("birthyear") ? kakaoAccount.get("birthyear").getAsString() : "";
		String birthDay = kakaoAccount.has("birthday") ? kakaoAccount.get("birthday").getAsString().substring(0, 2) + "-" + kakaoAccount.get("birthday").getAsString().substring(2) : "";
		String birth = birthYear + "-" + birthDay;
		String gender = kakaoAccount.has("gender") ? kakaoAccount.get("gender").getAsString() : "";
		if(gender.equals("male")) {
			gender = "M";
		} else {
			gender = "F";
		}
		
		// DTO 매핑
		MemberDTO member = new MemberDTO();
		member.setMemberId(String.valueOf(id));
		member.setMemberPassword("kakao");
		member.setMemberEmail(email);
		member.setMemberName(name);
		member.setMemberGender(gender);
		member.setMemberNickname(nickname);
		member.setMemberPhoneNumber(phone);
		member.setMemberBirthDate(birthDay);

		return member;
	}
}
