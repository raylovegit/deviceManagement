package com.xl.device;

public class Device {
	private int id;
	private String deviceId;      //设备号码
	private String deviceName; //设备名称
	private String deviceState;//设备状态
	private String devicePrice;//设备价格
	private String useOfYear;  //设备使用年限
	private String stockDate;  //设备报废日期
	
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
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceState() {
		return deviceState;
	}
	public void setDeviceState(String deviceState) {
		this.deviceState = deviceState;
	}
	public String getDevicePrice() {
		return devicePrice;
	}
	public void setDevicePrice(String devicePrice) {
		this.devicePrice = devicePrice;
	}
	public String getUseOfYear() {
		return useOfYear;
	}
	public void setUseOfYear(String useOfYear) {
		this.useOfYear = useOfYear;
	}
	public String getStockDate() {
		return stockDate;
	}
	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}
	
	
}
