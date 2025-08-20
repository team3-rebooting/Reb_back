package com.sol.app.dto;

public class MainCourseReviewListDTO {
	//수업 후기글 목록
	private int courseReviewNumber; // 수업 후기 넘버
	private String courseReviewTitle; // 수업 후기 제목
	private String memberName; // 회원 이름
	private String courseReviewCreatedDate; // 수업 후기 작성날짜
	private int courseReviewImageNumber; // 수업 후기 이미지 번호.
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
	
	@Override
	public String toString() {
		return "MainCourseListDTO [courseReviewNumber=" + courseReviewNumber + ", courseReviewTitle="
				+ courseReviewTitle + ", memberName=" + memberName + ", courseReviewCreatedDate="
				+ courseReviewCreatedDate + ", courseReviewImageNumber=" + courseReviewImageNumber + "]";
	}
	
	
	
	
}
