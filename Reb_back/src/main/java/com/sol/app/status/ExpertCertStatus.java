package com.sol.app.status;

public enum ExpertCertStatus {
	
	CONFIRMING(1, "확인 중"), APPROVED(2,"승인 완료"), COMPANION(3, "반려"), APPROVECANCEL(4,"승인 취소");
	
	private final int expertStatusNumber;
	private final String expertCertStatusInfo;
	
	public int getExpertStatusNumber() {
		return expertStatusNumber;
	}
	public String getExpertCertStatusInfo() {
		return expertCertStatusInfo;
	}
	
	ExpertCertStatus(int expertStatusNumber, String expertCertStatusInfo) {
		this.expertStatusNumber = expertStatusNumber;
		this.expertCertStatusInfo = expertCertStatusInfo;
	}
	
	public static String findExpertCertStatus(int expertStatusNumber) {
		for (ExpertCertStatus e : ExpertCertStatus.values()) {
			if (e.getExpertStatusNumber() == expertStatusNumber) {
				return e.getExpertCertStatusInfo();
			}
		}
		
		return "-";
	}
}
