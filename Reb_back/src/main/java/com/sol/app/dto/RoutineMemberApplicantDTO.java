package com.sol.app.dto;

public class RoutineMemberApplicantDTO {
	private int routineNumber;
	private int memberNumber;
	private String routineMemberApplyDate;
	public int getRoutineNumber() {
		return routineNumber;
	}
	public void setRoutineNumber(int routineNumber) {
		this.routineNumber = routineNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getRoutineMemberApplyDate() {
		return routineMemberApplyDate;
	}
	public void setRoutineMemberApplyDate(String routineMemberApplyDate) {
		this.routineMemberApplyDate = routineMemberApplyDate;
	}
	
	@Override
	public String toString() {
		return "RoutineMemberApplicantDTO [routineNumber=" + routineNumber + ", memberNumber=" + memberNumber
				+ ", routineMemberApplyDate=" + routineMemberApplyDate + "]";
	}
}
