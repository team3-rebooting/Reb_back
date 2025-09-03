package com.sol.app.myPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.FileExpertDTO;
import com.sol.app.dto.MyExpertDTO;
import com.sol.app.myPage.dao.FileExpertDAO;
import com.sol.app.myPage.dao.MyExpertDAO;

public class ExpertStatusOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyExpertDAO myExpertDAO = new MyExpertDAO();
		FileExpertDAO fileExpertDAO = new FileExpertDAO();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		Result result = new Result();

		request.setCharacterEncoding("UTF-8");
		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			MyExpertDTO myExpertDTO = myExpertDAO.select(memberNumber);
			
			if (myExpertDTO == null) {
				myExpertDTO = new MyExpertDTO();
				
				myExpertDTO.setExpertCareer("-");
				myExpertDTO.setExpertLicenseInfo("-");
			}

			List<FileExpertDTO> fileExpertList = new ArrayList<>();
			fileExpertList.add(fileExpertDAO.select(memberNumber));
			
			myExpertDTO.setFileExpertList(fileExpertList);
			
			request.setAttribute("expert", myExpertDTO);
			
			System.out.println("myExpertDTO : " + myExpertDTO);
		}
		
		result.setPath(request.getContextPath() + "/myPage/expertStatus.my");
		result.setRedirect(false);
		
		return result;
	}

}
