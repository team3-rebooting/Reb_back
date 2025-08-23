package com.sol.app.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.myPage.dao.MyCourseDAO;

public class MyApplicantRoutineOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MyApplicantRoutineOkController 진입");
		MyCourseDAO myCourseDAO = new MyCourseDAO();
		Result result = new Result();

		String temp = request.getParameter("page");
		int page = (temp == null) ? 1 : Integer.valueOf(temp); // 페이지 번호 기본값 1로 설정하겠다
		int rowCount = 10; // 한 페이지당 게시글 수
		int pageCount = 5; // 페이지 버튼 수

		request.setAttribute("rowCount", rowCount);

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			// 페이징 정보 설정
			// BoardMapper.xml의 getTotal을 이용하여 전체 게시글 개수 조회
			// 실제 마지막 페이지 번호(realEndPage)를 계산함
			int total = myCourseDAO.getTotal(memberNumber);
			int realEndPage = (int) Math.ceil(total / (double) rowCount); // 실제 마지막 페이지(전체 게시글 기준으로 계산)
			int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount); // 현재 페이지 그룹에서의 마지막 페이지
			int startPage = endPage - (pageCount - 1); // 현재 페이지 그룹에서의 첫 페이지

			// endPage가 실제 존재하는 마지막 페이지보다 크면 조정
			endPage = Math.min(endPage, realEndPage);

			// prev, next 버튼 활성화 여부 확인
			boolean prev = startPage > 1;
			boolean next = endPage < realEndPage;

			request.setAttribute("page", page);
			request.setAttribute("startPage", startPage);
			request.setAttribute("endPage", endPage);
			request.setAttribute("prev", prev);
			request.setAttribute("next", next);

			System.out.println("====페이징정보 확인====");
			System.out.println(
					"startPage : " + startPage + ", endPage : " + endPage + ", prev : " + prev + ", next : " + next);
			System.out.println("====================");

		}

		result.setPath(request.getContextPath() + "/app/mypage/my-courses.jsp");
		result.setRedirect(false);

		return result;
	}
}
