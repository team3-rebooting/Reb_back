package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dao.MyPageDAO;
import com.sol.app.dto.MemberDTO;

public class MyPasswordOKController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MemberDTO memberDTO = new MemberDTO();
		Result result = new Result();
		
		request.setCharacterEncoding("UTF-8");
		
		//회원정보 세팅
		memberDTO.setMemberId(request.getParameter("memberId"));
		memberDTO.setMemberPassword(request.getParameter("memberPassword"));
		
		//DAO 호출
		memberDTO = myPageDAO.login(memberDTO);
		
		if(memberDTO != null) {
			result.setPath(request.getContextPath() + "/myPage/myinfo.my");
			result.setRedirect(true);
		}else {
			result.setPath(request.getContextPath() + "/myPage/myPassword.my?pw=fail");
			result.setRedirect(false);
		}
		
		return result;
	}
	
}
