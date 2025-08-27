package com.sol.app.donation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;

public class DonationResponseOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//DB 처리
		
		
		//가격 보내기
		request.setAttribute("amount", Integer.parseInt(request.getParameter("amount")));
		//완료 페이지로 보내기
		Result result = new Result();
		result.setPath("/app/donation/sponsorship-complete.jsp");
		result.setRedirect(false);
		return result;
	}

}
