package com.sol.app.course;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseMemberApplicantDAO;
import com.sol.app.dto.CourseMemberApplicantDTO;

public class CourseReviewWriteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("CourseReviewWriteController 진입 성공");

		Result result = new Result();
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		String path = null;
		CourseMemberApplicantDTO courseMemberApplicantDTO = new CourseMemberApplicantDTO();
		CourseMemberApplicantDAO courseMemberApplicantDAO = new CourseMemberApplicantDAO();
		
		if(memberNumber == null) {
			path = "/app/auth/login.jsp";
		} else {
			path = "/app/course/course-review-write.jsp";
		}
		
		List<CourseMemberApplicantDTO> list = courseMemberApplicantDAO.selectAll(memberNumber);
		request.setAttribute("courseMemberApplicant", list);
		
		result.setPath(path);
		result.setRedirect(false);
		
		return result;
	}

	
}
