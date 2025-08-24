package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminRoutineReviewDTO;
import com.sol.app.dto.AdminRoutineReviewListDTO;
import com.sol.config.MyBatisConfig;

public class AdminRoutineReviewDAO {
	public SqlSession sqlSession;

	public AdminRoutineReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 루틴모임 리뷰 목록
	public List<AdminRoutineReviewListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminRoutineReviewListDTO> list = sqlSession.selectList("adminRoutineReview.selectAll", pageMap);
		return list;
	}

	// 루틴모임 리뷰 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminRoutineReview.getTotal");
	}

	// 루틴모임 리뷰 상세
	public AdminRoutineReviewDTO select(int routineReviewNumber) {
		return sqlSession.selectOne("adminRoutineReview.select", routineReviewNumber);
	}
	//루틴모임 리뷰 삭제
	public void delete(int routineReviewNumber) {
		sqlSession.delete("adminRoutineReview.delete",routineReviewNumber);
	}
}
