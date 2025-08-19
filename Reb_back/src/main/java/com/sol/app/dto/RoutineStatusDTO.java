package com.sol.app.dto;

public class RoutineStatusDTO {
	private int routineStatusNumber;
	private String routineStatusInfo;
	
	public int getRoutineStatusNumber() {
		return routineStatusNumber;
	}
	public void setRoutineStatusNumber(int routineStatusNumber) {
		this.routineStatusNumber = routineStatusNumber;
	}
	public String getRoutineStatusInfo() {
		return routineStatusInfo;
	}
	public void setRoutineStatusInfo(String routineStatusInfo) {
		this.routineStatusInfo = routineStatusInfo;
	}
	
	@Override
	public String toString() {
		return "RoutineStatusDTO [routineStatusNumber=" + routineStatusNumber + ", routineStatusInfo="
				+ routineStatusInfo + "]";
	}
}
