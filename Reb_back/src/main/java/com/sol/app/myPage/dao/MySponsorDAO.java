package com.sol.app.myPage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.SponsorDTO;
import com.sol.config.MyBatisConfig;

public class MySponsorDAO {
	public SqlSession sqlSession;

	public MySponsorDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int getSponsorTotalAmount(int memberNumber) {
		return sqlSession.selectOne("sponsor.getTotalAmount", memberNumber);
	}
	
	public int getSponsorTotalCount(int memberNumber) {
		return sqlSession.selectOne("sponsor.getTotalCount", memberNumber);
	}
	
	public List<SponsorDTO> selectSponsorList(int memberNumber) {
		return sqlSession.selectList("sponsor.selectList", memberNumber);
	}
}
