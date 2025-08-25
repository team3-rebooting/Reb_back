package com.sol.app.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.myPage.MyApplicantCourseOkController;
import com.sol.app.myPage.MyApplicantRoutineOkController;

public class CommentWriteOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//String listType = request.getParameter("listType");
		//System.out.println(listType);
		

		new RoutineCommentWriteOkController().execute(request, response);
		/*
		 * switch(listType) { case "routine": break; case "course": break; }
		 */
		return null;
	}
	
}