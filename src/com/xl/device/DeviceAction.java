package com.xl.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import common.util.PageAction;

public class DeviceAction extends PageAction{
	
	private static final long serialVersionUID = -3750335546312321974L;
	private Device device;
	@Autowired
	private DeviceDao deviceDao;
	private List<Device> nlist;
	private Long[] ids;
	private int id;
	
	public String list(){		
		try {
//			System.out.println(deviceDao);
			allCount = deviceDao.allCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		allPages();
		nlist = deviceDao.list(pageNow, maxCount);
		System.out.println("nlist========"+nlist);
		return "list";
	}
	
	public String preUpdate(){
		System.out.println("preUpdate...............");
		device = deviceDao.read(id);
		return "update";
	}
	public String update(){
		deviceDao.update(device);
		return "updateok";
	}
	
	public String delete(){
		deviceDao.delete(device, device.getId());
		return "deleteok";
	}
	
	public String preCreate(){
		return "preCreate";
	}
	
	public String create(){
		deviceDao.create(device);
		return "createok";
	}
	
	public List<Device> getNlist() {
		return nlist;
	}

	public void setNlist(List<Device> nlist) {
		this.nlist = nlist;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
