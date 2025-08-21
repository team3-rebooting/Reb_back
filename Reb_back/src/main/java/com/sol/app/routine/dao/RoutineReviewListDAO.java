package com.sol.app.routine.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineReviewListDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewListDAO {
	public SqlSession sqlSession;

	public RoutineReviewListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public RoutineReviewListDTO select(int memberNumber) {
		return sqlSession.selectOne("routineReviewList.select", memberNumber);
	}
	
	public List<RoutineReviewListDTO> selectAll() {
		return sqlSession.selectList("routineReviewList.selectAll");
	}
}
