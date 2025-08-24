package com.sol.app.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileExpertDTO;
import com.sol.config.MyBatisConfig;

public class FileExpertDAO {
	public SqlSession sqlSession;

	public FileExpertDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 파일 추가 메소드
	public void insert(FileExpertDTO fileDTO) {
		System.out.println("파일 DAO - 파일 저장 " + fileDTO);

		try {
			int result = sqlSession.insert("fileExpert.insert", fileDTO);
			// db에 파일이 제대로 저장되었는지 확인
			List<FileExpertDTO> uploadFile = select(fileDTO.getMemberNumber());
		} catch (Exception e) {
			System.out.println("파일 저장이 실패되었습니다. : " + e.getMessage());
			e.printStackTrace();
		}
	}

	// 파일 조회 메소드
	public List<FileExpertDTO> select(int expertNumber) {
		return sqlSession.selectList("fileExpert.select", expertNumber);
	}

	// 파일 삭제 메소드
	public void delete(int expertNumber) {
		sqlSession.delete("fileExpert.delete", expertNumber);
	}
}
