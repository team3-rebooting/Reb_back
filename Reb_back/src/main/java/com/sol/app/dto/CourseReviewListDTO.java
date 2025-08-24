package com.sol.app.dto;

import java.util.List;

public class CourseReviewListDTO {
	private int courseReviewNumber;
	private int courseNumber;
	private String courseReviewTitle;
	private String memberNickname;
	private String courseReviewCreatedDate;
	private int courseReviewLike;
	private List<FileMemberProfileDTO> fileWriterPriFileList;
	private List<FileMemberProfileDTO> fileCommentPriFileList; 
	private List<FileCourseReviewDTO> fileCourseReviewList;
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
	public String getCourseReviewTitle() {
		return courseReviewTitle;
	}
	public void setCourseReviewTitle(String courseReviewTItle) {
		this.courseReviewTitle = courseReviewTItle;
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
	public int getCourseReviewLike() {
		return courseReviewLike;
	}
	public void setCourseReviewLike(int courseReviewLike) {
		this.courseReviewLike = courseReviewLike;
	}
	public List<FileMemberProfileDTO> getFileWriterPriFileList() {
		return fileWriterPriFileList;
	}
	public void setFileWriterPriFileList(List<FileMemberProfileDTO> fileWriterPriFileList) {
		this.fileWriterPriFileList = fileWriterPriFileList;
	}
	public List<FileMemberProfileDTO> getFileCommentPriFileList() {
		return fileCommentPriFileList;
	}
	public void setFileCommentPriFileList(List<FileMemberProfileDTO> fileCommentPriFileList) {
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
		return "CourseReviewListDTO [courseReviewNumber=" + courseReviewNumber + ", courseNumber=" + courseNumber
				+ ", courseReviewTItle=" + courseReviewTitle + ", memberNickname=" + memberNickname
				+ ", courseReviewCreatedDate=" + courseReviewCreatedDate + ", courseReviewLike=" + courseReviewLike
				+ ", fileWriterPriFileList=" + fileWriterPriFileList + ", fileCommentPriFileList="
				+ fileCommentPriFileList + ", fileCourseReviewList=" + fileCourseReviewList + "]";
	}
	
	
	
	
}
