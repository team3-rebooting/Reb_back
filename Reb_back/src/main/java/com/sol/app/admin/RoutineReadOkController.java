package com.sol.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineDAO;
import com.sol.app.dto.AdminRoutineDTO;
import com.sol.app.dto.FileRoutineDTO;
import com.sol.app.file.dao.FileRoutineDAO;

public class RoutineReadOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		String routineNumberStr = request.getParameter("routineNumber");
		if (routineNumberStr == null || routineNumberStr.trim().isEmpty()) {
			System.out.println("routineNumber값이 없습니다");
			result.setPath("/app/admin/routine/admin-routine-list.jsp"); // 게시글 목록 페이지로 리다이렉트
			result.setRedirect(true);
			return result;
		}

		AdminRoutineDAO routineDAO = new AdminRoutineDAO();
		int routineNumber = Integer.parseInt(routineNumberStr);
		FileRoutineDAO fileRoutineDAO = new FileRoutineDAO();

		// DB에서 게시글 가져오기
		AdminRoutineDTO routineDTO = routineDAO.select(routineNumber);
		
		if (routineDTO == null) {
			System.out.println("존재하지 않는 게시글입니다. " + routineNumber);
			result.setPath("/app/admin/routine/admin-routine-list.jsp");
			result.setRedirect(true);
			return result;
		}

		// 첨부파일 가져오기
		List<FileRoutineDTO> files = fileRoutineDAO.select(routineNumber);
		System.out.println("======파일 확인======");
		System.out.println(files);
		System.out.println("===================");

		// 첨부파일 붙이기
		routineDTO.setFileRoutineList(files);
		// 로그인한 사용자 번호 가져오기
		Integer loginAdminNumber = (Integer) request.getSession().getAttribute("adminNumber");
		System.out.println("로그인 한 관리자 번호 : " + loginAdminNumber);

		request.setAttribute("routine", routineDTO);
		result.setPath("/app/admin/routine/admin-routine-detail.jsp");
		result.setRedirect(false);

		return result;
	}

}
