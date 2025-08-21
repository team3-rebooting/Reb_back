package com.sol.app.routine.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewDAO {
	public SqlSession sqlSession;

	public RoutineReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(RoutineDTO routineDTO) {
		sqlSession.insert("routineReview.insert", routineDTO);
	}
	
	public void delete(int routineReviewNumber) {
		sqlSession.delete("routineReview.delete", routineReviewNumber);
	}
	
	public void update(RoutineDTO routineDTO) {
		sqlSession.update("routineReview.update", routineDTO);
	}
}