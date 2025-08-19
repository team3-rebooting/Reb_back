package com.sol.app.dto;

public class MyExpertDTO {
	//ExpertDTO, ExpertCertStatusDTO, ExpertApplicantDTO, ExpertFileDTO, FiledDTO, FileDTO 
	private int expertNumber;
	private int memberNumber;
	private String expertLicenseInfo;
	private String expertCareer;
	private int expertFiledNumber;
	private String fieldName;
	private int expertCertStatusNumber;
	private String expertCertStatusInfo;
	private String expertApplicantReason;
	private String expertCheckDate;
	private int expertFileNumber;
	private String filePath;
	private String fileRegDate;
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
	public int getExpertFiledNumber() {
		return expertFiledNumber;
	}
	public void setExpertFiledNumber(int expertFiledNumber) {
		this.expertFiledNumber = expertFiledNumber;
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
	public int getExpertFileNumber() {
		return expertFileNumber;
	}
	public void setExpertFileNumber(int expertFileNumber) {
		this.expertFileNumber = expertFileNumber;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileRegDate() {
		return fileRegDate;
	}
	public void setFileRegDate(String fileRegDate) {
		this.fileRegDate = fileRegDate;
	}
	
	@Override
	public String toString() {
		return "MyExpertDTO [expertNumber=" + expertNumber + ", memberNumber=" + memberNumber + ", expertLicenseInfo="
				+ expertLicenseInfo + ", expertCareer=" + expertCareer + ", expertFiledNumber=" + expertFiledNumber
				+ ", fieldName=" + fieldName + ", expertCertStatusNumber=" + expertCertStatusNumber
				+ ", expertCertStatusInfo=" + expertCertStatusInfo + ", expertApplicantReason=" + expertApplicantReason
				+ ", expertCheckDate=" + expertCheckDate + ", expertFileNumber=" + expertFileNumber + ", filePath="
				+ filePath + ", fileRegDate=" + fileRegDate + "]";
	}
}
