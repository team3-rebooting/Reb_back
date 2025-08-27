package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class KakaoLoginController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Result result = new Result();
		
		String code = request.getParameter("code");
		
		HttpSession session = request.getSession();
		session.setAttribute("code", code);
		
		System.out.println("code : " + code);
		result.setRedirect(true);
		result.setPath("/main/reviewListOk.ma");
		
		return result;
	}
}
