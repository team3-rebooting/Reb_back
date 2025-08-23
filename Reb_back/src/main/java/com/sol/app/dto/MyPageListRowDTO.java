package com.sol.app.dto;

public class MyPageListRowDTO {
	private String title;
	private String userName;
	private String date;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "MyPageListRow [title=" + title + ", userName=" + userName + ", date=" + date + "]";
	}
}
