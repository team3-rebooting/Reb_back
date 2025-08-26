//package com.sol.app.admin;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
//import com.oreilly.servlet.multipart.FilePart;
//import com.oreilly.servlet.multipart.MultipartParser;
//import com.oreilly.servlet.multipart.ParamPart;
//import com.oreilly.servlet.multipart.Part;
//import com.sol.app.Execute;
//import com.sol.app.Result;
//import com.sol.app.dto.AdminRoutineDTO;
//import com.sol.app.file.dao.FileRoutineDAO;
//
//public class RoutineUpdateOkController implements Execute {
//
//	@Override
//	public Result execute(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		Result result = new Result();
//		AdminRoutineDTO routineDTO = new AdminRoutineDTO();
//		FileRoutineDAO fileRoutineDAO = new FileRoutineDAO();
//		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/") + "upload/";
//        final int FILE_SIZE = 1024 * 1024 * 5; 
//
//        // MultipartParser 실행
//        MultipartParser parser = new MultipartParser(request, FILE_SIZE);
//        parser.setEncoding("utf-8");
//        System.out.println("MultipartParser 초기화 완료");
//
//        int routineNumber = 0;
//        boolean isFileUpload = false;
//
//        // 파일, 텍스트 데이터 처리
//        Part part;
//        while ((part = parser.readNextPart()) != null) {
//            if (part.isParam()) {
//                // 텍스트 파라미터 처리
//                ParamPart paramPart = (ParamPart) part;
//                String paramName = paramPart.getName();
//                String paramValue = paramPart.getStringValue();
//
//                System.out.println("파라미터: " + paramName + " = " + paramValue);
//
//                if ("routineNumber".equals(paramName)) {
//                	routineNumber = Integer.parseInt(paramValue);
//                    routineDTO.setRoutineNumber(routineNumber);
//                } else if ("noticeTitle".equals(paramName)) {
//                	noticeDTO.setNoticeTitle(paramValue);
//                } else if ("noticeContent".equals(paramName)) {
//                	noticeDTO.setNoticeContent(paramValue);
//                }
//            } else if (part.isFile() && !isFileUpload) {
//                FilePart filePart = (FilePart) part;
//                filePart.setRenamePolicy(new DefaultFileRenamePolicy());
//                String fileOriginalName = filePart.getFileName();
//                
//                // 기존 파일 삭제
//                if (noticeNumber != 0) {
//                    List<FileNoticeDTO> existingFiles = fileNoticeDAO.select(noticeNumber);
//                    for (FileNoticeDTO file : existingFiles) {
//                        File oldFile = new File(UPLOAD_PATH, file.getFileSystemName());
//                        if (oldFile.exists()) {
//                            System.out.println("기존 파일 삭제: " + oldFile.getAbsolutePath());
//                            oldFile.delete();
//                        }
//                    }
//                    fileNoticeDAO.delete(noticeNumber);
//                    System.out.println("기존 파일 DB 삭제 완료");
//                }
//
//                if (fileOriginalName != null) {
//                    String newFileName = System.currentTimeMillis() + "_" + fileOriginalName;
//                    File newFile = new File(UPLOAD_PATH, newFileName);
//                    filePart.writeTo(newFile);
//
//                    if (newFile.exists()) {
//                        System.out.println("새로운 파일 저장 완료: " + newFile.getAbsolutePath());
//                    } else {
//                        System.out.println("새로운 파일 저장 실패: " + newFile.getAbsolutePath());
//                    }
//
//                    // DB 저장
//                    FileNoticeDTO fileDTO = new FileNoticeDTO();
//                    fileDTO.setFileSystemName(newFileName);
//                    fileDTO.setFileOriginalName(fileOriginalName);
//                    fileDTO.setNoticeNumber(noticeNumber);
//                    fileNoticeDAO.insert(fileDTO);
//                    System.out.println("새로운 파일 DB 저장 완료: " + fileDTO);
//
//                    isFileUpload = true; // 파일이 업로드되었음을 표시
//                } else {
//                    System.out.println("업로드된 파일이 없습니다 (파일 선택하지 않음)");
//                }
//            }
//        }
//        AdminNoticeDAO noticeDAO = new AdminNoticeDAO();
//        // 게시글 업데이트 실행
//        noticeDTO.setAdminNumber((Integer) request.getSession().getAttribute("adminNumber"));
//        noticeDAO.update(noticeDTO);
//        System.out.println("게시글 수정 완료");
//
//        //수정 완료 후 리스트 페이지로 이동
//        result.setPath("/admin/noticeListOk.ad");
//        result.setRedirect(true);
//        return result;
//	}
//
//}
