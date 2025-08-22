package com.sol.app.course.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseReviewListDTO;
import com.sol.config.MyBatisConfig;

public class CourseReviewDAO {
	public SqlSession sqlSession;
	
	public CourseReviewDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<CourseReviewListDTO> selectAll(Map<String, Integer> pageMap){
		
		return null;
	}

}
