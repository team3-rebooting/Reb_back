package com.sol.app.myPage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MyCourseRequestDTO;
import com.sol.config.MyBatisConfig;

public class MyCourseRequestDAO {
	public SqlSession sqlSession;

	public MyCourseRequestDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyCourseRequestDTO> selectList(int memberNumber){
		return sqlSession.selectList("myCourseRequest.selectList", memberNumber);
	}
}