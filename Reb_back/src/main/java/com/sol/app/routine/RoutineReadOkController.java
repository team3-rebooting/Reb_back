package com.sol.app.routine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.RoutineListDTO;
import com.sol.app.routine.dao.FileRoutineDAO;
import com.sol.app.routine.dao.RoutineListDAO;
import com.sol.app.routine.dao.RoutineMemberApplicantDAO;

public class RoutineReadOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineListDAO routineListDAO = new RoutineListDAO();
		RoutineListDTO routineListDTO = new RoutineListDTO();

		RoutineMemberApplicantDAO applicantDAO = new RoutineMemberApplicantDAO();

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		FileRoutineDAO fileRoutineDAO = new FileRoutineDAO();
		Result result = new Result();

		routineListDTO = routineListDAO.select(Integer.valueOf(request.getParameter("routineNumber")));

		if (routineListDTO.getRoutineNumber() != 0)
			routineListDTO.setFileRoutineList(fileRoutineDAO.selectList(routineListDTO.getRoutineNumber()));

		Map<String, Integer> map = new HashMap<>();

		int routineNumber = routineListDTO.getRoutineNumber();

		map.put("routineNumber", routineNumber);
		map.put("memberNumber", memberNumber);

		request.setAttribute("applicant", applicantDAO.select(map));
		routineListDTO.setRoutineApplicantCount(applicantDAO.getCount(routineNumber));

		System.out.println("routineListDTO : " + routineListDTO);
		request.setAttribute("routine", routineListDTO);

		result.setPath("/app/routine/routine-meeting-detail-ing.jsp");
		result.setRedirect(false);

		return result;
	}
}
