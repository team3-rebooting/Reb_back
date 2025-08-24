package com.sol.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminCourseReviewDAO;
import com.sol.app.admin.dao.AdminFileCourseReviewDAO;
import com.sol.app.dto.AdminCourseReviewDTO;
import com.sol.app.dto.FileCourseReviewDTO;

public class AdminCourseReviewListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		String reviewNumberStr = request.getParameter("courseReviewNumber");
		if (reviewNumberStr == null || reviewNumberStr.trim().isEmpty()) {
			System.out.println("courseReviewNumber값이 없습니다");
			result.setPath("/app/admin/review/admin-course-review-list.jsp"); // 게시글 목록 페이지로 리다이렉트
			result.setRedirect(true);
			return result;
		}

		AdminCourseReviewDAO reviewDAO = new AdminCourseReviewDAO();
		int reviewNumber = Integer.parseInt(reviewNumberStr);
		AdminFileCourseReviewDAO fileDAO = new AdminFileCourseReviewDAO();

		// DB에서 게시글 가져오기
		AdminCourseReviewDTO reviewDTO = reviewDAO.select(reviewNumber);
		
		if (reviewDTO == null) {
			System.out.println("존재하지 않는 게시글입니다. " + reviewNumber);
			result.setPath("/app/admin/review/admin-course-review-list.jsp");
			result.setRedirect(true);
			return result;
		}

		// 첨부파일 가져오기
		List<FileCourseReviewDTO> files = fileDAO.select(reviewNumber);
		System.out.println("======파일 확인======");
		System.out.println(files);
		System.out.println("===================");

		// 첨부파일 붙이기
		reviewDTO.setFileCourseReviewList(files);
		// 로그인한 사용자 번호 가져오기
		Integer loginAdminNumber = (Integer) request.getSession().getAttribute("adminNumber");
		System.out.println("로그인 한 관리자 번호 : " + loginAdminNumber);

		request.setAttribute("review", reviewDTO);
		result.setPath("/app/admin/review/admin-course-review-detail.jsp");
		result.setRedirect(false);

		return result;
	}

}
