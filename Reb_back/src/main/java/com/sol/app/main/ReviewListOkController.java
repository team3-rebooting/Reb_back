package com.sol.app.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.dto.CourseReviewListDTO;
import com.sol.app.routine.dao.RoutineReviewListDAO;

public class ReviewListOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		JsonArray list = new JsonArray();

		Result result = new Result();
		RoutineReviewListDAO routineReviewListDAO = new RoutineReviewListDAO();

		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", 1);
		map.put("endRow", 3);


		routineReviewListDAO.selectAll(map).stream().map(gson::toJson).map(JsonParser::parseString).forEach((data) -> {
			JsonObject o = new JsonObject();

			o.add("reviewNumber", data.getAsJsonObject().get("routineReviewNumber"));
			o.add("reviewCommentNumber", data.getAsJsonObject().get("routineReviewCommentNumber"));
			o.add("memberNumber", data.getAsJsonObject().get("memberNumber"));
			o.add("memberNickname", data.getAsJsonObject().get("memberNickname"));
			o.add("reviewCreatedDate", data.getAsJsonObject().get("routineReviewCreatedDate"));
			o.add("reviewUpdatedDate", data.getAsJsonObject().get("routineReviewUpdatedDate"));
			o.add("reviewContent", data.getAsJsonObject().get("routineReviewContent"));

			list.add(o);
		});

		obj.add("routineReviewList", list);
		
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();

		courseReviewDAO.selectAll(map).stream().map(gson::toJson).map(JsonParser::parseString).forEach((data) -> {
			JsonObject o = new JsonObject();

			o.add("reviewNumber", data.getAsJsonObject().get("routineReviewNumber"));
			o.add("reviewCommentNumber", data.getAsJsonObject().get("routineReviewCommentNumber"));
			o.add("memberNumber", data.getAsJsonObject().get("memberNumber"));
			o.add("memberNickname", data.getAsJsonObject().get("memberNickname"));
			o.add("reviewCreatedDate", data.getAsJsonObject().get("routineReviewCreatedDate"));
			o.add("reviewUpdatedDate", data.getAsJsonObject().get("routineReviewUpdatedDate"));
			o.add("reviewContent", data.getAsJsonObject().get("routineReviewContent"));

			list.add(o);
		});
		
		obj.add("courseReviewList", list);

		System.out.println("obj : " + obj.toString());

		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print(obj.toString());
		out.close();

		/*
		 * String code = request.getParameter("code");
		 * System.out.println("====================code : " + code) ;
		 * 
		 * Cookie cookie = new Cookie("authorize-access-token", code);
		 * cookie.setMaxAge(60 * 60 * 24); // 1일 response.addCookie(cookie);
		 */

		return null;
	}
}