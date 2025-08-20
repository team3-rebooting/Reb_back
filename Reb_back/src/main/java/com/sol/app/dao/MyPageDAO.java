package com.sol.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileMemberProfileDTO;
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
	
	public List<FileMemberProfileDTO> selectProfileList(int memberNumber) {
		System.out.println("selectProfileList 진입");
		System.out.println(sqlSession.selectList("fileMemberProfile.selectProfileList", memberNumber));
		
		return sqlSession.selectList("fileMemberProfile.selectProfileList", memberNumber);
	}
}
