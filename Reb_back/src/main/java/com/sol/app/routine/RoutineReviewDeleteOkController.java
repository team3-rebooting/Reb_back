package com.sol.app.routine;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
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
import com.sol.app.dto.RoutineReviewDTO;
import com.sol.app.routine.dao.RoutineReviewDAO;

public class RoutineReviewDeleteOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// json 응답
		Gson gson = new Gson();
		
		// JSON 응답
		response.setContentType("application/json; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		RoutineReviewDTO routineReviewDTO = new RoutineReviewDTO();
		RoutineReviewDAO routineReviewDAO = new RoutineReviewDAO();
		
		Integer reviewNumber = Integer.valueOf(request.getParameter("reviewNumber"));
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		if(reviewNumber == null) {
			response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "삭제 실패")));
			return null;
		}
		
		if (memberNumber == null) {
			response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "로그인 후 가능합니다")));
			return null;
		}

		routineReviewDTO.setMemberNumber(memberNumber);
		routineReviewDTO.setRoutineReviewNumber(reviewNumber);
		
		routineReviewDAO.delete(routineReviewDTO);
		response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "삭제 완료")));

		return null;
	}
}
