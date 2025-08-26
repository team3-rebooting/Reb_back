package com.sol.app.course;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseListDAO;
import com.sol.app.course.dao.CourseMemberApplicantDAO;
import com.sol.app.course.dao.FileCourseDAO;
import com.sol.app.dto.CourseListDTO;

public class CourseDetailOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CourseListDAO courseListDAO= new CourseListDAO();
		CourseListDTO courseListDTO = new CourseListDTO();
		
		CourseMemberApplicantDAO applicantDAO = new CourseMemberApplicantDAO();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
				
		FileCourseDAO fileCourseDAO = new FileCourseDAO();
		Result result = new Result();
		
		courseListDTO = courseListDAO.select(Integer.valueOf(request.getParameter("courseNumber")));

		if(courseListDTO.getCourseNumber() != 0)
			courseListDTO.setFileCourseList(fileCourseDAO.selectList(courseListDTO.getCourseNumber()));
		
		int courseNumber = courseListDTO.getCourseNumber();
		
		Map<String, Integer> map = new HashMap<>();

		map.put("courseNumber", courseNumber);
		map.put("memberNumber", memberNumber);

		request.setAttribute("applicant", applicantDAO.select(map));
		courseListDTO.setCourseApplicantCount(applicantDAO.getCount(courseNumber));

		System.out.println("courseListDTO : " + courseListDTO);
		request.setAttribute("course", courseListDTO);
		result.setPath("/app/course/course-detail-user-ing.jsp");
		result.setRedirect(false);
		
		return result;
	}
}
