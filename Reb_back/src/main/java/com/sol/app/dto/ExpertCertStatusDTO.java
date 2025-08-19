package com.sol.app.dto;

public class ExpertCertStatusDTO {
	private int expertCertStatusNumber;
	private String expertCertStatusInfo;
	
	public int getExpertCertStatusNumber() {
		return expertCertStatusNumber;
	}
	public void setExpertCertStatusNumber(int expertCertStatusNumber) {
		this.expertCertStatusNumber = expertCertStatusNumber;
	}
	public String getExpertCertStatusInfo() {
		return expertCertStatusInfo;
	}
	public void setExpertCertStatusInfo(String expertCertStatusInfo) {
		this.expertCertStatusInfo = expertCertStatusInfo;
	}
	
	@Override
	public String toString() {
		return "ExpertCertStatusDTO [expertCertStatusNumber=" + expertCertStatusNumber + ", expertCertStatusInfo="
				+ expertCertStatusInfo + "]";
	}
}
