package com.sol.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.config.MyBatisConfig;

public class CommentDAO {
	public SqlSession sqlSession;

	public CommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
