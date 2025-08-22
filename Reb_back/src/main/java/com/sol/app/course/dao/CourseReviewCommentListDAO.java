package com.sol.app.course.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseReviewCommentListDTO;
import com.sol.config.MyBatisConfig;

public class CourseReviewCommentListDAO {
	public SqlSession sqlSession;

	public CourseReviewCommentListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<CourseReviewCommentListDTO> selectAll(int courseReviewNumber) {
		return sqlSession.selectList("courseReviewCommentList.selectList", courseReviewNumber);
	}
}
