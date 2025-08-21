package com.sol.app.myPage.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileExpertDTO;
import com.sol.config.MyBatisConfig;

public class FileExpertDAO {
	public SqlSession sqlSession;

	public FileExpertDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public FileExpertDTO selectFileExpert(int memberNumber) {
		return sqlSession.selectOne("fileExpert.select", memberNumber);
	}

	public void insertFileExpert(FileExpertDTO fileExpertDTO) {
		 sqlSession.insert("fileExpert.insert", fileExpertDTO);
	}
	
	public void deleteFileExpert(int memberNumber) {
		sqlSession.delete("fileExpert.delete", memberNumber);
	}
}
