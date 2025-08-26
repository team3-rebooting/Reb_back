package com.sol.app.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;

public class CommentDeleteOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String listType = request.getParameter("listType");
		System.out.println("commentListType : " + listType);

		switch (listType) {
		case "routine":
			new RoutineCommentDeleteOkController().execute(request, response);
			break;
		case "course":
			new CourseCommentDeleteOkController().execute(request, response);
			break;
		}

		return null;
	}

}
