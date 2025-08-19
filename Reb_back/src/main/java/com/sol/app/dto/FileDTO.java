package com.sol.app.dto;

public class FileDTO {
	private int fileNumber;
	private String filePath;
	private String originalName;
	private String fileRegDate;
	private int fileTypeNumber;
	private int fileSize;
	public int getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(int fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getFileRegDate() {
		return fileRegDate;
	}
	public void setFileRegDate(String fileRegDate) {
		this.fileRegDate = fileRegDate;
	}
	public int getFileTypeNumber() {
		return fileTypeNumber;
	}
	public void setFileTypeNumber(int fileTypeNumber) {
		this.fileTypeNumber = fileTypeNumber;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	
	@Override
	public String toString() {
		return "FileDTO [fileNumber=" + fileNumber + ", filePath=" + filePath + ", originalName=" + originalName
				+ ", fileRegDate=" + fileRegDate + ", fileTypeNumber=" + fileTypeNumber + ", fileSize=" + fileSize
				+ "]";
	}
}
