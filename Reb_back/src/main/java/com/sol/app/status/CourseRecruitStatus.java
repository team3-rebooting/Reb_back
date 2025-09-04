package com.sol.app.status;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	public static Date parseStrToDate(String strDate) {
		strDate = strDate.replace('.', '-');

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date strToDate = null;
		try {
			strToDate = formatter.parse(strDate);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

		return strToDate;
	}
	
	public static int getCourseRecruitStatusNumber(String strRecruitStartDate, String strRecruitEndDate, String strStartDate, String strEndDate) {
		Date now = new Date();

		Date recruitStartDate = parseStrToDate(strRecruitStartDate);
		Date recruitEndDate = parseStrToDate(strRecruitEndDate);

		Date startDate = parseStrToDate(strStartDate);
		Date endDate = parseStrToDate(strEndDate);

		if (now.compareTo(recruitStartDate) < 0) {
			return 2;
		}
		if(now.compareTo(recruitEndDate) < 0) {
			return 1;
		}
		if(now.compareTo(startDate) < 0) {
			return 3;
		}
		if(now.compareTo(endDate) > 0) {
			return 5;
		}
		
		return 4;
	}

}
