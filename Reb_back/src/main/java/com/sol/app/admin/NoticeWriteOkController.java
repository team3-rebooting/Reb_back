package com.sol.app.admin;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminNoticeDAO;
import com.sol.app.dto.FileNoticeDTO;
import com.sol.app.dto.NoticeDTO;
import com.sol.app.file.dao.FileNoticeDAO;

public class NoticeWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminNoticeDAO noticeDAO = new AdminNoticeDAO();
		NoticeDTO noticeDTO = new NoticeDTO();
		Result result = new Result();
		FileNoticeDAO fileDAO = new FileNoticeDAO();
		FileNoticeDTO fileDTO = new FileNoticeDTO();
		
		//로그인 한 회원 정보 가져오기
		Integer adminNumber = (Integer)request.getSession().getAttribute("adminNumber");
		
		if(adminNumber == null) {
			System.out.println("오류 : 로그인된 사용자가 없습니다");
			response.sendRedirect("admin-login.jsp");
			return null;
		}
		//파일 업로드 환경 설정
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/";
		final int FILE_SIZE = 1024 * 1024 * 5; //5MB
		//MultipartRequest를 이용한 데이터 파싱
		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
		//게시글 정보 설정
		noticeDTO.setNoticeTitle(multipartRequest.getParameter("noticeTitle"));
		noticeDTO.setNoticeContent(multipartRequest.getParameter("noticeContent"));
		noticeDTO.setAdminNumber(adminNumber);
		System.out.println("게시글 추가 - noticeDTO : " + noticeDTO);
		
		//게시글 추가
		int noticeNumber = noticeDAO.insert(noticeDTO);
		System.out.println("생성된 게시글 번호 : " + noticeNumber);
		
		//파일 업로드 처리
		//Enumeration : java.util 패키지에 포함된 인터페이스, Iterator와 비슷한 역할함
		Enumeration<String> fileNames = multipartRequest.getFileNames();
		while(fileNames.hasMoreElements()) {
			String name = fileNames.nextElement();
			String fileSystemName = multipartRequest.getFilesystemName(name);
			String fileOriginalName = multipartRequest.getOriginalFileName(name);
			
			if(fileSystemName == null) {
				continue;
			}
			
			fileDTO.setFileSystemName(fileSystemName);
			fileDTO.setFileOriginalName(fileOriginalName);
			fileDTO.setNoticeNumber(noticeNumber);
			
			System.out.println("업로드 된 파일 정보 : " + fileDTO);
			fileDAO.insert(fileDTO);
		}
		
		result.setPath("/admin/noticeListOk.ad");
		result.setRedirect(true);
		
		return result;
	}

}
