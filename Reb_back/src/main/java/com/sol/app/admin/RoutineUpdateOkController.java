package com.sol.app.admin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.admin.dao.AdminRoutineDAO;
import com.sol.app.dto.FileRoutineDTO;
import com.sol.app.dto.RoutineDTO;
import com.sol.app.dto.RoutineListDTO;
import com.sol.app.file.dao.FileRoutineDAO;
import com.sol.app.routine.dao.RoutineListDAO;

public class RoutineUpdateOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Result result = new Result();
		RoutineDTO routineDTO = new RoutineDTO();
		RoutineListDAO routineListDAO = new RoutineListDAO();
		FileRoutineDAO fileRoutineDAO = new FileRoutineDAO();
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/routine/";
        final int FILE_SIZE = 1024 * 1024 * 5; 
        // MultipartParser 실행
        MultipartParser parser = new MultipartParser(request, FILE_SIZE);
        parser.setEncoding("utf-8");
        System.out.println("MultipartParser 초기화 완료");
        int routineNumber = 0;
        boolean isFileUpload = false;
        List<String> dayList = new ArrayList<>();
        // 파일, 텍스트 데이터 처리
        Part part;
        while ((part = parser.readNextPart()) != null) {
        	//파일이 아닐때
            if (part.isParam()) {
                // 텍스트 파라미터 처리
                ParamPart paramPart = (ParamPart) part;
                String paramName = paramPart.getName();
                String paramValue = paramPart.getStringValue();
                System.out.println("파라미터: " + paramName + " = " + paramValue);
                //얘를 parser 가 배열 처럼 모아줌 
                if("days".equals(paramName)) {
                	dayList.add(paramValue);
                };
                switch(paramName) {
                case "routineNumber" : 
                	System.out.println("여기들어옴");
                	routineNumber = Integer.parseInt(paramValue);
                    routineDTO.setRoutineNumber(routineNumber);
                    break;
                case "routineTitle" :
                	routineDTO.setRoutineTitle(paramValue);
                	break;
                case "routineContent" :
                	routineDTO.setRoutineContent(paramValue);
                	break;
                case "routineRecruitStartDate" :
                	routineDTO.setRoutineRecruitStartDate(paramValue);
                	break;
                case "routineRecruitEndDate" :
                	routineDTO.setRoutineRecruitEndDate(paramValue);
                	break;
                case "routineStartDate":
                	routineDTO.setRoutineStartDate(paramValue);
                	break;
                case "routineEndDate":
                	routineDTO.setRoutineEndDate(paramValue);
                	break;
                case "routineStartTime":
                	routineDTO.setRoutineStartTime(paramValue);
                	break;
                case "routineEndTime":
                	routineDTO.setRoutineEndTime(paramValue);
                	break;
                case "routineRecruitCount":
                	int count = Integer.parseInt(paramValue);
                	routineDTO.setRoutineRecruitCount(count);
                	break;
                case "routineLocation" :
                	routineDTO.setRoutineLocation(paramValue);
                	break;
                case "routineLocationAdd" :
                	routineDTO.setRoutineLocationAdd(paramValue);
                	break;
                }
                
            } else if (part.isFile() && !isFileUpload) {
                FilePart filePart = (FilePart) part;
                filePart.setRenamePolicy(new DefaultFileRenamePolicy());
                String fileOriginalName = filePart.getFileName();
                
//                // 기존 파일 삭제
                if (routineNumber != 0) {
                    List<FileRoutineDTO> existingFiles = fileRoutineDAO.select(routineNumber);
                    for (FileRoutineDTO file : existingFiles) {
                        File oldFile = new File(UPLOAD_PATH, file.getFileSystemName());
                        if (oldFile.exists()) {
                            System.out.println("기존 파일 삭제: " + oldFile.getAbsolutePath());
                            oldFile.delete();
                        }
                    }
                    fileRoutineDAO.delete(routineNumber);
                    System.out.println("기존 파일 DB 삭제 완료");
                }

                if (fileOriginalName != null) {
                    String newFileName = System.currentTimeMillis() + "_" + fileOriginalName;
                    File newFile = new File(UPLOAD_PATH, newFileName);
                    filePart.writeTo(newFile);

                    if (newFile.exists()) {
                        System.out.println("새로운 파일 저장 완료: " + newFile.getAbsolutePath());
                    } else {
                        System.out.println("새로운 파일 저장 실패: " + newFile.getAbsolutePath());
                    }

                    // DB 저장
                    FileRoutineDTO fileDTO = new FileRoutineDTO();
                    fileDTO.setFileSystemName(newFileName);
                    fileDTO.setFileOriginalName(fileOriginalName);
                    fileDTO.setRoutineNumber(routineNumber);
                    fileRoutineDAO.insert(fileDTO);
                    System.out.println("새로운 파일 DB 저장 완료: " + fileDTO);

                    isFileUpload = true; // 파일이 업로드되었음을 표시
                } else {
                    System.out.println("업로드된 파일이 없습니다 (파일 선택하지 않음)");
                }
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(String day : dayList) {
        	sb.append(Days.findKorean(day));                		
        }
        String dayPlus = sb.toString();
        routineDTO.setRoutineDayOfWeek(dayPlus);
        
        
        AdminRoutineDAO routineDAO = new AdminRoutineDAO();
//        // 게시글 업데이트 실행
        routineDAO.update(routineDTO);
        System.out.println("루틴 모임 수정 완료");
        
        RoutineListDTO routineListDTO = routineListDAO.select(routineNumber);
        
        routineListDTO.setRoutineStatusNumber();
		routineListDAO.updateStatus(routineListDTO);

        //수정 완료 후 상세 페이지로 이동
        result.setPath("/admin/routineReadOk.ad?routineNumber="+routineDTO.getRoutineNumber());
        result.setRedirect(true);
        return result;
	}

}
