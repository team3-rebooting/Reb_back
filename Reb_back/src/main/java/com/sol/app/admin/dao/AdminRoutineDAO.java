package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminRoutineListDTO;
import com.sol.config.MyBatisConfig;

public class AdminRoutineDAO {
	public SqlSession sqlSession;

	public AdminRoutineDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 모든 루틴모임 가져오기
	public List<AdminRoutineListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminRoutineListDTO> list = sqlSession.selectList("adminRoutine.selectAll", pageMap);
		return list;
	}

	// 루틴모임 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminRoutine.getTotal");
	}

}
