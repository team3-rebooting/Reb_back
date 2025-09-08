package com.sol.app.myPage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MemberDTO;
import com.sol.config.MyBatisConfig;

public class MyCourseApplicantDAO {
	public SqlSession sqlSession;

	public MyCourseApplicantDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MemberDTO> selectCourseApplicant(Map<String, Integer> map){
		return sqlSession.selectList("courseMemberApplicant.selectCourseApplicant", map);
	}
	
	public int getCourseApplicantCount(int courseNumber) {
		return sqlSession.selectOne("courseMemberApplicant.getCourseApplicantCount", courseNumber);
	}
}
