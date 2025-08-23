package com.sol.app.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminMemberDAO;
import com.sol.app.dto.AdminMemberListDTO;

public class MemberListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminMemberDAO memberDAO = new AdminMemberDAO();
		Result result = new Result();
		PagingService ps = new PagingService();

		String temp = request.getParameter("page");
		int total = memberDAO.getTotal();
		//여기서 페이징 처리 페이지 총합 10개씩 보여지고 숫자는 5개 
		Map<String, Object> paging = ps.Paging(temp, total, 10, 5);
		Map<String, Integer> pageMap = new HashMap<>();
		
		pageMap.put("startRow", (Integer)paging.get("startRow"));
		pageMap.put("endRow",  (Integer)paging.get("endRow"));
		
		List<AdminMemberListDTO> memberList = memberDAO.selectAll(pageMap);
		request.setAttribute("memberList", memberList);
		request.setAttribute("paging", paging);
		
		result.setPath("/app/admin/member/admin-member-list.jsp");
		result.setRedirect(false);

		return result;
	}

}
