package com.sol.app.status;

public enum CourseRequestType {

	OPEN(1, "개설"), UPDATE(2,"수정"), DELETE(3, "삭제");

	private final int courseRequestTypeNumber;
	private final String courseRequestType;
	
	public int getCourseRequestTypeNumber() {
		return courseRequestTypeNumber;
	}
	public String getCourseRequestType() {
		return courseRequestType;
	}
	
	CourseRequestType(int courseRequestTypeNumber, String courseRequestType) {
		this.courseRequestTypeNumber = courseRequestTypeNumber;
		this.courseRequestType = courseRequestType;
	}
	
	public static String findCourseRequestType(int courseRequestTypeNumber) {
		for (CourseRequestType c : CourseRequestType.values()) {
			if (c.getCourseRequestTypeNumber() == courseRequestTypeNumber) {
				return c.getCourseRequestType();
			}
		}
		
		return "오류";
	}
}
