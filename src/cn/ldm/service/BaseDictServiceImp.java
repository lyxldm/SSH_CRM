package cn.ldm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.ldm.bean.BaseDict;
import cn.ldm.dao.BaseDictDao;

public class BaseDictServiceImp implements BaseDictService{
	BaseDictDao bdd;
	@Override
	public List getBaseDict(DetachedCriteria dc) {
		// TODO Auto-generated method stub
		return bdd.getBaseDict(dc);
	}
	public BaseDictDao<BaseDict> getBdd() {
		return bdd;
	}
	public void setBdd(BaseDictDao<BaseDict> bdd) {
		this.bdd = bdd;
	}
	
}
