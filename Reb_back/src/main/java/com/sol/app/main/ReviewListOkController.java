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
import com.sol.app.admin.dao.AdminBannerDAO;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.course.dao.FileCourseReviewDAO;
import com.sol.app.dto.FileCourseReviewDTO;
import com.sol.app.dto.FileRoutineReviewDTO;
import com.sol.app.routine.dao.FileRoutineReviewDAO;
import com.sol.app.routine.dao.RoutineReviewListDAO;

public class ReviewListOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("ReviewListOkController 진입");
		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		JsonArray routineList = new JsonArray();
		JsonArray courseList = new JsonArray();
		

		Result result = new Result();

		RoutineReviewListDAO routineReviewListDAO = new RoutineReviewListDAO();
		FileRoutineReviewDAO fileRoutineReviewDAO = new FileRoutineReviewDAO();
		FileCourseReviewDAO fileCourseReviewDAO = new FileCourseReviewDAO();

		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", 1);
		map.put("endRow", 3);

		routineReviewListDAO.selectAll(map).stream().map(gson::toJson).map(JsonParser::parseString).forEach((data) -> {
			JsonObject o = new JsonObject();

			int routineReviewNumber = data.getAsJsonObject().get("routineReviewNumber").getAsInt();

			o.addProperty("reviewNumber", routineReviewNumber);
			o.add("reviewCommentNumber", data.getAsJsonObject().get("routineReviewCommentNumber"));
			o.add("memberNumber", data.getAsJsonObject().get("memberNumber"));
			o.add("memberNickname", data.getAsJsonObject().get("memberNickname"));
			o.add("reviewCreatedDate", data.getAsJsonObject().get("routineReviewCreatedDate"));
			o.add("reviewUpdatedDate", data.getAsJsonObject().get("routineReviewUpdatedDate"));
			o.add("reviewContent", data.getAsJsonObject().get("routineReviewContent"));
			o.add("reviewTitle", data.getAsJsonObject().get("routineReviewTitle"));
			
			List<FileRoutineReviewDTO> fileList = fileRoutineReviewDAO.selectList(routineReviewNumber);

			if (fileList != null && fileList.size() >= 1) {
				o.addProperty("file", fileList.get(0).getFileSystemName());
			}

			routineList.add(o);
		});

		obj.add("routineReviewList", routineList);

		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();

		courseReviewDAO.selectAll(map).stream().map(gson::toJson).map(JsonParser::parseString).forEach((data) -> {
			JsonObject o = new JsonObject();
			int courseReviewNumber = data.getAsJsonObject().get("courseReviewNumber").getAsInt();

			o.addProperty("reviewNumber", courseReviewNumber);
			o.add("reviewCommentNumber", data.getAsJsonObject().get("courseReviewCommentNumber"));
			o.add("memberNumber", data.getAsJsonObject().get("memberNumber"));
			o.add("memberNickname", data.getAsJsonObject().get("memberNickname"));
			o.add("reviewCreatedDate", data.getAsJsonObject().get("courseReviewCreatedDate"));
			o.add("reviewUpdatedDate", data.getAsJsonObject().get("courseReviewUpdatedDate"));
			o.add("reviewContent", data.getAsJsonObject().get("courseReviewContent"));
			o.add("reviewTitle", data.getAsJsonObject().get("courseReviewTitle"));

			List<FileCourseReviewDTO> fileList = fileCourseReviewDAO.select(courseReviewNumber);

			if (fileList != null && fileList.size() >= 1) {
				o.addProperty("file", fileList.get(0).getFileSystemName());
			}

			courseList.add(o);
		});

		obj.add("courseReviewList", courseList);
		
		
		AdminBannerDAO adminBannerDAO = new AdminBannerDAO();
		JsonArray array = new JsonArray();

		adminBannerDAO.selectAll().stream().map(gson::toJson).map(JsonParser::parseString).forEach((data) -> {
			array.add(data.getAsJsonObject().get("fileSystemName"));
		});

		obj.add("bannerList", array);

		System.out.println("obj : " + obj.toString());

		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print(obj.toString());
		out.close();

		return null;
	}
}