package com.sol.app.course.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseListDTO;
import com.sol.config.MyBatisConfig;

public class CourseListDAO {
	public SqlSession sqlSession;

	public CourseListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<CourseListDTO> selectList(Map map){
		return sqlSession.selectList("courseList.selectList", map);
	}
	
	public int getTotal() {
		return sqlSession.selectOne("courseList.getTotal");
	}
	
	public CourseListDTO select(int courseNumber) {
		return sqlSession.selectOne("courseList.select", courseNumber);
	}
	
	public int getCount(int boardNumber) {
		//return sqlSession.selectOne("courseMemberApplicant.getCount", boardNumber);
		return 0;
	}
}