package com.sol.app.myPage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MyRoutineDTO;
import com.sol.config.MyBatisConfig;

public class MyRoutineDAO {
	public SqlSession sqlSession;

	public MyRoutineDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyRoutineDTO> selectList(Map<String, Integer> map){
		return sqlSession.selectList("myRoutine.selectList", map);
	}
	
	public int getTotal(int memberNumber) {
		return sqlSession.selectOne("myRoutine.getTotal", memberNumber);
	}
}
