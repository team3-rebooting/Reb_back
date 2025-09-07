package com.sol.app.course;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.course.dao.FileCourseReviewDAO;
import com.sol.app.dto.CourseReviewListDTO;
import com.sol.app.dto.FileCourseReviewDTO;
import com.sol.app.dto.FileMemberProfileDTO;
import com.sol.app.myPage.dao.FileMemberProfileDAO;

public class CourseReviewDetailOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Result result = new Result();

		String courseReviewNumberStr = request.getParameter("courseReviewNumber");
		if (courseReviewNumberStr == null || courseReviewNumberStr.trim().isEmpty()) {
			System.out.println("courseReviewNumber 값이 없습니다");
			result.setPath("/app/course/course-review-list.jsp");
			result.setRedirect(true);
			return result;
		}

		int courseReviewNumber = Integer.parseInt(courseReviewNumberStr);

		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();
		FileCourseReviewDAO fileCourseReviewDAO = new FileCourseReviewDAO();
		FileMemberProfileDAO fileMemberProfileDAO = new FileMemberProfileDAO();

		CourseReviewListDTO courseReviewListDTO = courseReviewDAO.select(courseReviewNumber);
		

		if (courseReviewListDTO == null) {
			System.out.println("존재하지 않는 게시글입니다" + courseReviewNumber);
			result.setPath("/app/course/course-review-list.jsp");
			result.setRedirect(true);
			return result;
		}
		
		

		// 게시글 첨부파일 가져오기
		List<FileCourseReviewDTO> files = fileCourseReviewDAO.select(courseReviewNumber);
		System.out.println("=====확인=====");
		System.out.println(files);
		System.out.println("=============");

		courseReviewListDTO.setFileCourseReviewList(files);

		// 로그인한 사용자 번호 가져오기
		Integer loginMemberNumber = (Integer) request.getSession().getAttribute("mamberNumber");
		System.out.println("로그인 한 멤버 번호 : " + loginMemberNumber);

		// 현재 게시글의 작성자 번호 가져오기
		int courseReviewWriterNumber = courseReviewListDTO.getMemberNumber();
		System.out.println("현재 게시글 작성자 번호 : " + courseReviewWriterNumber);
		
		// 작성자 프로필 가져오기
		FileMemberProfileDTO profiles = fileMemberProfileDAO.select(courseReviewWriterNumber);
		System.out.println("작성자 프로필 번호" + profiles);
		
		courseReviewListDTO.setFileWriterProFileList(profiles);

		request.setAttribute("courseReview", courseReviewListDTO);
		result.setPath("/app/course/course-review-detail.jsp");
		result.setRedirect(false);

		return result;

	}

}