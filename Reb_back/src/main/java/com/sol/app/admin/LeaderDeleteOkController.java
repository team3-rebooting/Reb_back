package com.sol.app.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineDAO;
import com.sol.app.admin.dao.RoutineLeaderDAO;
import com.sol.app.dto.AdminRoutineDTO;

public class LeaderDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineLeaderDAO leaderDAO = new RoutineLeaderDAO();
		int leaderNumber = Integer.valueOf(request.getParameter("leaderNumber"));
		AdminRoutineDAO routineDAO = new AdminRoutineDAO();
		List<AdminRoutineDTO> list = routineDAO.selectFromLeader(leaderNumber);
		if(list.size()==0) {
			leaderDAO.delete(leaderNumber);
			response.getWriter().write("{\"status\":\"success\"}");
		}
		else {
			response.getWriter().write("{\"status\":\"fail\",\"message\":\"모임이 있는 리더는 삭제할 수 없습니다.\"}");
		}
		return null;
	}

}
