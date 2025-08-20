package com.sol.app.dto;

public class ExpertCourseRequestDTO {
	private String courseRequestType;
	private int courseNumber;
	private String courseTitle;
	private String courseContent;
	private int expertNumber;
	private int courseMainImageNumber;
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
	public int getCourseMainImageNumber() {
		return courseMainImageNumber;
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
	@Override
	public String toString() {
		return "ExpertCourseRequestDTO [courseRequestType=" + courseRequestType + ", courseNumber=" + courseNumber
				+ ", courseTitle=" + courseTitle + ", courseContent=" + courseContent + ", expertNumber=" + expertNumber
				+ ", courseMainImageNumber=" + courseMainImageNumber + ", courseStartDate=" + courseStartDate
				+ ", courseEndDate=" + courseEndDate + ", courseStartTime=" + courseStartTime + ", courseEndTime="
				+ courseEndTime + ", courseDayOfWeek=" + courseDayOfWeek + ", courseRecruitCount=" + courseRecruitCount
				+ ", coursePrice=" + coursePrice + "]";
	}
	
	
}
