package com.sol.app.course.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseReviewLikeDTO;
import com.sol.config.MyBatisConfig;

public class CourseReviewLikeDAO {
	public SqlSession sqlSession;

	public CourseReviewLikeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public void insert(CourseReviewLikeDTO courseReviewLikeDTO) {
		sqlSession.insert("courseReviewLike.insert", courseReviewLikeDTO);
	}

	public void delete(CourseReviewLikeDTO courseReviewLikeDTO) {
		sqlSession.delete("courseReviewLike.delete", courseReviewLikeDTO);
	}

	public List<CourseReviewLikeDTO> select(int memberNumber) {
		return sqlSession.selectList("courseReviewLike.select", memberNumber);
	}

	public int getCount(int courseReviewNumber) {
		return sqlSession.selectOne("courseReviewLike.getCount", courseReviewNumber);
	}

	public boolean isLike(CourseReviewLikeDTO courseReviewLikeDTO) {
		return (Integer) sqlSession.selectOne("courseReviewLike.isLike", courseReviewLikeDTO) >= 1;
	}
}