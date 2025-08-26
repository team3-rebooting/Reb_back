package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminCourseDAO;

public class CourseDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		AdminCourseDAO courseDAO = new AdminCourseDAO();
		int courseNumber = Integer.valueOf(request.getParameter("courseNumber"));
		courseDAO.updateDelete(courseNumber);
		
		result.setPath("/admin/courseListOk.ad");
		result.setRedirect(true);
		return result;
	}

}
