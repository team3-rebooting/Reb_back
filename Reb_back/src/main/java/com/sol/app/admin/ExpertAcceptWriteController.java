package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminDAO;
import com.sol.app.dto.AdminExpertApplicantDTO;
import com.sol.app.dto.MemberDTO;
import com.sol.app.member.dao.MemberDAO;

public class ExpertAcceptWriteController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminDAO adminDAO = new AdminDAO();
		Result result = new Result();
		HttpSession session = request.getSession();
		Integer adminNumber = (Integer)session.getAttribute("adminNumber");
		int memberNumber = Integer.valueOf(request.getParameter("memberNumber"));
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = memberDAO.findExpert(memberNumber);
		
		AdminExpertApplicantDTO expertDTO = new AdminExpertApplicantDTO();
		expertDTO.setMemberNumber(memberNumber);
		expertDTO.setMemberName(memberDTO.getMemberName());
		expertDTO.setMemberGender(memberDTO.getMemberGender());
		expertDTO.setMemberEmail(memberDTO.getMemberEmail());
		expertDTO.setMemberPhoneNumber(memberDTO.getMemberPhoneNumber());
		String path = null;
		
		if(adminNumber == null) {
			path = "/app/admin/login/admin-login.jsp";
		}else {
			path = "/app/admin/member/admin-expert-input-info.jsp";
			request.setAttribute("adminId", adminDAO.getAdminId(adminNumber));
			request.setAttribute("expert", expertDTO);
		}
		
		result.setPath(path);
		result.setRedirect(false);
		
		
		return result;
	}

}
