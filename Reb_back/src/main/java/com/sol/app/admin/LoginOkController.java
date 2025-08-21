package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminDAO;
import com.sol.app.dto.AdminDTO;

public class LoginOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminDAO adminDAO = new AdminDAO();
		Result result = new Result();
		AdminDTO adminDTO = adminDAO.login(request.getParameter("adminId"), request.getParameter("adminPassword"));
		System.out.println(adminDTO);
		if(adminDTO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("adminNumber",adminDTO.getAdminNumber());
			//여기서 메인으로 보내주면됨
			result.setPath(request.getContextPath() + "/admin/noticeList.ad");
			result.setRedirect(true);
		}
		else {
			result.setPath(request.getContextPath() + "/admin/login.ad");
			result.setRedirect(true);
		}
		return result;
	}

}
