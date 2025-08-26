package com.sol.app.dto;

public class CourseMemberApplicantDTO {
	private int courseNumber;
	private String courseTitle;
	private int memberNumber;
	private String courseMemberApplyDate;
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getCourseMemberApplyDate() {
		return courseMemberApplyDate;
	}
	public void setCourseMemberApplyDate(String courseMemberApplyDate) {
		this.courseMemberApplyDate = courseMemberApplyDate;
	}
	@Override
	public String toString() {
		return "CourseMemberApplicantDTO [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle
				+ ", memberNumber=" + memberNumber + ", courseMemberApplyDate=" + courseMemberApplyDate + "]";
	}
	
	
}
