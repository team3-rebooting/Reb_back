package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminNoticeListDTO;
import com.sol.config.MyBatisConfig;

public class AdminNoticeDAO {
	public SqlSession sqlSession;

	public AdminNoticeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 모든 공지사항 가져오기
	public List<AdminNoticeListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminNoticeListDTO> list = sqlSession.selectList("adminNotice.selectAll", pageMap);
		return list;
	}

	// 공지사항 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminNotice.getTotal");
	}

}
