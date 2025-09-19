package com.sol.app.dto;

import java.util.List;

public class SmallClubCommentListDTO {
	private int smallClubCommentNumber;
	private int smallClubNumber;
	private int memberNumber;
	private String memberNickname;
	private String smallClubCreatedDate;
	private String smallClubUpdatedDate;
	private String smallClubContent;
	
	private List<FileMemberProfileDTO> fileMemberProFIleList;
	private String fileSystemName;
	
	public int getSmallClubCommentNumber() {
		return smallClubCommentNumber;
	}
	public void setSmallClubCommentNumber(int smallClubCommentNumber) {
		this.smallClubCommentNumber = smallClubCommentNumber;
	}
	public int getSmallClubNumber() {
		return smallClubNumber;
	}
	public void setSmallClubNumber(int smallClubNumber) {
		this.smallClubNumber = smallClubNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getSmallClubCreatedDate() {
		return smallClubCreatedDate;
	}
	public void setSmallClubCreatedDate(String smallClubCreatedDate) {
		this.smallClubCreatedDate = smallClubCreatedDate;
	}
	public String getSmallClubUpdatedDate() {
		return smallClubUpdatedDate;
	}
	public void setSmallClubUpdatedDate(String smallClubUpdatedDate) {
		this.smallClubUpdatedDate = smallClubUpdatedDate;
	}
	public String getSmallClubContent() {
		return smallClubContent;
	}
	public void setSmallClubContent(String smallClubContent) {
		this.smallClubContent = smallClubContent;
	}
	public List<FileMemberProfileDTO> getFileMemberProFIleList() {
		return fileMemberProFIleList;
	}
	public void setFileMemberProFIleList(List<FileMemberProfileDTO> fileMemberProFIleList) {
		this.fileMemberProFIleList = fileMemberProFIleList;
	}
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	
	@Override
	public String toString() {
		return "SmallClubCommentListDTO [smallClubCommentNumber=" + smallClubCommentNumber + ", smallClubNumber="
				+ smallClubNumber + ", memberNumber=" + memberNumber + ", memberNickname=" + memberNickname
				+ ", smallClubCreatedDate=" + smallClubCreatedDate + ", smallClubUpdatedDate=" + smallClubUpdatedDate
				+ ", smallClubContent=" + smallClubContent + ", fileMemberProFIleList=" + fileMemberProFIleList
				+ ", fileSystemName=" + fileSystemName + "]";
	}
}
