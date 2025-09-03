package com.sol.app.status;

public enum RoutineStatus {
	RECRUITING(1, "모집중"), RECRUITBEFORE(2,"모집전"), RECRUITEND(3, "모집 종료"), MEETING(4,"모임중"), MEETINGEND(5,"모임 종료");
	private final int routineStatusNumber;
	private final String routineStatusInfo;
	
	public int getRoutineStatusNumber() {
		return routineStatusNumber;
	}
	public String getRoutineStatusInfo() {
		return routineStatusInfo;
	}
	
	RoutineStatus(int routineStatusNumber, String routineStatusInfo) {
		this.routineStatusNumber = routineStatusNumber;
		this.routineStatusInfo = routineStatusInfo;
	}
	
	public static String findRoutineStatusInfo(int routineStatusNumber) {
		for (RoutineStatus r : RoutineStatus.values()) {
			if (r.getRoutineStatusNumber() == routineStatusNumber) {
				return r.getRoutineStatusInfo();
			}
		}
		
		return "오류";
	}
}
