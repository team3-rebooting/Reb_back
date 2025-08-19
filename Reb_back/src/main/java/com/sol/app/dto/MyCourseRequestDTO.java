package com.sol.app.dto;

public class MyCourseRequestDTO {
	//CourseRequestDTO, CourseDTO, ExpertDTO, CourseMemberApplicantDTO, CourseRequestTypeDTO, CourseOpenStatusDTO, FiledDTO
	private int memberNumber;
	private int courseNumber;
	private int prevCourseNumber;
	private int courseOpenStatusNumber;
	private String courseStatusInfo;
	private int courseRequestTypeNumber;
	private String courseRequestType;
	private String courseRegisterDate;
	private String courseRequestDate;
	private String courseResultDate;
	private String courseRejectReason;
	private String courseTitle;
	private int expertNumber;
	private int expertFiledNumber;
	private String fieldName;
	private int courseRecruitStatusNumber;
	private String coursePostDate;
	private String coursePostUpdateDate;
	private int courseApplicantCount;
	private int courseRecruitCount;
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
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
	public String getCourseStatusInfo() {
		return courseStatusInfo;
	}
	public void setCourseStatusInfo(String courseStatusInfo) {
		this.courseStatusInfo = courseStatusInfo;
	}
	public int getCourseRequestTypeNumber() {
		return courseRequestTypeNumber;
	}
	public void setCourseRequestTypeNumber(int courseRequestTypeNumber) {
		this.courseRequestTypeNumber = courseRequestTypeNumber;
	}
	public String getCourseRequestType() {
		return courseRequestType;
	}
	public void setCourseRequestType(String courseRequestType) {
		this.courseRequestType = courseRequestType;
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
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getExpertNumber() {
		return expertNumber;
	}
	public void setExpertNumber(int expertNumber) {
		this.expertNumber = expertNumber;
	}
	public int getExpertFiledNumber() {
		return expertFiledNumber;
	}
	public void setExpertFiledNumber(int expertFiledNumber) {
		this.expertFiledNumber = expertFiledNumber;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
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
	public int getCourseApplicantCount() {
		return courseApplicantCount;
	}
	public void setCourseApplicantCount(int courseApplicantCount) {
		this.courseApplicantCount = courseApplicantCount;
	}
	public int getCourseRecruitCount() {
		return courseRecruitCount;
	}
	public void setCourseRecruitCount(int courseRecruitCount) {
		this.courseRecruitCount = courseRecruitCount;
	}
	
	@Override
	public String toString() {
		return "MyCourseRequestDTO [memberNumber=" + memberNumber + ", courseNumber=" + courseNumber
				+ ", prevCourseNumber=" + prevCourseNumber + ", courseOpenStatusNumber=" + courseOpenStatusNumber
				+ ", courseStatusInfo=" + courseStatusInfo + ", courseRequestTypeNumber=" + courseRequestTypeNumber
				+ ", courseRequestType=" + courseRequestType + ", courseRegisterDate=" + courseRegisterDate
				+ ", courseRequestDate=" + courseRequestDate + ", courseResultDate=" + courseResultDate
				+ ", courseRejectReason=" + courseRejectReason + ", courseTitle=" + courseTitle + ", expertNumber="
				+ expertNumber + ", expertFiledNumber=" + expertFiledNumber + ", fieldName=" + fieldName
				+ ", courseRecruitStatusNumber=" + courseRecruitStatusNumber + ", coursePostDate=" + coursePostDate
				+ ", coursePostUpdateDate=" + coursePostUpdateDate + ", courseApplicantCount=" + courseApplicantCount
				+ ", courseRecruitCount=" + courseRecruitCount + "]";
	}
}
