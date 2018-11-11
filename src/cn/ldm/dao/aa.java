package cn.ldm.dao;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.ldm.bean.User;

public class aa extends BaseDaoImp<User>{
	@Test
	public void ss(){
		User byid= new User();
		byid.setUser_name("fsdf");
		save(byid);
		}
}
