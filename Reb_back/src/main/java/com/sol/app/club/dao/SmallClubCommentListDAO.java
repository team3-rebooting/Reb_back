package com.sol.app.club.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.SmallClubCommentListDTO;
import com.sol.config.MyBatisConfig;

public class SmallClubCommentListDAO {
	public SqlSession sqlSession;

	public SmallClubCommentListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<SmallClubCommentListDTO> selectList(Map map) {
		return sqlSession.selectList("smallClubCommentList.selectList", map);
	}
	
	public int getTotal(int smallClubNumber) {
		return sqlSession.selectOne("smallClubCommentList.getTotal", smallClubNumber);
	}
}