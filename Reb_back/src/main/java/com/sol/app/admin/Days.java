package com.sol.app.admin;

public enum Days {
	MONDAY("mon", "월"), TUESDAY("tue", "화"), WEDNESDAY("wed", "수"),
	THURSDAY("thu", "목"), FRIDAY("fri", "금"), SATURDAY("sat", "토"),
	SUNDAY("sun", "일");
	
	private final String day;
	private final String korean;
	
	public String getDay() {
		return day;
	}
	public String getKorean() {
		return korean;
	}
	
	Days(String day, String korean) {
		this.day = day;
		this.korean = korean;
	}
	//날짜를 영어로 받아 한국어로 반환하는 메소드
	public static String findKorean(String day) {
		for (Days d : Days.values()) {
			if (d.getDay().equals(day)) {
				return d.getKorean();
			}
		}
		return "없음"; // 없으면 없음 출력
	}
	//날짜를 한국어로 받아 영어로 반환
	public static String findEnglish(String korean) {
		for (Days d : Days.values()) {
			if (d.getKorean().equals(korean)) {
				return d.getDay();
			}
		}
		return "없음"; // 없으면 없음 출력
	}
	
}
