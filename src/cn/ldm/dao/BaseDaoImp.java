package cn.ldm.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class BaseDaoImp<T> extends HibernateDaoSupport implements BaseDao<T>{
	private Class clazz;
		// TODO Auto-generated constructor stub
		public BaseDaoImp() {
			// TODO Auto-generated constructor stub
			ParameterizedType pType =(ParameterizedType) getClass().getGenericSuperclass();
			clazz = (Class) pType.getActualTypeArguments()[0];	
		}
	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		T t = getByid(id);
		getHibernateTemplate().delete(t);
		
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(t);	
	}

	@Override
	public T getByid(Integer id) {
		// TODO Auto-generated method stub
		return (T) getHibernateTemplate().get(clazz, id);
	}

	@Override
	public Integer getTotalCount(DetachedCriteria dc) {
		// TODO Auto-generated method stub
		List<T> list = (List<T>) getHibernateTemplate().findByCriteria(dc);
		
		return list.size();
	}

	@Override
	public List<T> getPageList(DetachedCriteria dc) {
		// TODO Auto-generated method stub
		System.out.println(dc);
		return (List<T>) getHibernateTemplate().findByCriteria(dc);
	}
	@Override
	public List<T> getPageList(DetachedCriteria dc, int start, int size) {
		// TODO Auto-generated method stub
		return (List<T>) getHibernateTemplate().findByCriteria(dc, start, size);
	}

}
