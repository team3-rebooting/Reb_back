package com.sol.app.routine.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileRoutineReviewDTO;
import com.sol.config.MyBatisConfig;

public class FileRoutineReviewDAO {
	public SqlSession sqlSession;

	public FileRoutineReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<FileRoutineReviewDTO> selectList(int routineReviewNumber) {
		return sqlSession.selectList("fileRoutineReview.selectList", routineReviewNumber);
	}

	public void insert(FileRoutineReviewDTO fileRoutineReviewDTO) {
		 sqlSession.insert("fileRoutineReview.insert", fileRoutineReviewDTO);
	}
	
	public void delete(int routineReviewNumber) {
		sqlSession.delete("fileRoutineReview.delete", routineReviewNumber);
	}
}
