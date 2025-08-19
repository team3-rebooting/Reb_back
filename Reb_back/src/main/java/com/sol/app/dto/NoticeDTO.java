package com.sol.app.dto;

public class NoticeDTO {
	private int noticeNumber;
	private String noticeTitle;
	private int adminNumber;
	private String noticeCreatedDate;
	private String noticeUpdatedDate;
	private String noticeContent;
	private int noticeFileNumber;
	public int getNoticeNumber() {
		return noticeNumber;
	}
	public void setNoticeNumber(int noticeNumber) {
		this.noticeNumber = noticeNumber;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public int getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(int adminNumber) {
		this.adminNumber = adminNumber;
	}
	public String getNoticeCreatedDate() {
		return noticeCreatedDate;
	}
	public void setNoticeCreatedDate(String noticeCreatedDate) {
		this.noticeCreatedDate = noticeCreatedDate;
	}
	public String getNoticeUpdatedDate() {
		return noticeUpdatedDate;
	}
	public void setNoticeUpdatedDate(String noticeUpdatedDate) {
		this.noticeUpdatedDate = noticeUpdatedDate;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public int getNoticeFileNumber() {
		return noticeFileNumber;
	}
	public void setNoticeFileNumber(int noticeFileNumber) {
		this.noticeFileNumber = noticeFileNumber;
	}
	@Override
	public String toString() {
		return "NoticeDTO [noticeNumber=" + noticeNumber + ", noticeTitle=" + noticeTitle + ", adminNumber="
				+ adminNumber + ", noticeCreatedDate=" + noticeCreatedDate + ", noticeUpdatedDate=" + noticeUpdatedDate
				+ ", noticeContent=" + noticeContent + ", noticeFileNumber=" + noticeFileNumber + "]";
	}
	
}
