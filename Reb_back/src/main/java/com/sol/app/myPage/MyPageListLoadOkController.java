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
		String temp = request.getParameter("page");
		int page = (temp == null) ? 1 : Integer.valueOf(temp); // 페이지 번호 기본값 1로 설정하겠다

		MyCourseDAO myCourseDAO = new MyCourseDAO();
		Result result = new Result();
		
		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		JsonArray list = new JsonArray();
		JsonArray cols = new JsonArray();
		JsonElement title;

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		
		int rowCount = 10; // 한 페이지당 게시글 수

		// 페이징 처리
		int startRow = (page - 1) * rowCount + 1; // 시작행(1, 11, 21, ..)
		int endRow = startRow + rowCount - 1; // 끝 행(10, 20, 30, ..)
		
		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			cols.add("제목");
			cols.add("전문가");
			cols.add("신청일자");

			myCourseDAO.selectList(pageMap).stream().map(gson::toJson).map(JsonParser::parseString)
					.forEach(list::add);

			obj.addProperty("listTitle", "나의 수강 수업 내역");
			obj.add("cols", cols);
			obj.add("list", list);

			System.out.println(obj.toString());

			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();

			out.print(obj.toString());
			out.close();
		}
		
		return result;
	}
}
