package com.sol.app.course.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseMemberApplicantDTO;
import com.sol.config.MyBatisConfig;

public class CourseMemberApplicantDAO {

	public SqlSession sqlSession;
	
	public CourseMemberApplicantDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public List<CourseMemberApplicantDTO> selectAll(int memberNumber) {
		List<CourseMemberApplicantDTO> list = sqlSession.selectList("courseMemberApplicant.selectAll", memberNumber);
		return list;
	}
}
