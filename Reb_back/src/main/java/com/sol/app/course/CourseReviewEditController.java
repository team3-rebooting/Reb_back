package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;

public class CourseReviewEditController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("CourseReviewEditController 진입 성공");
		System.out.println(request.getParameter("courseReviewNumber"));
		
		int courseReviewNumber = Integer.valueOf(request.getParameter("courseReviewNumber"));
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();
		Result result = new Result();
		
		request.setAttribute("courseReview", courseReviewDAO.select(courseReviewNumber));
		
		result.setPath("/app/course/course-review-edit.jsp");
		result.setRedirect(false);
		
		return result;
	}

	
}
