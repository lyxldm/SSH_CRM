package cn.ldm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDictService {
	List getBaseDict(DetachedCriteria dc);
}
