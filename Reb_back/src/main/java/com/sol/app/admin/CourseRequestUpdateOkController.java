package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminCourseDAO;
import com.sol.app.admin.dao.AdminCourseRequestDAO;
import com.sol.app.dto.AdminCourseRequestDTO;

public class CourseRequestUpdateOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		AdminCourseRequestDAO requestDAO = new AdminCourseRequestDAO();
		AdminCourseDAO courseDAO = new AdminCourseDAO();
		AdminCourseRequestDTO requestDTO = requestDAO.select(Integer.parseInt(request.getParameter("courseNumber")));
		//이전 수업 삭제
		System.out.println(requestDTO.getPrevCourseNumber());
		courseDAO.delete(requestDTO.getPrevCourseNumber());
		//수업 승인
		requestDAO.update(requestDTO.getCourseNumber());
		
		result.setPath("/admin/courseRequestListOk.ad");
		result.setRedirect(true);
		
		return result;
	}

}
