package com.sol.app.dto;

import java.util.List;

public class SmallClubListDTO {
	private int smallClubNumber;
	private String smallClubTitle;
	private int memberNumber;
	private String memberName;
	private String smallClubCreatedDate;
	private String smallClubUpdatedDate;
	private String smallClubContent;
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
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
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
	public List<FileSmallClubDTO> getFileSmallClubList() {
		return fileSmallClubList;
	}
	public void setFileSmallClubList(List<FileSmallClubDTO> fileSmallClubList) {
		this.fileSmallClubList = fileSmallClubList;
	}
	@Override
	public String toString() {
		return "SmallClubListDTO [smallClubNumber=" + smallClubNumber + ", smallClubTitle=" + smallClubTitle
				+ ", memberNumber=" + memberNumber + ", memberName=" + memberName + ", smallClubCreatedDate="
				+ smallClubCreatedDate + ", smallClubUpdatedDate=" + smallClubUpdatedDate + ", smallClubContent="
				+ smallClubContent + ", fileSmallClubList=" + fileSmallClubList + "]";
	}
	
}
