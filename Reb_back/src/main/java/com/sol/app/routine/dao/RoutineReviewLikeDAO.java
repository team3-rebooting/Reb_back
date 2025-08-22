package com.sol.app.routine.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineReviewLikeDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewLikeDAO {
	public SqlSession sqlSession;

	public RoutineReviewLikeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(RoutineReviewLikeDTO routineReviewLikeDTO) {
		sqlSession.insert("routineReviewLike.insert", routineReviewLikeDTO);
	}
	
	public void delete(int memberNumber) {
		sqlSession.delete("routineReviewLike.delete", memberNumber);
	}
	
	public boolean select(int memberNumber) {
		return (Integer)sqlSession.selectOne("routineReviewLike.select", memberNumber) >= 1;
	}
	
	public int getCount(int routineReviewNumber) {
		return sqlSession.selectOne("routineReviewLike.getCount", routineReviewNumber);
	}
}