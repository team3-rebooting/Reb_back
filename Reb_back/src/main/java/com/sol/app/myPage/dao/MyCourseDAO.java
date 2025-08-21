package com.sol.app.myPage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MyCourseDTO;
import com.sol.config.MyBatisConfig;

public class MyCourseDAO {
	public SqlSession sqlSession;

	public MyCourseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyCourseDTO> selectList(int memberNumber){
		return sqlSession.selectList("myCourse.selectList", memberNumber);
	}
}