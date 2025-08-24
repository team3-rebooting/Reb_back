package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.myPage.dao.MySponsorDAO;

public class MySponsorController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		HttpSession session = request.getSession();
		MySponsorDAO mySponsorDAO = new MySponsorDAO();
		
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		String path = null;
		
		if(memberNumber == null) {
			path = request.getContextPath() + "/app/auth/login.jsp";
		}else {
			int totalCount = mySponsorDAO.getTotal(memberNumber);
			int totalAmount = mySponsorDAO.getSponsorTotalAmount(memberNumber);
			
			System.out.println("totalCount : " + totalCount);
			System.out.println("totalAmount : " + totalAmount);
			
			request.setAttribute("totalCount", totalCount);
			request.setAttribute("totalAmount", totalAmount);
			path =  request.getContextPath() + "/app/mypage/my-sponsorship.jsp";
		}
		
		result.setPath(path);
		result.setRedirect(false);
		
		return result;
	}
}
