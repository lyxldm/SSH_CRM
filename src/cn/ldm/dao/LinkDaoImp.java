package cn.ldm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.ldm.bean.LinkMan;

public class LinkDaoImp extends BaseDaoImp<LinkMan> implements LinkDao{

	@Override
	public void saveLink(LinkMan linkMan) {
		// TODO Auto-generated method stub
		save(linkMan);
	}

	@Override
	public List getList(DetachedCriteria dc,int start) {
		return getPageList(dc, (start-1)*3, 3);
	}
	
}
