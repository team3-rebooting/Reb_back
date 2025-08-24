package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminExpertApplicantDTO;
import com.sol.app.dto.AdminExpertApplicantListDTO;
import com.sol.app.dto.ExpertApplicantDTO;
import com.sol.config.MyBatisConfig;

public class AdminExpertApplicantDAO {
	public SqlSession sqlSession;

	public AdminExpertApplicantDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 전문가 인증 신청 목록
	public List<AdminExpertApplicantListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminExpertApplicantListDTO> list = sqlSession.selectList("AdminExpertApplicant.selectAll", pageMap);
		return list;
	}
	// 공지사항 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("AdminExpertApplicant.getTotal");
	}
	//전문가 승인
	//이거 페이징 다시한번확인 
	public void insert(AdminExpertApplicantDTO adminExpertApplicantDTO) {
		sqlSession.insert("AdminExpertApplicant.insert",adminExpertApplicantDTO);
	}
	//전문가 반려
	//이거 페이징 다시한번확인
	public void update(ExpertApplicantDTO expertApplicantDTO) {
		sqlSession.update("AdminExpertApplicant.update",expertApplicantDTO);
	}
	
}
