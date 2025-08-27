package com.sol.app.main;

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.dto.CourseReviewListDTO;
import com.sol.app.dto.RoutineReviewListDTO;
import com.sol.app.routine.dao.RoutineReviewListDAO;

public class ReviewListOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Result result = new Result();
		RoutineReviewListDAO routineReviewListDAO = new RoutineReviewListDAO();

		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("startRow", 1);
		pageMap.put("endRow", 3);

		List<RoutineReviewListDTO> routineReviewList = routineReviewListDAO.selectAll(pageMap);

		request.setAttribute("routineList", routineReviewList);

		System.out.println("routineList " + routineReviewList);
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();

		List<CourseReviewListDTO> courseReviewList = courseReviewDAO.selectAll(pageMap);
		request.setAttribute("courseList", courseReviewList);
		
		System.out.println("courseList " + courseReviewList);

		result.setPath(request.getContextPath() + "/main.jsp");
		result.setRedirect(false);
		
		/*
		 * String code = request.getParameter("code");
		 * System.out.println("====================code : " + code) ;
		 * 
		 * Cookie cookie = new Cookie("authorize-access-token", code);
		 * cookie.setMaxAge(60 * 60 * 24); // 1일 response.addCookie(cookie);
		 */
		
		return result;
	}
}