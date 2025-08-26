package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseDAO;
import com.sol.app.course.dao.FileCourseDAO;
import com.sol.app.dto.CourseDTO;
import com.sol.app.dto.FileCourseDTO;

public class ExpertCourseCreateRequestOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CourseDTO courseDTO = new CourseDTO();
		CourseDAO CourseDAO = new CourseDAO();
		FileCourseDTO fileCourseDTO = new FileCourseDTO();
		FileCourseDAO fileCourseDAO = new FileCourseDAO();
		Result result = new Result();

		Integer memberNumber = (Integer)request.getSession().getAttribute("memberNumber");
		
		courseDTO.setMemberNumber(memberNumber);
		courseDTO.setCourseTitle(request.getParameter("courseTitle"));
		courseDTO.setCourseContent(request.getParameter("courseText"));
		courseDTO.setCourseStartDate(request.getParameter("courseStartDate"));
		courseDTO.setCourseEndDate(request.getParameter("courseEndDate"));
		courseDTO.setCourseStartTime(request.getParameter("courseStartTime"));
		courseDTO.setCourseEndTime(request.getParameter("courseEndTime"));
		courseDTO.setMemberNumber(memberNumber);
//		요일 선택 위치
		courseDTO.setCourseDayOfWeek("");
		courseDTO.setCourseRecruitCount(Integer.parseInt(request.getParameter("recruitmentNumber")));
		courseDTO.setCoursePrice(Integer.parseInt(request.getParameter("recruitmentPrice")));
		
		
		
		
		
		
		
		return null;
	}

	
}
