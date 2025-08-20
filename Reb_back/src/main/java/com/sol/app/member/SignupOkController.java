package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dao.MemberDAO;
import com.sol.app.dto.MemberSignupDTO;

public class SignupOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SignupOkController 진입 완료");
		
		MemberSignupDTO memberSignupDTO = new MemberSignupDTO();
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		
		memberSignupDTO.setMemberId(request.getParameter("memberId"));
		memberSignupDTO.setMemberPassword(request.getParameter("memberPassword"));
		memberSignupDTO.setMemberBirthDate(request.getParameter("memberBirthDate"));
		memberSignupDTO.setAddress(request.getParameter("addressBasic"));
		memberSignupDTO.setAddressDetail(request.getParameter("ddressAdd"));
		memberSignupDTO.setMemberEmail(request.getParameter("email"));
		memberSignupDTO.setMemberName(request.getParameter("name"));
		memberSignupDTO.setMemberGender(request.getParameter("gender"));
		memberSignupDTO.setMemberNickname(request.getParameter("nickName"));
		memberSignupDTO.setMemberPhoneNumber(request.getParameter("phoneNumber"));
		
		memberDAO.signup(memberSignupDTO);
		
		result.setPath(request.getContextPath() + "/member/login.me");
		result.setRedirect(true);
		
		return result;
	}

}
