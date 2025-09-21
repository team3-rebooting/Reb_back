package com.sol.app.club;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.club.dao.FileSmallClubDAO;
import com.sol.app.club.dao.SmallClubDAO;
import com.sol.app.dto.SmallClubDTO;

public class SmallClubEditController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SmallClubEditController 진입 성공");
		System.out.println(request.getParameter("smallClubNumber"));
		
		Integer smallClubNumber = Integer.valueOf(request.getParameter("smallClubNumber"));
		SmallClubDAO smallClubDAO = new SmallClubDAO();
		SmallClubDTO smallClubDTO = new SmallClubDTO();
		FileSmallClubDAO fileSmallClubDAO = new FileSmallClubDAO();
		Result result = new Result();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");
		
		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
			
		}
		else if(smallClubNumber == null) {
			return null;
		} else {
			smallClubDTO = smallClubDAO.select(smallClubNumber);

			smallClubDTO.setFileSmallClubList(fileSmallClubDAO.select(smallClubDTO.getSmallClubNumber()));
			
			request.setAttribute("smallClub", smallClubDTO);
			
			System.out.println(smallClubDTO);
			
			result.setPath("/app/club/small-club-edit.jsp");
			result.setRedirect(false);
		}
		
		
		
		return result;
	}

	
}
