package com.sol.app.course.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseMemberApplicantDTO;
import com.sol.app.dto.RoutineDTO;
import com.sol.app.dto.RoutineMemberApplicantDTO;
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

	public int getApplicantCount(int boardNumber) {
		return sqlSession.selectOne("courseMemberApplicant.getCount", boardNumber);
	}

	public boolean select(Map map) {
		return (Integer) sqlSession.selectOne("courseMemberApplicant.select", map) >= 1;
	}

	public void insert(RoutineMemberApplicantDTO routineMemberApplicantDTO) {
		System.out.println("inser : " + routineMemberApplicantDTO);
		sqlSession.insert("routineMemberApplicant.insert", routineMemberApplicantDTO);
	}

	public void delete(Map map) {
		sqlSession.delete("routineMemberApplicant.delete", map);
	}

	public List<RoutineDTO> getRoutineList(int memberNumber) {
		return sqlSession.selectList("routineMemberApplicant.getRoutineList", memberNumber);
	}

}
