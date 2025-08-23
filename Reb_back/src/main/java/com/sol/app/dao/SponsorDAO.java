package com.sol.app.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminSponsorListDTO;
import com.sol.config.MyBatisConfig;

public class SponsorDAO {
	public SqlSession sqlSession;

    public SponsorDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// [관리자]후원 목록
	public List<AdminSponsorListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminSponsorListDTO> list = sqlSession.selectList("sponsor.selectAll", pageMap);
		return list;
	}
	// 후원 총 개수 가져오기
		public int getTotal() {
			return sqlSession.selectOne("getTotal.getTotal");
		}

}
