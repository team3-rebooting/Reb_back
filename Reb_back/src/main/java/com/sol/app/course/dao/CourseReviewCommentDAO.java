package com.sol.app.course.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseReviewCommentDTO;
import com.sol.config.MyBatisConfig;

public class CourseReviewCommentDAO {
	public SqlSession sqlSession;

	public CourseReviewCommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(CourseReviewCommentDTO courseReviewCommentDTO) {
		sqlSession.insert("courseReviewComment.insert", courseReviewCommentDTO);
	}
	
	public void delete(int courseReviewCommentNumber) {
		sqlSession.delete("courseReviewComment.delete", courseReviewCommentNumber);
	}
	
	public void update(CourseReviewCommentDTO courseReviewCommentDTO) {
		sqlSession.update("courseReviewComment.update", courseReviewCommentDTO);
	}
}