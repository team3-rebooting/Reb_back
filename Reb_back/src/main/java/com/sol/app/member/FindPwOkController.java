package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MemberDTO;
import com.sol.app.member.dao.MemberDAO;

public class FindPwOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("FindPwOkController 진입 완료");
		
		String name = request.getParameter("modalPwName");
		String phone = request.getParameter("modalPwPhone");
		String id = request.getParameter("modalPwId");
		
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		
		request.setCharacterEncoding("UTF-8");
		
		memberDTO.setMemberName(name);
		memberDTO.setMemberPhoneNumber(phone);
		memberDTO.setMemberId(id);
		
		MemberDTO findMemberDTO = memberDAO.findPw(memberDTO);
		findMemberDTO.setMemberName(name);
		
		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		Gson gson = new Gson();
		
		if(findMemberDTO != null) {
			String json = gson.toJson(findMemberDTO);
			response.getWriter().write(json);
		} else {
			response.getWriter().write("{}");
		}
		
		return null;
	}

	
}
