package com.sol.app.club.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.config.MyBatisConfig;

public class SmallClubListDAO {
	public SqlSession sqlSession;

	public SmallClubListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}
