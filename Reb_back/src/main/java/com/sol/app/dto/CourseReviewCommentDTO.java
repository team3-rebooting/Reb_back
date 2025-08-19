package com.sol.app.dto;

public class CourseReviewCommentDTO {
	private int courseReviewCommentNumber;
	private int courseReviewNumber;
	private int memberNumber;
	private String courseReviewCreatedDate;
	private String courseReviewUpdatedDate;
	private String courseReviewContent;
	
	public int getCourseReviewCommentNumber() {
		return courseReviewCommentNumber;
	}
	public void setCourseReviewCommentNumber(int courseReviewCommentNumber) {
		this.courseReviewCommentNumber = courseReviewCommentNumber;
	}
	public int getCourseReviewNumber() {
		return courseReviewNumber;
	}
	public void setCourseReviewNumber(int courseReviewNumber) {
		this.courseReviewNumber = courseReviewNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
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
	public String getCourseReviewContent() {
		return courseReviewContent;
	}
	public void setCourseReviewContent(String courseReviewContent) {
		this.courseReviewContent = courseReviewContent;
	}
	@Override
	public String toString() {
		return "CourseReviewCommentDTO [courseReviewCommentNumber=" + courseReviewCommentNumber
				+ ", courseReviewNumber=" + courseReviewNumber + ", memberNumber=" + memberNumber
				+ ", courseReviewCreatedDate=" + courseReviewCreatedDate + ", courseReviewUpdatedDate="
				+ courseReviewUpdatedDate + ", courseReviewContent=" + courseReviewContent + "]";
	}
	
}
