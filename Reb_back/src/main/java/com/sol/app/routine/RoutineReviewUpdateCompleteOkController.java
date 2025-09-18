package com.sol.app.routine;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.FileRoutineReviewDTO;
import com.sol.app.dto.RoutineReviewDTO;
import com.sol.app.routine.dao.FileRoutineReviewDAO;
import com.sol.app.routine.dao.RoutineReviewListDAO;

public class RoutineReviewUpdateCompleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoutineReviewListDAO routineReviewListDAO = new RoutineReviewListDAO();
		RoutineReviewDTO routineReviewDTO = new RoutineReviewDTO();

		FileRoutineReviewDAO fileRoutineReviewDAO = new FileRoutineReviewDAO();
		FileRoutineReviewDTO fileRoutineReviewDTO = new FileRoutineReviewDTO();

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		Result result = new Result();

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);

			return result;
		}

		// 파일 업로드 환경 설정
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/routine/";
		final int FILE_SIZE = 1024 * 1024 * 5; // 5MB
		System.out.println("파일 업로드 경로 : " + UPLOAD_PATH);

		// MultipartRequest를 이용한 데이터 파싱
		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8",
				new DefaultFileRenamePolicy());
		// request : HTTP 요청객체
		// UPLOAD_PATH : 파일을 저장할 경로
		// FILE_SIZE : 파일의 최대 크기
		// "utf-8" : 파일명 인코딩 방식
		// new DefaultFileRenamePolicy() : 파일명이 중복될 경우 자동으로 이름 변경해주는 정책

		System.out.println("routineNumber : " + multipartRequest.getParameter("routineNumber"));

		routineReviewDTO.setMemberNumber(memberNumber);
		routineReviewDTO.setRoutineReviewContent(multipartRequest.getParameter("routineReviewContent"));
		routineReviewDTO.setRoutineReviewTitle(multipartRequest.getParameter("routineReviewTitle"));

		//routineReviewDTO.setRoutineNumber(Integer.parseInt(multipartRequest.getParameter("routineNumber")));

		System.out.println("routineReviewDTO : " + routineReviewDTO);
		int reviewNum = Integer.parseInt(request.getParameter("routineReviewNumber"));
		routineReviewDTO.setRoutineReviewNumber(reviewNum);
		
		routineReviewListDAO.update(routineReviewDTO);
		
		

		System.out.println("============게시글 작성 : " + reviewNum);

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

			fileRoutineReviewDAO.delete(reviewNum);
			fileRoutineReviewDTO.setFileSystemName(fileSystemName);
			fileRoutineReviewDTO.setFileOriginalName(fileOriginalName);
			fileRoutineReviewDTO.setRoutineReviewNumber(reviewNum);

			System.out.println("업로드 된 파일 정보 : " + fileRoutineReviewDTO);
			fileRoutineReviewDAO.insert(fileRoutineReviewDTO);
		}
		
		
		result.setPath(request.getContextPath() + "/routine/routineReviewReadOk.ro?routineReviewNumber=" + reviewNum);
		result.setRedirect(false);

		return result;
	}
}