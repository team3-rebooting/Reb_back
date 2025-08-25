package com.sol.app.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;

public class CommentListOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String listType = request.getParameter("listType");
		System.out.println(listType);
		
		switch(listType) {
		case "routine":
			new RoutineCommentOkController().execute(request, response);
			break;
		case "course":
			break;
		}
		
		return null;
	}
}