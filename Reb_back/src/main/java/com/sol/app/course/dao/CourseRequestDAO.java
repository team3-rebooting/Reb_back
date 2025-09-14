package com.sol.app.course.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseRequestDTO;
import com.sol.config.MyBatisConfig;

public class CourseRequestDAO {
	public SqlSession sqlSession;

	public CourseRequestDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public CourseRequestDTO select(int courseNumber) {
		System.out.println("select courseNumber : " + courseNumber);
		
		return sqlSession.selectOne("courseRequest.select", courseNumber);
	}
	
	public void delete(int courseNumber) {
		sqlSession.delete("courseRequest.delete", courseNumber);
	}
	
	public void insert(CourseRequestDTO courseRequestDTO) {
		System.out.println("insert : " + courseRequestDTO);
		sqlSession.insert("courseRequest.insert", courseRequestDTO);
	}
}
