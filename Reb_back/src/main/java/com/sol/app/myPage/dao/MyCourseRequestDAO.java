package com.sol.app.myPage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MyCourseRequestDTO;
import com.sol.config.MyBatisConfig;

public class MyCourseRequestDAO {
	public SqlSession sqlSession;

	public MyCourseRequestDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyCourseRequestDTO> selectList(Map map){
		return sqlSession.selectList("myCourseRequest.selectList", map);
	}
	
	public int getTotal(int memberNumber){
		System.out.println("MyCourseRequestDAO getTotal 진입");
		return sqlSession.selectOne("myCourseRequest.getTotal", memberNumber);
	}
}