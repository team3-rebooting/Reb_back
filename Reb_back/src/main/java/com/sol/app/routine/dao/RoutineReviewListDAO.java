package com.sol.app.routine.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineReviewDTO;
import com.sol.app.dto.RoutineReviewListDTO;
import com.sol.config.MyBatisConfig;

public class RoutineReviewListDAO {
	public SqlSession sqlSession;

	public RoutineReviewListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public RoutineReviewListDTO select(int routineReviewNumber) {
		return sqlSession.selectOne("routineReviewList.select", routineReviewNumber);
	}
	
	public List<RoutineReviewListDTO> selectAll(Map map) {
		return sqlSession.selectList("routineReviewList.selectAll", map);
	}
	
	public int getTotal() {
		return sqlSession.selectOne("routineReviewList.getTotal");
	}
	
	public int insert(RoutineReviewDTO routineReviewListDTO) {
		sqlSession.insert("routineReview.insert", routineReviewListDTO);
		return routineReviewListDTO.getRoutineReviewNumber();
	}
	
	public void delete(int routineReviewNumber) {
		sqlSession.delete("routineReview.delete", routineReviewNumber);
	}
}
