package com.sol.app.routine.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineListDTO;
import com.sol.config.MyBatisConfig;

public class RoutineListDAO {
	public SqlSession sqlSession;

	public RoutineListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<RoutineListDTO> selectList(Map map){
		return sqlSession.selectList("routineList.selectList", map);
	}
	
	public List<RoutineListDTO> selectAll(){
		return sqlSession.selectList("routineList.selectAll");
	}
	
	public int getTotal() {
		return sqlSession.selectOne("routineList.getTotal");
	}
	
	public RoutineListDTO select(int boardNumber) {
		return sqlSession.selectOne("routineList.select", boardNumber);
	}
	
	public int getCount(int boardNumber) {
		return sqlSession.selectOne("routineMemberApplicant.getCount", boardNumber);
	}
	
	public void updateStatus(RoutineListDTO routineListDTO) {
		sqlSession.update("routineList.updateStatus", routineListDTO);
	}
}
