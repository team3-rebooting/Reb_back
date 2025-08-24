package com.sol.app.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminExpertDAO;
import com.sol.app.dto.AdminExpertDTO;
import com.sol.app.dto.FileExpertDTO;
import com.sol.app.file.dao.FileExpertDAO;

public class ExpertReadOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();
		String expertNumberStr = request.getParameter("expertNumber");
		if (expertNumberStr == null || expertNumberStr.trim().isEmpty()) {
			System.out.println("expertNumber값이 없습니다");
			result.setPath("/app/admin/member/admin-expert-access-list.jsp"); // 게시글 목록 페이지로 리다이렉트
			result.setRedirect(true);
			return result;
		}

		AdminExpertDAO expertDAO = new AdminExpertDAO();
		int expertNumber = Integer.parseInt(expertNumberStr);
		FileExpertDAO fileExpertDAO = new FileExpertDAO();

		// DB에서 게시글 가져오기
		AdminExpertDTO expertDTO = expertDAO.select(expertNumber);
		
		if (expertDTO == null) {
			System.out.println("존재하지 않는 게시글입니다. " + expertNumber);
			result.setPath("/app/admin/member/admin-expert-access-list.jsp");
			result.setRedirect(true);
			return result;
		}

		// 첨부파일 가져오기
		List<FileExpertDTO> files = fileExpertDAO.select(expertDTO.getMemberNumber());
		System.out.println("======파일 확인======");
		System.out.println(files);
		System.out.println("===================");

		// 첨부파일 붙이기
		expertDTO.setFileExpertList(files);
		// 로그인한 사용자 번호 가져오기
		Integer loginAdminNumber = (Integer) request.getSession().getAttribute("adminNumber");
		System.out.println("로그인 한 관리자 번호 : " + loginAdminNumber);

		request.setAttribute("expert", expertDTO);
		result.setPath("/app/admin/member/admin-expert-access-detail.jsp");
		result.setRedirect(false);

		return result;
	}

}
