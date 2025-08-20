package com.sol.app.dto;

public class AdminCourseListDTO {
	private int memberNumber;
	private String memberId;
	private String memberNickname;
	private int courseNumber;
	private String courseTitle;
	private int courseRecruitStatusNumber;
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
	public int getCourseRecruitStatusNumber() {
		return courseRecruitStatusNumber;
	}
	public void setCourseRecruitStatusNumber(int courseRecruitStatusNumber) {
		this.courseRecruitStatusNumber = courseRecruitStatusNumber;
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
	
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	@Override
	public String toString() {
		return "AdminCourseListDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberNickname="
				+ memberNickname + ", courseNumber=" + courseNumber + ", courseTitle=" + courseTitle
				+ ", courseRecruitStatusNumber=" + courseRecruitStatusNumber + ", courseStartDate=" + courseStartDate
				+ ", courseEndDate=" + courseEndDate + "]";
	}
	

	

	
}
