package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dao.MemberDAO;

public class MyPasswordController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		String path = null;
		
		if(memberNumber == null) {
			path = request.getContextPath() + "/app/auth/login.jsp";
		}else {
			path =  request.getContextPath() + "/app/mypage/mypage-password.jsp";
		}
		
		result.setPath(path);
		result.setRedirect(false);
		
		return result;
	}
}
