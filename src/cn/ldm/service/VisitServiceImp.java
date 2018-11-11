package cn.ldm.service;

import cn.ldm.bean.Visit;
import cn.ldm.dao.VisitDao;

public class VisitServiceImp implements VisitService{
	private VisitDao vd;
	
	
	public VisitDao getVd() {
		return vd;
	}


	public void setVd(VisitDao vd) {
		this.vd = vd;
	}


	@Override
	public void saveVisit(Visit visit) {
		// TODO Auto-generated method stub
		vd.saveVisit(visit);
	}

}
