package com.sol.app.status;

public enum CourseOpenStatus {

	APPLICATION(1, "신청"), APPROVAL(2,"승인"), COMPANION(3, "반려");
	
	private final int courseRecruitStatusNumber;
	private final String courseStatusInfo;
	
	public int getCourseRecruitStatusNumber() {
		return courseRecruitStatusNumber;
	}
	public String getCourseStatusInfo() {
		return courseStatusInfo;
	}
	
	CourseOpenStatus(int courseRecruitStatusNumber, String courseStatusInfo) {
		this.courseRecruitStatusNumber = courseRecruitStatusNumber;
		this.courseStatusInfo = courseStatusInfo;
	}
	
	public static String findCourseStatusInfo(int courseRecruitStatusNumber) {
		for (CourseOpenStatus c : CourseOpenStatus.values()) {
			if (c.getCourseRecruitStatusNumber() == courseRecruitStatusNumber) {
				return c.getCourseStatusInfo();
			}
		}
		
		return "오류";
	}
}
