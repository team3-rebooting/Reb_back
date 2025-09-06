package com.sol.app.myPage.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.ExpertDTO;
import com.sol.app.dto.MyExpertDTO;
import com.sol.config.MyBatisConfig;

public class MyExpertDAO {
	public SqlSession sqlSession;

	public MyExpertDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public MyExpertDTO select(int memberNumber) {
		return sqlSession.selectOne("myExpert.select", memberNumber);
	}
	
	public String getReason(int memberNumber) {
		return sqlSession.selectOne("expertApplicant.getReason", memberNumber);
	}
	
	public void insert(int memberNumber) {
		sqlSession.insert("expertApplicant.insert", memberNumber);
	}
	
	public void delete(int memberNumber) {
		sqlSession.delete("expertApplicant.delete", memberNumber);
	}
	
	public void update(ExpertDTO expert) {
		//sqlSession.update("expert.update", expert);
	}
	
	public boolean exist(int memberNumber) {
		return (Integer)sqlSession.selectOne("expertApplicant.exist", memberNumber) >= 1;
	}
}
