package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminExpertDTO;
import com.sol.app.dto.AdminExpertListDTO;
import com.sol.app.dto.ExpertApplicantDTO;
import com.sol.app.dto.ExpertDTO;
import com.sol.config.MyBatisConfig;

public class AdminExpertDAO {
	public SqlSession sqlSession;

	public AdminExpertDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 전문가 목록
	public List<AdminExpertListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminExpertListDTO> list = sqlSession.selectList("adminExpert.selectAll", pageMap);
		return list;
	}

	// 전문가 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminExpert.getTotal");
	}
	//전문가 상세
	public AdminExpertDTO select(int expertNumber) {
		return sqlSession.selectOne("adminExpert.select", expertNumber);
	}
	//전문가 신청 반려
	public void update(ExpertApplicantDTO expertApplicantDTO) {
		sqlSession.update("adminExpert.update",expertApplicantDTO);
	}
	//전문가 승인 반려
	public void updateExpertNo(ExpertApplicantDTO expertApplicantDTO) {
		sqlSession.update("AdminExpertApplicant.updateExpertNo",expertApplicantDTO);
	}
	
	//전문가 생성
	public void insert(ExpertDTO expertDTO) {
		sqlSession.insert("adminExpert.insert",expertDTO);
	}
	//전문가 생성 시 상태 변경
	public void updateExpert(int memberNumber) {
		sqlSession.update("adminExpert.updateExpert",memberNumber);
	}
	//전문가 삭제
	public void delete(int memberNumber) {
		sqlSession.delete("adminExpert.delete",memberNumber);
	}
	
}
