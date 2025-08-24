package com.sol.app.course.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileCourseDTO;
import com.sol.config.MyBatisConfig;

public class FileCourseDAO {
	public SqlSession sqlSession;

	public FileCourseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<FileCourseDTO> selectList(int courseNumber) {
		return sqlSession.selectList("fileCourse.selectList", courseNumber);
	}

	public void insert(FileCourseDTO fileCourseDTO) {
		 sqlSession.insert("fileCourse.insert", fileCourseDTO);
	}
	
	public void delete(int routineNumber) {
		sqlSession.delete("fileCourse.delete", routineNumber);
	}
}