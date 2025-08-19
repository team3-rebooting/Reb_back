package com.sol.app.dto;

public class CourseOpenStatusDTO {
	private int courseOpenStatusNumber;
	private String courseStatusInfo;
	
	public int getCourseOpenStatusNumber() {
		return courseOpenStatusNumber;
	}
	public void setCourseOpenStatusNumber(int courseOpenStatusNumber) {
		this.courseOpenStatusNumber = courseOpenStatusNumber;
	}
	public String getCourseStatusInfo() {
		return courseStatusInfo;
	}
	public void setCourseStatusInfo(String courseStatusInfo) {
		this.courseStatusInfo = courseStatusInfo;
	}
	@Override
	public String toString() {
		return "CourseOpenStatusDTO [courseOpenStatusNumber=" + courseOpenStatusNumber + ", courseStatusInfo="
				+ courseStatusInfo + "]";
	}
}
