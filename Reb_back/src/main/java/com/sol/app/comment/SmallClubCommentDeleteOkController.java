package com.sol.app.comment;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.club.dao.SmallClubCommentDAO;

public class SmallClubCommentDeleteOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SmallClubCommentDeleteOkController 진입");
		SmallClubCommentDAO commentDAO = new SmallClubCommentDAO();

		request.setCharacterEncoding("utf-8");

		// json 응답
		Gson gson = new Gson();

		// DTO 설정
		int smallClubCommentNumber = Integer.valueOf(request.getParameter("commentNumber"));
		System.out.println("smallClubCommentNumber 확인 :" + smallClubCommentNumber);

		// DB 저장
		commentDAO.delete(smallClubCommentNumber);

		// JSON 응답
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "댓글 삭제 완료")));
		
		return null;
	}
}
