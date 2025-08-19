package com.sol.app.dto;

public class ExpertFileDTO {
	private int memberNumber;
	private int expertFileNumber;
	
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public int getExpertFileNumber() {
		return expertFileNumber;
	}
	public void setExpertFileNumber(int expertFileNumber) {
		this.expertFileNumber = expertFileNumber;
	}
	
	@Override
	public String toString() {
		return "ExpertFileDTO [memberNumber=" + memberNumber + ", expertFileNumber=" + expertFileNumber + "]";
	}
}
