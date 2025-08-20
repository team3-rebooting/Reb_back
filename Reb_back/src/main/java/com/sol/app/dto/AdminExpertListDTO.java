package com.sol.app.dto;

public class AdminExpertListDTO {
	private int memberNumber;
	private String memberId;
	private String memberName;
	private int expertFieldNumber;
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
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getExpertFieldNumber() {
		return expertFieldNumber;
	}
	public void setExpertFieldNumber(int expertFieldNumber) {
		this.expertFieldNumber = expertFieldNumber;
	}
	public String getExpertCheckDate() {
		return expertCheckDate;
	}
	public void setExpertCheckDate(String expertCheckDate) {
		this.expertCheckDate = expertCheckDate;
	}
	@Override
	public String toString() {
		return "AdminExpertListDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberName="
				+ memberName + ", expertFieldNumber=" + expertFieldNumber + ", expertCheckDate=" + expertCheckDate
				+ "]";
	}
	
	
	
}
