package com.sol.app.dto;

public class SponsorDTO {
	private int sponsorNumber;
	private int memberNumber;
	private int sponsorAmount;
	private String sponsorDate;
	public int getSponsorNumber() {
		return sponsorNumber;
	}
	public void setSponsorNumber(int sponsorNumber) {
		this.sponsorNumber = sponsorNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
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
		return "SponsorDTO [sponsorNumber=" + sponsorNumber + ", memberNumber=" + memberNumber + ", sponsorAmount="
				+ sponsorAmount + ", sponsorDate=" + sponsorDate + "]";
	}
}
