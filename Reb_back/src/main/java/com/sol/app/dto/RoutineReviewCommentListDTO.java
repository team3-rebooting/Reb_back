package com.sol.app.dto;

public class RoutineReviewCommentListDTO {
	//RoutineReviewComment, MemberDTO, FileDTO
	private int routineReviewCommentNumber;
	private int routineReviewNumber;
	private int memberNumber;
	private String memberNickname;
	private int profileFileNumber;
	private String filePath;
	private String routineReviewCreatedDate;
	private String routineReviewUpdatedDate;
	private String routineReviewContent;
	public int getRoutineReviewCommentNumber() {
		return routineReviewCommentNumber;
	}
	public void setRoutineReviewCommentNumber(int routineReviewCommentNumber) {
		this.routineReviewCommentNumber = routineReviewCommentNumber;
	}
	public int getRoutineReviewNumber() {
		return routineReviewNumber;
	}
	public void setRoutineReviewNumber(int routineReviewNumber) {
		this.routineReviewNumber = routineReviewNumber;
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
	public int getProfileFileNumber() {
		return profileFileNumber;
	}
	public void setProfileFileNumber(int profileFileNumber) {
		this.profileFileNumber = profileFileNumber;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
	
	@Override
	public String toString() {
		return "RoutineReviewCommentListDTO [routineReviewCommentNumber=" + routineReviewCommentNumber
				+ ", routineReviewNumber=" + routineReviewNumber + ", memberNumber=" + memberNumber
				+ ", memberNickname=" + memberNickname + ", profileFileNumber=" + profileFileNumber + ", filePath="
				+ filePath + ", routineReviewCreatedDate=" + routineReviewCreatedDate + ", routineReviewUpdatedDate="
				+ routineReviewUpdatedDate + ", routineReviewContent=" + routineReviewContent + "]";
	}
}
