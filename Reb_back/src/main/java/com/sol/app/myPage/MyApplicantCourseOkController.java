package com.sol.app.myPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.myPage.dao.MyCourseDAO;

public class MyApplicantCourseOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MyApplicantCourseLoadOkController 진입");

		String temp = request.getParameter("page");
		System.out.println("temp page : " + temp);
		
		int page = (temp == null) ? 1 : Integer.valueOf(temp); // 페이지 번호 기본값 1로 설정하겠다

		MyCourseDAO myCourseDAO = new MyCourseDAO();
		Result result = new Result();

		Gson gson = new Gson();
		JsonArray cols = new JsonArray();

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		int pageCount = 5; // 페이지 버튼 수
		int rowCount = 10; // 한 페이지당 게시글 수

		// 페이징 처리
		int startRow = (page - 1) * rowCount + 1;
		int endRow = startRow + rowCount - 1;

		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("memberNumber", memberNumber);

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			// 페이징 정보 설정
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
			
			JsonObject pageObj = new JsonObject();
			
			pageObj.addProperty("page", page);
			pageObj.addProperty("startPage", startPage);
			pageObj.addProperty("endPage", endPage);
			pageObj.addProperty("prev", prev);
			pageObj.addProperty("next", next);
			pageObj.addProperty("rowCount", rowCount);			

			System.out.println("====페이징정보 확인====");
			System.out.println(
					"startPage : " + startPage + ", endPage : " + endPage + ", prev : " + prev + ", next : " + next);
			System.out.println("====================");

			// 목록 열 정보
			cols.add("제목");
			cols.add("전문가");
			cols.add("신청일자");


			JsonObject obj = new JsonObject();
			JsonArray list = new JsonArray();
			JsonArray etcArr = new JsonArray();
			
			// DB에서 가져온 목록 정보를 Json 형태로 변환
			myCourseDAO.selectList(map).stream().map(gson::toJson).map(JsonParser::parseString).forEach((data) -> {
				//목록 행 정보
				JsonArray a = new JsonArray();

				a.add(data.getAsJsonObject().get("courseTitle"));
				a.add(data.getAsJsonObject().get("expertName"));
				a.add(data.getAsJsonObject().get("courseMemberApplyDate"));

				list.add(a);
				
				// 행에 추가할 기타 정보
				JsonObject etc = new JsonObject();

				String href = "/course/courseDetailOk.co?courseNumber=" + data.getAsJsonObject().get("courseNumber");
				etc.addProperty("href", href);
				
				etcArr.add(etc);
			});

			obj.addProperty("listTitle", "나의 수강 수업 내역");
			obj.add("cols", cols);
			obj.add("list", list);
			obj.add("etcArr", etcArr);
			obj.add("page", pageObj);

			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();

			out.close();
		}
		return null;
	}
}
