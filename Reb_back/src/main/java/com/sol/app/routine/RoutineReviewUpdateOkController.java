package com.sol.app.routine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.RoutineReviewListDTO;
import com.sol.app.routine.dao.RoutineReviewListDAO;

public class RoutineReviewUpdateOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		// json 응답
		Gson gson = new Gson();
		
		// JSON 응답
		response.setContentType("application/json; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		RoutineReviewListDTO routineReviewListDTO = new RoutineReviewListDTO();
		RoutineReviewListDAO routineReviewListDAO = new RoutineReviewListDAO();
		
		Integer reviewNumber = Integer.valueOf(request.getParameter("reviewNumber"));
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		
		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
			
		}
		else if(reviewNumber == null) {
			return null;
		} else {
			routineReviewListDTO = routineReviewListDAO.select(reviewNumber);
			request.setAttribute("routineReview", routineReviewListDTO);
			
			result.setPath(request.getContextPath() + "/routine/routineUpdate.ro");
			result.setRedirect(false);
		}
		
		return result;
	}
}
