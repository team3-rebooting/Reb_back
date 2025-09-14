package com.sol.app.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;
import com.sol.app.routine.RoutineOkController;
import com.sol.app.routine.RoutineReadOkController;

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
		case "/course/courseDetailOk.co" :
			System.out.println("수업 상세 처리");
			result = new CourseDetailOkController().execute(request, response);
			break;
		case "/course/courseReviewEdit.co":
			System.out.println("수업 수정 페이지 요청");
			result = new CourseReviewEditController().execute(request, response);
			break;
		case "/course/courseReviewEditOk.co":
			System.out.println("수업 후기 수정 처리 요청");
			result = new CourseReviewEditOkController().execute(request, response);
			break;
		case "/course/courseReviewDeleteOk.co":
			System.out.println("수업 후기 삭제 처리 요청");
			result = new CourseReviewDeleteOkController().execute(request, response);
			break;
		case "/course/expertCourseCreateRequest.co":
			System.out.println("수업 개설 요청 페이지 요청");
			result = new ExpertCourseCreateRequestController().execute(request, response);
			break;
		case "/course/expertCourseCreateRequestOk.co":
			System.out.println("수업 개설 요청 처리 요청");
			result = new ExpertCourseCreateRequestOkController().execute(request, response);
			break;
		case "/course/expertCourseEditRequest.co":
			System.out.println("수업 수정 요청 페이지 요청");
			result = new ExpertCourseEditRequestController().execute(request, response);
			break;
		case "/course/expertCourseEditRequestOk.co":
			System.out.println("수업 수정 요청 처리 요청");
			result = new ExpertCourseEditRequestOkController().execute(request, response);
			break;
		case "/course/courseApplyOk.co":
			System.out.println("수업 신청/취소 처리 요청");
			result = new CourseApplyOkController().execute(request, response);
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
