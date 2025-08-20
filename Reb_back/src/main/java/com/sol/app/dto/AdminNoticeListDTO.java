package com.sol.app.dto;

import java.util.List;

public class AdminNoticeListDTO {
	private int noticeNumber;
	private String noticeTitle;
	private int adminNumber;
	private String adminNickname;
	private String noticeCreatedDate;
	private String noticeUpdatedDate;
	
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
	public String getAdminNickname() {
		return adminNickname;
	}
	public void setAdminNickname(String adminNickname) {
		this.adminNickname = adminNickname;
	}
	@Override
	public String toString() {
		return "AdminNoticeListDTO [noticeNumber=" + noticeNumber + ", noticeTitle=" + noticeTitle + ", adminNumber="
				+ adminNumber + ", adminNickname=" + adminNickname + ", noticeCreatedDate=" + noticeCreatedDate
				+ ", noticeUpdatedDate=" + noticeUpdatedDate + "]";
	}
	
}
