package com.sol.app.routine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.RoutineReviewListDTO;
import com.sol.app.routine.dao.RoutineReviewListDAO;

public class RoutineReviewReadOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineReviewListDAO routineReviewListDAO = new RoutineReviewListDAO();
		RoutineReviewListDTO routineReviewListDTO = new RoutineReviewListDTO();
		
		Result result = new Result();
		
		routineReviewListDTO = routineReviewListDAO.select(Integer.valueOf(request.getParameter("routineReviewNumber")));
		
		request.setAttribute("routineReview", routineReviewListDTO);
		result.setPath("/app/routine/routine-meeting-review-detail.jsp");
		
		result.setRedirect(false);
		
		return result;
	}
}
