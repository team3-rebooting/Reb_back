package com.sol.app.course;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseDAO;
import com.sol.app.course.dao.CourseRequestDAO;
import com.sol.app.course.dao.FileCourseDAO;
import com.sol.app.dto.CourseDTO;
import com.sol.app.dto.CourseRequestDTO;
import com.sol.app.dto.FileCourseDTO;

public class ExpertCourseEditRequestOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("ExpertCourseEditRequestOkController 진입");

		CourseDTO courseDTO = new CourseDTO();
		CourseDAO courseDAO = new CourseDAO();
		FileCourseDTO fileCourseDTO = new FileCourseDTO();
		FileCourseDAO fileCourseDAO = new FileCourseDAO();
		Result result = new Result();

		Integer memberNumber = (Integer) request.getSession().getAttribute("memberNumber");
		Integer expertNumber = (Integer) request.getSession().getAttribute("expertNumber");
		
		if (memberNumber == null) {
			result.setPath("/member/login.me");
			result.setRedirect(true);
		} else if (expertNumber == null) {
			result.setPath("/myPage/myCourseRequest.my");
			result.setRedirect(true);
		} else {
			CourseRequestDAO courseRequestDAO = new CourseRequestDAO();
			CourseRequestDTO courseRequestDTO = new CourseRequestDTO();

			// 파일 업로드 환경 설정
			final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/";
			final int FILE_SIZE = 1024 * 1024 * 5; // 5MB
			// MultipartRequest를 이용한 데이터 파싱
			MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8",
					new DefaultFileRenamePolicy());
			
			Integer editCourseNumber = Integer.valueOf(multipartRequest.getParameter("courseNumber"));
			courseRequestDTO = courseRequestDAO.select(editCourseNumber.intValue());

			System.out.println("editCourseNumber : " + editCourseNumber);
			System.out.println(courseRequestDTO);
			
			courseRequestDTO.setCourseRequestTypeNumber(2);
			courseRequestDTO.setCourseOpenStatusNumber(1);
			courseRequestDTO.setPrevCourseNumber(editCourseNumber);

			courseDTO.setExpertNumber(expertNumber);
			courseDTO.setMemberNumber(memberNumber);
			courseDTO.setCourseTitle(multipartRequest.getParameter("courseTitle"));
			courseDTO.setCourseContent(multipartRequest.getParameter("courseText"));
			courseDTO.setCourseStartDate(multipartRequest.getParameter("courseStartDate"));
			courseDTO.setCourseEndDate(multipartRequest.getParameter("courseEndDate"));
			courseDTO.setCourseStartTime(multipartRequest.getParameter("courseStartTime"));
			courseDTO.setCourseEndTime(multipartRequest.getParameter("courseEndTime"));
			courseDTO.setCourseRecruitCount(Integer.valueOf(multipartRequest.getParameter("recruitmentNumber")));
			
			courseDTO.setCourseLocation("지도 api 추가 후 수정");
			String[] days = multipartRequest.getParameterValues("dow");
			String day = "";

			if (days != null) {
				for (int i = 0; i < days.length; i++) {
					switch (days[i]) {
					case "mon":
						day += "월";
						break;
					case "tue":
						day += "화";
						break;
					case "wed":
						day += "수";
						break;
					case "thu":
						day += "목";
						break;
					case "fri":
						day += "금";
						break;
					case "sat":
						day += "토";
						break;
					case "sun":
						day += "일";
						break;
					}
				}
			}
			courseDTO.setCourseDayOfWeek(day);

			System.out.println(courseDTO);
			int courseNumber = courseDAO.createRequest(courseDTO, false);
			System.out.println("생성된 게시글 번호 : " + courseNumber);
			courseRequestDTO.setCourseNumber(courseNumber);
			
			// 파일 업로드 처리
			// Enumeration : java.util 패키지에 포함된 인터페이스, Iterator와 비슷한 역할함
			Enumeration<String> fileNames = multipartRequest.getFileNames();
			while (fileNames.hasMoreElements()) {
				String name = fileNames.nextElement();
				String fileSystemName = multipartRequest.getFilesystemName(name);
				String fileOriginalName = multipartRequest.getOriginalFileName(name);

				if (fileSystemName == null) {
					continue;
				}

				fileCourseDTO.setFileSystemName(fileSystemName);
				fileCourseDTO.setFileOriginalName(fileOriginalName);
				fileCourseDTO.setCourseNumber(courseNumber);

				System.out.println("업로드 된 파일 정보 : " + fileCourseDTO);
				fileCourseDAO.insert(fileCourseDTO);
			}
			
			System.out.println("새로운 요청 courseRequestDTO : " + courseRequestDTO);
			
			courseRequestDAO.delete(editCourseNumber);
			courseRequestDAO.insert(courseRequestDTO);

			result.setPath("/course/courseDetailOk.co?courseNumber="+courseNumber);
			result.setRedirect(false);
		}
		return result;
	}

}