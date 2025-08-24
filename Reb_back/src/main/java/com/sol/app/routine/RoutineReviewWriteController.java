package com.sol.app.routine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class RoutineReviewWriteController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RoutineReviewWriteController 진입");
		
		Result result = new Result();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		
		int tempRoutineNumber =  1;
		
		if(memberNumber == null)
		{
			System.out.println("로그인 필요");
			result.setPath("/member/login.me");
			result.setRedirect(true);
		}
		else {
			request.setAttribute("routineNumber", tempRoutineNumber);
			result.setPath("/app/routine/routine-meeting-review-write.jsp");
			result.setRedirect(false);
		}
		
		return result;
	}
}