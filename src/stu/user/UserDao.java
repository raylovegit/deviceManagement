package stu.user;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import common.util.UtilDao;

public class UserDao extends UtilDao<User>{
	
	@Transactional(readOnly=true)
	public User login(User user){
		User temp=null;
		String hql="from User user where user.userName=? and user.userPassword=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, user.getUserName());
		query.setString(1, user.getUserPassword());
		List<User> list=query.list();
		if(list!=null&&list.size()>0){
			temp=list.get(0);
		}
		return temp;
	}
}
