package com.sol.app.dto;

import java.util.List;

public class CourseReviewListDTO {
	private int courseReviewNumber;
	private int courseNumber;
	private String courseTitle;
	private String courseReviewTitle;
	private String courseReviewContent;
	private int memberNumber;
	private String memberNickname;
	private String courseReviewCreatedDate;
	private String courseReviewUpdatedDate;
	private int courseReviewLike;
	private FileMemberProfileDTO fileWriterProFileList;
	private List<FileMemberProfileDTO> fileCommentProFileList;
	private List<FileCourseReviewDTO> fileCourseReviewList;
	private int likeCount;
	/*
	 * //작성자 프로필 사진 private String profileFilePath; private
	 * List<FileMemberProfileDTO> fileWriterPriFileList; private int
	 * courseReviewLikeCount; private int courseReviewCommentNumber; private int
	 * CommentMemberNickname; //댓글 프로필 사진 private List<FileMemberProfileDTO>
	 * fileCommentPriFileList; private String courseReviewCreatedDate; private
	 * String courseReviewUpdatedDate; private String courseReviewContent; private
	 * int courseReviewNumber; private int courseNumber; private String
	 * courseReviewTitle; private int memberNumber; //수업 후기 사진 private
	 * List<FileCourseReviewDTO> fileCourseReviewList;
	 */
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
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseReviewTitle() {
		return courseReviewTitle;
	}
	public void setCourseReviewTitle(String courseReviewTitle) {
		this.courseReviewTitle = courseReviewTitle;
	}
	public String getCourseReviewContent() {
		return courseReviewContent;
	}
	public void setCourseReviewContent(String courseReviewContent) {
		this.courseReviewContent = courseReviewContent;
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
	public int getCourseReviewLike() {
		return courseReviewLike;
	}
	public void setCourseReviewLike(int courseReviewLike) {
		this.courseReviewLike = courseReviewLike;
	}
	public FileMemberProfileDTO getFileWriterProFileList() {
		return fileWriterProFileList;
	}
	public void setFileWriterProFileList(FileMemberProfileDTO fileWriterProFileList) {
		this.fileWriterProFileList = fileWriterProFileList;
	}
	public List<FileMemberProfileDTO> getFileCommentProFileList() {
		return fileCommentProFileList;
	}
	public void setFileCommentProFileList(List<FileMemberProfileDTO> fileCommentProFileList) {
		this.fileCommentProFileList = fileCommentProFileList;
	}
	public List<FileCourseReviewDTO> getFileCourseReviewList() {
		return fileCourseReviewList;
	}
	public void setFileCourseReviewList(List<FileCourseReviewDTO> fileCourseReviewList) {
		this.fileCourseReviewList = fileCourseReviewList;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	@Override
	public String toString() {
		return "CourseReviewListDTO [courseReviewNumber=" + courseReviewNumber + ", courseNumber=" + courseNumber
				+ ", courseTitle=" + courseTitle + ", courseReviewTitle=" + courseReviewTitle + ", courseReviewContent="
				+ courseReviewContent + ", memberNumber=" + memberNumber + ", memberNickname=" + memberNickname
				+ ", courseReviewCreatedDate=" + courseReviewCreatedDate + ", courseReviewUpdatedDate="
				+ courseReviewUpdatedDate + ", courseReviewLike=" + courseReviewLike + ", fileWriterProFileList="
				+ fileWriterProFileList + ", fileCommentProFileList=" + fileCommentProFileList
				+ ", fileCourseReviewList=" + fileCourseReviewList + "]" + ", likeCount=" + likeCount;
	}	
}
