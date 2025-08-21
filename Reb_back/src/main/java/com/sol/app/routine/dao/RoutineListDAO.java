package com.sol.app.routine.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineListDTO;
import com.sol.config.MyBatisConfig;

public class RoutineListDAO {
	public SqlSession sqlSession;

	public RoutineListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<RoutineListDTO> selectList(){
		return sqlSession.selectList("routineList.selectAll");
	}
	
	public RoutineListDTO select(int boardNumber) {
		return sqlSession.selectOne("routineList.select", boardNumber);
	}
	
	public int getApplicantCount(int boardNumber) {
		return sqlSession.selectOne("routineMemberApplicant.getCount", boardNumber);
	}
}
