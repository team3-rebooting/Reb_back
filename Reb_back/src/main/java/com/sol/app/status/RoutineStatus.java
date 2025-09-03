package com.sol.app.status;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public enum RoutineStatus {
	RECRUITING(1, "모집중"), RECRUITBEFORE(2, "모집전"), RECRUITEND(3, "모집 종료"), MEETING(4, "모임중"), MEETINGEND(5, "모임 종료");

	private final int routineStatusNumber;
	private final String routineStatusInfo;

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

	public static int getRoutineStatusNumber(String strRecruitStartDate, String strRecruitEndDate, String strStartDate,
			String strEndDate) {
		Date now = new Date();

		Date recruitStartDate = parseStrToDate(strRecruitStartDate);
		Date recruitEndDate = parseStrToDate(strRecruitEndDate);

		Date startDate = parseStrToDate(strStartDate);
		Date endDate = parseStrToDate(strEndDate);

		if (now.compareTo(recruitStartDate) >= 0) {
			System.out.println("now가 더 큼");
		}

	}

	public int getRoutineStatusNumber() {
		return routineStatusNumber;
	}

	public String getRoutineStatusInfo() {
		return routineStatusInfo;
	}

	RoutineStatus(int routineStatusNumber, String routineStatusInfo) {
		this.routineStatusNumber = routineStatusNumber;
		this.routineStatusInfo = routineStatusInfo;
	}

	public static String findRoutineStatusInfo(int routineStatusNumber) {
		for (RoutineStatus r : RoutineStatus.values()) {
			if (r.getRoutineStatusNumber() == routineStatusNumber) {
				return r.getRoutineStatusInfo();
			}
		}

		return "오류";
	}

}
