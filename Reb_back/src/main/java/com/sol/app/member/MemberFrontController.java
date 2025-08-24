package com.sol.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;
import com.sol.app.admin.LoginController;

/**
 * Servlet implementation class MemberFrontController
 */
//@WebServlet("/MemberFrontController")
public class MemberFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("현재 경로 : " + target);
		Result result = new Result();

		switch(target) {
		case "/member/login.me":
			System.out.println("로그인 페이지 요청");
			result = new LoginController().execute(request, response);
			break;
		case "/member/loginOk.me":
			System.out.println("로그인 처리 요청");
			result = new LoginOkController().execute(request, response);
			System.out.println("로그인 처리 완료");
			break;
		case "/member/logoutOk.me":
			System.out.println("로그아웃 처리 요청");
			result = new LogoutOkController().execute(request, response);
			break;
		case "/member/signup.me":
			System.out.println("회원가입 페이지 이동");
			request.getRequestDispatcher("/app/auth/signup.jsp").forward(request, response);
			break;
		case "/member/signupOk.me":
			System.out.println("회원가입 처리 요청");
			result = new SignupOkController().execute(request, response);
			break;
		case "/member/checkIdOk.me":
			System.out.println("아이디 중복 확인 요청");
			result = new CheckIdOkController().execute(request, response);
			System.out.println("아이디 중복 확인 완료");
			break;
		case "/member/findIdOk.me":
			System.out.println("아이디 찾기 처리 요청");
			result = new findIdOkController().execute(request, response);
			System.out.println("아이디 찾기 처리 요청 완료");
			break;
		}
		
		if(result != null && result.getPath() != null) {
			if(result.isRedirect()) {
				response.sendRedirect(result.getPath());
			}else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}
	}

}
