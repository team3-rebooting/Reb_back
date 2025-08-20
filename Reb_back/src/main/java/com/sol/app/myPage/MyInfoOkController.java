package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dao.MyPageDAO;
import com.sol.app.dto.MemberDTO;
import com.sol.app.dto.MyMemberDTO;

public class MyInfoOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MyMemberDTO myMemberDTO = new MyMemberDTO();
		Result result = new Result();
		
		request.setCharacterEncoding("UTF-8");
		
		//회원정보 세팅
		myMemberDTO.setMemberId(request.getParameter("memberId"));
		myMemberDTO.setMemberPassword(request.getParameter("memberPassword"));
		
		myMemberDTO = myPageDAO.read(myMemberDTO);
		
		if(myMemberDTO != null) {
			System.out.println(myMemberDTO.toString());
			result.setPath(request.getContextPath() + "/myPage/myInfo.my");
			result.setRedirect(true);
		}else {
			result.setPath(request.getContextPath() + "/myPage/myPassword.my?pw=fail");
			result.setRedirect(false);
		}
		
		return result;
	}

}
