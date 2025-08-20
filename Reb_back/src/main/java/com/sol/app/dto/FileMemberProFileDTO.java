package com.sol.app.dto;

public class FileMemberProFileDTO {
	private String fileSystemName;
	private String fileOriginalName;
	private int memberNumber;
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
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	@Override
	public String toString() {
		return "FileMemberProFileDTO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName
				+ ", memberNumber=" + memberNumber + "]";
	}
}
