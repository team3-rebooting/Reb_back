package com.sol.app.course.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseDTO;
import com.sol.app.dto.CourseMemberApplicantDTO;
import com.sol.config.MyBatisConfig;

public class CourseMemberApplicantDAO {

	public SqlSession sqlSession;

	public CourseMemberApplicantDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public List<CourseMemberApplicantDTO> selectAll(int memberNumber) {
		List<CourseMemberApplicantDTO> list = sqlSession.selectList("courseMemberApplicant.selectAll", memberNumber);
		return list;
	}

	public int getCount(int courseNumber) {
		return sqlSession.selectOne("courseMemberApplicant.getCount", courseNumber);
	}

	public boolean select(Map map) {
		return (Integer) sqlSession.selectOne("courseMemberApplicant.select", map) >= 1;
	}

	public void insert(CourseMemberApplicantDTO courseMemberApplicantDTO) {
		System.out.println("insert : " + courseMemberApplicantDTO);
		sqlSession.insert("courseMemberApplicant.insert", courseMemberApplicantDTO);
	}

	public void delete(Map map) {
		sqlSession.delete("courseMemberApplicant.delete", map);
	}

	public List<CourseDTO> getCourseList(int memberNumber) {
		return sqlSession.selectList("courseMemberApplicant.getCourseList", memberNumber);
	}

}
