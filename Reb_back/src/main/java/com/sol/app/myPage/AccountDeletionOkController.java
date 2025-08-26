package com.sol.app.myPage;

import java.io.BufferedReader;
import java.io.IOException;
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
import com.sol.app.dto.RoutineReviewCommentDTO;
import com.sol.app.myPage.dao.MyCourseRequestDAO;
import com.sol.app.myPage.dao.MyPageDAO;
import com.sol.app.routine.dao.RoutineReviewCommentDAO;

public class AccountDeletionOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MyCourseRequestDAO myCourseRequestDAO = new MyCourseRequestDAO();

		// json 응답
		Gson gson = new Gson();

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		Result result = new Result();
		request.setCharacterEncoding("UTF-8");

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			if (myCourseRequestDAO.getTotal(memberNumber) > 0) {
				response.setContentType("application/json; charset=utf-8");
				response.getWriter().write(gson.toJson(Map.of("status", "fail", "message", "개설 수업 존재로 회원 탈퇴 불가")));
				return null;
			} else {
				myPageDAO.delete(memberNumber);

				request.getSession().invalidate();

				response.setContentType("application/json; charset=utf-8");
				response.getWriter().write(gson.toJson(Map.of("status", "success", "message", "회원 탈퇴 성공")));
			}
		}

		return null;
	}
}
