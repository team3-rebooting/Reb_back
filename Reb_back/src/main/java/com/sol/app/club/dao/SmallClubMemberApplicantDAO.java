package com.sol.app.club.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.SmallClubMemberApplicantDTO;
import com.sol.config.MyBatisConfig;

public class SmallClubMemberApplicantDAO {
	public SqlSession sqlSession;
	
	public SmallClubMemberApplicantDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public boolean select(Map map) {
		return (Integer) sqlSession.selectOne("smallClubMemberApplicant.select", map) >= 1;
	}
	
	public void insert(SmallClubMemberApplicantDTO smallClubMemberApplicantDTO) {
		System.out.println("insert : " + smallClubMemberApplicantDTO);
		sqlSession.insert("smallClubMemberApplicant.insert", smallClubMemberApplicantDTO);
	}

	public void delete(Map map) {
		sqlSession.delete("smallClubMemberApplicant.delete", map);
	}
	
	public int getCount(int smallClubNumber) {
		return sqlSession.selectOne("smallClubMemberApplicant.getCount", smallClubNumber);
	}
}
