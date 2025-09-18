package com.sol.app.dto;

public class CourseRequestDTO {
	private int courseNumber;
	private int prevCourseNumber;
	private int courseOpenStatusNumber;
	private int courseRequestTypeNumber;
	private String courseRegisterDate;
	private String courseRequestDate;
	private String courseResultDate;
	private String courseRejectReason;
	
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getPrevCourseNumber() {
		return prevCourseNumber;
	}
	public void setPrevCourseNumber(int prevCourseNumber) {
		this.prevCourseNumber = prevCourseNumber;
	}
	public int getCourseOpenStatusNumber() {
		return courseOpenStatusNumber;
	}
	public void setCourseOpenStatusNumber(int courseOpenStatusNumber) {
		this.courseOpenStatusNumber = courseOpenStatusNumber;
	}
	public int getCourseRequestTypeNumber() {
		return courseRequestTypeNumber;
	}
	public void setCourseRequestTypeNumber(int courseRequestTypeNumber) {
		this.courseRequestTypeNumber = courseRequestTypeNumber;
	}
	public String getCourseRegisterDate() {
		return courseRegisterDate;
	}
	public void setCourseRegisterDate(String courseRegisterDate) {
		this.courseRegisterDate = courseRegisterDate;
	}
	public String getCourseRequestDate() {
		return courseRequestDate;
	}
	public void setCourseRequestDate(String courseRequestDate) {
		this.courseRequestDate = courseRequestDate;
	}
	public String getCourseResultDate() {
		return courseResultDate;
	}
	public void setCourseResultDate(String courseResultDate) {
		this.courseResultDate = courseResultDate;
	}
	public String getCourseRejectReason() {
		return courseRejectReason;
	}
	public void setCourseRejectReason(String courseRejectReason) {
		this.courseRejectReason = courseRejectReason;
	}
	@Override
	public String toString() {
		return "CourseRequestDTO [courseNumber=" + courseNumber + ", prevCourseNumber=" + prevCourseNumber
				+ ", courseOpenStatusNumber=" + courseOpenStatusNumber + ", courseRequestTypeNumber="
				+ courseRequestTypeNumber + ", courseRegisterDate=" + courseRegisterDate + ", courseRequestDate="
				+ courseRequestDate + ", courseResultDate=" + courseResultDate + ", courseRejectReason="
				+ courseRejectReason + "]";
	}

	
	
}
