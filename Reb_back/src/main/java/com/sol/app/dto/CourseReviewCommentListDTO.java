package com.sol.app.dto;

import java.util.List;

public class CourseReviewCommentListDTO {
	//CourseReviewComment, MemberDTO, FileDTO
	private int courseReviewCommentNumber;
	private int courseReviewNumber;
	private int memberNumber;
	private String memberNickname;
	private List<FileMemberProfileDTO> fileMemberProFIleList;
	private String fileSystemName;
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
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public List<FileMemberProfileDTO> getFileMemberProFIleList() {
		return fileMemberProFIleList;
	}
	public void setFileMemberProFIleList(List<FileMemberProfileDTO> fileMemberProFIleList) {
		this.fileMemberProFIleList = fileMemberProFIleList;
	}
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
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
		return "CourseReviewCommentListDTO [courseReviewCommentNumber=" + courseReviewCommentNumber
				+ ", courseReviewNumber=" + courseReviewNumber + ", memberNumber=" + memberNumber + ", memberNickname="
				+ memberNickname + ", fileMemberProFIleList=" + fileMemberProFIleList + ", fileSystemName="
				+ fileSystemName + ", courseReviewCreatedDate=" + courseReviewCreatedDate + ", courseReviewUpdatedDate="
				+ courseReviewUpdatedDate + ", courseReviewContent=" + courseReviewContent + "]";
	}
}
