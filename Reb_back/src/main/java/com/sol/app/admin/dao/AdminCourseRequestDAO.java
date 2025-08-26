package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminCourseRequestDTO;
import com.sol.app.dto.AdminCourseRequestListDTO;
import com.sol.config.MyBatisConfig;

public class AdminCourseRequestDAO {
	public SqlSession sqlSession;

	public AdminCourseRequestDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 수업 요청 목록
	public List<AdminCourseRequestListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminCourseRequestListDTO> list = sqlSession.selectList("adminCourseRequest.selectAll", pageMap);
		return list;
	}

	// 수업 요청 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminCourseRequest.getTotal");
	}
	// 수업 요청 상세
	public AdminCourseRequestDTO select(int courseNumber) {
		return sqlSession.selectOne("adminCourseRequest.select", courseNumber);
	}
	// 수업 신청/수정 요청 승인
	public void approve(int courseNumber) {
		sqlSession.update("adminCourseRequest.approve",courseNumber);
	}
	//수업 삭제 요청 승인
	public void deleteApprove(int courseNumber) {
		sqlSession.update("adminCourseRequest.deleteApprove",courseNumber);
	}
	//반려 처리
	public void rejection(AdminCourseRequestDTO adminCourseRequestDTO) {
		sqlSession.update("adminCourseRequest.rejection",adminCourseRequestDTO);
	}
	//이전 번호 가져오기
	public int selectPrev(int courseNumber) {
		return sqlSession.selectOne("adminCourseRequest.selectPrev", courseNumber);
	}
	
}
