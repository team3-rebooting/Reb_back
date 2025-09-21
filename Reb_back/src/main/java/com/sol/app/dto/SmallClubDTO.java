package com.sol.app.dto;

import java.util.List;

public class SmallClubDTO {
	private int smallClubNumber;
	private String smallClubTitle;
	private int memberNumber;
	private String memberNickname;
	private String smallClubCreatedDate;
	private String smallClubUpdatedDate;
	private String smallClubContent;
	private String smallClubStartDate;
	private String smallClubStartTime;
	private int smallClubRecruitCount;
	private FileMemberProfileDTO fileWriterProFileList;
	private List<FileMemberProfileDTO> fileCommentProFileList;
	private List<FileSmallClubDTO> fileSmallClubList;
	public int getSmallClubNumber() {
		return smallClubNumber;
	}
	public void setSmallClubNumber(int smallClubNumber) {
		this.smallClubNumber = smallClubNumber;
	}
	public String getSmallClubTitle() {
		return smallClubTitle;
	}
	public void setSmallClubTitle(String smallClubTitle) {
		this.smallClubTitle = smallClubTitle;
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
	public FileMemberProfileDTO getFileWriterProFileList() {
		return fileWriterProFileList;
	}
	public void setFileWriterProFileList(FileMemberProfileDTO fileWriterProFileList) {
		this.fileWriterProFileList = fileWriterProFileList;
	}
	public List<FileMemberProfileDTO> getFileCommentProFileList() {
		return fileCommentProFileList;
	}
	public void setFileCommentProFileList(List<FileMemberProfileDTO> fileCommentProFileList) {
		this.fileCommentProFileList = fileCommentProFileList;
	}
	public List<FileSmallClubDTO> getFileSmallClubList() {
		return fileSmallClubList;
	}
	public void setFileSmallClubList(List<FileSmallClubDTO> fileSmallClubList) {
		this.fileSmallClubList = fileSmallClubList;
	}
	public String getSmallClubStartDate() {
		return smallClubStartDate;
	}
	public void setSmallClubStartDate(String smallClubStartDate) {
		this.smallClubStartDate = smallClubStartDate;
	}
	public String getSmallClubStartTime() {
		return smallClubStartTime;
	}
	public void setSmallClubStartTime(String smallClubStartTime) {
		this.smallClubStartTime = smallClubStartTime;
	}
	public int getSmallClubRecruitCount() {
		return smallClubRecruitCount;
	}
	public void setSmallClubRecruitCount(int smallClubRecruitCount) {
		this.smallClubRecruitCount = smallClubRecruitCount;
	}
	@Override
	public String toString() {
		return "SmallClubDTO [smallClubNumber=" + smallClubNumber + ", smallClubTitle=" + smallClubTitle
				+ ", memberNumber=" + memberNumber + ", memberNickname=" + memberNickname + ", smallClubCreatedDate="
				+ smallClubCreatedDate + ", smallClubUpdatedDate=" + smallClubUpdatedDate + ", smallClubContent="
				+ smallClubContent + ", smallClubStartDate=" + smallClubStartDate + ", smallClubStartTime="
				+ smallClubStartTime + ", smallClubRecruitCount=" + smallClubRecruitCount + ", fileWriterProFileList="
				+ fileWriterProFileList + ", fileCommentProFileList=" + fileCommentProFileList + ", fileSmallClubList="
				+ fileSmallClubList + "]";
	}
	
	
	
	
	
}
