package com.sol.app.club;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.club.dao.SmallClubDAO;

public class SmallClubDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SmallClubDeleteOkController 진입 성공");

		int smallClubNumber = Integer.valueOf(request.getParameter("smallClubNumber"));
		SmallClubDAO smallClubDAO = new SmallClubDAO();
		Result result = new Result();

		smallClubDAO.delete(smallClubNumber);

		result.setPath("/club/smallClubListOk.cl");
		result.setRedirect(false);

		return result;
	}

}
