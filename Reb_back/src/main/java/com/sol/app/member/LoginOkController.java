package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dao.MemberDAO;
import com.sol.app.dto.MemberDTO;

public class LoginOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		Result result = null;
		
		String memberId = request.getParameter("userId");
		String memberPw = request.getParameter("userPw");
		memberDTO = memberDAO.login(memberId, memberPw);
		
		if(memberDTO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("memberDTO", memberDTO);
			
			Cookie cookie = new Cookie("memberId", memberId);
			cookie.setMaxAge(60 * 60 * 24);
			
			result.setPath(request.getContextPath());
			result.setRedirect(true);
		}else {
			result.setPath(request.getContextPath() + "/member/login.jsp");
			result.setRedirect(true);
		}
		
		return null;
	}
	
}
