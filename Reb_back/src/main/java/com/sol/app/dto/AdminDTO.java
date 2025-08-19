package com.sol.app.dto;

public class AdminDTO {
//	ADMIN_NUMBER NUMBER,
//    ADMIN_ID VARCHAR2(20) NOT NULL,
//    ADMIN_PASSWORD VARCHAR2(20) NOT NULL,
//    ADMIN_PROFILE_IMAGE_NUMBER NUMBER,
	
	private int adminNumber;
	private String adminId;
	private String adminPassword;
	private String adminNickname;
	public String getAdminNickname() {
		return adminNickname;
	}
	public void setAdminNickname(String adminNickname) {
		this.adminNickname = adminNickname;
	}
	private int adminProfileImageNumber;
	public int getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(int adminNumber) {
		this.adminNumber = adminNumber;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getAdminProfileImageNumber() {
		return adminProfileImageNumber;
	}
	public void setAdminProfileImageNumber(int adminProfileImageNumber) {
		this.adminProfileImageNumber = adminProfileImageNumber;
	}
	@Override
	public String toString() {
		return "AdminDTO [adminNumber=" + adminNumber + ", adminId=" + adminId + ", adminPassword=" + adminPassword
				+ ", adminProfileImageNumber=" + adminProfileImageNumber + "]";
	}
	
	
}
