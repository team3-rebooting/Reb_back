package com.sol.app.dto;

import java.util.List;
import com.sol.app.status.CourseRecruitStatus;
import com.sol.app.status.Field;

public class CourseListDTO {
	private int courseNumber;
	private int expertNumber;
	private String expertName;
	private String courseTitle;
	private String courseContent;
	private String coursePostDate;
	private String coursePostUpdateDate;
	private String courseRecruitStartDate;
	private String courseRecruitEndDate;
	private String courseStartDate;
	private String courseEndDate;
	private String courseStartTime;
	private String courseEndTime;
	private String courseDayOfWeek;
	private int courseApplicantCount;
	private int courseRecruitCount;
	private int fieldNumber;
	private String fieldName;
	private String expertLicenseInfo;
	private String expertCareer;

	private List<FileCourseDTO> fileCourseList;

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getExpertNumber() {
		return expertNumber;
	}

	public void setExpertNumber(int expertNumber) {
		this.expertNumber = expertNumber;
	}

	public String getExpertName() {
		return expertName;
	}

	public void setExpertName(String expertName) {
		this.expertName = expertName;
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

	public int getCourseRecruitStatusNumber() {
		return CourseRecruitStatus.getCourseRecruitStatusNumber(courseRecruitStartDate, courseRecruitEndDate, courseStartDate, courseEndDate);
	}

	public String getCourseStatusInfo() {
		return CourseRecruitStatus.findCourseStatusInfo(CourseRecruitStatus.getCourseRecruitStatusNumber(courseRecruitStartDate, courseRecruitEndDate, courseStartDate, courseEndDate));
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

	public FileCourseDTO getFileCourse() {
		if (fileCourseList == null)
			return null;
		if (fileCourseList.size() == 0)
			return null;

		return fileCourseList.get(0);
	}

	public List<FileCourseDTO> getFileCourseList() {
		return fileCourseList;
	}

	public void setFileCourseList(List<FileCourseDTO> fileCourseList) {
		this.fileCourseList = fileCourseList;
	}

	public int getFieldNumber() {
		return fieldNumber;
	}

	public void setFieldNumber(int fieldNumber) {
		this.fieldNumber = fieldNumber;
		
		this.setFieldName(Field.findFieldName(fieldNumber));
	}
	
	public String getFieldName() {
		if(fieldName == null) {
			this.setFieldName(Field.findFieldName(fieldNumber));
		}
		
		return fieldName;
	}

	private void setFieldName(String fieldName) {
		this.fieldName = fieldName;
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

	@Override
	public String toString() {
		return "CourseListDTO [courseNumber=" + courseNumber + ", expertNumber=" + expertNumber + ", expertName="
				+ expertName + ", courseTitle=" + courseTitle + ", courseContent=" + courseContent
				+ ", courseRecruitStatusNumber=" + getCourseRecruitStatusNumber() + ", courseStatusInfo=" + getCourseStatusInfo()
				+ ", coursePostDate=" + coursePostDate + ", coursePostUpdateDate=" + coursePostUpdateDate
				+ ", courseRecruitStartDate=" + courseRecruitStartDate + ", courseRecruitEndDate="
				+ courseRecruitEndDate + ", courseStartDate=" + courseStartDate + ", courseEndDate=" + courseEndDate
				+ ", courseStartTime=" + courseStartTime + ", courseEndTime=" + courseEndTime + ", courseDayOfWeek="
				+ courseDayOfWeek + ", courseApplicantCount=" + courseApplicantCount + ", courseRecruitCount="
				+ courseRecruitCount + ", fieldNumber=" + fieldNumber +", fieldName=" + fieldName
				+ ", expertLicenseInfo=" + expertLicenseInfo + ", expertCareer=" + expertCareer + ", fileCourseList="
				+ fileCourseList + "]";
	}
}
