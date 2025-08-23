package com.sol.app.myPage.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileMemberProfileDTO;
import com.sol.config.MyBatisConfig;

public class FileMemberProfileDAO  {
	public SqlSession sqlSession;

	public FileMemberProfileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public FileMemberProfileDTO select(int memberNumber) {
		return sqlSession.selectOne("fileMemberProfile.select", memberNumber);
	}

	public void insert(FileMemberProfileDTO fileMemberProfile) {
		 sqlSession.insert("fileMemberProfile.insert", fileMemberProfile);
	}
	
	public void delete(int memberNumber) {
		sqlSession.delete("fileMemberProfile.delete", memberNumber);
	}
}