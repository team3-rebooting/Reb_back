package com.sol.app.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileAdminDTO;
import com.sol.app.dto.FileCourseReviewDTO;
import com.sol.config.MyBatisConfig;

public class AdminFileCourseReviewDAO {
	public SqlSession sqlSession;

	public AdminFileCourseReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 파일 추가 메소드
	public void insert(FileCourseReviewDTO fileDTO) {
		System.out.println("파일 DAO - 파일 저장 " + fileDTO);

		try {
			int result = sqlSession.insert("fileCourseReview.insert", fileDTO);
			// db에 파일이 제대로 저장되었는지 확인
			List<FileCourseReviewDTO> uploadFile = select(fileDTO.getCourseReviewNumber());
		} catch (Exception e) {
			System.out.println("파일 저장이 실패되었습니다. : " + e.getMessage());
			e.printStackTrace();
		}
	}

	// 파일 조회 메소드
	public List<FileCourseReviewDTO> select(int reviewNumber) {
		return sqlSession.selectList("fileCourseReview.select", reviewNumber);
	}

	// 파일 삭제 메소드
	public void delete(int reviewNumber) {
		sqlSession.delete("fileCourseReview.delete", reviewNumber);
	}
}
