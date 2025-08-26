package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminNoticeDAO;

public class NoticeDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminNoticeDAO noticeDAO = new AdminNoticeDAO();
		int noticeNumber = Integer.valueOf(request.getParameter("noticeNumber"));
		noticeDAO.delete(noticeNumber);
		System.out.println("삭제 완료");
		return null;
	}

}
