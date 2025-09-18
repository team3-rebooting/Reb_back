package com.sol.app.admin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminCourseDAO;
import com.sol.app.admin.dao.AdminCourseRequestDAO;
import com.sol.app.course.dao.CourseDAO;
import com.sol.app.course.dao.CourseRequestDAO;
import com.sol.app.dto.AdminCourseRequestDTO;
import com.sol.app.dto.CourseDTO;
import com.sol.app.dto.CourseRequestDTO;

public class CourseRequestCompanionOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminCourseRequestDAO requestDAO = new AdminCourseRequestDAO();
		AdminCourseDAO courseDAO = new AdminCourseDAO();
		Gson gson = new Gson();
		try {
			BufferedReader reader = request.getReader();
			String body = reader.lines().collect(Collectors.joining());
			JsonObject json = JsonParser.parseString(body).getAsJsonObject();
			int courseNumber = json.get("courseNumber").getAsInt();
			System.out.println(courseNumber);
			String returnMsg = json.get("returnMsg").getAsString();
			System.out.println(returnMsg);
			String companionType = json.get("companionType").getAsString();
			AdminCourseRequestDTO requestDTO = new AdminCourseRequestDTO();
			CourseRequestDAO basicRequestDTO = new CourseRequestDAO();
			requestDTO.setCourseNumber(courseNumber);
			requestDTO.setCourseRejectReason(returnMsg);
			if(companionType.equals("create")) {
				requestDAO.rejection(requestDTO);
			}
			else if(companionType.equals("update")){
				CourseRequestDTO newDTO = basicRequestDTO.select(courseNumber);
				courseDAO.delete(courseNumber);
				newDTO.setCourseNumber(newDTO.getPrevCourseNumber());
				newDTO.setCourseRejectReason(returnMsg);
				requestDAO.insert(newDTO);
				requestDAO.deleteRequest(courseNumber);
			}
			else if(companionType.equals("delete")) {
				requestDAO.rejection(requestDTO);
			}
			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(gson.toJson(java.util.Map.of("status", "success")));
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			response.setContentType("application/json; charset=utf-8");
			response.getWriter().print(gson.toJson(java.util.Map.of("status", "fail")));
		}
		return null;
	}

}
