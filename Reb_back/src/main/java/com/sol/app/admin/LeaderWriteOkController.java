package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.RoutineLeaderDAO;
import com.sol.app.dto.RoutineLeaderDTO;

public class LeaderWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		RoutineLeaderDAO leaderDAO = new RoutineLeaderDAO();
		RoutineLeaderDTO leaderDTO = new RoutineLeaderDTO();
		
		leaderDTO.setRoutineLeaderName(request.getParameter("leaderName"));
		System.out.println(leaderDTO);
		leaderDAO.insert(leaderDTO);
		
		result.setPath("/admin/leaderListOk.ad");
		result.setRedirect(true);
		
		return result;
	}

}
