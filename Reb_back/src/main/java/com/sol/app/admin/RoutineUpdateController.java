package com.sol.app.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineDAO;
import com.sol.app.admin.dao.RoutineLeaderDAO;
import com.sol.app.dto.AdminRoutineDTO;
import com.sol.app.dto.RoutineLeaderDTO;
import com.sol.app.file.dao.FileRoutineDAO;

public class RoutineUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int routineNumber = Integer.valueOf(request.getParameter("routineNumber"));
		AdminRoutineDAO routineDAO = new AdminRoutineDAO();
		FileRoutineDAO fileDAO = new FileRoutineDAO();
		Result result = new Result();
		RoutineLeaderDAO leaderDAO = new RoutineLeaderDAO();
		List<RoutineLeaderDTO> leaderList = leaderDAO.selectForRoutine();
		
		//routineDTO를 불러와서
		AdminRoutineDTO routineDTO = routineDAO.select(routineNumber);
		
		//얘가 한국어
		String week = routineDTO.getRoutineDayOfWeek();
		//얘가 나눠 담을 영어 배열
//		String[] days = new String[week.length()];
		Map<String,String> days = new HashMap<>();
		//얘로 짤라서 days 에 넣고
		String[] daysK = week.split("");
		//한국어 한글자씩 있는 배열을 영어로 변환해줘야함
//		for(int i=0;i<days.length;i++) {
//			days[i] = Days.findEnglish(days[i]);
//		}
		//한글,영어로 만들기
		for(int i=0;i<daysK.length;i++) {
			days.put(daysK[i], Days.findEnglish(daysK[i]));
		}
		//days 를 요청 객체에 담아 보낸다
		request.setAttribute("days", days);
		//파일 추가
		routineDTO.setFileRoutineList(fileDAO.select(routineNumber));
		//추가한 파일까지 같이 set
		request.setAttribute("routine", routineDTO);
		request.setAttribute("leader", leaderList);
		result.setPath("/app/admin/routine/admin-routine-edit.jsp");
		result.setRedirect(false);
		return result;
	}

}
