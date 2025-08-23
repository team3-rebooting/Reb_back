package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.course.dao.FileCourseReviewDAO;
import com.sol.app.dto.CourseReviewDTO;
import com.sol.app.dto.FileCourseReviewDTO;

public class CourseReviewWriteOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("CourseReviewWriteOkController 진입 성공");
		
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();
		CourseReviewDTO courseReviewDTO = new CourseReviewDTO();
		Result result = new Result();
		FileCourseReviewDAO fileCourseReviewDAO = new FileCourseReviewDAO();
		FileCourseReviewDTO fileCourseReviewDTO = new FileCourseReviewDTO();
		
		// 로그인 한 회원 정보 가져오기
		Integer memberNumber = (Integer)request.getSession().getAttribute("memberNumber");
		
		if(memberNumber == null) {
			System.out.println("오류 : 로그인 한 사용자가 없습니다.");
			response.sendRedirect("login.jsp");
			return null;
		}
		
		// 파일 업로드 환경 설정
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/";
		final int FILE_SIZE = 1024 * 1024 * 5;	// 5MB
		System.out.println("파일 업로드 경로 : " + UPLOAD_PATH);
		
		// MulpartRequest를 이용한 데이터 파싱
		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
		
		courseReviewDTO.setCourseReviewTitle(multipartRequest.getParameter("courseReviewTitle"));
		courseReviewDTO.setCourseReviewContent(multipartRequest.getParameter("courseReviewContent"));
		
		
		return null;
	}

	
}
