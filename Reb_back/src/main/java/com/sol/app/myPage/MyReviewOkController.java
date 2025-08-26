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
import com.sol.app.myPage.dao.MyReviewDAO;

public class MyReviewOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MyReviewOkController 진입");

		String temp = request.getParameter("page");
		System.out.println("temp page : " + temp);
		int page = (temp == null) ? 1 : Integer.valueOf(temp); // 페이지 번호 기본값 1로 설정하겠다

		MyReviewDAO myReviewDAO = new MyReviewDAO();
		Result result = new Result();

		Gson gson = new Gson();
		JsonObject obj = new JsonObject();
		JsonArray list = new JsonArray();
		JsonArray etcArr = new JsonArray();
		JsonArray cols = new JsonArray();

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		int pageCount = 5; // 페이지 버튼 수
		int rowCount = 10; // 한 페이지당 게시글 수

		// 페이징 처리
		int startRow = (page - 1) * rowCount + 1; // 시작행(1, 11, 21, ..)
		int endRow = startRow + rowCount - 1; // 끝 행(10, 20, 30, ..)

		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("memberNumber", memberNumber);

		if (memberNumber == null) {
			result.setPath(request.getContextPath() + "/member/login.me");
			result.setRedirect(true);
		} else {
			// 페이징 정보 설정
			// BoardMapper.xml의 getTotal을 이용하여 전체 게시글 개수 조회
			// 실제 마지막 페이지 번호(realEndPage)를 계산함
			int total = myReviewDAO.getTotal(memberNumber);
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

			obj.add("page", pageObj);

			System.out.println("====페이징정보 확인====");
			System.out.println(
					"startPage : " + startPage + ", endPage : " + endPage + ", prev : " + prev + ", next : " + next);
			System.out.println("====================");

			cols.add("제목");
			cols.add("게시판");
			cols.add("작성일자");

			myReviewDAO.selectList(map).stream().map(gson::toJson).map(JsonParser::parseString).forEach((data) -> {
				JsonArray a = new JsonArray();

				a.add(data.getAsJsonObject().get("reviewTitle"));
				a.add(data.getAsJsonObject().get("postType"));
				a.add(data.getAsJsonObject().get("createdDate"));

				list.add(a);

				JsonObject etc = new JsonObject();

				boolean isRoutine = data.getAsJsonObject().get("postType").getAsString().equals("루틴 모임 후기");

				etc.addProperty("listtype", isRoutine ? "routine" : "course");
				etc.add("reviewnumber", data.getAsJsonObject().get("reviewNumber"));
				String href;

				if (isRoutine) {
					href = "/routine/routineReviewReadOk.ro?routineReviewNumber=" + data.getAsJsonObject().get("reviewNumber");
				} else {
					href = "/course/courseReviewDetailOk.co?courseReviewNumber=" + data.getAsJsonObject().get("reviewNumber");
				}

				etc.addProperty("href", href);
				etcArr.add(etc);
			});

			obj.addProperty("listTitle", "나의 후기 내역");
			obj.add("cols", cols);
			obj.add("list", list);
			obj.add("etcArr", etcArr);

			System.out.println(obj.toString());

			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();

			out.print(obj.toString());
			out.close();
		}
		return null;
	}
}