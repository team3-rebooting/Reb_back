package com.sol.app.dto;

public class MyCommentDTO {
	// CourseReviewCommentDTO, RoutineReviewCommentDTO
	
	private int memberNumber;
	private String postType;
	private int reviewNumber;
	private String reviewTitle;
	private String commentNumber;
	private String commentContent;
	private String commentCreatedDate;
	private String commentUpdatedDate;
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
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
	public String getCommentNumber() {
		return commentNumber;
	}
	public void setCommentNumber(String commentNumber) {
		this.commentNumber = commentNumber;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentCreatedDate() {
		return commentCreatedDate;
	}
	public void setCommentCreatedDate(String commentCreatedDate) {
		this.commentCreatedDate = commentCreatedDate;
	}
	public String getCommentUpdatedDate() {
		return commentUpdatedDate;
	}
	public void setCommentUpdatedDate(String commentUpdatedDate) {
		this.commentUpdatedDate = commentUpdatedDate;
	}
	
	@Override
	public String toString() {
		return "MyCommentDTO [memberNumber=" + memberNumber + ", postType=" + postType + ", reviewNumber="
				+ reviewNumber + ", reviewTitle=" + reviewTitle + ", commentNumber=" + commentNumber
				+ ", commentContent=" + commentContent + ", commentCreatedDate=" + commentCreatedDate
				+ ", commentUpdatedDate=" + commentUpdatedDate + "]";
	}
}
