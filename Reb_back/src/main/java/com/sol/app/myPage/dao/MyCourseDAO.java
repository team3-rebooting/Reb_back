package com.sol.app.myPage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MyCourseDTO;
import com.sol.config.MyBatisConfig;

public class MyCourseDAO {
	public SqlSession sqlSession;

	public MyCourseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<MyCourseDTO> selectList(Map<String, Integer> pageMap){
		return sqlSession.selectList("myCourse.selectList", pageMap);
	}
	
	public int getTotal(int memberNumber) {
		return sqlSession.selectOne("myCourse.getTotal", memberNumber);
	}
}