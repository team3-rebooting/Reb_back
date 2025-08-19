package com.sol.app.dto;

public class RoutineLeaderDTO {
	private int routineLeaderNumber;
	private String routineLeaderName;
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
	@Override
	public String toString() {
		return "RoutineLeaderDTO [routineLeaderNumber=" + routineLeaderNumber + ", routineLeaderName="
				+ routineLeaderName + "]";
	}
	
}
