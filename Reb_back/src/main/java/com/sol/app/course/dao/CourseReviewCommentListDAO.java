package com.sol.app.course.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseReviewCommentListDTO;
import com.sol.config.MyBatisConfig;

public class CourseReviewCommentListDAO {
	public SqlSession sqlSession;

	public CourseReviewCommentListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<CourseReviewCommentListDTO> selectList(Map map) {
		return sqlSession.selectList("courseReviewCommentList.selectList", map);
	}
	
	public int getTotal(int courseReviewNumber) {
		return sqlSession.selectOne("courseReviewCommentList.getTotal", courseReviewNumber);
	}
}
