package com.sol.app.club.dao;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseReviewDTO;
import com.sol.app.dto.SmallClubDTO;
import com.sol.config.MyBatisConfig;

public class SmallClubDAO {
	public SqlSession sqlSession;

	public SmallClubDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public SmallClubDTO select(int smallClubNumber) {
		System.out.println("소모임 : " + smallClubNumber);
		return sqlSession.selectOne("smallClub.select", smallClubNumber);
	}

	public int insertSmallClub(SmallClubDTO smallClubDTO) {
		int insert = sqlSession.insert("smallClub.insert", smallClubDTO);
		System.out.println(smallClubDTO + "출력");
		System.out.println("소모임 게시글 생성");
		System.out.println("insert 결과 : " + insert);
		System.out.println("생성된 소모임 게시글 번호 : " + smallClubDTO.getSmallClubNumber());

		return smallClubDTO.getSmallClubNumber();
	}

	// 소모임 게시글 삭제
	public void delete(int smallClubNumber) {
		System.out.println("소모임 게시글 삭제 : " + smallClubNumber);
		sqlSession.delete("smallClub.delete", smallClubNumber);
		System.out.println("소모임 게시글 삭제 완료");
	}
	
	// 소모임 게시글 수정
		public void update(SmallClubDTO smallClubDTO) {
			System.out.println("소모임 게시글 수정 : " + smallClubDTO.getSmallClubNumber());
			sqlSession.update("smallClub.update", smallClubDTO);
		}

}
