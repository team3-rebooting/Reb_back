package com.sol.app.dto;

import java.util.List;

public class CourseReviewListDTO {
	private String memberNickname;
	//작성자 프로필 사진
	private String profileFilePath;
	private List<FileMemberProFileDTO> fileWriterPriFileList;
	private int courseReviewLikeCount;
	private int courseReviewCommentNumber;
	private int CommentMemberNickname;
	//댓글 프로필 사진
	private List<FileMemberProFileDTO> fileCommentPriFileList; 
	private String courseReviewCreatedDate;
	private String courseReviewUpdatedDate;
	private String courseReviewContent;
	private int courseReviewNumber;
	private int courseNumber;
	private String courseReviewTitle;
	private int memberNumber;
	//수업 후기 사진
	private List<FileCourseReviewDTO> fileCourseReviewList;
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
	public List<FileMemberProFileDTO> getFileWriterPriFileList() {
		return fileWriterPriFileList;
	}
	public void setFileWriterPriFileList(List<FileMemberProFileDTO> fileWriterPriFileList) {
		this.fileWriterPriFileList = fileWriterPriFileList;
	}
	public List<FileMemberProFileDTO> getFileCommentPriFileList() {
		return fileCommentPriFileList;
	}
	public void setFileCommentPriFileList(List<FileMemberProFileDTO> fileCommentPriFileList) {
		this.fileCommentPriFileList = fileCommentPriFileList;
	}
	public List<FileCourseReviewDTO> getFileCourseReviewList() {
		return fileCourseReviewList;
	}
	public void setFileCourseReviewList(List<FileCourseReviewDTO> fileCourseReviewList) {
		this.fileCourseReviewList = fileCourseReviewList;
	}
	@Override
	public String toString() {
		return "CourseReviewListDTO [memberNickname=" + memberNickname + ", profileFilePath=" + profileFilePath
				+ ", fileWriterPriFileList=" + fileWriterPriFileList + ", courseReviewLikeCount="
				+ courseReviewLikeCount + ", courseReviewCommentNumber=" + courseReviewCommentNumber
				+ ", CommentMemberNickname=" + CommentMemberNickname + ", fileCommentPriFileList="
				+ fileCommentPriFileList + ", courseReviewCreatedDate=" + courseReviewCreatedDate
				+ ", courseReviewUpdatedDate=" + courseReviewUpdatedDate + ", courseReviewContent="
				+ courseReviewContent + ", courseReviewNumber=" + courseReviewNumber + ", courseNumber=" + courseNumber
				+ ", courseReviewTitle=" + courseReviewTitle + ", memberNumber=" + memberNumber
				+ ", fileCourseReviewList=" + fileCourseReviewList + "]";
	}
	
	
}
