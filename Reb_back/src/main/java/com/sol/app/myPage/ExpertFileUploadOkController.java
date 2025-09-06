package com.sol.app.myPage;

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
import com.sol.app.dto.ExpertDTO;
import com.sol.app.dto.FileExpertDTO;
import com.sol.app.myPage.dao.FileExpertDAO;
import com.sol.app.myPage.dao.MyExpertDAO;

public class ExpertFileUploadOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FileExpertDAO fileExpertDAO = new FileExpertDAO();
		FileExpertDTO fileExpertDTO = new FileExpertDTO();
		MyExpertDAO myExpertDAO = new MyExpertDAO();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		Result result = new Result();

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);

			return result;
		}
		
		if(myExpertDAO.exist(memberNumber)) {
			result.setPath(request.getContextPath() + "/myPage/expertStatus.my");
			result.setRedirect(false);
			
			return result;
		}

		// 파일 업로드 환경 설정
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/";
		final int FILE_SIZE = 1024 * 1024 * 5; // 5MB
		System.out.println("파일 업로드 경로 : " + UPLOAD_PATH);

		// MultipartRequest를 이용한 데이터 파싱
		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8",
				new DefaultFileRenamePolicy());
		// request : HTTP 요청객체
		// UPLOAD_PATH : 파일을 저장할 경로
		// FILE_SIZE : 파일의 최대 크기
		// "utf-8" : 파일명 인코딩 방식
		
		// Enumeration : java.util 패키지에 포함된 인터페이스, Iterator와 비슷한 역할함
		Enumeration<String> fileNames = multipartRequest.getFileNames();
		while (fileNames.hasMoreElements()) {
			String name = fileNames.nextElement();
			String fileSystemName = multipartRequest.getFilesystemName(name);
			String fileOriginalName = multipartRequest.getOriginalFileName(name);

			if (fileSystemName == null) {
				continue;
			}

			fileExpertDTO.setFileSystemName(fileSystemName);
			fileExpertDTO.setFileOriginalName(fileOriginalName);
			fileExpertDTO.setMemberNumber(memberNumber);

			System.out.println("업로드 된 파일 정보 : " + fileExpertDTO);
			
			fileExpertDAO.delete(memberNumber);
			
			System.out.println("myExpert : " + myExpertDAO.select(memberNumber));
			myExpertDAO.delete(memberNumber);
			myExpertDAO.insert(memberNumber);
			fileExpertDAO.insert(fileExpertDTO);
			
			ExpertDTO expertDTO = new ExpertDTO();
			expertDTO.setMemberNumber(memberNumber);
			
			myExpertDAO.update(expertDTO);
		}
		
		result.setPath(request.getContextPath() + "/myPage/expertStatusOk.my");
		result.setRedirect(false);

		return result;
	}
}
