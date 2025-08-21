package com.sol.app.dto;

public class NoticeListDTO {

//    NOTICE_NUMBER NUMBER,
//    NOTICE_TITLE VARCHAR2(90) NOT NULL,
//    ADMIN_NUMBER NUMBER NOT NULL,
//    NOTICE_CREATED_DATE DATE DEFAULT SYSDATE NOT NULL,
//    NOTICE_UPDATED_DATE DATE,
//    NOTICE_CONTENT VARCHAR2(3000) NOT NULL,
//    NOTICE_FILE_NUMBER NUMBER,

	private int noticeNumber; // 공지사항 번호
	private String noticeTitle; // 공지사항 제목
	private String noticeCreatedDate; // 공지사항 작성날짜
	private int	adminNumber; // 관리자 번호
	private String adminNickname; // 관리자닉네임
	
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
	public String getNoticeCreatedDate() {
		return noticeCreatedDate;
	}
	public void setNoticeCreatedDate(String noticeCreatedDate) {
		this.noticeCreatedDate = noticeCreatedDate;
	}
	public int getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(int adminNumber) {
		this.adminNumber = adminNumber;
	}
	public String getAdminNickname() {
		return adminNickname;
	}
	public void setAdminNickname(String adminNickname) {
		this.adminNickname = adminNickname;
	}
	@Override
	public String toString() {
		return "NoticeListDTO [noticeNumber=" + noticeNumber + ", noticeTitle=" + noticeTitle + ", noticeCreatedDate="
				+ noticeCreatedDate + ", adminNumber=" + adminNumber + ", adminNickname=" + adminNickname + "]";
	}



}
