package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class ExpertCourseCreateRequestController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("ExpertCourseCreateRequestController 진입 성공");
		
		Result result = new Result();
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		String path = null;
		
		path = "/course/export-course-crete-request.jsp";
		
		result.setPath(path);
		result.setRedirect(true);
		
		
		return result;
	}

	
}
