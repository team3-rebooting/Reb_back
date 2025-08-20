package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;

/**
 * Servlet implementation class MyPageFrontController
 */
public class MyPageFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("현재 경로 : " + target);
		Result result = null;

		switch (target) {
		case "/myPage/myPassword.my":
			System.out.println("마이페이지 비밀번호 입력 페이지");
			result = new MyPasswordController().execute(request, response);
			break;
		case "/myPage/myPasswordOk.my":
			System.out.println("마이페이지 비밀번호 처리");
			result = new MyPasswordOKController().execute(request, response);
			break;
		case "/myPage/myInfoOk.my":
				System.out.println("개인정보 조회 처리");
				result = new MyInfoOkController().execute(request, response);
				break;
//		case "/myPage/myInfo.my":
//			System.out.println("개인정보 조회 페이지");
//			response.sendRedirect("/app/mypage/personal-info.jsp");
//			break;
		case "/myPage/editOk.my":
			System.out.println("개인정보 수정 처리");
			break;
		}
		
		if (result != null) {
			if (result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}
	}
}
