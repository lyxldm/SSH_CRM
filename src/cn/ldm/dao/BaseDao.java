package cn.ldm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T>{
	void save(T t);
	
	void delete(T t);
	
	void delete(Integer id);
	
	void update(T t);
	
	T getByid(Integer id); 
	
	Integer getTotalCount(DetachedCriteria dc);
	
	List<T> getPageList(DetachedCriteria dc);
	
	List<T> getPageList(DetachedCriteria dc,int start, int size);
	
}
