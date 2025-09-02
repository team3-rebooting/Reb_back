package com.sol.app.dto;

import java.util.List;

import com.sol.app.status.RoutineStatus;

public class AdminRoutineDTO {
	private String routineStatusInfo;
	private int routineNumber;
	private int routineLeaderNumber;
	private String routineLeaderName;
	private int adminNumber;
	private String routineTitle;
	private String routineContent;
	private int routineStatusNumber;
	private List<FileRoutineDTO> fileRoutineList;
	private String routineLocation;
	private String routineCreatedDate;
	private String routineUpdatedDate;
	private String routineRecruitStartDate;
	private String routineRecruitEndDate;
	private String routineStartDate;
	private String routineEndDate;
	private String routineStartTime;
	private String routineEndTime;
	private String routineDayOfWeek;
	private int routineCount;
	private int routineRecruitCount;
	public String getRoutineStatusInfo() {
		if(routineStatusInfo == null) {
			this.setRoutineStatusInfo(RoutineStatus.findRoutineStatusInfo(routineStatusNumber));
		}
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
	public int getRoutineLeaderNumber() {
		return routineLeaderNumber;
	}
	public void setRoutineLeaderNumber(int routineLeaderNumber) {
		this.routineLeaderNumber = routineLeaderNumber;
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
	public String getRoutineContent() {
		return routineContent;
	}
	public void setRoutineContent(String routineContent) {
		this.routineContent = routineContent;
	}
	public int getRoutineStatusNumber() {
		return routineStatusNumber;
	}
	public void setRoutineStatusNumber(int routineStatusNumber) {
		this.routineStatusNumber = routineStatusNumber;
		
		this.setRoutineStatusInfo(RoutineStatus.findRoutineStatusInfo(routineStatusNumber));
	}
	public String getRoutineLocation() {
		return routineLocation;
	}
	public void setRoutineLocation(String routineLocation) {
		this.routineLocation = routineLocation;
	}
	public String getRoutineCreatedDate() {
		return routineCreatedDate;
	}
	public void setRoutineCreatedDate(String routineCreatedDate) {
		this.routineCreatedDate = routineCreatedDate;
	}
	public String getRoutineUpdatedDate() {
		return routineUpdatedDate;
	}
	public void setRoutineUpdatedDate(String routineUpdatedDate) {
		this.routineUpdatedDate = routineUpdatedDate;
	}
	public String getRoutineRecruitStartDate() {
		return routineRecruitStartDate;
	}
	public void setRoutineRecruitStartDate(String routineRecruitStartDate) {
		this.routineRecruitStartDate = routineRecruitStartDate;
	}
	public String getRoutineRecruitEndDate() {
		return routineRecruitEndDate;
	}
	public void setRoutineRecruitEndDate(String routineRecruitEndDate) {
		this.routineRecruitEndDate = routineRecruitEndDate;
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
	public String getRoutineStartTime() {
		return routineStartTime;
	}
	public void setRoutineStartTime(String routineStartTime) {
		this.routineStartTime = routineStartTime;
	}
	public String getRoutineEndTime() {
		return routineEndTime;
	}
	public void setRoutineEndTime(String routineEndTime) {
		this.routineEndTime = routineEndTime;
	}
	public String getRoutineDayOfWeek() {
		return routineDayOfWeek;
	}
	public void setRoutineDayOfWeek(String routineDayOfWeek) {
		this.routineDayOfWeek = routineDayOfWeek;
	}
	public int getRoutineRecruitCount() {
		return routineRecruitCount;
	}
	public void setRoutineRecruitCount(int routineRecruitCount) {
		this.routineRecruitCount = routineRecruitCount;
	}
	public List<FileRoutineDTO> getFileRoutineList() {
		return fileRoutineList;
	}
	public void setFileRoutineList(List<FileRoutineDTO> fileRoutineList) {
		this.fileRoutineList = fileRoutineList;
	}
	public int getRoutineCount() {
		return routineCount;
	}
	public void setRoutineCount(int routineCount) {
		this.routineCount = routineCount;
	}
	public String getRoutineLeaderName() {
		return routineLeaderName;
	}
	public void setRoutineLeaderName(String routineLeaderName) {
		this.routineLeaderName = routineLeaderName;
	}
	@Override
	public String toString() {
		return "AdminRoutineDTO [routineStatusInfo=" + routineStatusInfo + ", routineNumber=" + routineNumber
				+ ", routineLeaderNumber=" + routineLeaderNumber + ", routineLeaderName=" + routineLeaderName
				+ ", adminNumber=" + adminNumber + ", routineTitle=" + routineTitle + ", routineContent="
				+ routineContent + ", routineStatusNumber=" + routineStatusNumber + ", fileRoutineList="
				+ fileRoutineList + ", routineLocation=" + routineLocation + ", routineCreatedDate="
				+ routineCreatedDate + ", routineUpdatedDate=" + routineUpdatedDate + ", routineRecruitStartDate="
				+ routineRecruitStartDate + ", routineRecruitEndDate=" + routineRecruitEndDate + ", routineStartDate="
				+ routineStartDate + ", routineEndDate=" + routineEndDate + ", routineStartTime=" + routineStartTime
				+ ", routineEndTime=" + routineEndTime + ", routineDayOfWeek=" + routineDayOfWeek + ", routineCount="
				+ routineCount + ", routineRecruitCount=" + routineRecruitCount + "]";
	}
	
	
	
	
	
	
}
