package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.ExpertDTO;
import com.sol.app.dto.MemberDTO;
import com.sol.app.member.dao.ExpertDAO;
import com.sol.app.myPage.dao.MyPageDAO;

public class MyPasswordOKController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MemberDTO memberDTO = new MemberDTO();
		Result result = new Result();
		String path = null;

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		request.setCharacterEncoding("UTF-8");
		memberDTO.setMemberPassword(request.getParameter("memberPassword"));

		if (memberNumber == null) {
			path = request.getContextPath() + "/member/login.me";
		} else {
			ExpertDAO expertDAO = new ExpertDAO();
			ExpertDTO expertDTO = expertDAO.select(memberNumber);

			if (expertDTO != null) {
				session.setAttribute("expertNumber", expertDTO.getExpertNumber());
				System.out.println("세션 값 expertNumber : " + expertDTO.getExpertNumber());
			}
			
			memberDTO.setMemberNumber(memberNumber);
			if (myPageDAO.checkPassword(memberDTO)) {
				path = request.getContextPath() + "/myPage/myInfoOk.my";
			} else {
				path = request.getContextPath() + "/myPage/myPassword.my?pw=fail";
			}
		}

		result.setPath(path);
		result.setRedirect(true);
		
		return result;
	}
}
