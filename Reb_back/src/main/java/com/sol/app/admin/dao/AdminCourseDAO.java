package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminCourseDTO;
import com.sol.app.dto.AdminCourseListDTO;
import com.sol.app.dto.CourseDTO;
import com.sol.config.MyBatisConfig;

public class AdminCourseDAO {
	public SqlSession sqlSession;

	public AdminCourseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 수업 목록
	public List<AdminCourseListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminCourseListDTO> list = sqlSession.selectList("adminCourse.selectAll", pageMap);
		return list;
	}

	// 수업 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminCourse.getTotal");
	}

	// 수업 상세
	public AdminCourseDTO select(int courseNumber) {
		return sqlSession.selectOne("adminCourse.select", courseNumber);
	}

	// 수업 강제 삭제
	public void delete(int courseNumber) {
		sqlSession.delete("adminCourse.delete", courseNumber);
	}
	// 수업 조회(courseDTO)
	public CourseDTO selectCourse(int courseNumber) {
		return sqlSession.selectOne("adminCourse.selectCourse",courseNumber);
	}
	// 수업 삭제(삭제됨)
	public void updateDelete(int courseNumber) {
		sqlSession.update("adminCourse.updateDelete",courseNumber);
	}
}
