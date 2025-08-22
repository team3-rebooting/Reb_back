package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MemberDTO;
import com.sol.app.member.dao.MemberDAO;

public class LoginOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		int memberNumber = 0;
		Result result = new Result();
		// 로그인 시도 결과에 따른 경로를 알려주기 위해 사용
		String path = null;
		System.out.println("LoginOkController 진입 성공");
		
		String memberId = request.getParameter("memberId"); // 아이디 저장 처리할 때 재사용
		String memberPassword = request.getParameter("memberPassword");
//		String remember = request.getParameter("remember");		// 아이디 기억 체크박스를 위해 사용, 현재 페이지에는 없는 기능
		
		// 세션 저장
		HttpSession session = request.getSession();
		memberDTO.setMemberId(memberId);
		memberDTO.setMemberPassword(memberPassword);
		
		// 쿼리문 실행 메소드 호출
		memberNumber = memberDAO.login(memberDTO);
		
		if(memberNumber != -1) {
//			추후 main servlet으로 경로 변경
			path = "/main.jsp";
			session.setAttribute("memberNumber", memberNumber);
			System.out.println("세션 값 : " + memberNumber);
			
			/*
			 * if(remember != null) { 
			 * 		Cookie cookie = new Cookie("memberId", memberId);
			 * 		cookie.setMaxAge(60 * 60 * 24);
			 * 		cookie.setPath(cookiePath));
			 * 		response.addCookie(cookie);
			 * 
			 * 		response.addCookie(cookie); 
			 * } else { 
			 * 		path= "/member/login.me?login=fail"; 
			 *  }
			 */
		}else {
			path = "/member/login.me?login=fail";
		}
		
		
		result.setRedirect(true);	// 세션에 저장된 값은 유지
		result.setPath(path);
		
		System.out.println("loginOkController 탈출");
		return result;
	}
	
}
