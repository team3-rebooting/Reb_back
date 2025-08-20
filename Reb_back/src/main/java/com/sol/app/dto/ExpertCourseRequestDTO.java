package com.sol.app.dto;

import java.util.List;

public class ExpertCourseRequestDTO {
	private String courseRequestType;
	private int courseNumber;
	private String courseTitle;
	private String courseContent;
	private int expertNumber;
	private List<FileCourseDTO> fileCourseList;
	private String courseStartDate;
	private String courseEndDate;
	private String courseStartTime;
	private String courseEndTime;
	private String courseDayOfWeek;
	private int courseRecruitCount;
	private int coursePrice;
	public String getCourseRequestType() {
		return courseRequestType;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public String getCourseContent() {
		return courseContent;
	}
	public int getExpertNumber() {
		return expertNumber;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}
	public String getCourseEndDate() {
		return courseEndDate;
	}
	public String getCourseStartTime() {
		return courseStartTime;
	}
	public String getCourseEndTime() {
		return courseEndTime;
	}
	public String getCourseDayOfWeek() {
		return courseDayOfWeek;
	}
	public int getCourseRecruitCount() {
		return courseRecruitCount;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public List<FileCourseDTO> getFileCourseList() {
		return fileCourseList;
	}
	public void setFileCourseList(List<FileCourseDTO> fileCourseList) {
		this.fileCourseList = fileCourseList;
	}
	public void setCourseRequestType(String courseRequestType) {
		this.courseRequestType = courseRequestType;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	public void setExpertNumber(int expertNumber) {
		this.expertNumber = expertNumber;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}
	public void setCourseStartTime(String courseStartTime) {
		this.courseStartTime = courseStartTime;
	}
	public void setCourseEndTime(String courseEndTime) {
		this.courseEndTime = courseEndTime;
	}
	public void setCourseDayOfWeek(String courseDayOfWeek) {
		this.courseDayOfWeek = courseDayOfWeek;
	}
	public void setCourseRecruitCount(int courseRecruitCount) {
		this.courseRecruitCount = courseRecruitCount;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	@Override
	public String toString() {
		return "ExpertCourseRequestDTO [courseRequestType=" + courseRequestType + ", courseNumber=" + courseNumber
				+ ", courseTitle=" + courseTitle + ", courseContent=" + courseContent + ", expertNumber=" + expertNumber
				+ ", fileCourseList=" + fileCourseList + ", courseStartDate=" + courseStartDate + ", courseEndDate="
				+ courseEndDate + ", courseStartTime=" + courseStartTime + ", courseEndTime=" + courseEndTime
				+ ", courseDayOfWeek=" + courseDayOfWeek + ", courseRecruitCount=" + courseRecruitCount
				+ ", coursePrice=" + coursePrice + "]";
	}
	
	
}
