package com.sol.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sol.app.dto.AddressDTO;
import com.sol.app.dto.FileExpertDTO;
import com.sol.app.dto.FileMemberProfileDTO;
import com.sol.app.dto.MemberDTO;
import com.sol.app.dto.MyExpertDTO;
import com.sol.app.dto.MyMemberDTO;
import com.sol.app.dto.SponsorDTO;
import com.sol.config.MyBatisConfig;

public class MyPageDAO {
	public SqlSession sqlSession;

	public MyPageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public String getId(int memberNumber) {
		return sqlSession.selectOne("member.getId", memberNumber);
	}
	
	public MemberDTO checkPassword(MemberDTO memberDTO) {
		return sqlSession.selectOne("member.login", memberDTO);
	}
	
	public boolean login(MemberDTO memberDTO) {
		return sqlSession.selectOne("member.login", memberDTO) != null;
	}
	
	public MyMemberDTO read(int memberNumber) {
		return sqlSession.selectOne("myMember.read", memberNumber);
	}
	
	public List<FileMemberProfileDTO> selectProfileList(int memberNumber) {
		System.out.println("selectProfileList 진입");
		System.out.println(sqlSession.selectList("fileMemberProfile.selectList", memberNumber));
		
		return sqlSession.selectList("fileMemberProfile.selectList", memberNumber);
	}
	
	public void insertAddress(AddressDTO addressDTO) {
		//select key 배우면 반환해서 사용자 수정에 추가하기
		sqlSession.insert("address.insert", addressDTO);
	}
	
	public void update(MemberDTO memberDTO) {
		sqlSession.update("member.update", memberDTO);
	}
	
	public void insertProfile(FileMemberProfileDTO fileMemberProfileDTO) {
		sqlSession.insert("fileMemberProfile.insert", fileMemberProfileDTO);
	}
	
	public void deleteProfile(int memberNumber) {
		sqlSession.delete("fileMemberProfile.delete", memberNumber);
	}
	
	public void delete(int memberNumber) {
		sqlSession.delete("member.delete", memberNumber);
	}
	
	public int getSponsorTotalAmount(int memberNumber) {
		return sqlSession.selectOne("sponsor.getTotalAmount", memberNumber);
	}
	
	public int getSponsorTotalCount(int memberNumber) {
		return sqlSession.selectOne("sponsor.getTotalCount", memberNumber);
	}
	
	public List<SponsorDTO> selectSponsorList(int memberNumber) {
		return sqlSession.selectList("sponsor.selectList", memberNumber);
	}
	
	public MyExpertDTO selectMyExepert(int memberNumber) {
		return sqlSession.selectOne("myExpert.select", memberNumber);
	}
	
	public FileExpertDTO selectFileExpert(int memberNumber) {
		return sqlSession.selectOne("fileExpert.select", memberNumber);
	}

	public void insertFileExpert(FileExpertDTO fileExpertDTO) {
		 sqlSession.insert("fileExpert.insert", fileExpertDTO);
	}
	
	public void deleteFileExpert(int memberNumber) {
		sqlSession.delete("fileExpert.delete", memberNumber);
	}
	
	public String getExpertApplicantReason(int memberNumber) {
		return sqlSession.selectOne("expertApplicant.getReason", memberNumber);
	}
	
	public String getCourseRejectReason(int memberNumber) {
		return sqlSession.selectOne("courseRequest.getReason", memberNumber);
	}
}
