package com.sol.app.dto;

import java.util.List;

public class AdminExpertListDTO {
	private int expertApplicantNumber;
	private int memberNumber;
	private String memberId;
	private String memberName;
	private List<FileExpertDTO> fileExpertList;
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
	public List<FileExpertDTO> getFileExpertList() {
		return fileExpertList;
	}
	public void setFileExpertList(List<FileExpertDTO> fileExpertList) {
		this.fileExpertList = fileExpertList;
	}
	@Override
	public String toString() {
		return "AdminExpertListDTO [expertApplicantNumber=" + expertApplicantNumber + ", memberNumber=" + memberNumber
				+ ", memberId=" + memberId + ", memberName=" + memberName + ", fileExpertList=" + fileExpertList
				+ ", expertApplicantReason=" + expertApplicantReason + ", expertCheckDate=" + expertCheckDate + "]";
	}
	
	
}
