package com.sol.app.dto;

public class RoutineReviewLikeDTO {
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
		return "RoutineReviewLikeDTO [routineReviewNumber=" + routineReviewNumber + ", memberNumber=" + memberNumber
				+ "]";
	}
	
}
