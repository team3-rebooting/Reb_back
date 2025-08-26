package com.sol.app.course.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseListDTO;
import com.sol.config.MyBatisConfig;

public class CourseDAO {

	public SqlSession sqlSession;

	public CourseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	
	
	
}
