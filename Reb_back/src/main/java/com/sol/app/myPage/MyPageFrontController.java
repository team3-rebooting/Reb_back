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
		case "/myPage/editInfoOk.my":
			System.out.println("개인정보 수정 정보 조회 처리");
			result = new EditInfoOkController().execute(request, response);
			break;
		case "/myPage/editCompleteOk.my":
			System.out.println("개인정보 수정 처리");
			result = new EditCompleteOkController().execute(request, response);
			break;
		case "/mypage/checkNicknameOk.my":
			System.out.println("닉네임 중복 확인 처리");
			result = new CheckNicknameOkController().execute(request, response);
			break;
		case "/myPage/accountDeletionOk.my":
			System.out.println("회원 탈퇴 처리");
			result = new AccountDeletionOkController().execute(request, response);
			break;
		case "/myPage/accountDeletion.my":
			System.out.println("회원 탈퇴 완료 페이지");
			request.getRequestDispatcher(request.getContextPath() + "/app/mypage/account-deletion.jsp").forward(request, response);
			break;
		case "/myPage/mySponsorship.my":
			System.out.println("후원 정보 페이지");
			result = new MySponsorController().execute(request, response);
			break;
		case "/myPage/expertStatusOk.my":
			System.out.println("전문가 인증 정보 조회 처리");
			request.getRequestDispatcher(request.getContextPath() + "/app/mypage/expert-status.jsp").forward(request, response);
			
			break;
		case "/myPage/expertFileUploadOk.my":
			System.out.println("전문가 인증 파일 처리");
			break;
		case "/myPage/expertReasonOk.my":
			System.out.println("전문가 반려 사유 조회 처리");
			break;
		case "/myPage/courseReasonOk.my":
			System.out.println("수업 신청 반려 사유 조회 처리");
			break;
		case "/mypage/myApplicant.my":
			System.out.println("나의 신청/수강 목록");
			request.getRequestDispatcher(request.getContextPath() + "/app/mypage/my-applicant.jsp").forward(request, response);
			break;
		case "/mypage/myReview.my":
			System.out.println("나의 후기/댓글 목록 페이지");
			request.getRequestDispatcher(request.getContextPath() + "/app/mypage/my-review.jsp").forward(request, response);
			break;
		case "/myPage/myCourseRequest.my":
			System.out.println("나의 개설 수업 목록 페이지");
			request.getRequestDispatcher(request.getContextPath() + "/app/mypage/expert-course-info.jsp").forward(request, response);
			break;
		case "/mypage/mypageListOk.my":
			System.out.println("마이페이지 목록 분기 처리");
			result = new MyPageListOkController().execute(request, response);
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
