package com.sol.app.myPage.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AddressDTO;
import com.sol.config.MyBatisConfig;

public class MyAddressDAO {
	public SqlSession sqlSession;

	public MyAddressDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int insert(AddressDTO addressDTO) {
		sqlSession.insert("address.insert", addressDTO);
		
		return addressDTO.getAddressNumber();
	}
}
