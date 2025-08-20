package com.sol.app.dto;

public class AddressDTO {
	private int addressNumber;
	private String zipCode;
	private String address;
	private String addressDetail;
	
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	
	@Override
	public String toString() {
		return "AddressDTO [addressNumber=" + addressNumber + ", zipCode=" + zipCode + ", address=" + address
				+ ", addressDetail=" + addressDetail + "]";
	}
}
