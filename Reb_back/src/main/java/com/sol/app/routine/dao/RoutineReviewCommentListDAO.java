package com.sol.app.routine.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineReviewCommentListDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewCommentListDAO {
	public SqlSession sqlSession;

	public RoutineReviewCommentListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<RoutineReviewCommentListDTO> selectAll(int routineReviewNumber) {
		return sqlSession.selectList("routineReviewCommentList.selectList", routineReviewNumber);
	}
}
