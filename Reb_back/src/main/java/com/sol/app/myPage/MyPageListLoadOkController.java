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

public class MyPageListLoadOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String listType = request.getParameter("listType");
		System.out.println(listType);
		
		switch(listType) {
		case "myCourse":
			new MyApplicantCourseLoadOkController().execute(request, response);
			break;
		case "myRoutine":
			new MyApplicantRoutineLoadOkController().execute(request, response);
			break;
		}
		
		return null;
	}
}
