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
			request.getRequestDispatcher("/app/admin/login/admin-login.jsp").forward(request, response);
			break;
		case "/admin/loginOk.ad":
			result = new LoginOkController().execute(request, response);
			break;
		case "/admin/logoutOk.ad" :
			result = new AdminLogoutOkController().execute(request, response);
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
			result = new NoticeUpdateOkController().execute(request,response);
			break;
		case "/admin/noticeDeleteOk.ad" :
			System.out.println("공지사항 삭제");
			result = new NoticeDeleteOkController().execute(request,response);
			break;
		case "/admin/courseRequestListOk.ad" :
			System.out.println("수업 요청 리스트");
			result = new CouresRequestListOkController().execute(request,response);
			break;
		case "/admin/courseRequestReadOk.ad" :
			System.out.println("수업 요청 상세");
			result = new CourseRequestReadOkController().execute(request,response);
			break;
		case "/admin/courseRequestApproveOk.ad" :
			System.out.println("수업 개설 승인");
			result = new CourseRequestApproveOkController().execute(request,response);
			break;
		case "/admin/courseRequestCompanionOk.ad" :
			System.out.println("수업 개설 반려");
			result = new CourseRequestCompanionOkController().execute(request,response);
			break;
		case "/admin/courseRequestDeleteOk.ad" :
			System.out.println("수업 삭제 승인");
			result = new CourseRequestDeleteOkController().execute(request, response);
			break;
		case "/admin/courseListOk.ad" :
			System.out.println("수업 리스트");
			result = new CourseListOkController().execute(request,response);
			break;
		case "/admin/courseReadOk.ad" :
			System.out.println("수업 상세");
			result = new CourseReadOkController().execute(request,response);
			break;
		case "/admin/courseDeleteOk.ad" :
			System.out.println("수업 삭제");
			result = new CourseDeleteOkController().execute(request,response);
		case "/admin/routineListOk.ad" :
			System.out.println("루틴모임 리스트");
			result = new RoutineListOkController().execute(request, response);
			break;
		case "/admin/routineReadOk.ad":
			System.out.println("루틴모임 상세");
			result = new RoutineReadOkController().execute(request, response);
			break;
		case "/admin/routineWrite.ad" :
			System.out.println("루틴 모임 생성");
			result = new RoutineWriteController().execute(request,response);
			break;
		case "/admin/routineWriteOk.ad" :
			System.out.println("루틴 모임 생성 완료");
			result = new RoutineWriteOkController().execute(request,response);
			break;
		case "/admin/routineUpdate.ad" :
			System.out.println("루틴 모임 수정");
			result = new RoutineUpdateController().execute(request,response);
			break;
		case "/admin/routineUpdateOk.ad" :
			System.out.println("루틴 모임 수정 완료");
			result = new RoutineUpdateOkController().execute(request, response);
			break;
		case "/admin/routineDeleteOk.ad" :
			System.out.println("루틴 모임 삭제");
			result = new RoutineDeleteOkController().execute(request, response);
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
		case "/admin/expertAcceptWrite.ad" :
			System.out.println("전문가 승인 및 작성");
			result = new ExpertAcceptWriteController().execute(request,response);
			break;
		case "/admin/expertAcceptWriteOk.ad" :
			System.out.println("전문가 승인 및 작성 완료");
			result = new ExpertAccpetWriteOkController().execute(request,response);
			break;
		case "/admin/expertCompanionOk.ad" :
			System.out.println("전문가 승인 반려");
			result = new ExpertCompanionOkController().execute(request,response);
			break;
		case "/admin/expertListOk.ad" :
			System.out.println("전문가 목록 리스트");
			result = new ExpertListOkController().execute(request,response);
			break;
		case "/admin/expertReadOk.ad" :
			System.out.println("전문가 상세");
			result = new ExpertReadOkController().execute(request,response);
			break;
		case "/admin/routineReviewListOk.ad" :
			System.out.println("루틴 모임 리뷰 목록");
			result = new RoutineReviewListOkController().execute(request,response);
			break;
		case "/admin/routineReviewReadOk.ad" :
			System.out.println("루틴 모임 리뷰 상세");
			result = new AdminRoutineReviewReadOkController().execute(request,response);
			break;
		case "/admin/routineReviewDeleteOk.ad" :
			System.out.println("루틴 모임 리뷰 강제 삭제");
			result = new AdminRoutineReviewDeleteOkController().execute(request, response);
			break;
		case "/admin/courseReviewListOk.ad" :
			System.out.println("수업 리뷰 목록");
			result = new CourseReviewListOkController().execute(request,response);
			break;
		case "/admin/courseReviewReadOk.ad" :
			System.out.println("수업 리뷰 상세");
			result = new AdminCourseReviewListOkController().execute(request, response);
			break;
		case "/admin/courseReviewDeleteOk.ad" :
			System.out.println("수업 리뷰 강제 삭제");
			result = new AdminCourseReviewDeleteOkController().execute(request, response);
			break;
		case "/admin/bannerListOk.ad" :
			System.out.println("배너 목록");
			result = new BannerListOkController().execute(request,response);
			break;
		case "/admin/bannerWrite.ad":
			System.out.println("배너 생성");
			result = new BannerWriteController().execute(request,response);
			break;
		case "/admin/bannerWriteOk.ad" :
			System.out.println("배너 생성 완료");
			result = new BannerWriteOkController().execute(request,response);
			break;
		case "/admin/bannerUpdateOk.ad":
			System.out.println("배너 순서 변경");
			result = new BannerUpdateOkController().execute(request,response);
			break;
		case "/admin/bannerDeleteOk.ad":
			System.out.println("배너 삭제 완료");
			result = new BannerDeleteOkController().execute(request,response);
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
