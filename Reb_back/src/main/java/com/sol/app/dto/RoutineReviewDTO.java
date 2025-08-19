package com.sol.app.dto;

public class RoutineReviewDTO {
	private int routineReviewNumber;
	private int routineNumber;
	private String routineReviewTitle;
	private int memberNumber;
	private String routineReviewCreatedDate;
	private String routineReviewUpdatedDate;
	private String routineReviewContent;
	private int routineReviewImageNumber;
	
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
	public int getRoutineReviewImageNumber() {
		return routineReviewImageNumber;
	}
	public void setRoutineReviewImageNumber(int routineReviewImageNumber) {
		this.routineReviewImageNumber = routineReviewImageNumber;
	}
	@Override
	public String toString() {
		return "RoutineReviewDTO [routineReviewNumber=" + routineReviewNumber + ", routineNumber=" + routineNumber
				+ ", routineReviewTitle=" + routineReviewTitle + ", memberNumber=" + memberNumber
				+ ", routineReviewCreatedDate=" + routineReviewCreatedDate + ", routineReviewUpdatedDate="
				+ routineReviewUpdatedDate + ", routineReviewContent=" + routineReviewContent
				+ ", routineReviewImageNumber=" + routineReviewImageNumber + "]";
	}
	
}
