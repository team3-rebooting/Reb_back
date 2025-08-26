package com.sol.app.routine.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineMemberApplicantDTO;
import com.sol.config.MyBatisConfig;

public class RoutineMemberApplicantDAO {
	public SqlSession sqlSession;

	public RoutineMemberApplicantDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int getApplicantCount(int boardNumber) {
		return sqlSession.selectOne("routineMemberApplicant.getCount", boardNumber);
	}
	
	public boolean select(Map map) {
		return (Integer)sqlSession.selectOne("routineMemberApplicant.select", map) >= 1;
	}
	
	public void insert(RoutineMemberApplicantDTO routineMemberApplicantDTO) {
		System.out.println("inser : " + routineMemberApplicantDTO);
		sqlSession.insert("routineMemberApplicant.insert", routineMemberApplicantDTO);
	}
	
	public void delete(Map map) {
		sqlSession.delete("routineMemberApplicant.delete", map);
	}
}
