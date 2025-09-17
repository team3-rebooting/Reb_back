package com.sol.app.dto;

public class FileSmallClubDTO {
	private String fileSystemName;
	private String fileOriginalName;
	private int smallClubNumber;
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	public String getFileOriginalName() {
		return fileOriginalName;
	}
	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}
	public int getSmallClubNumber() {
		return smallClubNumber;
	}
	public void setSmallClubNumber(int smallClubNumber) {
		this.smallClubNumber = smallClubNumber;
	}
	@Override
	public String toString() {
		return "FileSmallClubDTO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName
				+ ", smallClubNumber=" + smallClubNumber + "]";
	}
	
}
