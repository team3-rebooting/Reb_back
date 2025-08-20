package com.sol.app.dto;

public class AdminCourseReviewListDTO {
	private int courseReviewNumber;
	private String courseReviewTitle;
	private int memberNumber;
	private String memberNickname;
	private String courseReviewCreatedDate;
	private String courseReviewUpdatedDate;
	
	public int getCourseReviewNumber() {
		return courseReviewNumber;
	}
	public void setCourseReviewNumber(int courseReviewNumber) {
		this.courseReviewNumber = courseReviewNumber;
	}
	public String getCourseReviewTitle() {
		return courseReviewTitle;
	}
	public void setCourseReviewTitle(String courseReviewTitle) {
		this.courseReviewTitle = courseReviewTitle;
	}
	public String getCourseReviewCreatedDate() {
		return courseReviewCreatedDate;
	}
	public void setCourseReviewCreatedDate(String courseReviewCreatedDate) {
		this.courseReviewCreatedDate = courseReviewCreatedDate;
	}
	public String getCourseReviewUpdatedDate() {
		return courseReviewUpdatedDate;
	}
	public void setCourseReviewUpdatedDate(String courseReviewUpdatedDate) {
		this.courseReviewUpdatedDate = courseReviewUpdatedDate;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	@Override
	public String toString() {
		return "AdminCourseReviewListDTO [courseReviewNumber=" + courseReviewNumber + ", courseReviewTitle="
				+ courseReviewTitle + ", memberNumber=" + memberNumber + ", memberNickname=" + memberNickname
				+ ", courseReviewCreatedDate=" + courseReviewCreatedDate + ", courseReviewUpdatedDate="
				+ courseReviewUpdatedDate + "]";
	}
	
	
	
}
