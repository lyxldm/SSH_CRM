package cn.ldm.dao;

import cn.ldm.bean.Visit;

public class VisitDaoImp extends BaseDaoImp<Visit>implements VisitDao{

	@Override
	public void saveVisit(Visit visit) {
		// TODO Auto-generated method stub
		save(visit);
	}

}
