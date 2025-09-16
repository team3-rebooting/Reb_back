package com.sol.app.dto;

public class CourseReviewLikeDTO {
	private int courseReviewNumber;
	private int memberNumber;
	
	public int getCourseReviewNumber() {
		return courseReviewNumber;
	}
	public void setCourseReviewNumber(int courseReviewNumber) {
		this.courseReviewNumber = courseReviewNumber;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	@Override
	public String toString() {
		return "CourseReviewLikeDTO [courseReviewNumber=" + courseReviewNumber + ", memberNumber=" + memberNumber + "]";
	}
}
