package com.sol.app.routine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.RoutineListDTO;
import com.sol.app.routine.dao.FileRoutineDAO;
import com.sol.app.routine.dao.RoutineListDAO;

public class RoutineReadOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineListDAO routineListDAO = new RoutineListDAO();
		RoutineListDTO routineListDTO = new RoutineListDTO();
		
		FileRoutineDAO fileRoutineDAO = new FileRoutineDAO();
		Result result = new Result();
		
		routineListDTO = routineListDAO.select(Integer.valueOf(request.getParameter("routineNumber")));
		
		if(routineListDTO.getRoutineNumber() != 0)
			routineListDTO.setFileRoutineList(fileRoutineDAO.selectList(routineListDTO.getRoutineNumber()));
		
		System.out.println("routineListDTO : " + routineListDTO);
		
		request.setAttribute("routine", routineListDTO);
		result.setPath("/app/routine/routine-meeting-detail-ing.jsp");
		result.setRedirect(false);
		
		return result;
	}
}
