package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseListDAO;

public class ExpertCourseEditRequestController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ExpertCourseEditRequestController 진입 성공");
		
		Result result = new Result();
		CourseListDAO courseListDAO = new CourseListDAO();
		HttpSession session = request.getSession();
		Integer expertNumber = (Integer)session.getAttribute("expertNumber");
		
		Integer courseNumber = Integer.valueOf(request.getParameter("courseNumber"));

		String path = null;
		
		if(expertNumber == null) {
			path = "/course/courseDetailOk.co?courseNumber=" + courseNumber;
			result.setRedirect(false);

			return result;
		}
		if(courseNumber == null) {
			path = "/course/courseListOk.co";
			result.setRedirect(true);

			return result;
		}
				
		request.setAttribute("course", courseListDAO.select(courseNumber));
		
		result.setPath("/app/course/expert-course-edit-request.jsp");
		result.setRedirect(false);
		
		return result;
	}

	
}
