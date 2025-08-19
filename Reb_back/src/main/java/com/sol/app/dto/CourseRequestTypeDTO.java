package com.sol.app.dto;

public class CourseRequestTypeDTO {
	private int courseRequestTypeNumber;
	private String courseRequestType;
	public int getCourseRequestTypeNumber() {
		return courseRequestTypeNumber;
	}
	public void setCourseRequestTypeNumber(int courseRequestTypeNumber) {
		this.courseRequestTypeNumber = courseRequestTypeNumber;
	}
	public String getCourseRequestType() {
		return courseRequestType;
	}
	public void setCourseRequestType(String courseRequestType) {
		this.courseRequestType = courseRequestType;
	}
	@Override
	public String toString() {
		return "CourseRequestTypeDTO [courseRequestTypeNumber=" + courseRequestTypeNumber + ", courseRequestType="
				+ courseRequestType + "]";
	}
	
}
