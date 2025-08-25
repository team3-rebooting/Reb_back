package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminNoticeDAO;
import com.sol.app.dto.AdminNoticeDTO;
import com.sol.app.file.dao.FileNoticeDAO;

public class NoticeUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int noticeNumber = Integer.valueOf(request.getParameter("noticeNumber"));
		AdminNoticeDAO noticeDAO = new AdminNoticeDAO();
		FileNoticeDAO fileDAO = new FileNoticeDAO();
		Result result = new Result();
		
		//noticeDTO를 불러와서
		AdminNoticeDTO noticeDTO = noticeDAO.select(noticeNumber);
		//파일 추가
		noticeDTO.setFileNoticeList(fileDAO.select(noticeNumber));
		//추가한 파일까지 같이 set
		request.setAttribute("notice", noticeDTO);
		result.setPath("/app/admin/notice/admin-notice-edit.jsp");
		result.setRedirect(false);
			
		return result;
	}

}
