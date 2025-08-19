package com.sol.app.dto;

public class AdminExpertApplicantDTO {
	private int expertApplicantNumber;
	private int memberNumber;
	private String expertCheckDate;
	private int expertCertStatusNumber;
	private String memberName;
	private String memberGender;
	private String memberPhoneNumber;
	private String memberEmail;
	private String expertFileNumber;
	private String expertLicenseInfo;
	private String expertCareer;
	private int expertFieldNumber;
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
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}
	public void setMemberPhoneNumber(String memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getExpertFileNumber() {
		return expertFileNumber;
	}
	public void setExpertFileNumber(String expertFileNumber) {
		this.expertFileNumber = expertFileNumber;
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
		return "AdminExpertApplicantDTO [expertApplicantNumber=" + expertApplicantNumber + ", memberNumber="
				+ memberNumber + ", expertCheckDate=" + expertCheckDate + ", expertCertStatusNumber="
				+ expertCertStatusNumber + ", memberName=" + memberName + ", memberGender=" + memberGender
				+ ", memberPhoneNumber=" + memberPhoneNumber + ", memberEmail=" + memberEmail + ", expertFileNumber="
				+ expertFileNumber + ", expertLicenseInfo=" + expertLicenseInfo + ", expertCareer=" + expertCareer
				+ ", expertFieldNumber=" + expertFieldNumber + "]";
	}
	
}
