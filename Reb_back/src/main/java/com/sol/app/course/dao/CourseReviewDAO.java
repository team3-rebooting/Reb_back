package com.sol.app.course.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.CourseReviewDTO;
import com.sol.app.dto.CourseReviewListDTO;
import com.sol.config.MyBatisConfig;

public class CourseReviewDAO {
	public SqlSession sqlSession;
	
	public CourseReviewDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<CourseReviewListDTO> selectAll(Map<String, Integer> pageMap){
		System.out.println("모든 게시글 조회하기" + pageMap);
		List<CourseReviewListDTO> list = sqlSession.selectList("courseReview.selectAll", pageMap);
		System.out.println("조회 결과 : " + list);
		return list;
	}
	
	public List<CourseReviewListDTO> selectMain(Map<String, Integer> pageMap){
		List<CourseReviewListDTO> list = sqlSession.selectList("courseReview.selectMain", pageMap);
		return list;
	}
	
	public int getTotal() {
		System.out.println("게시글 총 개수 조회");
		
		return sqlSession.selectOne("courseReview.getTotal");
	}
	
	// 수업 후기 생성 후 파일 테이블에서 사용하기 위한 수업 후기 번호 반환
	public int insertCourseReview(CourseReviewDTO courseReviewDTO) {
		int insert = sqlSession.insert("courseReview.insert", courseReviewDTO);
		System.out.println(courseReviewDTO + "출력");
		System.out.println("수업 후기 생성");
		System.out.println("insert 결과 : " + insert);
		System.out.println("생성된 수업 후기 번호 : " + courseReviewDTO.getCourseReviewNumber());
		
		return courseReviewDTO.getCourseReviewNumber();
	}

	// 수업 후기 삭제
	public void delete(int courseReviewNumber) {
		System.out.println("수업 후기 삭제 : " + courseReviewNumber);
		sqlSession.delete("courseReview.delete", courseReviewNumber);
		System.out.println("수업 후기 삭제 완료");
	}
	
	// 수업 후기 수정
	public void update(CourseReviewDTO courseReviewDTO) {
		System.out.println("수업 후기 수정 : " + courseReviewDTO.getCourseReviewNumber());
		sqlSession.update("courseReview.update", courseReviewDTO);
	}
	
	// 수업 후기 상세 페이지 조회
	public CourseReviewListDTO select(int courseReviewNumber) {
		System.out.println("수업 후기 상세 페이지 조회(단건 조회)");
		return sqlSession.selectOne("courseReview.select", courseReviewNumber);
	}
}
