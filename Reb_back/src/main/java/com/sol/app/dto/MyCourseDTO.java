package com.sol.app.dto;

public class MyCourseDTO {
	//CourseDTO, CourseMemberApplicantDTO, ExpertDTO, MemberDTO
	private int courseNumber;
	private int memberNumber;
	private String courseTitle;
	private int expertNumber;
	private int expertMemberNumber;
	private String expertName;
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
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getExpertNumber() {
		return expertNumber;
	}
	public void setExpertNumber(int expertNumber) {
		this.expertNumber = expertNumber;
	}
	public int getExpertMemberNumber() {
		return expertMemberNumber;
	}
	public void setExpertMemberNumber(int expertMemberNumber) {
		this.expertMemberNumber = expertMemberNumber;
	}
	public String getExpertName() {
		return expertName;
	}
	public void setExpertName(String expertName) {
		this.expertName = expertName;
	}
	public String getCourseMemberApplyDate() {
		return courseMemberApplyDate;
	}
	public void setCourseMemberApplyDate(String courseMemberApplyDate) {
		this.courseMemberApplyDate = courseMemberApplyDate;
	}
	
	@Override
	public String toString() {
		return "MyCourseDTO [courseNumber=" + courseNumber + ", memberNumber=" + memberNumber + ", courseTitle="
				+ courseTitle + ", expertNumber=" + expertNumber + ", expertMemberNumber=" + expertMemberNumber
				+ ", expertName=" + expertName + ", courseMemberApplyDate=" + courseMemberApplyDate + "]";
	}
}
