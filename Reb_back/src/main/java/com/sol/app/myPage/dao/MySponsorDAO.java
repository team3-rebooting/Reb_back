package com.sol.app.myPage.dao;

import java.util.List;
import java.util.Map;

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
	
	public List<SponsorDTO> selectList(Map map) {
		return sqlSession.selectList("sponsor.selectList", map);
	}
	
	public int getTotal(int memberNumber) {
		return sqlSession.selectOne("sponsor.getTotalCount", memberNumber);
	}
}
