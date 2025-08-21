package com.sol.app.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import com.sol.app.dto.NoticeListDTO;
import com.sol.config.MyBatisConfig;


public class NoticeListDAO {
    public SqlSession sqlSession;

    public NoticeListDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

    // 모든 공지 가져오기 (ROWNUM 페이징: startRow, endRow 필요)
	public List<NoticeListDTO> selectAll(Map<String, Integer> pageMap) {
		System.out.println("모든 공지 조회 - selectAll 메소드 실행 : " + pageMap);
		List<NoticeListDTO> list = sqlSession.selectList("noticeList.selectAll", pageMap);
		System.out.println("조회 결과 : " + list);
		return list;
	}

    // 공지 총 개수
	public int getTotal() {
		System.out.println("공지 총 개수 조회 - getTotal 실행");
		return sqlSession.selectOne("noticeList.getTotal");
	}
}