package com.sol.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminNoticeDAO;
import com.sol.app.dto.AdminNoticeDTO;
import com.sol.app.dto.FileNoticeDTO;
import com.sol.app.dto.NoticeDTO;
import com.sol.app.file.dao.FileNoticeDAO;

public class NoticeReadOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		
		//boardNumber가 빈 문자열이거나 null인경우
		String noticeNumberStr = request.getParameter("noticeNumber");
		if(noticeNumberStr == null || noticeNumberStr.trim().isEmpty()){
			System.out.println("noticeNumber값이 없습니다");
			result.setPath("/app/admin/notice/admin-notice-list.jsp"); //게시글 목록 페이지로 리다이렉트
			result.setRedirect(true);
			return result;
		}
		
		int noticeNumber = Integer.parseInt(noticeNumberStr);
		
		AdminNoticeDAO noticeDAO = new AdminNoticeDAO();
		FileNoticeDAO fileDAO = new FileNoticeDAO();

		//DB에서 게시글 가져오기
		AdminNoticeDTO noticeDTO = noticeDAO.select(noticeNumber);
		
		//게시글이 존재하지 않을 경우 처리
		if(noticeDTO == null) {
			System.out.println("존재하지 않는 게시글입니다. " + noticeNumber);
			result.setPath("/app/admin/notice/admin-notice-list.jsp");
			result.setRedirect(true);
			return result;
		}
		
		//첨부파일 가져오기
		List<FileNoticeDTO> files = fileDAO.select(noticeNumber);
		System.out.println("======파일 확인======");
		System.out.println(files);
		System.out.println("===================");
		
		//첨부파일 붙이기
		noticeDTO.setFileNoticeList(files);
		
		//로그인한 사용자 번호 가져오기
		Integer loginAdminNumber = (Integer) request.getSession().getAttribute("adminNumber");
		System.out.println("로그인 한 관리자 번호 : " + loginAdminNumber);
		
		//현재 게시글의 작성자 번호 가져오기
		int boardWriterNumber = noticeDTO.getAdminNumber();
		System.out.println("현재 게시글 작성자 번호 : " + boardWriterNumber);
		
		
		request.setAttribute("notice", noticeDTO);
		result.setPath("/app/admin/notice/admin-notice-detail.jsp");
		result.setRedirect(false);		
		
		return result;
	}

}
