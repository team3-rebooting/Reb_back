package com.sol.app.dto;

public class CourseMemberApplicantDTO {
	private int courseNumber;
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
		return "CourseMemberApplicantDTO [courseNumber=" + courseNumber + ", memberNumber=" + memberNumber
				+ ", courseMemberApplyDate=" + courseMemberApplyDate + "]";
	}
	
}
