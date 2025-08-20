package com.sol.app.dto;

public class MainDTO {

	private int bannerNumber; // 배너 번호
	private int courseReviewNumber; // 수업 후기 넘버
	private String courseReviewTitle; // 수업 후기 제목
	private String memberName; // 회원 이름
	private String courseReviewCreatedDate; // 수업 후기 작성날짜
	private int courseReviewImageNumber; // 수업 후기 이미지 번호
	private int routineReviewNumber; // 루틴 후기 넘버
	private String routineReviewTitle; // 루틴 후기 제목
	private String routineReviewCreatedDate; // 루틴 후기 작성날짜
	private int routineReviewImageNumber; // 루틴 후기 이미지 번호
	
	public int getBannerNumber() {
		return bannerNumber;
	}
	public void setBannerNumber(int bannerNumber) {
		this.bannerNumber = bannerNumber;
	}
	public int getCourseReviewNumber() {
		return courseReviewNumber;
	}
	public void setCourseReviewNumber(int courseReviewNumber) {
		this.courseReviewNumber = courseReviewNumber;
	}
	public String getCourseReviewTitle() {
		return courseReviewTitle;
	}
	public void setCourseReviewTitle(String courseReviewTitle) {
		this.courseReviewTitle = courseReviewTitle;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getCourseReviewCreatedDate() {
		return courseReviewCreatedDate;
	}
	public void setCourseReviewCreatedDate(String courseReviewCreatedDate) {
		this.courseReviewCreatedDate = courseReviewCreatedDate;
	}
	public int getCourseReviewImageNumber() {
		return courseReviewImageNumber;
	}
	public void setCourseReviewImageNumber(int courseReviewImageNumber) {
		this.courseReviewImageNumber = courseReviewImageNumber;
	}
	public int getRoutineReviewNumber() {
		return routineReviewNumber;
	}
	public void setRoutineReviewNumber(int routineReviewNumber) {
		this.routineReviewNumber = routineReviewNumber;
	}
	public String getRoutineReviewTitle() {
		return routineReviewTitle;
	}
	public void setRoutineReviewTitle(String routineReviewTitle) {
		this.routineReviewTitle = routineReviewTitle;
	}
	public String getRoutineReviewCreatedDate() {
		return routineReviewCreatedDate;
	}
	public void setRoutineReviewCreatedDate(String routineReviewCreatedDate) {
		this.routineReviewCreatedDate = routineReviewCreatedDate;
	}
	public int getRoutineReviewImageNumber() {
		return routineReviewImageNumber;
	}
	public void setRoutineReviewImageNumber(int routineReviewImageNumber) {
		this.routineReviewImageNumber = routineReviewImageNumber;
	}
	@Override
	public String toString() {
		return "MainDTO [bannerNumber=" + bannerNumber + ", courseReviewNumber=" + courseReviewNumber
				+ ", courseReviewTitle=" + courseReviewTitle + ", memberName=" + memberName
				+ ", courseReviewCreatedDate=" + courseReviewCreatedDate + ", courseReviewImageNumber="
				+ courseReviewImageNumber + ", routineReviewNumber=" + routineReviewNumber + ", routineReviewTitle="
				+ routineReviewTitle + ", routineReviewCreatedDate=" + routineReviewCreatedDate
				+ ", routineReviewImageNumber=" + routineReviewImageNumber + "]";
	}
	
	
	
}
