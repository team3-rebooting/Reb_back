package com.sol.app.course.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseDTO;
import com.sol.config.MyBatisConfig;

public class CourseDAO {

	public SqlSession sqlSession;

	public CourseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public int createRequest(CourseDTO courseDTO) {
		int insert = sqlSession.insert("courseRequest.create", courseDTO);
		sqlSession.insert("courseRequest.createRequest", insert);
		return insert;
	}
	
	
	
}
