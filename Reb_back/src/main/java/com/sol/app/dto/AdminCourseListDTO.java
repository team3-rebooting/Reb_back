package com.sol.app.dto;

import com.sol.app.status.CourseRecruitStatus;

public class AdminCourseListDTO {
	private String memberNumber;
	private String memberId;
	private String memberName;
	private int courseNumber;
	private String courseTitle;
	private int courseRecruitStatusNumber;
	private String courseStatusInfo;
	private String courseStartDate;
	private String courseEndDate;

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

	public String getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public String getCourseEndDate() {
		return courseEndDate;
	}

	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	public int getCourseRecruitStatusNumber() {
		return courseRecruitStatusNumber;
	}

	public void setCourseRecruitStatusNumber(int courseRecruitStatusNumber) {
		this.courseRecruitStatusNumber = courseRecruitStatusNumber;
		this.setCourseStatusInfo(CourseRecruitStatus.findCourseStatusInfo(courseRecruitStatusNumber));
	}

	public String getCourseStatusInfo() {
		if (courseStatusInfo == null) {
			this.setCourseStatusInfo(CourseRecruitStatus.findCourseStatusInfo(courseRecruitStatusNumber));
		}
		return courseStatusInfo;
	}

	public void setCourseStatusInfo(String courseStatusInfo) {
		this.courseStatusInfo = courseStatusInfo;
	}

	@Override
	public String toString() {
		return "AdminCourseListDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberName="
				+ memberName + ", courseNumber=" + courseNumber + ", courseTitle=" + courseTitle
				+ ", courseRecruitStatusNumber=" + courseRecruitStatusNumber + ", courseStatusInfo=" + courseStatusInfo
				+ ", courseStartDate=" + courseStartDate + ", courseEndDate=" + courseEndDate + "]";
	}

}
