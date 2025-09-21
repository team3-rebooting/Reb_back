package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class KakaoLoginController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Result result = new Result();
		
		String clientId = "";
        String redirectUri = "http://localhost:8888/member/kakaoCallBack.me";
        String kakaoAuthUrl = "https://kauth.kakao.com/oauth/authorize"
                            + "?client_id=" + clientId
                            + "&redirect_uri=" + redirectUri
                            + "&response_type=code";

        result.setPath(kakaoAuthUrl);
        result.setRedirect(true); // 카카오 로그인 페이지로 리다이렉트
        return result;
	}
}
