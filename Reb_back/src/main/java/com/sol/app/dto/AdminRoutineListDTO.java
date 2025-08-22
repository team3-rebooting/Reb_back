package com.sol.app.dto;

public class AdminRoutineListDTO {
	private String routineStatusInfo;
	private int routineNumber;
	private String routineLeaderName;
	private int adminNumber;
	private String routineTitle;
	private int routineStatusNumber;
	private String routineStartDate;
	private String routineEndDate;
	private int routineRecruitCount;
	private int routineCount;

	public String getRoutineStatusInfo() {
		return routineStatusInfo;
	}

	public void setRoutineStatusInfo(String routineStatusInfo) {
		this.routineStatusInfo = routineStatusInfo;
	}

	public int getRoutineNumber() {
		return routineNumber;
	}

	public void setRoutineNumber(int routineNumber) {
		this.routineNumber = routineNumber;
	}

	public int getAdminNumber() {
		return adminNumber;
	}

	public void setAdminNumber(int adminNumber) {
		this.adminNumber = adminNumber;
	}

	public String getRoutineTitle() {
		return routineTitle;
	}

	public void setRoutineTitle(String routineTitle) {
		this.routineTitle = routineTitle;
	}

	public int getRoutineStatusNumber() {
		return routineStatusNumber;
	}

	public void setRoutineStatusNumber(int routineStatusNumber) {
		this.routineStatusNumber = routineStatusNumber;
	}

	public String getRoutineStartDate() {
		return routineStartDate;
	}

	public void setRoutineStartDate(String routineStartDate) {
		this.routineStartDate = routineStartDate;
	}

	public String getRoutineEndDate() {
		return routineEndDate;
	}

	public void setRoutineEndDate(String routineEndDate) {
		this.routineEndDate = routineEndDate;
	}

	public int getRoutineRecruitCount() {
		return routineRecruitCount;
	}

	public void setRoutineRecruitCount(int routineRecruitCount) {
		this.routineRecruitCount = routineRecruitCount;
	}

	
	public String getRoutineLeaderName() {
		return routineLeaderName;
	}

	public void setRoutineLeaderName(String routineLeaderName) {
		this.routineLeaderName = routineLeaderName;
	}
	
	public int getRoutineCount() {
		return routineCount;
	}

	public void setRoutineCount(int routineCount) {
		this.routineCount = routineCount;
	}

	@Override
	public String toString() {
		return "AdminRoutineListDTO [routineStatusInfo=" + routineStatusInfo + ", routineNumber=" + routineNumber
				+ ", routineLeaderName=" + routineLeaderName + ", adminNumber=" + adminNumber + ", routineTitle="
				+ routineTitle + ", routineStatusNumber=" + routineStatusNumber + ", routineStartDate="
				+ routineStartDate + ", routineEndDate=" + routineEndDate + ", routineRecruitCount="
				+ routineRecruitCount + ", routineCount=" + routineCount + "]";
	}

	

}
