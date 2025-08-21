package com.sol.app.routine.dao;

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
	
	public boolean select(int boardNumber) {
		return (Integer)sqlSession.selectOne("routineMemberApplicant.select", boardNumber) >= 1;
	}
	
	public void insert(RoutineMemberApplicantDTO routineMemberApplicantDTO) {
		sqlSession.insert("routineMemberApplicant.insert", routineMemberApplicantDTO);
	}
	
	public void delete(int memberNumber) {
		sqlSession.delete("routineMemberApplicant.delete", memberNumber);
	}
}
