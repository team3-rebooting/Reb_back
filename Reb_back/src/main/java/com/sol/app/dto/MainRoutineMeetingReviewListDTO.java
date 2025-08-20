package com.sol.app.dto;

import java.util.List;

public class MainRoutineMeetingReviewListDTO {
	
	//루틴 모임 후기글 목록
	private int routineReviewNumber; // 루틴 후기 넘버
	private String routineReviewTitle; // 루틴 후기 제목
	private String memberName; // 회원 이름
	private String routineReviewCreatedDate; // 루틴 후기 작성날짜
	private List<FileRoutineReviewDTO> fileRoutineReviewList;// 루틴 후기 이미지 번호
	
	
	public int getRoutineReviewNumber() {
		return routineReviewNumber;
	}
	public void setRoutineReviewNumber(int routineReviewNumber) {
		this.routineReviewNumber = routineReviewNumber;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getRoutineReviewCreatedDate() {
		return routineReviewCreatedDate;
	}
	public void setRoutineReviewCreatedDate(String routineReviewCreatedDate) {
		this.routineReviewCreatedDate = routineReviewCreatedDate;
	}
	public String getRoutineReviewTitle() {
		return routineReviewTitle;
	}
	public void setRoutineReviewTitle(String routineReviewTitle) {
		this.routineReviewTitle = routineReviewTitle;
	}
	public List<FileRoutineReviewDTO> getFileRoutineReviewList() {
		return fileRoutineReviewList;
	}
	public void setFileRoutineReviewList(List<FileRoutineReviewDTO> fileRoutineReviewList) {
		this.fileRoutineReviewList = fileRoutineReviewList;
	}
	@Override
	public String toString() {
		return "MainRoutineMeetingReviewListDTO [routineReviewNumber=" + routineReviewNumber + ", routineReviewTitle="
				+ routineReviewTitle + ", memberName=" + memberName + ", routineReviewCreatedDate="
				+ routineReviewCreatedDate + ", fileRoutineReviewList=" + fileRoutineReviewList + "]";
	}
	

	
}
