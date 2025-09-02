package com.sol.app.dto;

public class AdminCourseRequestListDTO {
	private String memberNumber;
	private String memberId;
	private String memberName;
	private int courseNumber;
	private String courseTitle;
	private int courseRequestTypeNumber;
	private String courseStartDate;
	private String courseEndDate;
	
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
	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
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
	
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getCourseRequestTypeNumber() {
		return courseRequestTypeNumber;
	}
	public void setCourseRequestTypeNumber(int courseRequestTypeNumber) {
		this.courseRequestTypeNumber = courseRequestTypeNumber;
	}
	@Override
	public String toString() {
		return "AdminCourseRequestListDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberName="
				+ memberName + ", courseNumber=" + courseNumber + ", courseTitle=" + courseTitle
				+ ", courseRequestTypeNumber=" + courseRequestTypeNumber + ", courseStartDate=" + courseStartDate
				+ ", courseEndDate=" + courseEndDate + "]";
	}
	
		
	
}
