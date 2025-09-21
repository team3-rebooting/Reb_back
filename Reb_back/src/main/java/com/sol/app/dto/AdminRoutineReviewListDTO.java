package com.sol.app.dto;

public class AdminRoutineReviewListDTO {
	private int routineReviewNumber;
	private String routineReviewTitle;
	private String memberNickname;
	private String routineReviewCreatedDate;
	private String routineReviewUpdatedDate;
	private int likeCount;
	
	public int getRoutineReviewNumber() {
		return routineReviewNumber;
	}
	public void setRoutineReviewNumber(int routineReviewNumber) {
		this.routineReviewNumber = routineReviewNumber;
	}
	public String getRoutineReviewTitle() {
		return routineReviewTitle;
	}
	public void setRoutineReviewTitle(String routineReviewTitle) {
		this.routineReviewTitle = routineReviewTitle;
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
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	@Override
	public String toString() {
		return "AdminRoutineReviewListDTO [routineReviewNumber=" + routineReviewNumber + ", routineReviewTitle="
				+ routineReviewTitle + ", memberNickname=" + memberNickname + ", routineReviewCreatedDate="
				+ routineReviewCreatedDate + ", routineReviewUpdatedDate=" + routineReviewUpdatedDate + ", likeCount="
				+ likeCount + "]";
	}
	
	
	
	
}
