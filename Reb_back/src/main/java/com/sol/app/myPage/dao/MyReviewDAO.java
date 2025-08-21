package com.sol.app.myPage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.config.MyBatisConfig;

public class MyReviewDAO {
	public SqlSession sqlSession;

	public MyReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyReviewDAO> selectList(int memberNumber){
		return sqlSession.selectList("myReview.selectList", memberNumber);
	}
}
