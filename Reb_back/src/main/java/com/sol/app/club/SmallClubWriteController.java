package com.sol.app.club;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class SmallClubWriteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("SmallClubWriteController 진입 성공");

		Result result = new Result();
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		String path = null;
		
		if(memberNumber == null) {
			path = request.getContextPath() + "/member/login.me";
		} else {
			path = "/app/club/small-club-write.jsp";
		}
		
		result.setPath(path);
		result.setRedirect(false);
		
		return result;
	}

	
}
