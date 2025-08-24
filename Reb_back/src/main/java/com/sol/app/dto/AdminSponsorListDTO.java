package com.sol.app.dto;

public class AdminSponsorListDTO {
	private String memberId;
	private String memberNickname;
	private int sponsorAmount;
	private String sponsorDate;
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
	public int getSponsorAmount() {
		return sponsorAmount;
	}
	public void setSponsorAmount(int sponsorAmount) {
		this.sponsorAmount = sponsorAmount;
	}
	public String getSponsorDate() {
		return sponsorDate;
	}
	public void setSponsorDate(String sponsorDate) {
		this.sponsorDate = sponsorDate;
	}
	@Override
	public String toString() {
		return "AdminSponsorListDTO [memberId=" + memberId + ", memberNickname=" + memberNickname + ", sponsorAmount="
				+ sponsorAmount + ", sponsorDate=" + sponsorDate + "]";
	}
	
}
