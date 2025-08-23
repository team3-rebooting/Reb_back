package com.sol.app.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.member.dao.MemberDAO;

public class CheckIdOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("CheckIdOkController 진입 완료");
		
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		
		// 클라이언트에서 전달받은 memberId
		String memberId = request.getParameter("memberId");
		boolean isAvailable = memberDAO.checkId(memberId);
		
		// JSON 형식 응답 설정
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		// JSON 응답 작성
		try (PrintWriter out = response.getWriter()){
			out.print("{\"available\" : " + isAvailable + "}");
			out.flush();
		}
		
		// Result 객체 반환(JSON 응답 처리 후 페이지 이동 없음)
		result.setPath(null);
		result.setRedirect(false);
		
		return result;
	}

	
}
