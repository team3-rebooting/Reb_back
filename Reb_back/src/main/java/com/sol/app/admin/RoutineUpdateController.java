package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineDAO;
import com.sol.app.dto.AdminRoutineDTO;
import com.sol.app.file.dao.FileRoutineDAO;

public class RoutineUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int routineNumber = Integer.valueOf(request.getParameter("routineNumber"));
		AdminRoutineDAO routineDAO = new AdminRoutineDAO();
		FileRoutineDAO fileDAO = new FileRoutineDAO();
		Result result = new Result();
		
		//routineDTO를 불러와서
		AdminRoutineDTO routineDTO = routineDAO.select(routineNumber);
		//파일 추가
		routineDTO.setFileRoutineList(fileDAO.select(routineNumber));
		//추가한 파일까지 같이 set
		request.setAttribute("routine", routineDTO);
		result.setPath("/app/admin/routine/admin-routine-edit.jsp");
		result.setRedirect(false);
		return result;
	}

}
