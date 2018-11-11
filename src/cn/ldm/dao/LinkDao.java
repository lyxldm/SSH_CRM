package cn.ldm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.ldm.bean.LinkMan;

public interface LinkDao {

	void saveLink(LinkMan linkMan);

	List getList(DetachedCriteria dc,int start);
	
}
