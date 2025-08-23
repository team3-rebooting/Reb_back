package com.sol.app.course.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.config.MyBatisConfig;

public class FileCourseReviewDAO {
	public SqlSession sqlSession;

	public FileCourseReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	
}
