package com.sol.app.dto;

import com.sol.app.status.Field;

public class AdminExpertListDTO {
	private int expertNumber;
	private int memberNumber;
	private String memberId;
	private String memberNickname;
	private int expertFieldNumber;
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

	public int getExpertFieldNumber() {
		return expertFieldNumber;
	}

	public void setExpertFieldNumber(int expertFieldNumber) {
		this.expertFieldNumber = expertFieldNumber;
		
		this.setFieldName(Field.findFieldName(expertFieldNumber));
	}

	public String getFieldName() {
		if(fieldName == null) {
			this.setFieldName(Field.findFieldName(expertFieldNumber));
		}
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
				+ memberId + ", memberNickname=" + memberNickname + ", expertFieldNumber=" + expertFieldNumber
				+ ", fieldName=" + fieldName + ", expertCheckDate=" + expertCheckDate + "]";
	}

	

}
