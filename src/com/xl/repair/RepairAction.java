package com.xl.repair;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import common.util.PageAction;

public class RepairAction extends PageAction{
	
	private static final long serialVersionUID = -3825331973708798235L;
	private Repair repair;
	@Autowired
	private RepairDao repairDao;
	private List<Repair> nlist;
	private int id;
	
	public String list(){		
		try {
			System.out.println("start list...repair");
			allCount = repairDao.allCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		allPages();
		nlist = repairDao.list(pageNow, maxCount);
		System.out.println("nlist========"+nlist);
		return "list";
	}
	
	public String preUpdate(){
		System.out.println("preUpdate...............");
		repair = repairDao.read(id);
		return "update";
	}
	public String update(){
		repairDao.update(repair);
		return "updateok";
	}
	
	public String delete(){
		repairDao.delete(repair, repair.getId());
		return "deleteok";
	}
	
	public String preCreate(){
		return "preCreate";
	}
	
	public String create(){
		System.out.println("people------"+repair.getRepairPeople());
		repairDao.create(repair);
		return "createok";
	}

	public List<Repair> getNlist() {
		return nlist;
	}

	public void setNlist(List<Repair> nlist) {
		this.nlist = nlist;
	}

	public Repair getRepair() {
		return repair;
	}

	public void setRepair(Repair repair) {
		this.repair = repair;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
