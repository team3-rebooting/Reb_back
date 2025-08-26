package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineDAO;

public class RoutineDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminRoutineDAO routineDAO = new AdminRoutineDAO();
		int routineNumber = Integer.valueOf(request.getParameter("routineNumber"));
		routineDAO.delete(routineNumber);
		System.out.println("삭제 완료");
		return null;
	}

}
