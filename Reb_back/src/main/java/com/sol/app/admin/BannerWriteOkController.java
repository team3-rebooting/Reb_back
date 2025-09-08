package com.sol.app.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminBannerDAO;
import com.sol.app.dto.AdminBannerDTO;
import com.sol.app.dto.FileBannerDTO;
import com.sol.app.file.dao.FileBannerDAO;

public class BannerWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminBannerDAO bannerDAO = new AdminBannerDAO();
		AdminBannerDTO bannerDTO = new AdminBannerDTO();
		Result result = new Result();
		FileBannerDAO fileDAO = new FileBannerDAO();
		FileBannerDTO fileDTO = new FileBannerDTO();
		
		Integer adminNumber = (Integer)request.getSession().getAttribute("adminNumber");
		
		if(adminNumber == null) {
			System.out.println("오류 : 로그인된 관리자가 없습니다");
			response.sendRedirect("admin-login.jsp");
			return null;
		}

		//파일 업로드 환경 설정
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/";
		final int FILE_SIZE = 1024 * 1024 * 5; //5MB
		//MultipartRequest를 이용한 데이터 파싱
		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
		//배너 정보 설정
		bannerDTO.setBannerTitle(multipartRequest.getParameter("bannerTitle"));
		//배너 번호 설정
		List<AdminBannerDTO> bannerList = bannerDAO.selectAll(); 
		Set<Integer> bannerOrderNumber = new HashSet<>();
		for (AdminBannerDTO banner : bannerList) {
		    bannerOrderNumber.add(banner.getBannerOrderNumber());
		}

		int order = 1;
		while (bannerOrderNumber.contains(order)) {
		    order++;
		}
		bannerDTO.setBannerOrderNumber(order);
		//배너 추가
		int bannerNumber = bannerDAO.insert(bannerDTO);
		System.out.println(bannerNumber);
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
			fileDTO.setBannerNumber(bannerNumber);
			
			System.out.println("업로드 된 파일 정보 : " + fileDTO);
			fileDAO.insert(fileDTO);
		}
		
		result.setPath("/admin/bannerListOk.ad");
		result.setRedirect(true);
		
		return result;
	}

}
