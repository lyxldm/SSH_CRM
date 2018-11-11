package cn.ldm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.ldm.bean.LinkMan;
import cn.ldm.dao.LinkDao;

public class LinkServiceImp implements LinkService{
	LinkDao ld;
	@Override
	public void saveLink(LinkMan linkMan) {
		// TODO Auto-generated method stub
		ld.saveLink(linkMan);
	}
	public LinkDao getLd() {
		return ld;
	}
	public void setLd(LinkDao ld) {
		this.ld = ld;
	}
	@Override
	public List getList(DetachedCriteria dc,int start) {
		// TODO Auto-generated method stub
		return ld.getList(dc,start);
	}

}
