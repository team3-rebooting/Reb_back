package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.member.dao.MemberDAO;

public class CourseReviewWriteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("CourseReviewWriteController 진입 성공");
		
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		String path = null;
		
		
		
		result.setPath("/app/course/course-write.jsp");
		result.setRedirect(false);
		
		return result;
	}

	
}
