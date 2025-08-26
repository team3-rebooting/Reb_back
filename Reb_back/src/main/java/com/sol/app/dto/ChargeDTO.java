package com.sol.app.dto;

public class ChargeDTO {
	private int ChargeNo;
	private String ChargeTid;
	private String ChargeName;
	private int ChargeTotal;
	private int ChargeRemain;
	private String memberId;
	private String ChargeTime;
	public int getChargeNo() {
		return ChargeNo;
	}
	public void setChargeNo(int chargeNo) {
		ChargeNo = chargeNo;
	}
	public String getChargeTid() {
		return ChargeTid;
	}
	public void setChargeTid(String chargeTid) {
		ChargeTid = chargeTid;
	}
	public String getChargeName() {
		return ChargeName;
	}
	public void setChargeName(String chargeName) {
		ChargeName = chargeName;
	}
	public int getChargeTotal() {
		return ChargeTotal;
	}
	public void setChargeTotal(int chargeTotal) {
		ChargeTotal = chargeTotal;
	}
	public int getChargeRemain() {
		return ChargeRemain;
	}
	public void setChargeRemain(int chargeRemain) {
		ChargeRemain = chargeRemain;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getChargeTime() {
		return ChargeTime;
	}
	public void setChargeTime(String chargeTime) {
		ChargeTime = chargeTime;
	}
	@Override
	public String toString() {
		return "ChargeDTO [ChargeNo=" + ChargeNo + ", ChargeTid=" + ChargeTid + ", ChargeName=" + ChargeName
				+ ", ChargeTotal=" + ChargeTotal + ", ChargeRemain=" + ChargeRemain + ", memberId=" + memberId
				+ ", ChargeTime=" + ChargeTime + "]";
	}
	
}
