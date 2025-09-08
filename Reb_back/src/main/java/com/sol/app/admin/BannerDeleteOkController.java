package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminBannerDAO;
import com.sol.app.file.dao.FileBannerDAO;

public class BannerDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminBannerDAO bannerDAO = new AdminBannerDAO();
		FileBannerDAO fileBannerDAO = new FileBannerDAO();
		int bannerNumber = Integer.valueOf(request.getParameter("bannerNumber"));
		fileBannerDAO.delete(bannerNumber);
		bannerDAO.delete(bannerNumber);
		System.out.println("삭제 완료");
		return null;
	}

}
