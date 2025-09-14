package com.sol.app.course.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseDTO;
import com.sol.app.dto.CourseListDTO;
import com.sol.config.MyBatisConfig;

public class CourseDAO {

	public SqlSession sqlSession;

	public CourseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public int createRequest(CourseDTO courseDTO, boolean createRequset) {
		sqlSession.insert("expertCourseRequest.create", courseDTO);

		int courseNumber = courseDTO.getCourseNumber();

		if (createRequset) {
			System.out.println("courseNumber=================" + courseNumber);

			sqlSession.insert("expertCourseRequest.createRequest", courseNumber);
		}
		
		return courseNumber;
	}
}
