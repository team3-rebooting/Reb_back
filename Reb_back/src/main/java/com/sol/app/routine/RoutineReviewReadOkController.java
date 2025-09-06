package com.sol.app.routine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.RoutineReviewListDTO;
import com.sol.app.myPage.dao.FileMemberProfileDAO;
import com.sol.app.routine.dao.FileRoutineReviewDAO;
import com.sol.app.routine.dao.RoutineReviewListDAO;

public class RoutineReviewReadOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineReviewListDAO routineReviewListDAO = new RoutineReviewListDAO();
		RoutineReviewListDTO routineReviewListDTO = new RoutineReviewListDTO();
		
		FileRoutineReviewDAO fileRoutineReviewDAO = new FileRoutineReviewDAO();
		
		FileMemberProfileDAO fileMemberProfileDAO = new FileMemberProfileDAO();
		
		Result result = new Result();
		
		routineReviewListDTO = routineReviewListDAO.select(Integer.valueOf(request.getParameter("routineReviewNumber")));
		
		if(routineReviewListDTO.getRoutineReviewNumber() != 0) {
			routineReviewListDTO.setFileRoutineReviewList(fileRoutineReviewDAO.selectList(routineReviewListDTO.getRoutineReviewNumber()));
			routineReviewListDTO.setFileMemberProfile(fileMemberProfileDAO.select(routineReviewListDTO.getMemberNumber()));
		}
		System.out.println("routineReviewListDTO : " + routineReviewListDTO);
		
		request.setAttribute("routineReview", routineReviewListDTO);
		result.setPath("/app/routine/routine-meeting-review-detail.jsp");
		result.setRedirect(false);
		
		return result;
	}
}
