package com.sol.app.myPage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.SmallClubListDTO;
import com.sol.config.MyBatisConfig;

public class MySmallClubApplyDAO{
	public SqlSession sqlSession;

	public MySmallClubApplyDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<SmallClubListDTO> selectList(Map<String, Integer> pageMap){
		List<SmallClubListDTO> list = sqlSession.selectList("mySmallClubApplyList.selectList", pageMap);
		return list;
	}
	
	public int getTotal(int memberNumber) {
		System.out.println("게시글 총 개수 조회");
		return sqlSession.selectOne("mySmallClubApplyList.getTotal");
	}
}