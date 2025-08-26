package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MemberDTO;
import com.sol.app.member.dao.MemberDAO;

public class ExpertAcceptWriteController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		HttpSession session = request.getSession();
		//관리자 번호는 세션에서 가져오고
		Integer adminNumber = (Integer)session.getAttribute("adminNumber");
		//회원 번호는 parameter 를 통해 가져온다 
		int memberNumber = Integer.valueOf(request.getParameter("memberNumber"));
		MemberDAO memberDAO = new MemberDAO();
		//가져온 memberNumber 로 Expert 에 들어갈 member 정보를 memberDTO에 담는다
		System.out.println(memberNumber);
		MemberDTO memberDTO = memberDAO.findExpert(memberNumber);
		
		String path = null;
		
		//관리자 로그인 확인후
		if(adminNumber == null) {
			path = "/app/admin/login/admin-login.jsp";
		}else {
			//회원 정보를 input-info jsp로 넘긴다 
			path = "/app/admin/member/admin-expert-input-info.jsp";
			request.setAttribute("expert", memberDTO);
		}
		result.setPath(path);
		result.setRedirect(false);
		
		return result;
	}

}
