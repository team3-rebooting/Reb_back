package com.sol.app.myPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.myPage.dao.MyCourseDAO;

public class MyPageListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String listType = request.getParameter("listType");
		System.out.println("로드할 목록 종류 : " + listType);
		
		switch(listType) {
		case "my-courses-routine":
			new MyApplicantCourseOkController().execute(request, response);
			break;
		case "my-courses-courses":
			new MyApplicantRoutineOkController().execute(request, response);
			break;
		case "my-review":
			new MyReviewOkController().execute(request, response);
			break;
		case "my-comment":
			new MyCommentOkController().execute(request, response);
			break;
		case "my-course-request":
			new MyCourseRequestOKController().execute(request, response);
			break;
		case "my-sponsor":
			new MySponsorOKController().execute(request, response);
			break;
		}
		
		return null;
	}
}
