package com.sol.app.course;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseMemberApplicantDAO;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.course.dao.FileCourseReviewDAO;
import com.sol.app.dto.CourseMemberApplicantDTO;
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
		
		// 게시글 정보 설정
		courseReviewDTO.setCourseReviewTitle(multipartRequest.getParameter("courseReviewTitle"));
		courseReviewDTO.setCourseReviewContent(multipartRequest.getParameter("courseReviewContent"));
		courseReviewDTO.setMemberNumber(memberNumber);
		courseReviewDTO.setCourseNumber(Integer.valueOf(multipartRequest.getParameter("courseNumber")));
		
		// 게시글 추가
		int courseReviewNumber = courseReviewDAO.insertCourseReview(courseReviewDTO);
		System.out.println("생성된 게시글 번호 : " + courseReviewNumber);
		
		// 파일 업로드 처리
		Enumeration<String> fileNames = multipartRequest.getFileNames();
		while(fileNames.hasMoreElements()) {
			String name = fileNames.nextElement();
			String fileSystemName = multipartRequest.getFilesystemName(name);
			String fileOriginalName = multipartRequest.getOriginalFileName(name);
			
			if(fileSystemName == null) {
				continue;
			}
			
			fileCourseReviewDTO.setFileSystemName(fileSystemName);
			fileCourseReviewDTO.setFileOriginalName(fileOriginalName);
			fileCourseReviewDTO.setCourseReviewNumber(courseReviewNumber);
			
			System.out.println("업로드 된 파일 정보 : " + fileCourseReviewDTO);
			fileCourseReviewDAO.insert(fileCourseReviewDTO);
			
		}
		
	
		
		
		result.setPath("/course/courseReviewListOk.co");
		result.setRedirect(false);
		
		return result;
	}

	
}
