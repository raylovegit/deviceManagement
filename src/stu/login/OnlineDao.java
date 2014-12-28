package stu.login;

import org.springframework.transaction.annotation.Transactional;

import common.util.UtilDao;

public class OnlineDao extends UtilDao {
	String sql = "";

	// 将数据库的总访问记录数加一
	public void add() throws Exception {
		sql = "update visit_num set num=num+1";
		sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
	}

	// 取得当前的总访问人数
	
	@Transactional
	public Long getAll() throws Exception {
		Long count = 0L;
		sql = "select num from visit_num where id=0";
		java.math.BigInteger temp=(java.math.BigInteger)sessionFactory.getCurrentSession().createSQLQuery(sql).list().get(0);
		count=temp.longValue();
		return count;
	}

}
