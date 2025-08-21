package com.sol.app.dto;


public class MemberDTO {
	
//	CREATE TABLE TBL_MEMBER (
//		    MEMBER_NUMBER NUMBER,
//		    MEMBER_ID VARCHAR2(20) NOT NULL,
//		    MEMBER_PASSWORD VARCHAR2(20) NOT NULL,
//		    ADDRESS_NUMBER NUMBER NOT NULL,
//		    MEMBER_EMAIL VARCHAR2(320),
//		    MEMBER_NAME VARCHAR2(60) NOT NULL,
//		    MEMBER_GENDER CHAR(1) NOT NULL CHECK (MEMBER_GENDER IN ('M', 'F')),
//		    MEMBER_NICKNAME VARCHAR2(24) NOT NULL,
//		    MEMBER_PHONE_NUMBER CHAR(13) NOT NULL,
//		    EXPERT_STATUS_NUMBER NUMBER DEFAULT 0 NOT NULL,
//		    MEMBER_BIRTH_DATE DATE NOT NULL,
//		    PROFILE_FILE_NUMBER NUMBER,
//		    CONSTRAINT PK_MEMBER_NUMBER PRIMARY KEY(MEMBER_NUMBER),
//		    CONSTRAINT FK_MEMBER_ADDRESS FOREIGN KEY (ZIP_CODE) 
//		        REFERENCES TBL_ADDRESS(ZIP_CODE),
//		    CONSTRAINT FK_MEMBER_PROFILE_FILE FOREIGN KEY (PROFILE_FILE_NUMBER) 
//		        REFERENCES TBL_FILE(FILE_NUMBER) ON DELETE SET null,
//		    CONSTRAINT FK_MEMBER_EXPERT_STATUS_NUMBER FOREIGN KEY (EXPERT_STATUS_NUMBER) 
//		        REFERENCES TBL_EXPERT_CERT_STATUS(EXPERT_CERT_STATUS_NUMBER),
//		    CONSTRAINT UK_MEMBER_ID UNIQUE(MEMBER_ID),
//		    CONSTRAINT UK_MEMBER_NICKNAME UNIQUE(MEMBER_NICKNAME)
//		);
	
	private int memberNumber;
	private String memberId;
	private String memberPassword;
	private int memberAddressNumber;
	private String memberEmail;
	private String memberName;
	private String memberGender;
	private String memberNickname;
	private String memberPhoneNumber;
	private String memberBirthDate;
	
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
	
	@Override
	public String toString() {
		return "MemberDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberPassword="
				+ memberPassword + ", memberAddressNumber=" + memberAddressNumber + ", memberEmail=" + memberEmail
				+ ", memberName=" + memberName + ", memberGender=" + memberGender + ", memberNickname=" + memberNickname
				+ ", memberPhoneNumber=" + memberPhoneNumber + ", memberBirthDate=" + memberBirthDate + "]";
	}
}
