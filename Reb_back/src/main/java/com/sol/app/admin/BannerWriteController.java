package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class BannerWriteController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		HttpSession session = request.getSession();
		String path = null;
		//관리자 번호는 세션에서 가져오고
		Integer adminNumber = (Integer)session.getAttribute("adminNumber");
		
		if(adminNumber == null) {
			path = "/app/admin/login/admin-login.jsp";
		}else {
			path = "/app/admin/banner/admin-banner-create.jsp";
		}
		result.setPath(path);
		result.setRedirect(false);
		return result;
	}

}
