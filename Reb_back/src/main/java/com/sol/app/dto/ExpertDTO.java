package com.sol.app.dto;

public class ExpertDTO {
	private int expertNumber;
	private int memberNumber;
	private String expertLicenseInfo;
	private String expertCareer;
	private int expertFieldNumber;
	public int getExpertNumber() {
		return expertNumber;
	}
	public void setExpertNumber(int expertNumber) {
		this.expertNumber = expertNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getExpertLicenseInfo() {
		return expertLicenseInfo;
	}
	public void setExpertLicenseInfo(String expertLicenseInfo) {
		this.expertLicenseInfo = expertLicenseInfo;
	}
	public String getExpertCareer() {
		return expertCareer;
	}
	public void setExpertCareer(String expertCareer) {
		this.expertCareer = expertCareer;
	}
	public int getExpertFieldNumber() {
		return expertFieldNumber;
	}
	public void setExpertFieldNumber(int expertFieldNumber) {
		this.expertFieldNumber = expertFieldNumber;
	}
	@Override
	public String toString() {
		return "ExpertDTO [expertNumber=" + expertNumber + ", memberNumber=" + memberNumber + ", expertLicenseInfo="
				+ expertLicenseInfo + ", expertCareer=" + expertCareer + ", expertFieldNumber=" + expertFieldNumber
				+ "]";
	}
}
