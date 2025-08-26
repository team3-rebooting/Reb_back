package com.sol.app.routine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;

/**
 * Servlet implementation class RoutineFrontManager
 */
public class RoutineFrontManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoutineFrontManager() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("현재 경로 : " + target);
		Result result = null;

		switch (target) {
		case "/routine/routineReviewOk.ro":
			System.out.println("루틴 후기 목록 처리");
			result = new RoutineReviewOkController().execute(request, response);
			break;
		case "/routine/routineReviewReadOk.ro":
			System.out.println("루틴 후기 상세 처리");
			result = new RoutineReviewReadOkController().execute(request, response);
			break;
		case "/routine/routineReviewWrite.ro":
			System.out.println("루틴 후기 작성");
			result = new RoutineReviewWriteController().execute(request, response);
			break;
		case "/routine/routineReviewWriteOk.ro":
			System.out.println("루틴 후기 작성 처리");
			result = new RoutineReviewWriteOkController().execute(request, response);
			break;
		case "/routine/routineOk.ro" :
			System.out.println("루틴 모임 목록 처리");
			result = new RoutineOkController().execute(request, response);
			break;
		case "/routine/routineUpdate.ro":
			System.out.println("루틴 모임 후기 수정 페이지");
			request.getRequestDispatcher("/app/routine/routine-meeting-review-edit.jsp").forward(request, response);
			break;
		case "/routine/routineReadOk.ro" :
			System.out.println("루틴 모임 상세 처리");
			result = new RoutineReadOkController().execute(request, response);
			break;
		case "/routine/routineApplyOk.ro" :
			System.out.println("루틴 모임 신청/취소 처리");
			result = new RoutineApplyOkController().execute(request, response);
			break;
		case "/routine/routineReviewDeleteOk.ro" :
			System.out.println("루틴 모임 삭제 처리");
			result = new RoutineReviewDeleteOkController().execute(request, response);
			break;
		case "/routine/routineReviewUpdateOk.ro" :
			System.out.println("루틴 모임 수정 처리");
			result = new RoutineReviewUpdateOkController().execute(request, response);
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
