package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminNoticeDTO;
import com.sol.app.dto.AdminNoticeListDTO;
import com.sol.app.dto.NoticeDTO;
import com.sol.config.MyBatisConfig;

public class AdminNoticeDAO {
	public SqlSession sqlSession;

	public AdminNoticeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 공지사항 목록
	public List<AdminNoticeListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminNoticeListDTO> list = sqlSession.selectList("adminNotice.selectAll", pageMap);
		return list;
	}

	// 공지사항 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminNotice.getTotal");
	}

	// 공지사항 상세
	public AdminNoticeDTO select(int noticeNumber) {
		return sqlSession.selectOne("adminNotice.select", noticeNumber);
	}

	// 공지사항 추가 후 자동으로 생성된 noticeNumber 반환 -> notice 파일 테이블에서도 써야됨
	public int insert(NoticeDTO noticeDTO) {
		int tf = sqlSession.insert("adminNotice.insert", noticeDTO);
		System.out.println(tf);
		return noticeDTO.getNoticeNumber(); 
	}

	// 공지사항 삭제
	public void delete(int noticeNumber) {
		sqlSession.delete("adminNotice.delete", noticeNumber);
	}
}
