package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.AdminNoticeDTO;

public class NoticeUpdateOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		AdminNoticeDTO noticeDTO = new AdminNoticeDTO();
		noticeDTO.setNoticeTitle(request.getParameter("noticeTitle"));
//		noticeDTO.setFileNoticeList(request.getParameter("noticeTitle"));
		noticeDTO.setNoticeTitle(request.getParameter("noticeTitle"));
		result.setRedirect(false);
		result.setPath("/admin/noticeListOk.ad");
		return result;
	}

}
