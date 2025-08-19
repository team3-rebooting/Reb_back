package com.sol.app.dto;

public class MyRoutineDTO {
	//RoutineDTO, RoutineMemberApplicantDTO, RoutineLeader 
	private int routineNumber;
	private int memberNumber;
	private String routineMemberApplyDate;
	private int routineLeaderNumber;
	private String routineLeaderName;
	private String routineTitle;
	
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
	public int getRoutineLeaderNumber() {
		return routineLeaderNumber;
	}
	public void setRoutineLeaderNumber(int routineLeaderNumber) {
		this.routineLeaderNumber = routineLeaderNumber;
	}
	public String getRoutineLeaderName() {
		return routineLeaderName;
	}
	public void setRoutineLeaderName(String routineLeaderName) {
		this.routineLeaderName = routineLeaderName;
	}
	public String getRoutineTitle() {
		return routineTitle;
	}
	public void setRoutineTitle(String routineTitle) {
		this.routineTitle = routineTitle;
	}
	
	@Override
	public String toString() {
		return "MyRoutineDTO [routineNumber=" + routineNumber + ", memberNumber=" + memberNumber
				+ ", routineMemberApplyDate=" + routineMemberApplyDate + ", routineLeaderNumber=" + routineLeaderNumber
				+ ", routineLeaderName=" + routineLeaderName + ", routineTitle=" + routineTitle + "]";
	}
}
