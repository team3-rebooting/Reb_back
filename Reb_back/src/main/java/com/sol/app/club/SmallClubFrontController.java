package com.sol.app.club;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;

/**
 * Servlet implementation class SmallClubFrontController
 */
/* @WebServlet("/SmallClubFrontController") */
public class SmallClubFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SmallClubFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("SmallClubFrontController 현재 경로" + target);
		Result result = new Result();
		
		switch(target) {
		case "/club/smallClubListOk.cl":
			System.out.println("소모임 목록 처리 요청");
			result = new SmallClubListOkController().execute(request, response);
			break;
		case "/club/smallClubDetailOk.cl":
			System.out.println("소모임 상세페이지 처리 요청");
			result = new SmallClubDetailOkController().execute(request, response);
			break;
		case "/club/smallClubWrite.cl":
			System.out.println("소모임 게시글 작성 페이지 요청");
			result = new SmallClubWriteController().execute(request, response);
			break;
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				response.sendRedirect(result.getPath());
			}
			else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}
		
	}

}
