package com.sol.app.myPage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.myPage.dao.MyCourseDAO;

public class MyPageListOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MyPageListOkController 진입");
		MyCourseDAO myCourseDAO = new MyCourseDAO();
		Result result = new Result();
		Gson gson = new Gson();
		JsonArray list = new JsonArray();

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			myCourseDAO.selectList(memberNumber).stream().map(gson::toJson).map(JsonParser::parseString)
					.forEach(list::add);

			System.out.println(list.toString());

			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();

			out.print(list.toString());
			out.close();
		}
		
		return result;
	}
}