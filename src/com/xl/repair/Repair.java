package com.xl.repair;

public class Repair {
	private int id;
	private String deviceId;//设备编号
	private String repairPeople;//维修人
	private String repairDate;//维修日期
	private String repairPrice;//维修费用
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getRepairPeople() {
		return repairPeople;
	}
	public void setRepairPeople(String repairPeople) {
		this.repairPeople = repairPeople;
	}
	public String getRepairDate() {
		return repairDate;
	}
	public void setRepairDate(String repairDate) {
		this.repairDate = repairDate;
	}
	public String getRepairPrice() {
		return repairPrice;
	}
	public void setRepairPrice(String repairPrice) {
		this.repairPrice = repairPrice;
	}
	
	
}
