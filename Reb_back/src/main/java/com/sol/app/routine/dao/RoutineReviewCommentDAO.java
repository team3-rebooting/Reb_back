package com.sol.app.routine.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineReviewCommentDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewCommentDAO  {
	public SqlSession sqlSession;

	public RoutineReviewCommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(RoutineReviewCommentDTO routineReviewCommentDTO) {
		sqlSession.insert("routineReviewComment.insert", routineReviewCommentDTO);
	}
	
	public void delete(RoutineReviewCommentDTO routineReviewCommentDTO) {
		sqlSession.delete("routineReviewComment.delete", routineReviewCommentDTO);
	}
	
	public void update(RoutineReviewCommentDTO routineReviewCommentDTO) {
		sqlSession.update("routineReviewComment.update", routineReviewCommentDTO);
	}
}