package com.sol.app.dto;

public class FileTypeDTO {
	private String fileTypeNumber;
	private String fileTypeName;
	
	public String getFileTypeNumber() {
		return fileTypeNumber;
	}
	public void setFileTypeNumber(String fileTypeNumber) {
		this.fileTypeNumber = fileTypeNumber;
	}
	public String getFileTypeName() {
		return fileTypeName;
	}
	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}
	
	@Override
	public String toString() {
		return "FileTypeDTO [fileTypeNumber=" + fileTypeNumber + ", fileTypeName=" + fileTypeName + "]";
	}
}
