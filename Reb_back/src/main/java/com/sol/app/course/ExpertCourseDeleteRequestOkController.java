package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseDAO;
import com.sol.app.course.dao.CourseListDAO;
import com.sol.app.course.dao.CourseRequestDAO;
import com.sol.app.course.dao.FileCourseDAO;
import com.sol.app.dto.CourseDTO;
import com.sol.app.dto.CourseRequestDTO;
import com.sol.app.dto.FileCourseDTO;

public class ExpertCourseDeleteRequestOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("expertCourseDeleteRequestOkController 진입 성공");

		request.setCharacterEncoding("UTF-8");
		Result result = new Result();
		
		CourseRequestDAO courseRequestDAO = new CourseRequestDAO();
		CourseRequestDTO courseRequestDTO = new CourseRequestDTO();
		
		int courseNumber = Integer.parseInt(request.getParameter("courseNumber"));
		System.out.println(courseNumber);
		String courseDeleteRequestReason = request.getParameter("requestReason");
		System.out.println(courseDeleteRequestReason);
		courseRequestDTO = courseRequestDAO.select(courseNumber);
		System.out.println("이전 수업 요청 데이터");
		System.out.println(courseRequestDTO);
		
		courseRequestDTO.setCourseOpenStatusNumber(1);
		courseRequestDTO.setCourseRequestTypeNumber(3);
		courseRequestDTO.setCourseRejectReason(courseDeleteRequestReason);

		System.out.println("삭제 요청 데이터");
		System.out.println(courseRequestDTO);
		
		courseRequestDAO.delete(courseNumber);
		courseRequestDAO.insert(courseRequestDTO);

		result.setPath("/course/courseDetailOk.co?courseNumber="+courseNumber);
		result.setRedirect(false);
		
		return result;
	}

	
	
}
