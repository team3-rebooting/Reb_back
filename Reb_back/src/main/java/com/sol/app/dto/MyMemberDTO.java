package com.sol.app.dto;

import java.util.List;

public class MyMemberDTO {
	//MemberDTO, AddressDTO, ExpertCertStatusDTO, FileDTO,ExpertApplicantDTO
	private int memberNumber;
	private String memberId;
	private String memberPassword;
	private int addressNumber;
	private String zipCode;
	private String address;
	private String addressDetail;
	
	private String memberEmail;
	private String memberName;
	private String memberGender;
	private String memberNickname;
	private String memberPhoneNumber;
	private int expertCertStatusNumber;
	private String expertCertStatusInfo;
	private String expertApplicantReason;
	private String memberBirthDate;
	private List<FileMemberProfileDTO> fileMemberProfileList;
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
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
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
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}
	public void setMemberPhoneNumber(String memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
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
	public String getMemberBirthDate() {
		return memberBirthDate;
	}
	public void setMemberBirthDate(String memberBirthDate) {
		this.memberBirthDate = memberBirthDate;
	}
	
	
	 public List<FileMemberProfileDTO> getFileMemberProfileList() { return
	 fileMemberProfileList; } public void
	 setFileMemberProfileList(List<FileMemberProfileDTO> fileMemberProfileList) {
	 this.fileMemberProfileList = fileMemberProfileList; }
	 
	
	@Override
	public String toString() {
		return "MyMemberDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberPassword="
				+ memberPassword + ", addressNumber=" + addressNumber + ", zipCode=" + zipCode + ", address=" + address
				+ ", addressDetail=" + addressDetail + ", memberEmail=" + memberEmail + ", memberName=" + memberName
				+ ", memberGender=" + memberGender + ", memberNickname=" + memberNickname + ", memberPhoneNumber="
				+ memberPhoneNumber + ", expertCertStatusNumber=" + expertCertStatusNumber + ", expertCertStatusInfo="
				+ expertCertStatusInfo + ", expertApplicantReason=" + expertApplicantReason + ", memberBirthDate="
				+ memberBirthDate + ", fileMemberProFileList="+ fileMemberProfileList + "]";
	}
	
}
