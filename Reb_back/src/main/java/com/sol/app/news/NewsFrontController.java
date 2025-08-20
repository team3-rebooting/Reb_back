package com.sol.app.news;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;

/**
 * Servlet implementation class NewsFrontController
 */
@WebServlet("/NewsFrontController")
public class NewsFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("NewsFrontController 현재 경로 : " + target);
		Result result = new Result();
		
		//web.xml에서 아직 정해지지 않아 임의로 지정
		switch(target) {
		case "/notice/noticeListOk.no":
			System.out.println("공시사항 게시물 목록 처리 요청");
			//임시로 이동처리
//			request.getRequestDispatcher("/app/notice/notice-list.jsp").forward(request, response);
			result = new noticeListOkController().execute(request, response);
			System.out.println("result");
			break;
		
		case "/notice/noticeReadOk.no":
			System.out.println("게시물 상세 페이지 처리 요청");
			break;
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}
	}

}
