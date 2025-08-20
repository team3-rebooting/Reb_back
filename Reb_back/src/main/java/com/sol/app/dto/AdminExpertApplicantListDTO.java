package com.sol.app.dto;

import java.util.List;

public class AdminExpertApplicantListDTO {
	private int expertApplicantNumber;
	private int memberNumber;
	private String memberId;
	private int addressNumber;
	private String memberPhoneNumber;
	private int expertCertStatusNumber;
	private String expertCheckDate;
	private List<FileExpertDTO> fileExpertList;
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
	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}
	public void setMemberPhoneNumber(String memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}
	public List<FileExpertDTO> getFileExpertList() {
		return fileExpertList;
	}
	public void setFileExpertList(List<FileExpertDTO> fileExpertList) {
		this.fileExpertList = fileExpertList;
	}
	@Override
	public String toString() {
		return "AdminExpertApplicantListDTO [expertApplicantNumber=" + expertApplicantNumber + ", memberNumber="
				+ memberNumber + ", memberId=" + memberId + ", addressNumber=" + addressNumber + ", memberPhoneNumber="
				+ memberPhoneNumber + ", expertCertStatusNumber=" + expertCertStatusNumber + ", expertCheckDate="
				+ expertCheckDate + ", fileExpertList=" + fileExpertList + "]";
	}
	

	
	
}
