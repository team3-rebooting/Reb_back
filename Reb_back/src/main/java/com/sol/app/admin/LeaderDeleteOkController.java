package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.RoutineLeaderDAO;

public class LeaderDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineLeaderDAO leaderDAO = new RoutineLeaderDAO();
		int leaderNumber = Integer.valueOf(request.getParameter("leaderNumber"));
		leaderDAO.delete(leaderNumber);
		return null;
	}

}
