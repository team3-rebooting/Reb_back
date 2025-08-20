package com.sol.app.dto;

public class CourseReviewListDTO {
	private String memberNickname;
	private String profileFilePath;
	private int courseReviewLikeCount;
	private int courseReviewCommentNumber;
	private int CommentMemberNickname;
	private int CommentMemberProfile;
	private String courseReviewCreatedDate;
	private String courseReviewUpdatedDate;
	private String courseReviewContent;
	private int courseReviewNumber;
	private int courseNumber;
	private String courseReviewTitle;
	private int memberNumber;
	private int courseReviewImageNumber;
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getProfileFilePath() {
		return profileFilePath;
	}
	public void setProfileFilePath(String profileFilePath) {
		this.profileFilePath = profileFilePath;
	}
	public int getCourseReviewLikeCount() {
		return courseReviewLikeCount;
	}
	public void setCourseReviewLikeCount(int courseReviewLikeCount) {
		this.courseReviewLikeCount = courseReviewLikeCount;
	}
	public int getCourseReviewCommentNumber() {
		return courseReviewCommentNumber;
	}
	public void setCourseReviewCommentNumber(int courseReviewCommentNumber) {
		this.courseReviewCommentNumber = courseReviewCommentNumber;
	}
	public int getCommentMemberNickname() {
		return CommentMemberNickname;
	}
	public void setCommentMemberNickname(int commentMemberNickname) {
		CommentMemberNickname = commentMemberNickname;
	}
	public int getCommentMemberProfile() {
		return CommentMemberProfile;
	}
	public void setCommentMemberProfile(int commentMemberProfile) {
		CommentMemberProfile = commentMemberProfile;
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
	public int getCourseReviewNumber() {
		return courseReviewNumber;
	}
	public void setCourseReviewNumber(int courseReviewNumber) {
		this.courseReviewNumber = courseReviewNumber;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseReviewTitle() {
		return courseReviewTitle;
	}
	public void setCourseReviewTitle(String courseReviewTitle) {
		this.courseReviewTitle = courseReviewTitle;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public int getCourseReviewImageNumber() {
		return courseReviewImageNumber;
	}
	public void setCourseReviewImageNumber(int courseReviewImageNumber) {
		this.courseReviewImageNumber = courseReviewImageNumber;
	}
	
	@Override
	public String toString() {
		return "CourseReviewListDTO [memberNickname=" + memberNickname + ", profileFilePath=" + profileFilePath
				+ ", courseReviewLikeCount=" + courseReviewLikeCount + ", courseReviewCommentNumber="
				+ courseReviewCommentNumber + ", CommentMemberNickname=" + CommentMemberNickname
				+ ", CommentMemberProfile=" + CommentMemberProfile + ", courseReviewCreatedDate="
				+ courseReviewCreatedDate + ", courseReviewUpdatedDate=" + courseReviewUpdatedDate
				+ ", courseReviewContent=" + courseReviewContent + ", courseReviewNumber=" + courseReviewNumber
				+ ", courseNumber=" + courseNumber + ", courseReviewTitle=" + courseReviewTitle + ", memberNumber="
				+ memberNumber + ", courseReviewImageNumber=" + courseReviewImageNumber + "]";
	}
	
	
}
