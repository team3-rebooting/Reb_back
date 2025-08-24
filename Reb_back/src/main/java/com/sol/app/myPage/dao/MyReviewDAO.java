package com.sol.app.myPage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MyReviewDTO;
import com.sol.config.MyBatisConfig;

public class MyReviewDAO {
	public SqlSession sqlSession;

	public MyReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyReviewDTO> selectList(Map map){
		return sqlSession.selectList("myReview.selectList", map);
	}
	
	public int getTotal(int memberNumber) {
		return sqlSession.selectOne("myReview.getTotal", memberNumber);
	}
}
