package com.sol.app.routine.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineReviewDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewDAO {
	public SqlSession sqlSession;

	public RoutineReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(RoutineReviewDTO routineReviewDTO) {
		sqlSession.insert("routineReview.insert", routineReviewDTO);
	}
	
	public void delete(RoutineReviewDTO routineReviewDTO) {
		sqlSession.delete("routineReview.delete", routineReviewDTO);
	}
	
	public void update(RoutineReviewDTO routineReviewDTO) {
		sqlSession.update("routineReview.update", routineReviewDTO);
	}
}