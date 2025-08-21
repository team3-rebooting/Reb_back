package com.sol.app.dto;

import java.util.ArrayList;
import java.util.List;

public class RoutineListDTO {
	//RoutineDTO, RoutineLeaderDTO, RoutineStatusDTO, FileDTO, RoutineMemberApplicantDTO
	
	private int routineNumber;
	private int routineLeaderNumber;
	private String routineLeaderName;
	private int adminNumber;
	private String routineTitle;
	private String routineContent;
	private int routineStatusNumber;
	private String routineStatusInfo;
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
	private int routineApplicantCount;
	private int routineRecruitCount;
	
	private List<FileRoutineDTO> fileRoutineList;
	
	private List<RoutineMemberApplicantDTO> applicantList = new ArrayList<>();
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
	public String getRoutineLeaderName() {
		return routineLeaderName;
	}
	public void setRoutineLeaderName(String routineLeaderName) {
		this.routineLeaderName = routineLeaderName;
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
	}
	public String getRoutineStatusInfo() {
		return routineStatusInfo;
	}
	public void setRoutineStatusInfo(String routineStatusInfo) {
		this.routineStatusInfo = routineStatusInfo;
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
	public int getRoutineApplicantCount() {
		return routineApplicantCount;
	}
	public void setRoutineApplicantCount(int routineApplicantCount) {
		this.routineApplicantCount = routineApplicantCount;
	}
	public int getRoutineRecruitCount() {
		return routineRecruitCount;
	}
	public void setRoutineRecruitCount(int routineRecruitCount) {
		this.routineRecruitCount = routineRecruitCount;
	}
	public List<RoutineMemberApplicantDTO> getApplicantList() {
		return applicantList;
	}
	public void setApplicantList(List<RoutineMemberApplicantDTO> applicantList) {
		this.applicantList = applicantList;
	}
	public List<FileRoutineDTO> getFileRoutineList() {
		return fileRoutineList;
	}
	public void setFileRoutineList(List<FileRoutineDTO> fileRoutineList) {
		this.fileRoutineList = fileRoutineList;
	}
	@Override
	public String toString() {
		return "RoutineListDTO [routineNumber=" + routineNumber + ", routineLeaderNumber=" + routineLeaderNumber
				+ ", routineLeaderName=" + routineLeaderName + ", adminNumber=" + adminNumber + ", routineTitle="
				+ routineTitle + ", routineContent=" + routineContent + ", routineStatusNumber=" + routineStatusNumber
				+ ", routineStatusInfo=" + routineStatusInfo + ", fileRoutineList=" + fileRoutineList
				+ ", routineLocation=" + routineLocation + ", routineCreatedDate=" + routineCreatedDate
				+ ", routineUpdatedDate=" + routineUpdatedDate + ", routineRecruitStartDate=" + routineRecruitStartDate
				+ ", routineRecruitEndDate=" + routineRecruitEndDate + ", routineStartDate=" + routineStartDate
				+ ", routineEndDate=" + routineEndDate + ", routineStartTime=" + routineStartTime + ", routineEndTime="
				+ routineEndTime + ", routineDayOfWeek=" + routineDayOfWeek + ", routineApplicantCount="
				+ routineApplicantCount + ", routineRecruitCount=" + routineRecruitCount + ", applicantList="
				+ applicantList + "]";
	}
	
	
}
