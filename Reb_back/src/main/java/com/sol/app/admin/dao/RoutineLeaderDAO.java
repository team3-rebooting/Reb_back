package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.RoutineLeaderDTO;
import com.sol.config.MyBatisConfig;

public class RoutineLeaderDAO {
	public SqlSession sqlSession;

	public RoutineLeaderDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 모든 모임장 목록 가져오기
	public List<RoutineLeaderDTO> selectAll(Map<String, Integer> pageMap) {
		List<RoutineLeaderDTO> list = sqlSession.selectList("routineLeader.selectAll", pageMap);
		return list;
	}

	// 모임장 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("routineLeader.getTotal");
	}
	
	//모임장 등록
	public void insert(RoutineLeaderDTO leaderDTO) {
		sqlSession.insert("routineLeader.insert",leaderDTO);
	}
	
	//모임장 삭제
	public void delete(int leaderNumber) {
		sqlSession.delete("routineLeader.delete",leaderNumber);
	}
	public List<RoutineLeaderDTO> selectForRoutine(){
		List<RoutineLeaderDTO> list = sqlSession.selectList("routineLeader.selectForRoutine");
		return list;
	}
}
