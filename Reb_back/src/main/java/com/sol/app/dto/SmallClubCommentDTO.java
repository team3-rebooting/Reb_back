package com.sol.app.dto;

public class SmallClubCommentDTO {
	/*
	 * SMALL_CLUB_COMMENT_NUMBER NUMBER, 
	 * SMALL_CLUB_NUMBER NUMBER NOT NULL,
	 * MEMBER_NUMBER NUMBER NOT NULL, 
	 * SMALL_CLUB_CREATED_DATE DATE DEFAULT SYSDATE NOT NULL, 
	 * SMALL_CLUB_UPDATED_DATE DATE, 
	 * SMALL_CLUB_CONTENT VARCHAR2(300) NOT NULL,
	 */
	
	private int smallClubCommentNumber;
	private int smallClubNumber;
	private int memberNumber;
	private String smallClubCreatedDate;
	private String smallClubUpdatedDate;
	private String smallClubContent;
	public int getSmallClubCommentNumber() {
		return smallClubCommentNumber;
	}
	public void setSmallClubCommentNumber(int smallClubCommentNumber) {
		this.smallClubCommentNumber = smallClubCommentNumber;
	}
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
		return "SmallClubCommentDTO [smallClubCommentNumber=" + smallClubCommentNumber + ", smallClubNumber="
				+ smallClubNumber + ", memberNumber=" + memberNumber + ", smallClubCreatedDate=" + smallClubCreatedDate
				+ ", smallClubUpdatedDate=" + smallClubUpdatedDate + ", smallClubContent=" + smallClubContent + "]";
	}
}
