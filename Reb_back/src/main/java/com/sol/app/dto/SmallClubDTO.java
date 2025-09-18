package com.sol.app.dto;

public class SmallClubDTO {
	private int smallClubNuber;
	private String smallClubTitle;
	private int memberNumber;
	private String smallClubCreatedDate;
	private String smallClubUpdatedDate;
	private String smallClubContent;
	public int getSmallClubNuber() {
		return smallClubNuber;
	}
	public void setSmallClubNuber(int smallClubNuber) {
		this.smallClubNuber = smallClubNuber;
	}
	public String getSmallClubTitle() {
		return smallClubTitle;
	}
	public void setSmallClubTitle(String smallClubTitle) {
		this.smallClubTitle = smallClubTitle;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getSmallClubCreatedDate() {
		return smallClubCreatedDate;
	}
	public void setSmallClubCreatedDate(String smallClubCreatedDate) {
		this.smallClubCreatedDate = smallClubCreatedDate;
	}
	public String getSmallClubUpdatedDate() {
		return smallClubUpdatedDate;
	}
	public void setSmallClubUpdatedDate(String smallClubUpdatedDate) {
		this.smallClubUpdatedDate = smallClubUpdatedDate;
	}
	public String getSmallClubContent() {
		return smallClubContent;
	}
	public void setSmallClubContent(String smallClubContent) {
		this.smallClubContent = smallClubContent;
	}
	@Override
	public String toString() {
		return "SmallClubDTO [smallClubNuber=" + smallClubNuber + ", smallClubTitle=" + smallClubTitle
				+ ", memberNumber=" + memberNumber + ", smallClubCreatedDate=" + smallClubCreatedDate
				+ ", smallClubUpdatedDate=" + smallClubUpdatedDate + ", smallClubContent=" + smallClubContent + "]";
	}
	
	
}
