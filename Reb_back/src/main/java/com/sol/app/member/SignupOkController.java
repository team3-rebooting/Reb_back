package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dao.MemberDAO;
import com.sol.app.dto.MemberDTO;

public class SignupOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SignupOkController 진입 완료");
		
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		Result result = new Result();
		String path = null;
		
		String memberId = request.getParameter("memberId");
		String memberPassword = request.getParameter("memberPassword");
		String memberBirth = request.getParameter("memberBirth");
		
		
		return null;
	}

}
