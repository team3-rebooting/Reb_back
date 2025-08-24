package com.sol.app.dto;

public class AdminExpertListDTO {
	private int expertNumber;
	private int memberNumber;
	private String memberId;
	private String memberNickname;
	private String fieldName;
	private String expertCheckDate;
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

	public String getExpertCheckDate() {
		return expertCheckDate;
	}
	public void setExpertCheckDate(String expertCheckDate) {
		this.expertCheckDate = expertCheckDate;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public int getExpertNumber() {
		return expertNumber;
	}
	public void setExpertNumber(int expertNumber) {
		this.expertNumber = expertNumber;
	}
	@Override
	public String toString() {
		return "AdminExpertListDTO [expertNumber=" + expertNumber + ", memberNumber=" + memberNumber + ", memberId="
				+ memberId + ", memberNickname=" + memberNickname + ", fieldName=" + fieldName + ", expertCheckDate="
				+ expertCheckDate + "]";
	}
	
	
	
	
	
}
