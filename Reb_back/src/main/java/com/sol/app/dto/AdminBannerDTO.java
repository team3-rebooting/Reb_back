package com.sol.app.dto;

import java.util.List;

public class AdminBannerDTO {
	//bannerDTO, FileBannerDTO
	private int bannerNumber;
	private String bannerTitle;
	private int bannerOrderNumber;
	private List<FileBannerDTO> fileBannerList;
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
	public List<FileBannerDTO> getFileBannerList() {
		return fileBannerList;
	}
	public void setFileBannerList(List<FileBannerDTO> fileBannerList) {
		this.fileBannerList = fileBannerList;
	}
	@Override
	public String toString() {
		return "AdminBannerDTO [bannerNumber=" + bannerNumber + ", bannerTitle=" + bannerTitle + ", bannerOrderNumber="
				+ bannerOrderNumber + ", fileBannerList=" + fileBannerList + "]";
	}
	
	
}
