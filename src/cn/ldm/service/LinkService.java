package cn.ldm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.ldm.bean.LinkMan;

public interface LinkService {

	void saveLink(LinkMan linkMan);

	List getList(DetachedCriteria dc,int start);

}
