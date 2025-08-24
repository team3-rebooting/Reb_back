package com.sol.app.dto;

public class MemberSignupDTO {
	
	int memberNumber;
	String memberId;
	String memberPassword;
	int addressNumber;
	String memberEmail;
	String memberName;
	String memberGender;
	String memberNickname;
	String memberPhoneNumber;
	String memberBirthDate;
	String zipCode;
	String address;
	String addressAdd;
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
	public String getMemberBirthDate() {
		return memberBirthDate;
	}
	public void setMemberBirthDate(String memberBirthDate) {
		this.memberBirthDate = memberBirthDate;
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
	public String getAddressAdd() {
		return addressAdd;
	}
	public void setAddressAdd(String addressAdd) {
		this.addressAdd = addressAdd;
	}
	@Override
	public String toString() {
		return "MemberSignupDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberPassword="
				+ memberPassword + ", addressNumber=" + addressNumber + ", memberEmail=" + memberEmail + ", memberName="
				+ memberName + ", memberGender=" + memberGender + ", memberNickname=" + memberNickname
				+ ", memberPhoneNumber=" + memberPhoneNumber + ", memberBirthDate=" + memberBirthDate + ", zipCode="
				+ zipCode + ", address=" + address + ", addressAdd=" + addressAdd + "]";
	}
	
	
	
	
}
