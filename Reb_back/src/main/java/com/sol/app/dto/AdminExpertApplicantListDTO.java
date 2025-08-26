package com.sol.app.dto;

import java.util.List;

public class AdminExpertApplicantListDTO {
	
	private String expertCertStatusInfo;
	private int memberNumber;
	private String memberId;
	private String memberNickname;
	private String address;
	private String addressDetail;
	private String memberPhoneNumber;
	private List<FileExpertDTO> fileExpertList;
	
	public String getExpertCertStatusInfo() {
		return expertCertStatusInfo;
	}
	public void setExpertCertStatusInfo(String expertCertStatusInfo) {
		this.expertCertStatusInfo = expertCertStatusInfo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
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
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	@Override
	public String toString() {
		return "AdminExpertApplicantListDTO [expertCertStatusInfo=" + expertCertStatusInfo + ", memberNumber="
				+ memberNumber + ", memberId=" + memberId + ", memberNickname=" + memberNickname + ", address="
				+ address + ", addressDetail=" + addressDetail + ", memberPhoneNumber=" + memberPhoneNumber
				+ ", fileExpertList=" + fileExpertList + "]";
	}
	
	
	

	
	
}
