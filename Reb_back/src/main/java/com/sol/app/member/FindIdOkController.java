package com.sol.app.member;

import java.io.IOException;
import java.util.List;

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

		request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("modalIdName");
		String phone = request.getParameter("modalIdPhone");

		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemberName(name);
		memberDTO.setMemberPhoneNumber(phone);

		MemberDAO memberDAO = new MemberDAO(); // SqlSession 주입 필요
		List<MemberDTO> memberList = memberDAO.findIds(memberDTO);

		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		Gson gson = new Gson();
		String json = gson.toJson(memberList);
		response.getWriter().write(json);

		// Result 객체 반환(JSON 응답 처리 후 페이지 이동 없음)

		return null;
	}

}