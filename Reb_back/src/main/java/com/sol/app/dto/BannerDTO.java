package com.sol.app.dto;

public class BannerDTO {
	private int bannerNumber;
	private String bannerTitle;
	private int bannerImageNumber;
	private int bannerOrderNumber;
	public int getBannerNumber() {
		return bannerNumber;
	}
	public void setBannerNumber(int bannerNumber) {
		this.bannerNumber = bannerNumber;
	}
	public String getBannerTitle() {
		return bannerTitle;
	}
	public void setBannerTitle(String bannerTitle) {
		this.bannerTitle = bannerTitle;
	}
	public int getBannerImageNumber() {
		return bannerImageNumber;
	}
	public void setBannerImageNumber(int bannerImageNumber) {
		this.bannerImageNumber = bannerImageNumber;
	}
	public int getBannerOrderNumber() {
		return bannerOrderNumber;
	}
	public void setBannerOrderNumber(int bannerOrderNumber) {
		this.bannerOrderNumber = bannerOrderNumber;
	}
	@Override
	public String toString() {
		return "BannerDTO [bannerNumber=" + bannerNumber + ", bannerTitle=" + bannerTitle + ", bannerImageNumber="
				+ bannerImageNumber + ", bannerOrderNumber=" + bannerOrderNumber + "]";
	}
	
}
