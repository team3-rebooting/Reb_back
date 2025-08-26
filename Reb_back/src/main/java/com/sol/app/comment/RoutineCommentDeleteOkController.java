package com.sol.app.comment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.routine.dao.RoutineReviewCommentDAO;

public class RoutineCommentDeleteOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineReviewCommentDAO commentDAO = new RoutineReviewCommentDAO();

		request.setCharacterEncoding("utf-8");

		// json 응답
		Gson gson = new Gson();

		// Json 데이터 읽기
		BufferedReader reader = request.getReader();
		JsonObject jsonObject = JsonParser.parseString(reader.lines().collect(Collectors.joining())).getAsJsonObject();

		
		// 필수 파라미터 확인
		if (!jsonObject.has("reviewNumber")) {
			response.setContentType("application/json; charset=utf-8");
			response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "필수 데이터가 없습니다")));
			return null;
		}

		// DTO 설정
		int routineReviewCommentNumber = jsonObject.get("commentNumber").getAsInt();
		System.out.println("routineReviewCommentNumber 확인 :" + routineReviewCommentNumber);

		// DB 저장
		commentDAO.delete(routineReviewCommentNumber);

		// JSON 응답
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "댓글 삭제 완료")));
		
		return null;
	}
}
