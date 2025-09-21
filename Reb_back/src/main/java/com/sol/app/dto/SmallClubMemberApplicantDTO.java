package com.sol.app.dto;

public class SmallClubMemberApplicantDTO {
	private int smallClubNumber;
	private int memberNumber;
	private String smallClubMemberApplyDate;
	public int getSmallClubNumber() {
		return smallClubNumber;
	}
	public void setSmallClubNumber(int smallClubNumber) {
		this.smallClubNumber = smallClubNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getSmallClubMemberApplyDate() {
		return smallClubMemberApplyDate;
	}
	public void setSmallClubMemberApplyDate(String smallClubMemberApplyDate) {
		this.smallClubMemberApplyDate = smallClubMemberApplyDate;
	}
	@Override
	public String toString() {
		return "SmallClubMemberApplicantDTO [smallClubNumber=" + smallClubNumber + ", memberNumber=" + memberNumber
				+ ", smallClubMemberApplyDate=" + smallClubMemberApplyDate + "]";
	}
	
}
