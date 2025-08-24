package com.sol.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineReviewDAO;
import com.sol.app.dto.AdminRoutineReviewDTO;
import com.sol.app.dto.FileRoutineReviewDTO;
import com.sol.app.routine.dao.FileRoutineReviewDAO;

public class AdminRoutineReviewReadOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		String reviewNumberStr = request.getParameter("routineReviewNumber");
		if (reviewNumberStr == null || reviewNumberStr.trim().isEmpty()) {
			System.out.println("routineReviewNumber값이 없습니다");
			result.setPath("/app/admin/review/admin-routine-review-list.jsp"); // 게시글 목록 페이지로 리다이렉트
			result.setRedirect(true);
			return result;
		}

		AdminRoutineReviewDAO reviewDAO = new AdminRoutineReviewDAO();
		int reviewNumber = Integer.parseInt(reviewNumberStr);
		FileRoutineReviewDAO fileDAO = new FileRoutineReviewDAO();

		// DB에서 게시글 가져오기
		AdminRoutineReviewDTO reviewDTO = reviewDAO.select(reviewNumber);
		
		if (reviewDTO == null) {
			System.out.println("존재하지 않는 게시글입니다. " + reviewNumber);
			result.setPath("/app/admin/review/admin-routine-review-list.jsp");
			result.setRedirect(true);
			return result;
		}

		// 첨부파일 가져오기
		List<FileRoutineReviewDTO> files = fileDAO.selectList(reviewNumber);
		System.out.println("======파일 확인======");
		System.out.println(files);
		System.out.println("===================");

		// 첨부파일 붙이기
		reviewDTO.setFileRoutineReviewList(files);
		// 로그인한 사용자 번호 가져오기
		Integer loginAdminNumber = (Integer) request.getSession().getAttribute("adminNumber");
		System.out.println("로그인 한 관리자 번호 : " + loginAdminNumber);

		request.setAttribute("review", reviewDTO);
		result.setPath("/app/admin/review/admin-routine-review-detail.jsp");
		result.setRedirect(false);

		return result;
	}

}
