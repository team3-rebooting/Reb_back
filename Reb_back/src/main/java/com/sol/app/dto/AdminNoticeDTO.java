package com.sol.app.dto;

import java.util.List;

public class AdminNoticeDTO {
	private int noticeNumber;
	private String noticeTitle;
	private int adminNumber;
	private String adminNickname;
	private List<FileNoticeDTO> fileNoticeList; 
	private String noticeCreatedDate;
	private String noticeUpdatedDate;
	private String noticeContent;
	private List<FileAdminDTO> fileAdminList;
	
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
	public String getAdminNickname() {
		return adminNickname;
	}
	public void setAdminNickname(String adminNickname) {
		this.adminNickname = adminNickname;
	}
	public List<FileNoticeDTO> getFileNoticeList() {
		return fileNoticeList;
	}
	public void setFileNoticeList(List<FileNoticeDTO> fileNoticeList) {
		this.fileNoticeList = fileNoticeList;
	}
	
	public List<FileAdminDTO> getFileAdminList() {
		return fileAdminList;
	}
	public void setFileAdminList(List<FileAdminDTO> fileAdminList) {
		this.fileAdminList = fileAdminList;
	}
	@Override
	public String toString() {
		return "AdminNoticeDTO [noticeNumber=" + noticeNumber + ", noticeTitle=" + noticeTitle + ", adminNumber="
				+ adminNumber + ", adminNickname=" + adminNickname + ", noticeCreatedDate=" + noticeCreatedDate
				+ ", noticeUpdatedDate=" + noticeUpdatedDate + ", noticeContent=" + noticeContent + ", fileAdminList="
				+ fileAdminList + ", fileNoticeList=" + fileNoticeList + "]";
	}
	
	
}
