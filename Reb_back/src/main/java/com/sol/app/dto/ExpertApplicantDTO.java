package com.sol.app.dto;

public class ExpertApplicantDTO {
	private int memberNumber;
	private String expertApplicantReason;
	private String expertCheckDate;
	private int expertCertStatusNumber;
	
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getExpertApplicantReason() {
		return expertApplicantReason;
	}
	public void setExpertApplicantReason(String expertApplicantReason) {
		this.expertApplicantReason = expertApplicantReason;
	}
	public String getExpertCheckDate() {
		return expertCheckDate;
	}
	public void setExpertCheckDate(String expertCheckDate) {
		this.expertCheckDate = expertCheckDate;
	}
	public int getExpertCertStatusNumber() {
		return expertCertStatusNumber;
	}
	public void setExpertCertStatusNumber(int expertCertStatusNumber) {
		this.expertCertStatusNumber = expertCertStatusNumber;
	}
	
	@Override
	public String toString() {
		return "ExpertApplicantDTO [memberNumber=" + memberNumber + ", expertApplicantReason=" + expertApplicantReason
				+ ", expertCheckDate=" + expertCheckDate + ", expertCertStatusNumber=" + expertCertStatusNumber + "]";
	}
}
