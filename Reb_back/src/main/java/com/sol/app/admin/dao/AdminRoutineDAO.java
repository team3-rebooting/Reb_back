package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminRoutineDTO;
import com.sol.app.dto.AdminRoutineListDTO;
import com.sol.app.dto.RoutineDTO;
import com.sol.config.MyBatisConfig;

public class AdminRoutineDAO {
	public SqlSession sqlSession;

	public AdminRoutineDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 루틴모임 목록
	public List<AdminRoutineListDTO> selectAll(Map<String, Integer> pageMap) {
		List<AdminRoutineListDTO> list = sqlSession.selectList("adminRoutine.selectAll", pageMap);
		return list;
	}

	// 루틴모임 상세
	public AdminRoutineDTO select(int routineNumber) {
		return sqlSession.selectOne("adminRoutine.select", routineNumber);
	}
	
	// 루틴모임 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminRoutine.getTotal");
	}

	// 루틴모임 추가 후 자동으로 생성된 routineNumber 반환 -> routine 파일 테이블에서도 써야됨
	public int insert(RoutineDTO routineDTO) {
		sqlSession.insert("adminRoutine.insert", routineDTO);
		return routineDTO.getRoutineNumber();
	}

	// 루틴모임 삭제
	public void delete(int routineNumber) {
		sqlSession.delete("adminRoutine.delete", routineNumber);
	}
}
