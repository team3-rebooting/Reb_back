package com.sol.app.dto;

import java.util.List;

public class AdminExpertDTO {
	private int expertNumber;
	private int memberNumber;
	private String memberName;
	private String memberGender;
	private String memberPhoneNumber;
	private String memberEmail;
	private String expertFileNumber;
	private String expertLicenseInfo;
	private String expertCareer;
	private int expertFieldNumber;
	private List<FileExpertDTO> fileExpertList;
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
	public List<FileExpertDTO> getFileExpertList() {
		return fileExpertList;
	}
	public void setFileExpertList(List<FileExpertDTO> fileExpertList) {
		this.fileExpertList = fileExpertList;
	}
	@Override
	public String toString() {
		return "AdminExpertDTO [expertNumber=" + expertNumber + ", memberNumber=" + memberNumber + ", memberName="
				+ memberName + ", memberGender=" + memberGender + ", memberPhoneNumber=" + memberPhoneNumber
				+ ", memberEmail=" + memberEmail + ", expertFileNumber=" + expertFileNumber + ", expertLicenseInfo="
				+ expertLicenseInfo + ", expertCareer=" + expertCareer + ", expertFieldNumber=" + expertFieldNumber
				+ ", fileExpertList=" + fileExpertList + "]";
	}
	
	
}
