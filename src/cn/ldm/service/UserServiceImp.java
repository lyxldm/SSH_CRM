package cn.ldm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.ldm.bean.User;
import cn.ldm.dao.UserDao;
public class UserServiceImp implements UserService{
	private UserDao userdao;
	@Override
	public void login(User user) {
		
	}
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userdao.saveUser(user);;
	}

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public List getList(String name,int strat,int size) {
		// TODO Auto-generated method stub
		return userdao.getList(name,strat,size);
	}

	@Override
	public int getUserCount(String name) {
		// TODO Auto-generated method stub
		return userdao.getUserCount(name);
	}

	@Override
	public Integer getLogin(DetachedCriteria dc) {
		return userdao.getLogin(dc);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getCount() {
		// TODO Auto-generated method stub
		return userdao.getCount();
	}

}
