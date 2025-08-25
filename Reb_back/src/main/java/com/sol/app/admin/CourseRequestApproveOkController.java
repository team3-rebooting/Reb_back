package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminCourseRequestDAO;

public class CourseRequestApproveOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		AdminCourseRequestDAO requestDAO = new AdminCourseRequestDAO();
		
		int requestNumber = Integer.valueOf(request.getParameter("courseNumber"));
		requestDAO.approve(requestNumber);
		
		result.setPath("/admin/courseRequestListOk.ad");
		result.setRedirect(true);
		return result;
	}

}
