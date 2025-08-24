package com.sol.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminBannerDAO;
import com.sol.app.dto.AdminBannerDTO;


public class BannerListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminBannerDAO bannerDAO = new AdminBannerDAO();
		Result result = new Result();

		List<AdminBannerDTO> bannerList = bannerDAO.selectAll();
		
		request.setAttribute("bannerList", bannerList);
		
		result.setPath("/app/admin/banner/admin-banner-list.jsp");
		result.setRedirect(false);


		return result;
	}

}
