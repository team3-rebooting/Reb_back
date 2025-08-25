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
		String listType = request.getParameter("listType");
		System.out.println("commentListType : " + listType);

		switch (listType) {
		case "routine":
			new RoutineCommentWriteOkController().execute(request, response);
			break;
		case "course":
			new CourseCommentWriteOkController().execute(request, response);
			break;
		}

		return null;
	}

}