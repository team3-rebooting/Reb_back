package com.sol.app.dto;

import java.util.List;

public class MyExpertDTO {
	//ExpertDTO, ExpertCertStatusDTO, ExpertApplicantDTO, ExpertFileDTO, FiledDTO, FileDTO 
	private int expertNumber;
	private int memberNumber;
	private String expertLicenseInfo;
	private String expertCareer;
	private int expertFieldNumber;
	private String fieldName;
	private int expertCertStatusNumber;
	private String expertCertStatusInfo;
	private String expertApplicantReason;
	private String expertCheckDate;
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
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
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
		return "MyExpertDTO [expertNumber=" + expertNumber + ", memberNumber=" + memberNumber + ", expertLicenseInfo="
				+ expertLicenseInfo + ", expertCareer=" + expertCareer + ", expertFieldNumber=" + expertFieldNumber
				+ ", fieldName=" + fieldName + ", expertCertStatusNumber=" + expertCertStatusNumber
				+ ", expertCertStatusInfo=" + expertCertStatusInfo + ", expertApplicantReason=" + expertApplicantReason
				+ ", expertCheckDate=" + expertCheckDate + ", fileExpertList=" + fileExpertList + "]";
	}
	
}
