package com.sol.app.dto;

public class AdminCourseRequestListDTO {
	private String memberNumber;
	private String memberId;
	private int courseNumber;
	private int courseOpenStatusNumber;
	private int courseRequestTypeNumber;
	private String courseStartDate;
	private String courseEndDate;
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
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
	@Override
	public String toString() {
		return "AdminCourseRequestListDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", courseNumber="
				+ courseNumber + ", courseOpenStatusNumber=" + courseOpenStatusNumber + ", courseRequestTypeNumber="
				+ courseRequestTypeNumber + ", courseStartDate=" + courseStartDate + ", courseEndDate=" + courseEndDate
				+ "]";
	}
	
	
}
