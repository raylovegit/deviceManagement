package com.xl.device;

import java.util.List;

import common.util.UtilDao;

public class DeviceDao extends UtilDao<Device>{

	public long allCount(){
		String hql="select count(*) from Device";
		long allCount=(Long)sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
		System.out.println("allCount========="+allCount);
		return allCount;
	}
	
	public List<Device> list(int pageNow,int maxCount){
		String hql="from Device d order by d.id desc";
		query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult((pageNow-1)*maxCount);
		query.setMaxResults(maxCount);		
		return query.list();
	}
	
}
