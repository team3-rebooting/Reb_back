package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminExpertDAO;
import com.sol.app.dto.AdminExpertDTO;
import com.sol.app.dto.ExpertDTO;

public class ExpertAccpetWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Result result = new Result();

		//전문가 DAO
		AdminExpertDAO expertDAO = new AdminExpertDAO();
		//전문가 DTO(DB에 들어갈 값)
		ExpertDTO expertDTO = new ExpertDTO();
		expertDTO.setMemberNumber(Integer.valueOf(request.getParameter("memberNumber")));
		expertDTO.setExpertLicenseInfo(request.getParameter("expertLicenseInfo"));
		expertDTO.setExpertCareer(request.getParameter("expertCareer"));
		expertDTO.setExpertFieldNumber(Integer.valueOf(request.getParameter("expertFieldNumber")));
		//전문가 추가
		expertDAO.insert(expertDTO);
		
		//신청 상태 변경
		expertDAO.updateExpert(expertDTO.getMemberNumber());
		
		result.setPath("/admin/expertApplicantListOk.ad");
		result.setRedirect(false);
		return result;
	}

}
