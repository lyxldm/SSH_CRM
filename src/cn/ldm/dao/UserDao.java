package cn.ldm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.ldm.bean.User;

public interface UserDao {
	public void saveUser(User user);

	public List getList(String name,int strat,int size);

	public int getUserCount(String name);

	public Integer getLogin(DetachedCriteria dc);

	public List getCount();
}
