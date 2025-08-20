package com.sol.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MemberDTO;
import com.sol.app.dto.MyMemberDTO;
import com.sol.config.MyBatisConfig;

public class MyPageDAO {
	public SqlSession sqlSession;

	public MyPageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public MemberDTO login(MemberDTO memberDTO) {
		return sqlSession.selectOne("member.login", memberDTO);
	}
	
	public MyMemberDTO read(MyMemberDTO memberDTO) {
		return sqlSession.selectOne("myMember.read", memberDTO);
	}
}
