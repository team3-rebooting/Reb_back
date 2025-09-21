package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.course.dao.FileCourseReviewDAO;
import com.sol.app.dto.CourseReviewListDTO;

public class CourseReviewEditController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("CourseReviewEditController 진입 성공");
		System.out.println(request.getParameter("courseReviewNumber"));
		
		Integer courseReviewNumber = Integer.valueOf(request.getParameter("courseReviewNumber"));
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();
		CourseReviewListDTO courseReviewListDTO = new CourseReviewListDTO();
		FileCourseReviewDAO fileCourseReviewDAO = new FileCourseReviewDAO();
		Result result = new Result();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		
		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
			
		}
		else if(courseReviewNumber == null) {
			return null;
		} else {
			courseReviewListDTO = courseReviewDAO.select(courseReviewNumber);

			/*
			 * routineReviewListDTO.setFileRoutineReviewList(fileRoutineReviewDAO.selectList
			 * (routineReviewListDTO.getRoutineReviewNumber()));
			 * 
			 * request.setAttribute("routineReview", routineReviewListDTO);
			 * 
			 * System.out.println(routineReviewListDTO);
			 * 
			 * result.setPath(request.getContextPath() + "/routine/routineUpdate.ro");
			 * result.setRedirect(false);
			 */
		}
		
		request.setAttribute("courseReview", courseReviewDAO.select(courseReviewNumber));
		
		result.setPath("/app/course/course-review-edit.jsp");
		result.setRedirect(false);
		
		return result;
	}

	
}
