package com.sol.app.dto;

import java.util.List;

public class AdminCourseReviewDTO {
	private int courseReviewNumber;
	private int courseNumber;
	private String courseReviewTitle;
	private int memberNumber;
	private String memberNickname;
	private String courseReviewCreatedDate;
	private String courseReviewUpdatedDate;
	private String courseReviewContent;
	private List<FileMemberProfileDTO> fileMemberProfileList;
	private List<FileCourseReviewDTO> fileCourseReviewList;
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
	public String getCourseReviewContent() {
		return courseReviewContent;
	}
	public void setCourseReviewContent(String courseReviewContent) {
		this.courseReviewContent = courseReviewContent;
	}
	public List<FileMemberProfileDTO> getFileMemberProfileList() {
		return fileMemberProfileList;
	}
	public void setFileMemberProfileList(List<FileMemberProfileDTO> fileMemberProfileList) {
		this.fileMemberProfileList = fileMemberProfileList;
	}
	public List<FileCourseReviewDTO> getFileCourseReviewList() {
		return fileCourseReviewList;
	}
	public void setFileCourseReviewList(List<FileCourseReviewDTO> fileCourseReviewList) {
		this.fileCourseReviewList = fileCourseReviewList;
	}
	@Override
	public String toString() {
		return "AdminCourseReviewDTO [courseReviewNumber=" + courseReviewNumber + ", courseNumber=" + courseNumber
				+ ", courseReviewTitle=" + courseReviewTitle + ", memberNumber=" + memberNumber + ", memberNickname="
				+ memberNickname + ", courseReviewCreatedDate=" + courseReviewCreatedDate + ", courseReviewUpdatedDate="
				+ courseReviewUpdatedDate + ", courseReviewContent=" + courseReviewContent + ", fileMemberProfileList="
				+ fileMemberProfileList + ", fileCourseReviewList=" + fileCourseReviewList + "]";
	}
	
}
