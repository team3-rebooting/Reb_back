package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MyExpertDTO;
import com.sol.app.myPage.dao.MyExpertDAO;

public class ExpertStatusOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyExpertDAO myExpertDAO = new MyExpertDAO();
		
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
				myExpertDTO.setExpertCertStatusInfo("-");
				myExpertDTO.setExpertLicenseInfo("-");
			}
			
			request.setAttribute("expert", myExpertDTO);
		}
		
		result.setPath(request.getContextPath() + "/myPage/expertStatus.my");
		result.setRedirect(false);
		
		return result;
	}

}
