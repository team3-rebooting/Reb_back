package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminMemberListDTO;
import com.sol.config.MyBatisConfig;

public class AdminMemberDAO {
	public SqlSession sqlSession;

	public AdminMemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	// 모든 회원 목록 가져오기
		public List<AdminMemberListDTO> selectAll(Map<String, Integer> pageMap) {
			List<AdminMemberListDTO> list = sqlSession.selectList("adminMember.selectAll", pageMap);
			return list;
		}

		// 회원 총 개수 가져오기
		public int getTotal() {
			return sqlSession.selectOne("adminMember.getTotal");
		}
}
