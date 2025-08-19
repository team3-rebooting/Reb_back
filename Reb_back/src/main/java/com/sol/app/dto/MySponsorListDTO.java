package com.sol.app.dto;
import java.util.ArrayList;
import java.util.List;

public class MySponsorListDTO {
	private int memberNumber;
	private int totalAmount;
	private int totalCount;
	private List<SponsorDTO> sponsorDTOList = new ArrayList<>();
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<SponsorDTO> getSponsorDTOList() {
		return sponsorDTOList;
	}
	public void setSponsorDTOList(List<SponsorDTO> sponsorDTOList) {
		this.sponsorDTOList = sponsorDTOList;
	}
	
	@Override
	public String toString() {
		return "MySponsorListDTO [memberNumber=" + memberNumber + ", totalAmount=" + totalAmount + ", totalCount="
				+ totalCount + ", sponsorDTOList=" + sponsorDTOList + "]";
	}
}
