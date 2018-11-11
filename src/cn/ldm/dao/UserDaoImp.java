package cn.ldm.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.ldm.bean.BaseDict;
import cn.ldm.bean.LinkMan;
import cn.ldm.bean.User;

public class UserDaoImp extends BaseDaoImp<User> implements UserDao{
	
	@Test
	public void sa(){
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.eq("user_name", 2));
		getHibernateTemplate().findByCriteria(dc);
	}
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}
	
	
	
	@Override
	public List getList(final String name,final int strat,final int size) {
		// TODO Auto-generated method stub
		return (List) getHibernateTemplate().execute(new HibernateCallback<Object>() {
			@Override
			public List doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String hql = "from User where user_name = ?";
				Query query=  session.createQuery(hql);
				query.setFirstResult(strat);
				query.setMaxResults(size);
				query.setParameter(0, name);
				List<User> list = query.list();
				return list;
			}
		});
	}

	@Override
	public int getUserCount(String name) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.eq("user_name", name));
		return getTotalCount(dc);
	}

	@Override
	public Integer getLogin(DetachedCriteria dc) {
		Integer numInteger = getTotalCount(dc);
		if(numInteger == 0){
			throw new RuntimeException("用户名或者密码错误!");
		}
		// TODO Auto-generated method stub
		return numInteger;
	}

	@Override
	public List getCount() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().execute(new HibernateCallback<List>() {
			@Override
			public List doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				String sql = "SELECT b.dict_item_name, COUNT(*) FROM t_user u,base_dict b WHERE u.user_industry=b.dict_id GROUP BY u.user_industry";
				SQLQuery createSQLQuery = session.createSQLQuery(sql);
				return createSQLQuery.list();
			}
		});
	}
}
