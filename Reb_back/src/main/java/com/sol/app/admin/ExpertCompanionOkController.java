package com.sol.app.admin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminExpertDAO;
import com.sol.app.dto.ExpertApplicantDTO;

public class ExpertCompanionOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminExpertDAO expertDAO = new AdminExpertDAO();
		Gson gson = new Gson();
		try {
			BufferedReader reader = request.getReader();
			String body = reader.lines().collect(Collectors.joining());
			JsonObject json = JsonParser.parseString(body).getAsJsonObject();
			int memberNumber = json.get("memberNumber").getAsInt();
			System.out.println(memberNumber);
			String returnMsg = json.get("returnMsg").getAsString();
			System.out.println(returnMsg);
			ExpertApplicantDTO expertDTO = new ExpertApplicantDTO();
			expertDTO.setMemberNumber(memberNumber);
			expertDTO.setExpertApplicantReason(returnMsg);

			expertDAO.update(expertDTO);

			response.setContentType("application/json; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(gson.toJson(java.util.Map.of("status", "success")));
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			response.setContentType("application/json; charset=utf-8");
			response.getWriter().print(gson.toJson(java.util.Map.of("status", "fail")));
		}
		return null;
	}

}
