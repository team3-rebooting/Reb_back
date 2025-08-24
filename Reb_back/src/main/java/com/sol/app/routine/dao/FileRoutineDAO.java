package com.sol.app.routine.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.FileRoutineDTO;
import com.sol.config.MyBatisConfig;

public class FileRoutineDAO {
	public SqlSession sqlSession;

	public FileRoutineDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<FileRoutineDTO> selectList(int routineNumber) {
		return sqlSession.selectList("fileRoutine.selectList", routineNumber);
	}

	public void insert(FileRoutineDTO fileRoutineDTO) {
		 sqlSession.insert("fileRoutine.insert", fileRoutineDTO);
	}
	
	public void delete(int routineNumber) {
		sqlSession.delete("fileRoutine.delete", routineNumber);
	}
}
