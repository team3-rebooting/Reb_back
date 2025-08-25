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
		//select key 배우면 반환해서 사용자 수정에 추가하기
		sqlSession.insert("address.insert", addressDTO);
		
		return addressDTO.getAddressNumber();
	}
}
