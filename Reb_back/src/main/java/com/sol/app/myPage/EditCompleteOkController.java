package com.sol.app.myPage;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;
import com.sol.app.Execute;
import com.sol.app.Result;
import com.sol.app.dto.AddressDTO;
import com.sol.app.dto.FileMemberProfileDTO;
import com.sol.app.dto.MemberDTO;
import com.sol.app.dto.MyMemberDTO;
import com.sol.app.myPage.dao.FileMemberProfileDAO;
import com.sol.app.myPage.dao.MyAddressDAO;
import com.sol.app.myPage.dao.MyPageDAO;

public class EditCompleteOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("개인 정보 수정 완료 처리 진입");

		MyPageDAO myPageDAO = new MyPageDAO();
		MyMemberDTO myMemberDTO = new MyMemberDTO();
		FileMemberProfileDAO fileDAO = new FileMemberProfileDAO();
		MyAddressDAO addressDAO = new MyAddressDAO();
		AddressDTO addressDTO = new AddressDTO();
		
		Result result = new Result();

		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/profile";
		final int FILE_SIZE = 1024 * 1024 * 5;

		// MultipartParser 실행
		MultipartParser parser = new MultipartParser(request, FILE_SIZE);
		parser.setEncoding("utf-8");
		System.out.println("MultipartParser 초기화 완료");

		HttpSession session = request.getSession();
		Integer memberNumber = (Integer) session.getAttribute("memberNumber");

		myMemberDTO = myPageDAO.select(memberNumber);
		
		boolean isFileUpload = false;

		// 파일, 텍스트 데이터 처리
		Part part;
		while ((part = parser.readNextPart()) != null) {
			System.out.println("Part: " + part.getClass().getSimpleName());

			if (part.isParam()) {
				// 텍스트 파라미터 처리
				ParamPart paramPart = (ParamPart) part;
				String paramName = paramPart.getName();
				String paramValue = paramPart.getStringValue();

				/*
				 * MEMBER_PASSWORD = #{memberPassword}, MEMBER_NICKNAME = #{memberNickname},
				 * MEMBER_ADDRESS_NUMBER = #{memberAddressNumber}, MEMBER_EMAIL =
				 * #{memberEmail}, MEMBER_PHONE_NUMBER = #{memberPhoneNumber}
				 */

				System.out.println("파라미터: " + paramName + " = " + paramValue);

				if ("memberPassword".equals(paramName)) {
					myMemberDTO.setMemberPassword(paramValue);
				} else if ("memberNickname".equals(paramName)) {
					myMemberDTO.setMemberNickname(paramValue);
				} else if ("memberPhoneNumber".equals(paramName)) {
					myMemberDTO.setMemberPhoneNumber(paramValue);
				} else if ("memberEmail".equals(paramName)) {
					myMemberDTO.setMemberEmail(paramValue);
				} else if ("memberAddressNumber".equals(paramName)) {
					myMemberDTO.setMemberAddressNumber(Integer.parseInt(paramValue));   
				}else if("address".equals(paramName)) {
					addressDTO.setAddress(paramValue);
					myMemberDTO.setAddress(paramValue);
				}else if("addressDetail".equals(paramName)) {
					addressDTO.setAddressDetail(paramValue);
					myMemberDTO.setAddressDetail(paramValue);
				}else if("zipCode".equals(paramName)) {
					addressDTO.setZipCode(paramValue);
					myMemberDTO.setZipCode(paramValue);
				}
			} else if (part.isFile() && !isFileUpload) {
				FilePart filePart = (FilePart) part;
				filePart.setRenamePolicy(new DefaultFileRenamePolicy());
				String fileOriginalName = filePart.getFileName();

				// 기존 파일 삭제
				if (memberNumber != 0) {
					FileMemberProfileDTO existingFile = fileDAO.select(memberNumber);

					File oldFile = new File(UPLOAD_PATH, existingFile.getFileSystemName());
					if (oldFile.exists()) {
						System.out.println("기존 파일 삭제: " + oldFile.getAbsolutePath());
						oldFile.delete();
					}
					
					fileDAO.delete(memberNumber);
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
					FileMemberProfileDTO fileDTO = new FileMemberProfileDTO();
					fileDTO.setFileSystemName(newFileName);
					fileDTO.setFileOriginalName(fileOriginalName);
					fileDTO.setMemberNumber(memberNumber);
					fileDAO.insert(fileDTO);
					System.out.println("새로운 파일 DB 저장 완료: " + fileDTO);

					isFileUpload = true; // 파일이 업로드되었음을 표시
				} else {
					System.out.println("업로드된 파일이 없습니다 (파일 선택하지 않음)");
				}
			}
		}

		int addressNumber = addressDAO.insert(addressDTO);
		myMemberDTO.setMemberNumber(memberNumber);
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setMemberAddressNumber(addressNumber);
		memberDTO.setMemberNumber(myMemberDTO.getMemberNumber());
		memberDTO.setMemberEmail(myMemberDTO.getMemberEmail());
		memberDTO.setMemberNickname(myMemberDTO.getMemberNickname());
		memberDTO.setMemberPhoneNumber(myMemberDTO.getMemberPhoneNumber());
		memberDTO.setMemberPassword(myMemberDTO.getMemberPassword());
		
		System.out.println("updated : " + memberDTO);
		myPageDAO.update(memberDTO);

		// 수정 완료 후 리스트 페이지로 이동
		result.setPath("/myPage/myInfoOk.my");
		result.setRedirect(true);
		return result;
	}

}
