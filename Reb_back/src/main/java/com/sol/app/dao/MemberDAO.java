package com.sol.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MemberDTO;
import com.sol.config.MyBatisConfig;

public class MemberDAO {
	
	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public MemberDTO login(String memberId, String memberPw) {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setMemberId(memberId);
		memberDTO.setMemberPassword(memberPw);
		return sqlSession.selectOne("member.login", memberDTO);
	}

}
