package com.sol.app.admin;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineDAO;
import com.sol.app.dto.FileRoutineDTO;
import com.sol.app.dto.RoutineDTO;
import com.sol.app.file.dao.FileRoutineDAO;
import com.sol.app.status.RoutineStatus;

public class RoutineWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminRoutineDAO routineDAO = new AdminRoutineDAO();
		RoutineDTO routineDTO = new RoutineDTO();
		Result result = new Result();
		FileRoutineDAO fileDAO = new FileRoutineDAO();
		FileRoutineDTO fileDTO = new FileRoutineDTO();
		
		//로그인 한 회원 정보 가져오기
		Integer adminNumber = (Integer)request.getSession().getAttribute("adminNumber");
		
		if(adminNumber == null) {
			System.out.println("오류 : 로그인된 사용자가 없습니다");
			response.sendRedirect("admin-login.jsp");
			return null;
		}
		//파일 업로드 환경 설정
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/routine/";
		final int FILE_SIZE = 1024 * 1024 * 5; //5MB
		//MultipartRequest를 이용한 데이터 파싱
		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
		//게시글 정보 설정
		routineDTO.setRoutineTitle(multipartRequest.getParameter("routineTitle"));
		routineDTO.setRoutineContent(multipartRequest.getParameter("routineContent"));
		routineDTO.setRoutineRecruitStartDate(multipartRequest.getParameter("routineRecruitStartDate"));
		routineDTO.setRoutineRecruitEndDate(multipartRequest.getParameter("routineRecruitEndDate"));
		routineDTO.setRoutineStartDate(multipartRequest.getParameter("routineStartDate"));
		routineDTO.setRoutineEndDate(multipartRequest.getParameter("routineEndDate"));
		routineDTO.setRoutineStartTime(multipartRequest.getParameter("routineStartTime"));
		routineDTO.setRoutineEndTime(multipartRequest.getParameter("routineEndTime"));
		routineDTO.setRoutineRecruitCount(Integer.valueOf(multipartRequest.getParameter("routineRecruitCount")));
		routineDTO.setRoutineLeaderNumber(Integer.valueOf(multipartRequest.getParameter("routineLeaderNumber")));
		
		//days String 배열안에 체크박스로 선택된 날짜들을 가지고 옴 
		String[] days = multipartRequest.getParameterValues("days");
		//StringBuilder로 반복문 안에서 요일 계속 이어붙이기
		StringBuilder sb = new StringBuilder();
	    for (String day : days) {
	    	//Days 안에서 영어로된 날짜를 한국어로 반환
	        sb.append(Days.findKorean(day));
	    }
	    //dayPlus 변수에 이어붙인 요일 넣기
	    String dayPlus = sb.toString();
	    //루틴모임DTO에 저장
	    routineDTO.setRoutineDayOfWeek(dayPlus);
		
		
		routineDTO.setAdminNumber(adminNumber);
		routineDTO.setRoutineLocation("routineLocation");
		//이부분 다시 체크
		//2가 들어와야됨 지금 어떤 메소드 이용해야하는지 확인
		routineDTO.setRoutineStatusNumber(RoutineStatus.getRoutineStatusNumber
				(routineDTO.getRoutineRecruitStartDate(), routineDTO.getRoutineRecruitEndDate(),
				routineDTO.getRoutineStartDate(),routineDTO.getRoutineEndDate()));
		System.out.println(routineDTO.getRoutineStatusNumber());
		System.out.println("게시글 추가 - routineDTO : " + routineDTO);
		
		//게시글 추가
		int routineNumber =routineDAO.insert(routineDTO);
		System.out.println("생성된 게시글 번호 : " + routineNumber);
		
		//파일 업로드 처리
		//Enumeration : java.util 패키지에 포함된 인터페이스, Iterator와 비슷한 역할
		Enumeration<String> fileNames = multipartRequest.getFileNames();
		while(fileNames.hasMoreElements()) {
			String name = fileNames.nextElement();
			String fileSystemName = multipartRequest.getFilesystemName(name);
			String fileOriginalName = multipartRequest.getOriginalFileName(name);
			
			if(fileSystemName == null) {
				continue;
			}
			
			fileDTO.setFileSystemName(fileSystemName);
			fileDTO.setFileOriginalName(fileOriginalName);
			fileDTO.setRoutineNumber(routineNumber);
			
			System.out.println("업로드 된 파일 정보 : " + fileDTO);
			fileDAO.insert(fileDTO);
		}
		
		result.setPath("/admin/routineListOk.ad");
		result.setRedirect(true);
		
		return result;
	}
	
}
