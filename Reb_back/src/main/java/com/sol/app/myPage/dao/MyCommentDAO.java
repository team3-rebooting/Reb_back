package com.sol.app.myPage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MyCommentDTO;
import com.sol.config.MyBatisConfig;

public class MyCommentDAO {
	public SqlSession sqlSession;

	public MyCommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyCommentDTO> selectList(int memberNumber){
		return sqlSession.selectList("myComment.selectList", memberNumber);
	}
}
