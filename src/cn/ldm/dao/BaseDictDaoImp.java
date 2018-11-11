package cn.ldm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ldm.bean.BaseDict;
import cn.ldm.bean.LinkMan;
import cn.ldm.bean.User;

public class BaseDictDaoImp extends BaseDaoImp<BaseDict> implements BaseDictDao<BaseDict>{
	@Override
	public List getBaseDict(DetachedCriteria dc) {
		// TODO Auto-generated method stub
		//return getPageList(dc);
		return 	getHibernateTemplate().findByCriteria(dc);
	}
}
