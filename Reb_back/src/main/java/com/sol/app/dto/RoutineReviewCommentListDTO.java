package com.sol.app.dto;

import java.util.List;

public class RoutineReviewCommentListDTO {
	//RoutineReviewComment, MemberDTO, FileDTO
	private int routineReviewCommentNumber;
	private int routineReviewNumber;
	private int memberNumber;
	private String memberNickname;
	private List<FileMemberProfileDTO> fileMemberProFileList;
	private String fileSystemName;
	private String routineReviewCreatedDate;
	private String routineReviewUpdatedDate;
	private String routineReviewContent;
	public int getRoutineReviewCommentNumber() {
		return routineReviewCommentNumber;
	}
	public void setRoutineReviewCommentNumber(int routineReviewCommentNumber) {
		this.routineReviewCommentNumber = routineReviewCommentNumber;
	}
	public int getRoutineReviewNumber() {
		return routineReviewNumber;
	}
	public void setRoutineReviewNumber(int routineReviewNumber) {
		this.routineReviewNumber = routineReviewNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getRoutineReviewCreatedDate() {
		return routineReviewCreatedDate;
	}
	public void setRoutineReviewCreatedDate(String routineReviewCreatedDate) {
		this.routineReviewCreatedDate = routineReviewCreatedDate;
	}
	public String getRoutineReviewUpdatedDate() {
		return routineReviewUpdatedDate;
	}
	public void setRoutineReviewUpdatedDate(String routineReviewUpdatedDate) {
		this.routineReviewUpdatedDate = routineReviewUpdatedDate;
	}
	public String getRoutineReviewContent() {
		return routineReviewContent;
	}
	public void setRoutineReviewContent(String routineReviewContent) {
		this.routineReviewContent = routineReviewContent;
	}
	public List<FileMemberProfileDTO> getFileMemberProFileList() {
		return fileMemberProFileList;
	}
	public void setFileMemberProFileList(List<FileMemberProfileDTO> fileMemberProFileList) {
		this.fileMemberProFileList = fileMemberProFileList;
	}
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	@Override
	public String toString() {
		return "RoutineReviewCommentListDTO [routineReviewCommentNumber=" + routineReviewCommentNumber
				+ ", routineReviewNumber=" + routineReviewNumber + ", memberNumber=" + memberNumber
				+ ", memberNickname=" + memberNickname + ", fileMemberProFileList=" + fileMemberProFileList
				+ ", routineReviewCreatedDate=" + routineReviewCreatedDate + ", routineReviewUpdatedDate="
				+ routineReviewUpdatedDate + ", routineReviewContent=" + routineReviewContent + "]" + ", fileSystemName=" + fileSystemName;
	}
	
}
