package com.sol.app.dto;

import java.util.List;

public class CourseListDTO {
//	private String memberName;
//	private String expertLicenseInfo;
//	private String expertCareer;
//	private int courseNumber;
//	private String courseTitle;
//	private String courseContent;
//	private int expertNumber;
//	private int courseRecruitStatusNumber;
//	private List<FileCourseDTO> fileCourseList;
//	private String coursePostDate;
//	private String coursePostUpdateDate;
//	private String courseRecruitStartDate;
//	private String courseRecruitEndDate;
//	private String courseStartDate;
//	private String courseEndDate;
//	private String courseStartTime;
//	private String courseEndTime;
//	private String courseDayOfWeek;
//	private int courseRecruitCount;
//	private int coursePrice;
	private int courseNumber;
	private String courseTitle;
	private String courseStatusInfo;
	private String expertName;
	private String coursePostDate;
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseStatusInfo() {
		return courseStatusInfo;
	}
	public void setCourseStatusInfo(String courseStatusInfo) {
		this.courseStatusInfo = courseStatusInfo;
	}
	public String getExpertName() {
		return expertName;
	}
	public void setExpertName(String expertName) {
		this.expertName = expertName;
	}
	public String getCoursePostDate() {
		return coursePostDate;
	}
	public void setCoursePostDate(String coursePostDate) {
		this.coursePostDate = coursePostDate;
	}
	@Override
	public String toString() {
		return "CourseListDTO [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle + ", courseStatusInfo="
				+ courseStatusInfo + ", expertName=" + expertName + ", coursePostDate=" + coursePostDate + "]";
	}
	
	
	
}
