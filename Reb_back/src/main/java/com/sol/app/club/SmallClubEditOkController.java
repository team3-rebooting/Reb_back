package com.sol.app.club;

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
import com.sol.app.club.dao.FileSmallClubDAO;
import com.sol.app.club.dao.SmallClubDAO;
import com.sol.app.dto.FileCourseReviewDTO;
import com.sol.app.dto.FileSmallClubDTO;
import com.sol.app.dto.SmallClubDTO;

public class SmallClubEditOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SmallClubEditOkController 진입 완료");

		SmallClubDAO smallClubDAO = new SmallClubDAO();
		SmallClubDTO smallClubDTO = new SmallClubDTO();
		FileSmallClubDAO fileSmallClubDAO = new FileSmallClubDAO();
		Result result = new Result();

		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/";
		final int FILE_SIZE = 1024 * 1024 * 5;

		MultipartParser parser = new MultipartParser(request, FILE_SIZE);
		parser.setEncoding("utf-8");
		System.out.println("MultipartParser 초기화 완료");

		int smallClubNumber = 0;
		boolean isFileUpload = false;

		Part part;
		while ((part = parser.readNextPart()) != null) {
			System.out.println("Part : " + part.getClass().getSimpleName());

			if (part.isParam()) {
				// 텍스트 파라미터 처리
				ParamPart paramPart = (ParamPart) part;
				String paramName = paramPart.getName();
				String paramValue = paramPart.getStringValue();

				System.out.println("파라미터 : " + paramName + " = " + paramValue);

				if ("smallClubNumber".equals(paramName)) {
					smallClubNumber = Integer.parseInt(paramValue);
					smallClubDTO.setSmallClubNumber(smallClubNumber);
				} else if ("smallClubTitle".equals(paramName)) {
					smallClubDTO.setSmallClubTitle(paramValue);
				} else if ("smallClubContent".equals(paramName)) {
					smallClubDTO.setSmallClubContent(paramValue);
				} else if ("smallClubStartDate".equals(paramName)) {
					smallClubDTO.setSmallClubStartDate(paramValue);
				} else if ("smallClubStartTime".equals(paramName)) {
					smallClubDTO.setSmallClubStartTime(paramValue);
				} else if ("smallClubRecruitCount".equals(paramName)) {
					int recruitCount = Integer.parseInt(paramValue);
					smallClubDTO.setSmallClubRecruitCount(recruitCount);
				}
			} else if (part.isFile() && !isFileUpload) {
				FilePart filePart = (FilePart) part;
				filePart.setRenamePolicy(new DefaultFileRenamePolicy());
				String fileOriginalName = filePart.getFileName();

				

				if (fileOriginalName != null) {
					// 기존 파일 삭제
					List<FileSmallClubDTO> existingFiles = fileSmallClubDAO.select(smallClubNumber);
					for (FileSmallClubDTO file : existingFiles) {
						File oldFile = new File(UPLOAD_PATH, file.getFileSystemName());
						if (oldFile.exists()) {
							System.out.println("기존 파일 삭제 : " + oldFile.getAbsolutePath());
							oldFile.delete();
						}
					}
					fileSmallClubDAO.delete(smallClubNumber);
					System.out.println("기존 파일 DB 삭제 완료");
					String newFileName = System.currentTimeMillis() + "_" + fileOriginalName;
					File newFile = new File(UPLOAD_PATH, newFileName);
					filePart.writeTo(newFile);

					if (newFile.exists()) {
						System.out.println("새로운 파일 저장 완료 : " + newFile.getAbsolutePath());
					} else {
						System.out.println("새로운 파일 저장 실패 : " + newFile.getAbsolutePath());
					}

					FileSmallClubDTO fileSmallClubDTO = new FileSmallClubDTO();
					fileSmallClubDTO.setFileSystemName(newFileName);
					fileSmallClubDTO.setFileOriginalName(fileOriginalName);
					fileSmallClubDTO.setSmallClubNumber(smallClubNumber);
					fileSmallClubDAO.insert(fileSmallClubDTO);
					System.out.println("새로운 파일 DB 저장 완료");

					isFileUpload = true;
				} else {
					System.out.println("업로드된 파일이 없습니다 (파일 선택하지 않음)");
				}
			}
		}

		// 게시글 업데이트 실행
		smallClubDTO.setMemberNumber((Integer) request.getSession().getAttribute("memberNumber"));
		System.out.println(smallClubDTO);
		smallClubDAO.update(smallClubDTO);
		System.out.println("게시글 수정 완료");
		

		// 수정 완료 후 리스트 페이지로 이동
		result.setPath(request.getContextPath() + "/club/smallClubDetailOk.cl?smallClubNumber=" + smallClubNumber);
		result.setRedirect(true);

		return result;
	}

}
