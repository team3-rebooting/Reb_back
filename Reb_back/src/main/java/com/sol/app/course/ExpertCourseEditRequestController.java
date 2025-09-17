package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseListDAO;
import com.sol.app.course.dao.FileCourseDAO;
import com.sol.app.dto.CourseListDTO;

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
		
		CourseListDTO courseListDTO = courseListDAO.select(courseNumber);
		
		FileCourseDAO fileCourseDAO = new FileCourseDAO();

		if(courseListDTO.getCourseNumber() != 0)
			courseListDTO.setFileCourseList(fileCourseDAO.selectList(courseListDTO.getCourseNumber()));
				
		request.setAttribute("course", courseListDTO);
		
		result.setPath("/app/course/expert-course-edit-request.jsp");
		result.setRedirect(false);
		
		System.out.println("path : " + result.getPath());
		
		return result;
	}

	
}
