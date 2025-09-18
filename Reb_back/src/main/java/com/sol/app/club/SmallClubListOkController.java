package com.sol.app.club;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.club.dao.FileSmallClubDAO;
import com.sol.app.club.dao.SmallClubListDAO;
import com.sol.app.dto.SmallClubListDTO;

public class SmallClubListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("SmallClubListOkController 진입 성공");
		
		SmallClubListDAO smallClubListDAO = new SmallClubListDAO();
		FileSmallClubDAO fileSmallClubDAO = new FileSmallClubDAO();
		Result result = new Result();
		
		
		String temp = request.getParameter("page");
		int page = (temp == null) ? 1 : Integer.valueOf(temp);	// 페이지 기본값 1로 설정
		int rowCount = 10;	// 페이지 목록 개수
		int pageCount = 5;	// 페이지네이션 버튼 개수
		
		// 페이지 처리
		int startRow = (page - 1) * rowCount + 1;
		int endRow = startRow + rowCount - 1;
				
		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);
		
		List<SmallClubListDTO> smallClubList = smallClubListDAO.selectAll(pageMap);
		request.setAttribute("smallClubList", smallClubList);
		
		for (SmallClubListDTO sc : smallClubList) {
			System.out.println("SmallClubListDTO " + sc);			
			sc.setFileSmallClubList(fileSmallClubDAO.select(sc.getSmallClubNumber())); 
		}
		
		// 페이지 정보 설정
		int total = smallClubListDAO.getTotal();
		int realEndPage = (int)Math.ceil(total / (double)rowCount);
		int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);
		int startPage = endPage - (pageCount - 1);
				
		endPage = Math.min(endPage, realEndPage);
				
		boolean prev = startPage > 1;
		boolean next = endPage < realEndPage;
				
		request.setAttribute("page", page);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("prev", prev);
		request.setAttribute("next", next);
				
		System.out.println("======페이징정보 확인=====");
		System.out.println("pageMap : " + pageMap);
		System.out.println("smallClubList : " + smallClubList);
		System.out.println("startPage : " + startPage + ", endPage : " + endPage + ", prev : " + prev + ", next : " + next);
		System.out.println("======================");
		
		
		
		
		result.setPath("/app/club/small-club-list.jsp");
		result.setRedirect(false);
		
		return result;
	}

	
}
