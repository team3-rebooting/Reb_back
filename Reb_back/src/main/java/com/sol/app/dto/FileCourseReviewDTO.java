package com.sol.app.dto;

public class FileCourseReviewDTO {
	private String fileSystemName;
	private String fileOriginalName;
	private int courseReviewNumber;
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	public String getFileOriginalName() {
		return fileOriginalName;
	}
	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}
	public int getCourseReviewNumber() {
		return courseReviewNumber;
	}
	public void setCourseReviewNumber(int courseReviewNumber) {
		this.courseReviewNumber = courseReviewNumber;
	}
	@Override
	public String toString() {
		return "FileCourseReviewDTO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName
				+ ", courseReviewNumber=" + courseReviewNumber + "]";
	}
	
}
