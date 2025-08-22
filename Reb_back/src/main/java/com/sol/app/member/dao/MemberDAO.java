package com.sol.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MemberDTO;
import com.sol.app.dto.MemberSignupDTO;
import com.sol.config.MyBatisConfig;

public class MemberDAO {
	
	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int login(MemberDTO memberDTO) {
		Integer memberNumber = sqlSession.selectOne("member.login", memberDTO);
		// NullPointerException 방지
		return memberNumber == null ? -1 : memberNumber;
	}
	
	public void signup(MemberSignupDTO memberSignupDTO) {
		sqlSession.insert("member.signup", memberSignupDTO);
	}
	
	public 

}
