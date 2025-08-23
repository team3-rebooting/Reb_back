package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;

public class CourseReviewDetailOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Result result = new Result();
		
		String courseReviewNumberStr = request.getParameter("courseReviewNumber");
		if(courseReviewNumberStr == null || courseReviewNumberStr.trim().isEmpty()) {
			System.out.println("courseReviewNumber 값이 없습니다");
			result.setPath("/app/course/course-review-list.jsp");
			result.setRedirect(true);
			return result;
		}
		
		int CourseReviewNumber = Integer.parseInt(courseReviewNumberStr);
		
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();
		
	}

	
}
