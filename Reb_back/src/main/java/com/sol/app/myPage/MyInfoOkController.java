package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MyMemberDTO;
import com.sol.app.myPage.dao.MyPageDAO;

public class MyInfoOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MyMemberDTO myMemberDTO = new MyMemberDTO();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		
		Result result = new Result();
		
		request.setCharacterEncoding("UTF-8");
		
		myMemberDTO = myPageDAO.select(memberNumber);
		
		if(myMemberDTO != null) {
			//myMemberDTO.setFileMemberProfileList(myPageDAO.selectProfileList(memberNumber));
			
			request.setAttribute("myMemberDTO", myMemberDTO);

			System.out.println(myMemberDTO.toString());
			result.setPath(request.getContextPath() + "/app/mypage/personal-info.jsp");
			result.setRedirect(false);
		}else {
			result.setPath(request.getContextPath() + "/myPage/myPassword.my?pw=fail");
			result.setRedirect(true);
		}
		
		return result;
	}

}
