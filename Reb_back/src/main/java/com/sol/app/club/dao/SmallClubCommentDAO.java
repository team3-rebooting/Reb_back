package com.sol.app.club.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.SmallClubCommentDTO;
import com.sol.config.MyBatisConfig;

public class SmallClubCommentDAO {
	public SqlSession sqlSession;

	public SmallClubCommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(SmallClubCommentDTO smallClubCommentDTO) {
		sqlSession.insert("smallClubComment.insert", smallClubCommentDTO);
	}
	
	public void delete(int smallClubCommentNumber) {
		sqlSession.delete("smallClubComment.delete", smallClubCommentNumber);
	}
	
	public void update(SmallClubCommentDTO smallClubCommentDTO) {
		sqlSession.update("smallClubComment.update", smallClubCommentDTO);
	}
}
