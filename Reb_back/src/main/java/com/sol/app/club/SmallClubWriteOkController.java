package com.sol.app.club;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.club.dao.FileSmallClubDAO;
import com.sol.app.club.dao.SmallClubDAO;
import com.sol.app.dto.FileSmallClubDTO;
import com.sol.app.dto.SmallClubDTO;

public class SmallClubWriteOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("SmallClubWriteOkController 진입 성공");
		
		SmallClubDAO smallClubDAO = new SmallClubDAO();
		SmallClubDTO smallClubDTO = new SmallClubDTO();
		Result result = new Result();
		FileSmallClubDAO fileSmallClubDAO = new FileSmallClubDAO();
		FileSmallClubDTO fileSmallClubDTO = new FileSmallClubDTO();
		
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
		smallClubDTO.setSmallClubTitle(multipartRequest.getParameter("smallClubTitle"));
		smallClubDTO.setSmallClubContent(multipartRequest.getParameter("smallClubContent"));
		smallClubDTO.setMemberNumber(memberNumber);
//		smallClubDTO.setCourseNumber(Integer.valueOf(multipartRequest.getParameter("courseNumber")));
				
		// 게시글 추가
		int smallClubNumber = smallClubDAO.insertSmallClub(smallClubDTO);
		System.out.println("생성된 게시글 번호 : " + smallClubNumber);
				
		// 파일 업로드 처리
		Enumeration<String> fileNames = multipartRequest.getFileNames();
		while(fileNames.hasMoreElements()) {
			String name = fileNames.nextElement();
			String fileSystemName = multipartRequest.getFilesystemName(name);
			String fileOriginalName = multipartRequest.getOriginalFileName(name);
					
			if(fileSystemName == null) {
				continue;
			}
					
			fileSmallClubDTO.setFileSystemName(fileSystemName);
			fileSmallClubDTO.setFileOriginalName(fileOriginalName);
			fileSmallClubDTO.setSmallClubNumber(smallClubNumber);
			
			System.out.println("업로드 된 파일 정보 : " + fileSmallClubDTO);
			fileSmallClubDAO.insert(fileSmallClubDTO);
					
		}
				
		result.setPath("/club/smallClubListOk.cl");
		result.setRedirect(false);
		
		return result;
	}

	
}
