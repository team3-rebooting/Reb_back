package com.sol.app.dto;

public class MyReviewDTO {
	//CourseReviewDTO, RoutineReviewDTO (union)
	
	private String postType;
	private int reviewNumber;
	private String reviewTitle;
	private int postReviewNumber;
	private int postNumber;
	private String createdDate;
	private String updatedDate;
	private int memberNumber;
	
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public int getReviewNumber() {
		return reviewNumber;
	}
	public void setReviewNumber(int reviewNumber) {
		this.reviewNumber = reviewNumber;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	public int getPostReviewNumber() {
		return postReviewNumber;
	}
	public void setPostReviewNumber(int postReviewNumber) {
		this.postReviewNumber = postReviewNumber;
	}
	public int getPostNumber() {
		return postNumber;
	}
	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	@Override
	public String toString() {
		return "MyReviewDTO [postType=" + postType + ", reviewNumber=" + reviewNumber + ", reviewTitle=" + reviewTitle
				+ ", postReviewNumber=" + postReviewNumber + ", postNumber=" + postNumber + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + ", memberNumber=" + memberNumber + "]";
	}
}
