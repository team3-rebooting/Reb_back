package com.sol.app.dto;

import java.util.List;

public class AdminCourseListDTO {
	private int courseNumber;
	private String courseTitle;
	private String courseContent;
	private int expertNumber;
	private int courseRecruitStatusNumber;
	private List<FileCourseDTO> fileCourseList;
	private String coursePostDate;
	private String coursePostUpdateDate;
	private String courseRecruitStartDate;
	private String courseRecruitEndDate;
	private String courseStartDate;
	private String courseEndDate;
	private String courseStartTime;
	private String courseEndTime;
	private String courseDayOfWeek;
	private int courseRecruitCount;
	private int coursePrice;
	private String memberName;
	private int memberNumber;
	private String memberId;
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
	public String getCourseContent() {
		return courseContent;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	public int getExpertNumber() {
		return expertNumber;
	}
	public void setExpertNumber(int expertNumber) {
		this.expertNumber = expertNumber;
	}
	public int getCourseRecruitStatusNumber() {
		return courseRecruitStatusNumber;
	}
	public void setCourseRecruitStatusNumber(int courseRecruitStatusNumber) {
		this.courseRecruitStatusNumber = courseRecruitStatusNumber;
	}
	public String getCoursePostDate() {
		return coursePostDate;
	}
	public void setCoursePostDate(String coursePostDate) {
		this.coursePostDate = coursePostDate;
	}
	public String getCoursePostUpdateDate() {
		return coursePostUpdateDate;
	}
	public void setCoursePostUpdateDate(String coursePostUpdateDate) {
		this.coursePostUpdateDate = coursePostUpdateDate;
	}
	public String getCourseRecruitStartDate() {
		return courseRecruitStartDate;
	}
	public void setCourseRecruitStartDate(String courseRecruitStartDate) {
		this.courseRecruitStartDate = courseRecruitStartDate;
	}
	public String getCourseRecruitEndDate() {
		return courseRecruitEndDate;
	}
	public void setCourseRecruitEndDate(String courseRecruitEndDate) {
		this.courseRecruitEndDate = courseRecruitEndDate;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public String getCourseEndDate() {
		return courseEndDate;
	}
	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}
	public String getCourseStartTime() {
		return courseStartTime;
	}
	public void setCourseStartTime(String courseStartTime) {
		this.courseStartTime = courseStartTime;
	}
	public String getCourseEndTime() {
		return courseEndTime;
	}
	public void setCourseEndTime(String courseEndTime) {
		this.courseEndTime = courseEndTime;
	}
	public String getCourseDayOfWeek() {
		return courseDayOfWeek;
	}
	public void setCourseDayOfWeek(String courseDayOfWeek) {
		this.courseDayOfWeek = courseDayOfWeek;
	}
	public int getCourseRecruitCount() {
		return courseRecruitCount;
	}
	public void setCourseRecruitCount(int courseRecruitCount) {
		this.courseRecruitCount = courseRecruitCount;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public List<FileCourseDTO> getFileCourseList() {
		return fileCourseList;
	}
	public void setFileCourseList(List<FileCourseDTO> fileCourseList) {
		this.fileCourseList = fileCourseList;
	}
	@Override
	public String toString() {
		return "AdminCourseListDTO [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle + ", courseContent="
				+ courseContent + ", expertNumber=" + expertNumber + ", courseRecruitStatusNumber="
				+ courseRecruitStatusNumber + ", fileCourseList=" + fileCourseList + ", coursePostDate="
				+ coursePostDate + ", coursePostUpdateDate=" + coursePostUpdateDate + ", courseRecruitStartDate="
				+ courseRecruitStartDate + ", courseRecruitEndDate=" + courseRecruitEndDate + ", courseStartDate="
				+ courseStartDate + ", courseEndDate=" + courseEndDate + ", courseStartTime=" + courseStartTime
				+ ", courseEndTime=" + courseEndTime + ", courseDayOfWeek=" + courseDayOfWeek + ", courseRecruitCount="
				+ courseRecruitCount + ", coursePrice=" + coursePrice + ", memberName=" + memberName + ", memberNumber="
				+ memberNumber + ", memberId=" + memberId + "]";
	}
	

	

	
}
