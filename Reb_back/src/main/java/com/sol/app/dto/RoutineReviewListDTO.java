package com.sol.app.dto;

import java.util.ArrayList;
import java.util.List;

public class RoutineReviewListDTO {
	//RoutineReviewDTO, FileDTO, MemberDTO, RoutineReviewLikeDTO 
	private int routineReviewNumber;
	private int routineNumber;
	private String routineTitle;
	private String routineReviewTitle;
	private int memberNumber;
	private String memberNickname;
	private String routineReviewCreatedDate;
	private String routineReviewUpdatedDate;
	private String routineReviewContent;
	private List<FileRoutineReviewDTO> fileRoutineReviewList;
	private List<FileMemberProfileDTO> fileMemberProfileList;
	private int likeCount;
	private List<RoutineReviewLikeDTO> likeList = new ArrayList<>();
	public int getRoutineReviewNumber() {
		return routineReviewNumber;
	}
	public void setRoutineReviewNumber(int routineReviewNumber) {
		this.routineReviewNumber = routineReviewNumber;
	}
	public int getRoutineNumber() {
		return routineNumber;
	}
	public void setRoutineNumber(int routineNumber) {
		this.routineNumber = routineNumber;
	}
	public String getRoutineTitle() {
		return routineTitle;
	}
	public void setRoutineTitle(String routineTitle) {
		this.routineTitle = routineTitle;
	}
	public String getRoutineReviewTitle() {
		return routineReviewTitle;
	}
	public void setRoutineReviewTitle(String routineReviewTitle) {
		this.routineReviewTitle = routineReviewTitle;
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
		return routineReviewCreatedDate.split(" ")[0].replace('-', '.');
	}
	public void setRoutineReviewCreatedDate(String routineReviewCreatedDate) {
		this.routineReviewCreatedDate = routineReviewCreatedDate;
	}
	public String getRoutineReviewUpdatedDate() {
		return routineReviewUpdatedDate.split(" ")[0].replace('-', '.');
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
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public List<RoutineReviewLikeDTO> getLikeList() {
		return likeList;
	}
	public void setLikeList(List<RoutineReviewLikeDTO> likeList) {
		this.likeList = likeList;
	}
	
	public FileRoutineReviewDTO getFileRoutineReview() {
		if(fileRoutineReviewList == null)
			return null;
		if(fileRoutineReviewList.size() == 0)
			return null;
		
		return fileRoutineReviewList.get(0);
	}
	
	public List<FileRoutineReviewDTO> getFileRoutineReviewList() {
		return fileRoutineReviewList;
	}
	public void setFileRoutineReviewList(List<FileRoutineReviewDTO> fileRoutineReviewList) {
		this.fileRoutineReviewList = fileRoutineReviewList;
	}
	
	public FileMemberProfileDTO getFileMemberProfile() {
		if(fileMemberProfileList == null)
			return null;
		if(fileMemberProfileList.size() == 0)
			return null;
		
		return fileMemberProfileList.get(0);
	}
	
	public List<FileMemberProfileDTO> getFileMemberProfileList() {
		return fileMemberProfileList;
	}
	public void setFileMemberProfile(FileMemberProfileDTO fileMemberProfileList) {
		this.fileMemberProfileList = new ArrayList<>();
		this.fileMemberProfileList.add(fileMemberProfileList);
	}	
	public void setFileMemberProfileList(List<FileMemberProfileDTO> fileMemberProfileList) {
		this.fileMemberProfileList = fileMemberProfileList;
	}	
	
	public boolean isUpdated() {
		return !routineReviewUpdatedDate.equals(routineReviewCreatedDate);
	}
	
	@Override
	public String toString() {
		return "RoutineReviewListDTO [routineReviewNumber=" + routineReviewNumber + ", routineNumber=" + routineNumber
				+ ", routineTitle=" + routineTitle + ", routineReviewTitle=" + routineReviewTitle + ", memberNumber="
				+ memberNumber + ", memberNickname=" + memberNickname + ", routineReviewCreatedDate="
				+ routineReviewCreatedDate + ", routineReviewUpdatedDate=" + routineReviewUpdatedDate
				+ ", routineReviewContent=" + routineReviewContent + ", fileRoutineReviewList=" + fileRoutineReviewList
				+ ", fileMemberProfileList=" + fileMemberProfileList
				+ ", likeCount=" + likeCount + ", likeList=" + likeList + "]";
	}
}
