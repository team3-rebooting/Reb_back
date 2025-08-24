package com.sol.app.dto;

public class AdminMemberListDTO {
	private int memberNumber;
	private String memberId;
	private String memberNickname;
	private String address;
	private String addressDetail;
	private String memberPhoneNumber;
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}
	public void setMemberPhoneNumber(String memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}
	@Override
	public String toString() {
		return "AdminMemberListDTO [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberNickname="
				+ memberNickname + ", address=" + address + ", addressDetail=" + addressDetail + ", memberPhoneNumber="
				+ memberPhoneNumber + "]";
	}
	
	
}
