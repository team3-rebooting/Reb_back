package com.sol.app.routine.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineReviewCommentListDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewCommentListDAO {
	public SqlSession sqlSession;

	public RoutineReviewCommentListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public List<RoutineReviewCommentListDTO> selectList(Map map) {
		return sqlSession.selectList("routineReviewCommentList.selectList", map);
	}

	public int getTotal(int routineReviewNumber) {
		Integer total = (Integer) sqlSession.selectOne("routineReviewCommentList.getTotal", routineReviewNumber);
		return total == null ? 0 : total;
	}
}
