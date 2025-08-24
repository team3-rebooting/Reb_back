package com.sol.app.routine.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileRoutineReviewDTO;
import com.sol.config.MyBatisConfig;

public class FileRoutineReviewDAO {
	public SqlSession sqlSession;

	public FileRoutineReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public FileRoutineReviewDTO select(int routineReviewNumber) {
		return sqlSession.selectOne("fileRoutineReview.select", routineReviewNumber);
	}

	public void insert(FileRoutineReviewDTO fileRoutineReviewDTO) {
		 sqlSession.insert("fileRoutineReview.insert", fileRoutineReviewDTO);
	}
	
	public void delete(int routineReviewNumber) {
		sqlSession.delete("fileRoutineReview.delete", routineReviewNumber);
	}
}
