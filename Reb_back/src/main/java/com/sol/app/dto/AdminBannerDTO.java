package com.sol.app.dto;


public class AdminBannerDTO {
	//bannerDTO, FileBannerDTO
	private int bannerNumber;
	private String bannerTitle;
	private int bannerOrderNumber;
	private String fileSystemName;
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
	public int getBannerOrderNumber() {
		return bannerOrderNumber;
	}
	public void setBannerOrderNumber(int bannerOrderNumber) {
		this.bannerOrderNumber = bannerOrderNumber;
	}
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	@Override
	public String toString() {
		return "AdminBannerDTO [bannerNumber=" + bannerNumber + ", bannerTitle=" + bannerTitle + ", bannerOrderNumber="
				+ bannerOrderNumber + ", fileSystemName=" + fileSystemName + "]";
	}
	
	
	
}
