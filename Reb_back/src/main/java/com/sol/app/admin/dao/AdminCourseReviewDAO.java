package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminCourseReviewDTO;
import com.sol.app.dto.AdminCourseReviewListDTO;
import com.sol.config.MyBatisConfig;

public class AdminCourseReviewDAO {
	public SqlSession sqlSession;

	public AdminCourseReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 수업 후기 목록
	public List<AdminCourseReviewListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminCourseReviewListDTO> list = sqlSession.selectList("adminCourseReview.selectAll", pageMap);
		return list;
	}

	// 수업 후기 총 개수
	public int getTotal() {
		return sqlSession.selectOne("adminCourseReview.getTotal");
	}

	// 수업 후기 상세
	public AdminCourseReviewDTO select(int courseReviewNumber) {
		return sqlSession.selectOne("adminCourseReview.select", courseReviewNumber);
	}

	// 수업 후기 삭제
	public void delete(int courseReviewNumber) {
		sqlSession.delete("adminCourseReview.delete", courseReviewNumber);
	}

}
