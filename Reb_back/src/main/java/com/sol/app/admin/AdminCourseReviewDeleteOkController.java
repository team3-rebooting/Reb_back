package com.sol.app.admin;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.dto.CourseReviewDTO;

public class AdminCourseReviewDeleteOkController implements Execute {
	
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// json 응답
		Gson gson = new Gson();
		
		// JSON 응답
		response.setContentType("application/json; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		CourseReviewDTO courseReviewDTO = new CourseReviewDTO();
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();
		
		Integer reviewNumber = Integer.valueOf(request.getParameter("reviewNumber"));
		
		Integer memberNumber = Integer.valueOf(request.getParameter("memberNumber"));

		if(reviewNumber == null) {
			response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "삭제 실패")));
			return null;
		}
		
		if (memberNumber == null) {
			response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "memberNumber 오류")));
			return null;
		}

		courseReviewDTO.setMemberNumber(memberNumber);
		courseReviewDTO.setCourseReviewNumber(reviewNumber);
		
		courseReviewDAO.delete(courseReviewDTO.getCourseReviewNumber());
		response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "삭제 완료")));

		return null;
	}
}
