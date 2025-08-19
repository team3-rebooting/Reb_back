package com.sol.app.dto;

public class CourseReviewLikeDTO {
	private int routineReviewNumber;
	private int memberNumber;
	
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
	@Override
	public String toString() {
		return "CourseReviewLikeDTO [routineReviewNumber=" + routineReviewNumber + ", memberNumber=" + memberNumber
				+ "]";
	}
	
}
