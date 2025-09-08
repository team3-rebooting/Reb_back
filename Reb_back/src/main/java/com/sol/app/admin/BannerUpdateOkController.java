package com.sol.app.admin;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminBannerDAO;
import com.sol.app.dto.AdminBannerDTO;

public class BannerUpdateOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminBannerDAO bannerDAO = new AdminBannerDAO();
		AdminBannerDTO bannerDTO = new AdminBannerDTO();
		List<AdminBannerDTO> bannerList = bannerDAO.selectAll();
		//HashSet 으로 순서보장 x 하지만 빠르게 비교 가능
		Set<Integer> bannerOrderNumberSet = new HashSet<>();
		for(AdminBannerDTO banner : bannerList) {
			bannerOrderNumberSet.add(banner.getBannerOrderNumber());
		}
		int bannerNumber = Integer.valueOf(request.getParameter("bannerNumber"));
		boolean up = Boolean.valueOf(request.getParameter("up"));
		int bannerOrderNumber = Integer.valueOf(request.getParameter("bannerOrderNumber"));
		if(up) {
			do {
				bannerOrderNumber--;
			}while (bannerOrderNumberSet.contains(bannerOrderNumber));
			bannerDTO.setBannerNumber(bannerNumber);
			bannerDTO.setBannerOrderNumber(bannerOrderNumber);
			bannerDAO.update(bannerDTO);
		}
		else {
			do {
				bannerOrderNumber++;				
			}while (bannerOrderNumberSet.contains(bannerOrderNumber));
			bannerDTO.setBannerNumber(bannerNumber);
			bannerDTO.setBannerOrderNumber(bannerOrderNumber);
			bannerDAO.update(bannerDTO);
		}
		return null;
	}

}
