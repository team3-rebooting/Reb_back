package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminCourseDAO;
import com.sol.app.admin.dao.AdminCourseRequestDAO;
import com.sol.app.dto.CourseDTO;
import com.sol.app.dto.CourseDeletedDTO;

public class CourseRequestDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		AdminCourseRequestDAO requestDAO = new AdminCourseRequestDAO();
		AdminCourseDAO courseDAO = new AdminCourseDAO();
		int requestNumber = Integer.valueOf(request.getParameter("courseNumber"));
		CourseDTO courseDTO = courseDAO.selectCourse(requestNumber);
		CourseDeletedDTO courseDeletedDTO = new CourseDeletedDTO();
		courseDeletedDTO.setCourseNumber(requestNumber);
		courseDeletedDTO.setCourseTitle(courseDTO.getCourseTitle());
		courseDeletedDTO.setExpertNumber(courseDTO.getExpertNumber());
		requestDAO.deletedCourse(courseDeletedDTO);

		requestDAO.deleteApprove(requestNumber);
		courseDAO.delete(requestNumber);
		
		result.setPath("/admin/courseRequestListOk.ad");
		result.setRedirect(true);
		return result;
	}
	
}
