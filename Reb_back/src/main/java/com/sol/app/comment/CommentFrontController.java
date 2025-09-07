package com.sol.app.comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;
import com.sol.app.myPage.AccountDeletionOkController;
import com.sol.app.myPage.CheckNicknameOkController;
import com.sol.app.myPage.EditCompleteOkController;
import com.sol.app.myPage.EditInfoOkController;
import com.sol.app.myPage.MyInfoOkController;
import com.sol.app.myPage.MyPageListOkController;
import com.sol.app.myPage.MyPasswordController;
import com.sol.app.myPage.MyPasswordOKController;
import com.sol.app.myPage.MySponsorController;

/**
 * Servlet implementation class CommentFrontController
 */
public class CommentFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentFrontController() {
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
		case "/comment/commentListOk.cm":
			System.out.println("댓글 목록 분기 처리");
			result = new CommentListOkController().execute(request, response);
			break;
		case "/comment/commentWriteOk.cm":
			System.out.println("댓글 목록 작성 분기 처리");
			result = new CommentWriteOkController().execute(request, response);
			break;
		case "/comment/commentDeleteOk.cm":
			System.out.println("댓글 목록 삭제 분기 처리");
			result = new CommentDeleteOkController().execute(request, response);
			break;
		}
		
		if (result != null && result.getPath() != null) {
			if (result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}
	}
}
