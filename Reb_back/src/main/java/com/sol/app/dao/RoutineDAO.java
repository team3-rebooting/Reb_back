package com.sol.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.config.MyBatisConfig;

public class RoutineDAO {
	public SqlSession sqlSession;

	public RoutineDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
