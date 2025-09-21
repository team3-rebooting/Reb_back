package com.sol.app.dto;

public class CourseDeletedDTO {
	private int courseNumber;
	private String courseTitle;
	private int ExpertNumber;
	private String courseDeletedDate;
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
	public int getExpertNumber() {
		return ExpertNumber;
	}
	public void setExpertNumber(int expertNumber) {
		ExpertNumber = expertNumber;
	}
	public String getCourseDeletedDate() {
		return courseDeletedDate;
	}
	public void setCourseDeletedDate(String courseDeletedDate) {
		this.courseDeletedDate = courseDeletedDate;
	}
	@Override
	public String toString() {
		return "CourseDeletedDTO [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle + ", ExpertNumber="
				+ ExpertNumber + ", courseDeletedDate=" + courseDeletedDate + "]";
	}
	
	
}
