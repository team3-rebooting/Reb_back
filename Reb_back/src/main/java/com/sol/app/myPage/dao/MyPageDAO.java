package com.sol.app.myPage.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.MemberDTO;
import com.sol.app.dto.MyMemberDTO;
import com.sol.config.MyBatisConfig;

public class MyPageDAO {
	public SqlSession sqlSession;

	public MyPageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public String getId(int memberNumber) {
		return sqlSession.selectOne("member.getId", memberNumber);
	}
	
	public MemberDTO checkPassword(MemberDTO memberDTO) {
		return sqlSession.selectOne("member.login", memberDTO);
	}
	
	public boolean login(MemberDTO memberDTO) {
		return sqlSession.selectOne("member.login", memberDTO) != null;
	}
	
	public MyMemberDTO read(int memberNumber) {
		return sqlSession.selectOne("myMember.read", memberNumber);
	}
	
	public void update(MemberDTO memberDTO) {
		sqlSession.update("member.update", memberDTO);
	}
	
	public void delete(int memberNumber) {
		sqlSession.delete("member.delete", memberNumber);
	}
	
	public String getCourseRejectReason(int memberNumber) {
		return sqlSession.selectOne("courseRequest.getReason", memberNumber);
	}
}
