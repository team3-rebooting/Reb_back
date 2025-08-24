package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.member.dao.MemberDAO;

public class CourseListOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		String path = null;
		
		if(memberNumber == null) {
			path = "/app/course/course-review-list.jsp";
		} else {
			path = "/app/course/course-review-write.jsp";
			request.setAttribute("memberId", memberDAO.getMemberId(memberNumber));
		}
		
		result.setPath(path);
		result.setRedirect(false);
		
		return result;
	}

}
