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
			Integer lastBannerOrderNumber = (Integer)bannerDAO.findBannerNumber(1);
			if(bannerOrderNumber == 2 && lastBannerOrderNumber != 0) {
				//1번이었던 배너를 2번으로 옮김
				bannerDTO.setBannerNumber(lastBannerOrderNumber);
				bannerDTO.setBannerOrderNumber(2);
				bannerDAO.update(bannerDTO);
				//그 후 2번인 배너를 1번으로 옮김 ㅋㅋ
				AdminBannerDTO newBannerDTO = new AdminBannerDTO();
				newBannerDTO.setBannerOrderNumber(1);
				newBannerDTO.setBannerNumber(bannerNumber);
				bannerDAO.update(newBannerDTO);
			}
			else {
				do {
					bannerOrderNumber--;
				}while (bannerOrderNumberSet.contains(bannerOrderNumber));
				bannerDTO.setBannerNumber(bannerNumber);
				bannerDTO.setBannerOrderNumber(bannerOrderNumber);
				bannerDAO.update(bannerDTO);				
			}
		}
		else {
			Integer lastBannerOrderNumber = (Integer)bannerDAO.findBannerNumber(10);
			if(bannerOrderNumber == 9 && lastBannerOrderNumber != 0) {
				
				bannerDTO.setBannerNumber(lastBannerOrderNumber);
				bannerDTO.setBannerOrderNumber(9);
				bannerDAO.update(bannerDTO);
				
				AdminBannerDTO newBannerDTO = new AdminBannerDTO();
				newBannerDTO.setBannerOrderNumber(10);
				newBannerDTO.setBannerNumber(bannerNumber);
				bannerDAO.update(newBannerDTO);
			}
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
