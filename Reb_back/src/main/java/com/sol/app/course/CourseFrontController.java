package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;

/**
 * Servlet implementation class CourseFrontController
 */
//@WebServlet("/CourseFrontController")
public class CourseFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CourseFrontController() {
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

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("CourseFrontController 현재 경로" + target);
		Result result = new Result();
		
		switch(target) {
		case "/course/courseReviewListOk.co":
			System.out.println("수업 후기 목록 처리 요청");
			result = new CourseReviewListOkController().execute(request, response);
			break;
		case "/course/courseReviewDetailOk.co":
			System.out.println("수업 후기 상세 페이지 요청");
			result = new CourseReviewDetailOkController().execute(request, response);
			break;
		case "/course/courseReviewWrite.co":
			System.out.println("수업 후기 작성 페이지 요청");
			result = new CourseReviewWriteController().execute(request, response);
			System.out.println("수업 후기 작성 페이지 요청 완료");
			break;
		case "/course/courseReviewWriteOk.co":
			System.out.println("수업 후기 작성 처리 요청");
			result = new CourseReviewWriteOkController().execute(request, response);
			System.out.println("수업 후기 작성 처리 요청 완료");
			break;
		case "/course/courseListOk.co":
			System.out.println("수업 목록 처리 요청");
			result = new CourseListOkController().execute(request, response);
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
