package com.sol.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AdminBannerDTO;
import com.sol.config.MyBatisConfig;

public class AdminBannerDAO {
	public SqlSession sqlSession;

	public AdminBannerDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	// 배너 목록
	public List<AdminBannerDTO> selectAll() {
		List<AdminBannerDTO> list = sqlSession.selectList("adminBanner.selectAll");
		return list;
	}

	// 배너 총 개수 가져오기
	public int getTotal() {
		return sqlSession.selectOne("adminBanner.getTotal");
	}

	// 배너 추가
	public int insert(AdminBannerDTO adminBannerDTO) {
		int number = sqlSession.insert("adminBanner.insert",adminBannerDTO);
		System.out.println(number);
		System.out.println(adminBannerDTO.getBannerNumber());
		return adminBannerDTO.getBannerNumber();
	}
	// 배너 순서 변경
	public void update(AdminBannerDTO bannerDTO) {
		sqlSession.update("adminBanner.update",bannerDTO);
	}
	// 배너 삭제
	public void delete(int bannerNumber) {
		sqlSession.delete("adminBanner.delete",bannerNumber);
	}
}
