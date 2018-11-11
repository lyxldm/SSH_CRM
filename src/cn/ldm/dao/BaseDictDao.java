package cn.ldm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDictDao<T> {

	List getBaseDict(DetachedCriteria dc);

}
