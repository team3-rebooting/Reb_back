package com.sol.app.club.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.SmallClubDTO;
import com.sol.config.MyBatisConfig;

public class SmallClubDAO {
	public SqlSession sqlSession;
	
	public SmallClubDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public SmallClubDTO select(int smallClubNumber) {
		System.out.println("소모임 : " + smallClubNumber);
		return sqlSession.selectOne("smallClub.select", smallClubNumber);
	}

}
