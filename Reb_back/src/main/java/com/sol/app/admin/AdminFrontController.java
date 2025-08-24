package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;

/**
 * Servlet implementation class AdminFrontController
 */
public class AdminFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminFrontController() {
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
		Result result = new Result();

		switch (target) {
		case "/admin/login.ad":
			System.out.println("login으로 가야됨");
			request.getRequestDispatcher("/app/admin/login/admin-login.jsp").forward(request, response);
			System.out.println("login에서 돌아옴");
			break;
		case "/admin/loginOk.ad":
			System.out.println("로그인오케이 가야됨");
			result = new LoginOkController().execute(request, response);
			System.out.println("로그인오케이 돌아옴");
			break;
		case "/admin/noticeListOk.ad":
			System.out.println("공지사항 리스트");
			result = new NoticeListOkController().execute(request, response);
			break;
		case "/admin/noticeWrite.ad":
			System.out.println("공지사항 생성");
			result = new NoticeWriteController().execute(request,response);
			break;
		case "/admin/noticeWriteOk.ad" : 
			System.out.println("공지사항 생성 완료");
			result = new NoticeWriteOkController().execute(request, response);
			break;
		case "/admin/noticeReadOk.ad" :
			System.out.println("공지사항 상세");
			result = new NoticeReadOkController().execute(request,response);
			break;
		case "/admin/noticeUpdate.ad" :
			System.out.println("공지사항 수정");
			result = new NoticeUpdateController().execute(request,response);
			break;
		case "/admin/noticeUpdateOk.ad" :
			System.out.println("공지사항 수정완료");
			break;
		case "/admin/courseRequestListOk.ad" :
			System.out.println("수업 요청 리스트");
			result = new CouresRequestListOkController().execute(request,response);
			break;
		case "/admin/courseListOk.ad" :
			System.out.println("수업 리스트");
			result = new CourseListOkController().execute(request,response);
			break;
		case "/admin/routineListOk.ad":
			System.out.println("루틴목록 리스트");
			result = new RoutineListOkController().execute(request, response);
			break;
		case "/admin/memberListOk.ad":
			System.out.println("회원목록 리스트");
			result = new MemberListOkController().execute(request, response);
			break;
		case "/admin/sponsorListOk.ad" :
			System.out.println("후원 목록 리스트");
			result = new SponsorListOkController().execute(request,response);
			break;
		case "/admin/expertApplicantListOk.ad" :
			System.out.println("전문가 승인 목록 리스트");
			result = new ExpertApplicantListOkController().execute(request,response);
			break;
		case "/admin/expertListOk.ad" :
			System.out.println("전문가 목록 리스트");
			result = new ExpertListOkController().execute(request,response);
			break;
		case "/admin/routineReviewListOk.ad" :
			System.out.println("루틴 모임 리뷰 목록");
			result = new RoutineReviewListOkController().execute(request,response);
			break;
		case "/admin/courseReviewListOk.ad" :
			System.out.println("수업 리뷰 목록");
			result = new CourseReviewListOkController().execute(request,response);
			break;
		case "/admin/bannerListOk.ad" :
			System.out.println("배너 목록");
			result = new BannerListOkController().execute(request,response);
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
