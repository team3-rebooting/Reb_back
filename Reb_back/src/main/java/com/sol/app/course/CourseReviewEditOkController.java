package com.sol.app.course;

import java.io.File;
import java.io.IOException;
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
import com.sol.app.course.dao.CourseReviewDAO;
import com.sol.app.course.dao.FileCourseReviewDAO;
import com.sol.app.dto.CourseReviewDTO;
import com.sol.app.dto.FileCourseReviewDTO;

public class CourseReviewEditOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("CourseReviewEditOkController 진입 완료");
		
		CourseReviewDAO courseReviewDAO = new CourseReviewDAO();
		CourseReviewDTO courseReviewDTO = new CourseReviewDTO();
		FileCourseReviewDAO fileCourseReviewDAO = new FileCourseReviewDAO();
		Result result = new Result();
		
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload";
		final int FILE_SIZE = 1024 * 1024 * 5;
		
		MultipartParser parser = new MultipartParser(request, FILE_SIZE);
		parser.setEncoding("utf-8");
		System.out.println("MultipartParser 초기화 완료");
		
		int courseReviewNumber = 0;
		boolean isFileUpload = false;
		
		Part part;
		while((part = parser.readNextPart()) != null) {
			System.out.println("Part : " + part.getClass().getSimpleName());
			
			if(part.isParam()) {
				// 텍스트 파라미터 처리
				ParamPart paramPart = (ParamPart) part;
				String paramName = paramPart.getName();
				String paramValue = paramPart.getStringValue();
				
				System.out.println("파라미터 : " + paramName + " = " + paramValue);
				
				if("courseReviewNumber".equals(paramName)) {
					courseReviewNumber = Integer.parseInt(paramValue);
					courseReviewDTO.setCourseReviewNumber(courseReviewNumber);
				} else if("courseReviewTitle".equals(paramName)) {
					courseReviewDTO.setCourseReviewTitle(paramValue);
				} else if("courseReviewContent".equals(paramName)) {
					courseReviewDTO.setCourseReviewContent(paramValue);
				}
			} else if(part.isFile() && !isFileUpload) {
				FilePart filePart = (FilePart) part;
				filePart.setRenamePolicy(new DefaultFileRenamePolicy());
				String fileOriginalName = filePart.getFileName();
				
				// 기존 파일 삭제
				if(courseReviewNumber != 0) {
					List<FileCourseReviewDTO> existingFiles = fileCourseReviewDAO.select(courseReviewNumber);
					for(FileCourseReviewDTO file : existingFiles){
						File oldFile = new File(UPLOAD_PATH, file.getFileSystemName());
						if(oldFile.exists()) {
							System.out.println("기존 파일 삭제 : " + oldFile.getAbsolutePath());
							oldFile.delete();
						}
					}
					fileCourseReviewDAO.delete(courseReviewNumber);
					System.out.println("기존 파일 DB 삭제 완료");
				}
				
				if(fileOriginalName != null) {
					String newFileName = System.currentTimeMillis() + "_" + fileOriginalName;
					File newFile = new File(UPLOAD_PATH, newFileName);
					filePart.writeTo(newFile);
					
					if(newFile.exists()) {
						System.out.println("새로운 파일 저장 완료 : " + newFile.getAbsolutePath());
					} else {
						System.out.println("새로운 파일 저장 실패 : " + newFile.getAbsolutePath());
					}
					
					FileCourseReviewDTO fileCourseReviewDTO = new FileCourseReviewDTO();
					fileCourseReviewDTO.setFileSystemName(newFileName);
					fileCourseReviewDTO.setFileOriginalName(fileOriginalName);
					fileCourseReviewDTO.setCourseReviewNumber(courseReviewNumber);
					fileCourseReviewDAO.insert(fileCourseReviewDTO);
					System.out.println("새로운 파일 DB 저장 완료");
					
					isFileUpload = true;
				} else {
					System.out.println("업로드된 파일이 없습니다 (파일 선택하지 않음)");
				}
			}
		}
		
		// 게시글 업데이트 실행
		courseReviewDTO.setMemberNumber((Integer) request.getSession().getAttribute("memberNumber"));
		courseReviewDAO.update(courseReviewDTO);
		System.out.println("게시글 수정 완료");
		
		// 수정 완료 후 리스트 페이지로 이동
		result.setPath("/course/courseReviewListOk.co");
		result.setRedirect(true);		
		
		return result;
	}

}
