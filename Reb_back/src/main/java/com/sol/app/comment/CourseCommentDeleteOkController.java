package com.sol.app.comment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewCommentDAO;
import com.sol.app.routine.dao.RoutineReviewCommentDAO;

public class CourseCommentDeleteOkController  implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("CourseCommentDeleteOkController 진입");
		CourseReviewCommentDAO commentDAO = new CourseReviewCommentDAO();

		request.setCharacterEncoding("utf-8");

		// json 응답
		Gson gson = new Gson();

		// DTO 설정
		int courseReviewCommentNumber = Integer.valueOf(request.getParameter("commentNumber"));
		System.out.println("courseReviewCommentNumber 확인 :" + courseReviewCommentNumber);

		// DB 저장
		commentDAO.delete(courseReviewCommentNumber);

		// JSON 응답
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "댓글 삭제 완료")));
		
		return null;
	}
}