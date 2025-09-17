package com.sol.app.club.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileSmallClubDTO;
import com.sol.config.MyBatisConfig;

public class FileSmallClubDAO {
	public SqlSession sqlSession;

	public FileSmallClubDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 파일 추가 메소드
	public void insert(FileSmallClubDTO fileSmallClubDTO) {
		System.out.println("파일 DAO - 파일 저장 " + fileSmallClubDTO);

		try {
			int result = sqlSession.insert("fileSmallClub.insert", fileSmallClubDTO);
			System.out.println("파일 저장 완료 - DB에 저장된 행의 개수 : " + result);

			// db에 파일이 제대로 저장되었는지 확인
			List<FileSmallClubDTO> uploadFile = select(fileSmallClubDTO.getSmallClubNumber());
			System.out.println("db에서 가져온 파일 : " + uploadFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("파일 저장이 실패되었습니다. : " + e.getMessage());
			e.printStackTrace();
		}
	}

	// 파일 조회 메소드
	public List<FileSmallClubDTO> select(int smallClubNumber) {
		System.out.println("수업 게시글 이미지 조회 진입");
		return sqlSession.selectList("fileSmallClub.select", smallClubNumber);
	}

	// 파일 삭제 메소드
	public void delete(int smallClubNumber) {
		sqlSession.delete("fileSmallClub.delete", smallClubNumber);
	}
}
