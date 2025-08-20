package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.MemberSignupDTO;

public class SignupOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SignupOkController 진입 완료");
		
		MemberSignupDTO memberSignupDTO = new MemberSignupDTO();
		
		
		
		return null;
	}

}
