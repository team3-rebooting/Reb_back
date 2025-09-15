package com.sol.app.routine.dao;

import java.util.List;

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
	
	public void delete(RoutineReviewLikeDTO routineReviewLikeDTO) {
		sqlSession.delete("routineReviewLike.delete", routineReviewLikeDTO);
	}
	
	public List<RoutineReviewLikeDTO> select(int memberNumber) {
		return sqlSession.selectList("routineReviewLike.select", memberNumber);
	}
	
	public int getCount(int routineReviewNumber) {
		return sqlSession.selectOne("routineReviewLike.getCount", routineReviewNumber);
	}
	
	public boolean isLike(RoutineReviewLikeDTO routineReviewLikeDTO) {
		return (Integer)sqlSession.selectOne("routineReviewLike.isLike", routineReviewLikeDTO) >= 1;
	}
}