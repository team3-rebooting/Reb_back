package com.sol.app.club.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.SmallClubListDTO;
import com.sol.config.MyBatisConfig;

public class SmallClubListDAO {
	public SqlSession sqlSession;

	public SmallClubListDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<SmallClubListDTO> selectAll(Map<String, Integer> pageMap){
		System.out.println("모든 게시글 조회하기" + pageMap);
		List<SmallClubListDTO> list = sqlSession.selectList("smallClubList.selectAll", pageMap);
		System.out.println("조회 결과 : " + list);
		return list;
	}
	
	public int getTotal() {
		System.out.println("게시글 총 개수 조회");
		return sqlSession.selectOne("smallClubList.getTotal");
	}

}
