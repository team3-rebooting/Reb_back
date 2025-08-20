package com.sol.app.dto;

import java.util.List;

public class AdminRoutineReviewDTO {
	private int routineReviewNumber;
	private int routineNumber;
	private String routineReviewTitle;
	private int memberNumber;
	private String memberNickname;
	private String routineReviewCreatedDate;
	private String routineReviewUpdatedDate;
	private String routineReviewContent;
	private List<FileMemberProfileDTO> fileMemberProfileList;
	private List<FileRoutineReviewDTO> fileRoutineReviewList;
	public int getRoutineReviewNumber() {
		return routineReviewNumber;
	}
	public void setRoutineReviewNumber(int routineReviewNumber) {
		this.routineReviewNumber = routineReviewNumber;
	}
	public int getRoutineNumber() {
		return routineNumber;
	}
	public void setRoutineNumber(int routineNumber) {
		this.routineNumber = routineNumber;
	}
	public String getRoutineReviewTitle() {
		return routineReviewTitle;
	}
	public void setRoutineReviewTitle(String routineReviewTitle) {
		this.routineReviewTitle = routineReviewTitle;
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
	public String getRoutineReviewCreatedDate() {
		return routineReviewCreatedDate;
	}
	public void setRoutineReviewCreatedDate(String routineReviewCreatedDate) {
		this.routineReviewCreatedDate = routineReviewCreatedDate;
	}
	public String getRoutineReviewUpdatedDate() {
		return routineReviewUpdatedDate;
	}
	public void setRoutineReviewUpdatedDate(String routineReviewUpdatedDate) {
		this.routineReviewUpdatedDate = routineReviewUpdatedDate;
	}
	public String getRoutineReviewContent() {
		return routineReviewContent;
	}
	public void setRoutineReviewContent(String routineReviewContent) {
		this.routineReviewContent = routineReviewContent;
	}
	public List<FileMemberProfileDTO> getFileMemberProfileList() {
		return fileMemberProfileList;
	}
	public void setFileMemberProfileList(List<FileMemberProfileDTO> fileMemberProfileList) {
		this.fileMemberProfileList = fileMemberProfileList;
	}
	public List<FileRoutineReviewDTO> getFileRoutineReviewList() {
		return fileRoutineReviewList;
	}
	public void setFileRoutineReviewList(List<FileRoutineReviewDTO> fileRoutineReviewList) {
		this.fileRoutineReviewList = fileRoutineReviewList;
	}
	@Override
	public String toString() {
		return "AdminRoutineReviewDTO [routineReviewNumber=" + routineReviewNumber + ", routineNumber=" + routineNumber
				+ ", routineReviewTitle=" + routineReviewTitle + ", memberNumber=" + memberNumber + ", memberNickname="
				+ memberNickname + ", routineReviewCreatedDate=" + routineReviewCreatedDate
				+ ", routineReviewUpdatedDate=" + routineReviewUpdatedDate + ", routineReviewContent="
				+ routineReviewContent + ", fileMemberProfileList=" + fileMemberProfileList + ", fileRoutineReviewList="
				+ fileRoutineReviewList + "]";
	}
	
}
