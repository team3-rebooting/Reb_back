package com.sol.app.myPage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileMemberProfileDTO;
import com.sol.config.MyBatisConfig;

public class MyProfileDAO {
	public SqlSession sqlSession;

	public MyProfileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insertProfile(FileMemberProfileDTO fileMemberProfileDTO) {
		sqlSession.insert("fileMemberProfile.insert", fileMemberProfileDTO);
	}
	
	public void deleteProfile(int memberNumber) {
		sqlSession.delete("fileMemberProfile.delete", memberNumber);
	}
	
	public List<FileMemberProfileDTO> selectProfileList(int memberNumber) {
		System.out.println("selectProfileList 진입");
		System.out.println(sqlSession.selectList("fileMemberProfile.selectList", memberNumber));
		
		return sqlSession.selectList("fileMemberProfile.selectList", memberNumber);
	}
}
