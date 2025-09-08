package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class MyCourseApplicantController  implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MyCourseApplicantController 진입");
		Result result = new Result();
		HttpSession session = request.getSession();
		
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		Integer expertNumber = (Integer)session.getAttribute("expertNumber");
		String path = null;
		
		if(memberNumber == null) {
			path = request.getContextPath() + "/app/auth/login.jsp";
		}else if(expertNumber == null){
			return null;
		}else {
			path =  request.getContextPath() + "/app/mypage/my-course-applicant.jsp";
			System.out.println("courseNumber : " +  request.getParameter("courseNumber"));
			
			Cookie cookie = new Cookie("courseNumber", request.getParameter("courseNumber"));
			cookie.setPath("/");
			cookie.setMaxAge(60);
			response.addCookie(cookie); 
		}
		
		result.setPath(path);
		result.setRedirect(false);
		
		return result;
	}
}

