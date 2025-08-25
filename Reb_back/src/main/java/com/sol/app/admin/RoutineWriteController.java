package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminDAO;

public class RoutineWriteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminDAO adminDAO = new AdminDAO();
		Result result = new Result();
		HttpSession session = request.getSession();
		Integer adminNumber = (Integer)session.getAttribute("adminNumber");
		String path = null;
		
		if(adminNumber == null) {
			path = "/app/admin/login/admin-login.jsp";
		}else {
			path = "/app/admin/routine/admin-routine-create.jsp";
			request.setAttribute("adminId", adminDAO.getAdminId(adminNumber));
		}
		
		result.setPath(path);
		result.setRedirect(false);
		
		
		return result;
	}

}
