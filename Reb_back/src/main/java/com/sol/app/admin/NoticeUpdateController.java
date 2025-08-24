package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminNoticeDAO;

public class NoticeUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int noticeNumber = Integer.valueOf(request.getParameter("noticeNumber"));
		AdminNoticeDAO noticeDAO = new AdminNoticeDAO();
		Result result = new Result();
		
		request.setAttribute("notice", noticeDAO.select(noticeNumber));
		
		result.setPath("/app/admin/notice/admin-notice-edit.jsp");
		result.setRedirect(false);
			
		return result;
	}

}
