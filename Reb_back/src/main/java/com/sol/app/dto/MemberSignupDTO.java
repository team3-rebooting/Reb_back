package com.sol.app.dto;

public class MemberSignupDTO {
//	CREATE TABLE TBL_MEMBER (
//		    MEMBER_NUMBER NUMBER,
//		    MEMBER_ID VARCHAR2(20) NOT NULL,
//		    MEMBER_PASSWORD VARCHAR2(20) NOT NULL,
//		    MEMBER_ADDRESS_NUMBER NUMBER NOT NULL,
//		    MEMBER_EMAIL VARCHAR2(320),
//		    MEMBER_NAME VARCHAR2(60) NOT NULL,
//		    MEMBER_GENDER CHAR(1) NOT NULL CHECK (MEMBER_GENDER IN ('M', 'F')),
//		    MEMBER_NICKNAME VARCHAR2(24) NOT NULL,
//		    MEMBER_PHONE_NUMBER CHAR(13) NOT NULL,
//		    MEMBER_BIRTH_DATE DATE NOT NULL,
//		    CONSTRAINT PK_MEMBER_NUMBER PRIMARY KEY(MEMBER_NUMBER),
//		    CONSTRAINT FK_MEMBER_ADDRESS_NUMBER FOREIGN KEY (MEMBER_ADDRESS_NUMBER) 
//		        REFERENCES TBL_ADDRESS(ADDRESS_NUMBER),
//		    CONSTRAINT UK_MEMBER_ID UNIQUE(MEMBER_ID),
//		    CONSTRAINT UK_MEMBER_NICKNAME UNIQUE(MEMBER_NICKNAME)
//		);
	
//	CREATE TABLE TBL_ADDRESS (
//		   	ADDRESS_NUMBER NUMBER,
//		    ZIP_CODE CHAR(5) NOT NULL,
//		    ADDRESS VARCHAR2(110) NOT NULL,
//		    ADDRESS_DETAIL VARCHAR2(60),
//		    CONSTRAINT PK_ADDRESS_NUMBER PRIMARY KEY(ADDRESS_NUMBER)
//		);
	
	int memberNumber;
	String memberId;
	String memberPassword;
	int memberAddressNumber;
	String memberEmail;
	String memberName;
	String memberGender;
	String memberNickname;
	String memberPhoneNumber;
	String memberBirthDate;
	String zipCode;
	String address;
	String addressDetail;
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
	public int getMemberAddressNumber() {
		return memberAddressNumber;
	}
	public void setMemberAddressNumber(int memberAddressNumber) {
		this.memberAddressNumber = memberAddressNumber;
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
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	@Override
	public String toString() {
		return "MemberSignupDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberPassword="
				+ memberPassword + ", memberAddressNumber=" + memberAddressNumber + ", memberEmail=" + memberEmail
				+ ", memberName=" + memberName + ", memberGender=" + memberGender + ", memberNickname=" + memberNickname
				+ ", memberPhoneNumber=" + memberPhoneNumber + ", memberBirthDate=" + memberBirthDate + ", zipCode="
				+ zipCode + ", address=" + address + ", addressDetail=" + addressDetail + "]";
	}
	
	
}
