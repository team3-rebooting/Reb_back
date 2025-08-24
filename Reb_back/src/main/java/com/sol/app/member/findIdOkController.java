package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MemberDTO;
import com.sol.app.member.dao.MemberDAO;

public class findIdOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("PhoneVerificationOkController 진입 완료");

		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();

		memberDTO.setMemberName(request.getParameter("modalIdName"));
		memberDTO.setMemberPhoneNumber(request.getParameter("modalIdPhone"));

//		memberDTO = memberDAO.findId(memberDTO);

		memberDTO = memberDAO.findId(memberDTO);
		ObjectMapper mapper = new ObjectMapper();

		

		return result;
	}

}