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

public class EditInfoController  implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		MyPageDAO myPageDAO = new MyPageDAO();
		MyMemberDTO myMemberDTO = new MyMemberDTO();
		Result result = new Result();
		String path = null;
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer)session.getAttribute("memberNumber");
		
		request.setCharacterEncoding("UTF-8");
		
		if(memberNumber == null) {
			path = "/member/login.me";
			result.setRedirect(true);
		}
		else {
			myMemberDTO = myPageDAO.read(memberNumber);
			
			if(myMemberDTO != null) {
				//myMemberDTO.setFileMemberProfileList(myPageDAO.selectProfileList(memberNumber));
				request.setAttribute("myMemberDTO", myMemberDTO);
				path = "/app/mypage/edit-info.jsp";
				result.setRedirect(false);
			}else {
				path = "/myPage/myPassword.my?pw=fail";
				result.setRedirect(true);
			}
		}

		result.setPath(request.getContextPath() + path);
		
		return result;
	}
}
