package com.sol.app.dto;

public class FileRoutineDTO {
	private String fileSystemName;
	private String fileOriginalName;
	private int routineNumber;
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
	public int getRoutineNumber() {
		return routineNumber;
	}
	public void setRoutineNumber(int routineNumber) {
		this.routineNumber = routineNumber;
	}
	@Override
	public String toString() {
		return "FileRoutineDTO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName
				+ ", routineNumber=" + routineNumber + "]";
	}
	
}
