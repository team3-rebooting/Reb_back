package com.sol.app.dto;

public class AdminExpertLIistDTO {
	private int expertApplicantNumber;
	private int memberNumber;
	private String memberId;
	private String memberName;
	private int expertFiledNumber;
	private String expertApplicantReason;
	private String expertCheckDate;
	public int getExpertApplicantNumber() {
		return expertApplicantNumber;
	}
	public void setExpertApplicantNumber(int expertApplicantNumber) {
		this.expertApplicantNumber = expertApplicantNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getExpertFiledNumber() {
		return expertFiledNumber;
	}
	public void setExpertFiledNumber(int expertFiledNumber) {
		this.expertFiledNumber = expertFiledNumber;
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
	@Override
	public String toString() {
		return "AdminExpertLIistDTO [expertApplicantNumber=" + expertApplicantNumber + ", memberNumber=" + memberNumber
				+ ", memberId=" + memberId + ", memberName=" + memberName + ", expertFiledNumber=" + expertFiledNumber
				+ ", expertApplicantReason=" + expertApplicantReason + ", expertCheckDate=" + expertCheckDate + "]";
	}
	
}
