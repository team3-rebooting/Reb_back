package com.sol.app.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminDTO;
import com.sol.config.MyBatisConfig;

public class AdminDAO {
	public SqlSession sqlSession;

	public AdminDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public AdminDTO login(String adminId, String adminPassword) {
		AdminDTO adminDTO = new AdminDTO();
		adminDTO.setAdminId(adminId);
		adminDTO.setAdminPassword(adminPassword);
		return sqlSession.selectOne("admin.login",adminDTO);
	}
	
	public String getAdminId(int adminNumber) {
		return sqlSession.selectOne("admin.getAdminId",adminNumber);
	}
	
	
}
