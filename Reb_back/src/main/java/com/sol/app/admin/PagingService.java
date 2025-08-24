package com.sol.app.admin;

import java.util.HashMap;
import java.util.Map;

public class PagingService {
	
	 public Map<String, Object> Paging(String temp, int total, int rowCount, int pageCount) {
	        int page = (temp == null) ? 1 : Integer.parseInt(temp);
	      
	        // 페이징 처리
	        int startRow = (page - 1) * rowCount + 1;
	        int endRow = startRow + rowCount - 1;

	        // 페이지네이션 계산
	        int realEndPage = (int) Math.ceil(total / (double) rowCount);
	        int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);
	        int startPage = endPage - (pageCount - 1);
	        if (endPage > realEndPage) endPage = realEndPage;

	        boolean prev = startPage > 1;
	        boolean next = endPage < realEndPage;
	        
	        //묶어서 가져가기
	        Map<String, Object> pageInfo = new HashMap<>();
	        pageInfo.put("page", page);
	        pageInfo.put("startRow", startRow);
	        pageInfo.put("endRow", endRow);
	        pageInfo.put("startPage", startPage);
	        pageInfo.put("endPage", endPage);
	        pageInfo.put("prev", prev);
	        pageInfo.put("next", next);

	        return pageInfo;
	    }
}
