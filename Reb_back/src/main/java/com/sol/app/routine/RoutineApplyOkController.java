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
import com.sol.app.dto.RoutineMemberApplicantDTO;
import com.sol.app.routine.dao.RoutineMemberApplicantDAO;

public class RoutineApplyOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// JSON 응답
		response.setContentType("application/json; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		RoutineMemberApplicantDTO applicantDTO = new RoutineMemberApplicantDTO();
		RoutineMemberApplicantDAO applicantDAO = new RoutineMemberApplicantDAO();

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		// json 응답
		Gson gson = new Gson();

		if (memberNumber == null) {
			response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "로그인 후 가능합니다")));
			return null;
		}

		BufferedReader reader = request.getReader();
		JsonObject jsonObject = JsonParser.parseString(reader.lines().collect(Collectors.joining())).getAsJsonObject();

		// 필수 파라미터 확인
		if (!jsonObject.has("apply") || !jsonObject.has("routineNumber")) {
			response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "필수 정보 없음")));
			return null;
		}
		
		boolean apply = jsonObject.get("apply").getAsBoolean();
		int routineNumber = jsonObject.get("routineNumber").getAsInt();

		Map<String, Integer> map = new HashMap<>();

		map.put("routineNumber", routineNumber);
		map.put("memberNumber", memberNumber);

		applicantDTO.setMemberNumber(memberNumber);
		applicantDTO.setRoutineNumber(routineNumber);

		if (apply) {
			if (applicantDAO.select(map)) {
				response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "이미 신청한 상태입니다.")));
				return null;
			} else {
				applicantDAO.insert(applicantDTO);
				response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "신청 완료")));
			}
		} else {
			if (applicantDAO.select(map)) {
				applicantDAO.delete(map);
				response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "취소 완료")));
			} else {
				response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "신청하지 않은 상태입니다.")));
				return null;
			}
		}

		return null;
	}
}