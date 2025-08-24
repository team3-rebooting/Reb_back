package com.sol.app.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileNoticeDTO;
import com.sol.config.MyBatisConfig;

public class FileNoticeDAO {
	public SqlSession sqlSession;

	public FileNoticeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 파일 추가 메소드
	public void insert(FileNoticeDTO fileDTO) {
		System.out.println("파일 DAO - 파일 저장 " + fileDTO);

		try {
			int result = sqlSession.insert("fileNotice.insert", fileDTO);
			// db에 파일이 제대로 저장되었는지 확인
			List<FileNoticeDTO> uploadFile = select(fileDTO.getNoticeNumber());
		} catch (Exception e) {
			System.out.println("파일 저장이 실패되었습니다. : " + e.getMessage());
			e.printStackTrace();
		}
	}

	// 파일 조회 메소드
	public List<FileNoticeDTO> select(int noticeNumber) {
		return sqlSession.selectList("fileNotice.select", noticeNumber);
	}

	// 파일 삭제 메소드
	public void delete(int noticeNumber) {
		sqlSession.delete("fileNotice.delete", noticeNumber);
	}
}
