package com.sol.app.status;

public enum CourseRecruitStatus {
	RECRUITING(1, "모집 중"), RECRUITBEFORE(2, "모집 전"), RECRUITEND(3, "모집 종료"), DURINGCOURSE(4, "수업 중"), COURSEEND(5, "종강");
	
	private final int courseRecruitStatusNumber;
	private final String courseStatusInfo;

	public int getCourseRecruitStatusNumber() {
		return courseRecruitStatusNumber;
	}

	public String getCourseStatusInfo() {
		return courseStatusInfo;
	}

	CourseRecruitStatus(int courseRecruitStatusNumber, String courseStatusInfo) {
		this.courseRecruitStatusNumber = courseRecruitStatusNumber;
		this.courseStatusInfo = courseStatusInfo;
	}

	public static String findCourseStatusInfo(int courseRecruitStatusNumber) {
		for (CourseRecruitStatus f : CourseRecruitStatus.values()) {
			if (f.getCourseRecruitStatusNumber() == courseRecruitStatusNumber) {
				return f.getCourseStatusInfo();
			}
		}

		return null;
	}
}
