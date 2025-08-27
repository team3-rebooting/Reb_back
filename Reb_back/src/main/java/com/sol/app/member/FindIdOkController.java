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

public class FindIdOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("FindIdOkController 진입 완료");
		
		String name = request.getParameter("modalIdName");
		String phone = request.getParameter("modalIdPhone");
		
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = new MemberDAO();
		
		request.setCharacterEncoding("UTF-8");

		memberDTO.setMemberName(name);
		memberDTO.setMemberPhoneNumber(phone);

		MemberDTO findMemberDTO = memberDAO.findId(memberDTO);
		
		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		Gson gson = new Gson();
		
		if(findMemberDTO != null) {
			String json = gson.toJson(findMemberDTO);
			response.getWriter().write(json);
		} else {
			response.getWriter().write("{}");
		}
		

		// Result 객체 반환(JSON 응답 처리 후 페이지 이동 없음)

		return null;
	}

}