package com.sol.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.ExpertDTO;
import com.sol.config.MyBatisConfig;

public class ExpertDAO {
	
	public SqlSession sqlSession;
	
	public ExpertDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public ExpertDTO select(int memberNumber) {
		return sqlSession.selectOne("expert.select", memberNumber);
	}
}
