package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;

public class MyApplicantOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();

		new MyApplicantCourseOkController().execute(request, response);
		new MyApplicantRoutineOkController().execute(request, response);

		result.setPath(request.getContextPath() + "/app/mypage/my-courses.jsp");
		result.setRedirect(false);
		
		return result;
	}
}
