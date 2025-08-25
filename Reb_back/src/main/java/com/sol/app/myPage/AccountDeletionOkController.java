package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.myPage.dao.MyCourseRequestDAO;
import com.sol.app.myPage.dao.MyPageDAO;

public class AccountDeletionOkController  implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MyCourseRequestDAO myCourseRequestDAO = new MyCourseRequestDAO();
		
		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		Result result = new Result();
		request.setCharacterEncoding("UTF-8");
		
		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			if(myCourseRequestDAO.getTotal(memberNumber) > 0) {
				System.out.println("수업 존재로 회원 탈퇴 불가");
				result.setPath(request.getContextPath() + "/myPage/myInfoOk.my");
				result.setRedirect(false);
			}else {
				myPageDAO.delete(memberNumber);

				request.getSession().invalidate();
				
				result.setPath(request.getContextPath() + "/myPage/accountDeletion.my");
				result.setRedirect(true);
			}
		}
		
		return result;
	}
}
