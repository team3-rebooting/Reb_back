package com.sol.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminCourseDAO;
import com.sol.app.dto.AdminCourseDTO;
import com.sol.app.dto.FileCourseDTO;
import com.sol.app.file.dao.FileCourseDAO;

public class CourseReadOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		
		String courseNumberStr = request.getParameter("courseNumber");
		if (courseNumberStr == null || courseNumberStr.trim().isEmpty()) {
			System.out.println("courseNumber값이 없습니다");
			result.setPath("/app/admin/course/admin-course-list.jsp"); // 목록 페이지로 리다이렉트
			result.setRedirect(true);
			return result;
		}

		int courseNumber = Integer.parseInt(courseNumberStr);
		AdminCourseDAO courseDAO = new AdminCourseDAO();
		FileCourseDAO fileDAO = new FileCourseDAO();

		// DB에서 게시글 가져오기
		AdminCourseDTO courseDTO = courseDAO.select(courseNumber);
		int expertNumber = courseDTO.getExpertNumber();
		// 게시글이 존재하지 않을 경우 처리
		if (courseDTO == null) {
			System.out.println("존재하지 않는 게시글입니다. " + courseNumber);
			result.setPath("/app/admin/course/admin-course-list.jsp");
			result.setRedirect(true);
			return result;
		}

		// 첨부파일 가져오기
		List<FileCourseDTO> files = fileDAO.select(courseNumber);
		System.out.println("======파일 확인======");
		System.out.println(files);
		System.out.println("===================");

		// 첨부파일 붙이기
		courseDTO.setFileCourseList(files);
		// 로그인한 사용자 번호 가져오기
		Integer loginAdminNumber = (Integer) request.getSession().getAttribute("adminNumber");
		System.out.println("로그인 한 관리자 번호 : " + loginAdminNumber);

		request.setAttribute("course", courseDTO);
		result.setPath("/app/admin/course/admin-course-detail.jsp");
		result.setRedirect(false);

		return result;
	}

}
