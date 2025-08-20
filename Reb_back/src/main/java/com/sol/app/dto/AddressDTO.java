package com.sol.app.dto;

public class AddressDTO {
	private int addressNumber;
	private String zipCode;
	private String adress;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	
	@Override
	public String toString() {
		return "AddressDTO [addressNumber=" + addressNumber + ", zipCode=" + zipCode + ", adress=" + adress
				+ ", addressDetail=" + addressDetail + "]";
	}
}
