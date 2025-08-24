package com.sol.app.dto;

import java.util.List;

public class AdminCourseRequestDTO {
	//전문가 수업 요청 정보
	private int prevCourseNumber;
	private int courseOpenStatusNumber;
	private int courseRequestTypeNumber;
	private String courseRegisterDate;
	private String courseRequestDate;
	private String courseResultDate;
	private String courseRejectReason;
	private int courseNumber;
	private String courseTitle;
	private String courseContent;
	private int expertNumber;
	private String memberName;
	private String expertLicenseInfo;
	private String expertCareer;
	private String fieldName;
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
	private int courseCount;
	private int courseRecruitCount;
	private int coursePrice;
	
	public int getPrevCourseNumber() {
		return prevCourseNumber;
	}
	public void setPrevCourseNumber(int prevCourseNumber) {
		this.prevCourseNumber = prevCourseNumber;
	}
	public int getCourseOpenStatusNumber() {
		return courseOpenStatusNumber;
	}
	public void setCourseOpenStatusNumber(int courseOpenStatusNumber) {
		this.courseOpenStatusNumber = courseOpenStatusNumber;
	}
	public int getCourseRequestTypeNumber() {
		return courseRequestTypeNumber;
	}
	public void setCourseRequestTypeNumber(int courseRequestTypeNumber) {
		this.courseRequestTypeNumber = courseRequestTypeNumber;
	}
	public String getCourseRegisterDate() {
		return courseRegisterDate;
	}
	public void setCourseRegisterDate(String courseRegisterDate) {
		this.courseRegisterDate = courseRegisterDate;
	}
	public String getCourseRequestDate() {
		return courseRequestDate;
	}
	public void setCourseRequestDate(String courseRequestDate) {
		this.courseRequestDate = courseRequestDate;
	}
	public String getCourseResultDate() {
		return courseResultDate;
	}
	public void setCourseResultDate(String courseResultDate) {
		this.courseResultDate = courseResultDate;
	}
	public String getCourseRejectReason() {
		return courseRejectReason;
	}
	public void setCourseRejectReason(String courseRejectReason) {
		this.courseRejectReason = courseRejectReason;
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
	public List<FileCourseDTO> getFileCourseList() {
		return fileCourseList;
	}
	public void setFileCourseList(List<FileCourseDTO> fileCourseList) {
		this.fileCourseList = fileCourseList;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getExpertLicenseInfo() {
		return expertLicenseInfo;
	}
	public void setExpertLicenseInfo(String expertLicenseInfo) {
		this.expertLicenseInfo = expertLicenseInfo;
	}
	public String getExpertCareer() {
		return expertCareer;
	}
	public void setExpertCareer(String expertCareer) {
		this.expertCareer = expertCareer;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public int getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
	@Override
	public String toString() {
		return "AdminCourseRequestDTO [prevCourseNumber=" + prevCourseNumber + ", courseOpenStatusNumber="
				+ courseOpenStatusNumber + ", courseRequestTypeNumber=" + courseRequestTypeNumber
				+ ", courseRegisterDate=" + courseRegisterDate + ", courseRequestDate=" + courseRequestDate
				+ ", courseResultDate=" + courseResultDate + ", courseRejectReason=" + courseRejectReason
				+ ", courseNumber=" + courseNumber + ", courseTitle=" + courseTitle + ", courseContent=" + courseContent
				+ ", expertNumber=" + expertNumber + ", memberName=" + memberName + ", expertLicenseInfo="
				+ expertLicenseInfo + ", expertCareer=" + expertCareer + ", fieldName=" + fieldName
				+ ", courseRecruitStatusNumber=" + courseRecruitStatusNumber + ", fileCourseList=" + fileCourseList
				+ ", coursePostDate=" + coursePostDate + ", coursePostUpdateDate=" + coursePostUpdateDate
				+ ", courseRecruitStartDate=" + courseRecruitStartDate + ", courseRecruitEndDate="
				+ courseRecruitEndDate + ", courseStartDate=" + courseStartDate + ", courseEndDate=" + courseEndDate
				+ ", courseStartTime=" + courseStartTime + ", courseEndTime=" + courseEndTime + ", courseDayOfWeek="
				+ courseDayOfWeek + ", courseCount=" + courseCount + ", courseRecruitCount=" + courseRecruitCount
				+ ", coursePrice=" + coursePrice + "]";
	}
	
	
	

	
	
}
