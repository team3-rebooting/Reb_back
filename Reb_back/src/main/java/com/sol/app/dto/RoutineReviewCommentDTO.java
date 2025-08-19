package com.sol.app.dto;

public class RoutineReviewCommentDTO {
	private int routineReviewCommentNumber;
	private int routineReviewNumber;
	private int memberNumber;
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
		return "RoutineReviewCommentDTO [routineReviewCommentNumber=" + routineReviewCommentNumber
				+ ", routineReviewNumber=" + routineReviewNumber + ", memberNumber=" + memberNumber
				+ ", routineReviewCreatedDate=" + routineReviewCreatedDate + ", routineReviewUpdatedDate="
				+ routineReviewUpdatedDate + ", routineReviewContent=" + routineReviewContent + "]";
	}
	
}
