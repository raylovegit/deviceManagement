package com.xl.repair;

import java.util.List;


import common.util.UtilDao;

public class RepairDao extends UtilDao<Repair>{
	public long allCount(){
		String hql="select count(*) from Repair";
		long allCount=(Long)sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
		System.out.println("allCount========="+allCount);
		return allCount;
	}
	
	public List<Repair> list(int pageNow,int maxCount){
		String hql="from Repair d order by d.id desc";
		query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult((pageNow-1)*maxCount);
		query.setMaxResults(maxCount);		
		return query.list();
	}
}
