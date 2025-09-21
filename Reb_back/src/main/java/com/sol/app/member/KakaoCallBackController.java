package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MemberDTO;
import com.sol.app.dto.MemberSignupDTO;
import com.sol.app.member.dao.MemberDAO;

public class KakaoCallBackController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();

        try {
            String code = request.getParameter("code"); // 카카오가 넘겨준 인가 코드
            System.out.println("인가 코드: " + code);

            // 🔹 카카오 Access Token 요청
            KakaoService kakaoService = new KakaoService();
            String accessToken = kakaoService.getAccessToken(code);
            System.out.println("확인용");
            
            // 🔹 사용자 정보 요청
            MemberDTO kakaoUser = kakaoService.getUserInfo(accessToken);
            System.out.println(kakaoUser);

            // 🔹 DB 조회 및 회원가입/로그인 처리
            MemberDAO memberDAO = new MemberDAO();
            MemberDTO existingUser = memberDAO.findId(kakaoUser);

            if(existingUser == null) {
                System.out.println("신규 카카오 회원 -> 회원가입 진행");
                MemberSignupDTO newUser = new MemberSignupDTO();
                newUser.setMemberId(kakaoUser.getMemberId());
                newUser.setMemberPassword(kakaoUser.getMemberPassword());
                newUser.setMemberEmail(kakaoUser.getMemberEmail());
                newUser.setMemberName(kakaoUser.getMemberName());
                newUser.setMemberGender(kakaoUser.getMemberGender());
                newUser.setMemberNickname(kakaoUser.getMemberNickname());
                newUser.setMemberPhoneNumber(kakaoUser.getMemberPhoneNumber());
                newUser.setMemberBirthDate(kakaoUser.getMemberBirthDate());
                
                memberDAO.signup(newUser);
                request.getSession().setAttribute("loginUser", kakaoUser);
            } else {
                System.out.println("기존 카카오 회원 -> 로그인 진행");
                request.getSession().setAttribute("loginUser", existingUser);
            }

            result.setPath("/main.jsp"); // 로그인 후 메인페이지 이동
            result.setRedirect(true);

        } catch (Exception e) {
            e.printStackTrace();
            result.setPath("/error_page.jsp");
            result.setRedirect(false);
        }

        return result;
	}

}
