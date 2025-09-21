package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.club.dao.SmallClubDAO;

public class AdminSmallClubDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int smallClubNumber = Integer.valueOf(request.getParameter("smallClubNumber"));
		SmallClubDAO smallClubDAO = new SmallClubDAO();
		Result result = new Result();

		smallClubDAO.delete(smallClubNumber);

		result.setPath("/admin/smallclubListOk.ad");
		result.setRedirect(true);

		return result;
	}

}
