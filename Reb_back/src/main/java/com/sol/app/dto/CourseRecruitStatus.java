package com.sol.app.dto;

public class CourseRecruitStatus {
	private int courseRecruitStatusNumber;
	private String courseStatusInfo;
	
	public int getCourseRecruitStatusNumber() {
		return courseRecruitStatusNumber;
	}
	public void setCourseRecruitStatusNumber(int courseRecruitStatusNumber) {
		this.courseRecruitStatusNumber = courseRecruitStatusNumber;
	}
	public String getCourseStatusInfo() {
		return courseStatusInfo;
	}
	public void setCourseStatusInfo(String courseStatusInfo) {
		this.courseStatusInfo = courseStatusInfo;
	}
	
	@Override
	public String toString() {
		return "CourseRecruitStatus [courseRecruitStatusNumber=" + courseRecruitStatusNumber + ", courseStatusInfo="
				+ courseStatusInfo + "]";
	}
}
